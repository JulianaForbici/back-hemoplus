package br.com.senior.mydomain.myservice.estoque;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.hemocentro.HemocentroRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.Instant;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EstoqueServiceTest {

    @Mock
    private EstoqueRepository estoqueRepository;

    @Mock
    private HemocentroRepository hemocentroRepository;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private EstoqueService service;

    private void msg(String key, String val) {
        when(translationHubApi.getMessage(key)).thenReturn(val);
    }

    private HemocentroEntity hemocentroAtivo(UUID id) {
        HemocentroEntity h = new HemocentroEntity();
        h.setId(id);
        h.setAtivo(true);
        return h;
    }

    private EstoqueEntity estoqueExistente(HemocentroEntity h, TipoSangue t, FatorRh f, Long qtd, Long min) {
        EstoqueEntity e = new EstoqueEntity();
        e.setId(UUID.randomUUID());
        e.setHemocentro(h);
        e.setTipoSangue(t);
        e.setFatorRh(f);
        e.setQuantidadeMl(qtd);
        e.setMinimoMl(min);
        e.setDataAtualizacao(Instant.now());
        return e;
    }

    @Test
    @DisplayName("listarPorHemocentro deve delegar ao repository")
    public void listarPorHemocentro_DeveDelegar() {
        UUID hid = UUID.randomUUID();
        List<EstoqueEntity> list = Collections.singletonList(new EstoqueEntity());
        when(estoqueRepository.findByHemocentroId(hid)).thenReturn(list);

        List<EstoqueEntity> out = service.listarPorHemocentro(hid.toString());

        assertNotNull(out);
        assertEquals(1, out.size());
        verify(estoqueRepository).findByHemocentroId(hid);
    }

    @Test
    @DisplayName("listarEmFalta deve delegar ao repository")
    public void listarEmFalta_DeveDelegar() {
        UUID hid = UUID.randomUUID();
        List<EstoqueEntity> list = Collections.singletonList(new EstoqueEntity());
        when(estoqueRepository.listarTipoSangueEmFalta(hid)).thenReturn(list);

        List<EstoqueEntity> out = service.listarEmFalta(hid.toString());

        assertNotNull(out);
        assertEquals(1, out.size());
        verify(estoqueRepository).listarTipoSangueEmFalta(hid);
    }

    @Test
    @DisplayName("parseUuid deve lançar quando hemocentroId inválido")
    public void parseUuid_DeveLancar() {
        msg("br.com.senior.my_domain.my_service.common.hemocentro.invalido", "id invalido");

        try {
            service.listarPorHemocentro("abc");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("id invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("ajustar deve validar parâmetros obrigatórios e ação obrigatória (delta ou mínimo)")
    public void ajustar_DeveValidarObrigatorios() {
        msg("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio", "hid obrigatorio");
        msg("br.com.senior.my_domain.my_service.common.tipoSangue.obrigatorio", "tipo obrigatorio");
        msg("br.com.senior.my_domain.my_service.common.fatorRh.obrigatorio", "rh obrigatorio");
        msg("br.com.senior.my_domain.my_service.estoque.ajustar.acaoObrigatoria", "acao obrigatoria");

        try {
            service.ajustar("  ", TipoSangue.O, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("hid obrigatorio", e.getMessage());
        }

        try {
            service.ajustar(UUID.randomUUID().toString(), null, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("tipo obrigatorio", e.getMessage());
        }

        try {
            service.ajustar(UUID.randomUUID().toString(), TipoSangue.O, null, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("rh obrigatorio", e.getMessage());
        }

        try {
            service.ajustar(UUID.randomUUID().toString(), TipoSangue.O, FatorRh.POSITIVO, null, null);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("acao obrigatoria", e.getMessage());
        }

        try {
            service.ajustar(UUID.randomUUID().toString(), TipoSangue.O, FatorRh.POSITIVO, 0L, null);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("acao obrigatoria", e.getMessage());
        }
    }

    @Test
    @DisplayName("ajustar deve permitir salvar somente mínimo (delta 0) sem alterar quantidade")
    public void ajustar_DevePermitirSomenteMinimo() {
        UUID hid = UUID.randomUUID();
        HemocentroEntity h = hemocentroAtivo(hid);
        when(hemocentroRepository.findById(hid)).thenReturn(Optional.of(h));

        EstoqueEntity existente = estoqueExistente(h, TipoSangue.O, FatorRh.POSITIVO, 100L, 0L);

        when(estoqueRepository.findByKey(hid, TipoSangue.O, FatorRh.POSITIVO)).thenReturn(Collections.singletonList(new EstoqueEntity()));
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hid, TipoSangue.O, FatorRh.POSITIVO))
                .thenReturn(Optional.of(existente));
        when(estoqueRepository.save(any(EstoqueEntity.class))).thenAnswer(inv -> inv.getArgument(0));

        EstoqueEntity out = service.ajustar(hid.toString(), TipoSangue.O, FatorRh.POSITIVO, 0L, 500L);

        assertNotNull(out);
        assertEquals(Long.valueOf(100L), out.getQuantidadeMl());
        assertEquals(Long.valueOf(500L), out.getMinimoMl());
        assertNotNull(out.getDataAtualizacao());
        verify(estoqueRepository).save(existente);
    }

    @Test
    @DisplayName("ajustar deve lançar quando hemocentro não existe ou está inativo")
    public void ajustar_DeveValidarHemocentro() {
        UUID hid = UUID.randomUUID();
        msg("br.com.senior.my_domain.my_service.common.hemocentro.naoEncontrado", "nao encontrado");

        when(hemocentroRepository.findById(hid)).thenReturn(Optional.empty());

        try {
            service.ajustar(hid.toString(), TipoSangue.O, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.OBJECT_NOT_FOUND, e.getCategory());
            assertEquals("nao encontrado", e.getMessage());
        }

        HemocentroEntity inativo = new HemocentroEntity();
        inativo.setId(hid);
        inativo.setAtivo(false);

        msg("br.com.senior.my_domain.my_service.common.hemocentro.inativo", "inativo");
        when(hemocentroRepository.findById(hid)).thenReturn(Optional.of(inativo));

        try {
            service.ajustar(hid.toString(), TipoSangue.O, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("inativo", e.getMessage());
        }
    }

    @Test
    @DisplayName("ajustar deve lançar quando estoque ficaria negativo")
    public void ajustar_DeveLancarNegativo() {
        UUID hid = UUID.randomUUID();
        HemocentroEntity h = hemocentroAtivo(hid);
        when(hemocentroRepository.findById(hid)).thenReturn(Optional.of(h));

        when(estoqueRepository.findByKey(hid, TipoSangue.O, FatorRh.POSITIVO)).thenReturn(Collections.singletonList(new EstoqueEntity()));
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hid, TipoSangue.O, FatorRh.POSITIVO)).thenReturn(Optional.empty());

        msg("br.com.senior.my_domain.my_service.estoque.ajustar.naoPodeFicarNegativo", "negativo");

        try {
            service.ajustar(hid.toString(), TipoSangue.O, FatorRh.POSITIVO, -1L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("negativo", e.getMessage());
        }
    }

    @Test
    @DisplayName("ajustar deve salvar e setar minimo=0 quando minimoMl null e estoque.minimo null")
    public void ajustar_DeveSetarMinimoZeroQuandoNull() {
        UUID hid = UUID.randomUUID();
        HemocentroEntity h = hemocentroAtivo(hid);
        when(hemocentroRepository.findById(hid)).thenReturn(Optional.of(h));

        EstoqueEntity existente = estoqueExistente(h, TipoSangue.A, FatorRh.NEGATIVO, null, null);

        when(estoqueRepository.findByKey(hid, TipoSangue.A, FatorRh.NEGATIVO)).thenReturn(Collections.singletonList(new EstoqueEntity()));
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hid, TipoSangue.A, FatorRh.NEGATIVO))
                .thenReturn(Optional.of(existente));

        when(estoqueRepository.save(any(EstoqueEntity.class))).thenAnswer(inv -> inv.getArgument(0));

        EstoqueEntity out = service.ajustar(hid.toString(), TipoSangue.A, FatorRh.NEGATIVO, 10L, null);

        assertNotNull(out);
        assertEquals(Long.valueOf(10L), out.getQuantidadeMl());
        assertEquals(Long.valueOf(0L), out.getMinimoMl());
        assertNotNull(out.getDataAtualizacao());
        verify(estoqueRepository).save(existente);
    }

    @Test
    @DisplayName("obterOuCriar deve lançar quando houver duplicados > 1")
    public void obterOuCriar_DeveLancarDuplicado() {
        UUID hid = UUID.randomUUID();
        HemocentroEntity h = hemocentroAtivo(hid);
        when(hemocentroRepository.findById(hid)).thenReturn(Optional.of(h));

        msg("br.com.senior.my_domain.my_service.estoque.duplicado", "duplicado");

        when(estoqueRepository.findByKey(hid, TipoSangue.B, FatorRh.POSITIVO))
                .thenReturn(Arrays.asList(new EstoqueEntity(), new EstoqueEntity()));

        try {
            service.ajustar(hid.toString(), TipoSangue.B, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("duplicado", e.getMessage());
        }
    }

    @Test
    @DisplayName("adicionarDoacao deve validar parâmetros obrigatórios")
    public void adicionarDoacao_DeveValidarObrigatorios() {
        msg("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio", "hid obrigatorio");
        msg("br.com.senior.my_domain.my_service.common.tipoSangue.obrigatorio", "tipo obrigatorio");
        msg("br.com.senior.my_domain.my_service.common.fatorRh.obrigatorio", "rh obrigatorio");
        msg("br.com.senior.my_domain.my_service.estoque.doacao.mlInvalido", "ml invalido");

        try {
            service.adicionarDoacao(null, TipoSangue.O, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("hid obrigatorio", e.getMessage());
        }

        try {
            service.adicionarDoacao(UUID.randomUUID(), null, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals("tipo obrigatorio", e.getMessage());
        }

        try {
            service.adicionarDoacao(UUID.randomUUID(), TipoSangue.O, null, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals("rh obrigatorio", e.getMessage());
        }

        try {
            service.adicionarDoacao(UUID.randomUUID(), TipoSangue.O, FatorRh.POSITIVO, 0L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals("ml invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("adicionarDoacao deve lançar OBJECT_NOT_FOUND quando hemocentro não encontrado")
    public void adicionarDoacao_DeveLancarHemocentroNaoEncontrado() {
        UUID hid = UUID.randomUUID();
        msg("br.com.senior.my_domain.my_service.common.hemocentro.naoEncontrado", "nao encontrado");

        when(hemocentroRepository.findById(hid)).thenReturn(Optional.empty());

        try {
            service.adicionarDoacao(hid, TipoSangue.O, FatorRh.POSITIVO, 10L, 0L);
            fail();
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.OBJECT_NOT_FOUND, e.getCategory());
            assertEquals("nao encontrado", e.getMessage());
        }
    }

    @Test
    @DisplayName("adicionarDoacao deve criar novo, setar minimo padrao e salvar")
    public void adicionarDoacao_DeveCriarESalvar() {
        UUID hid = UUID.randomUUID();
        HemocentroEntity h = hemocentroAtivo(hid);
        when(hemocentroRepository.findById(hid)).thenReturn(Optional.of(h));

        when(estoqueRepository.findByKey(hid, TipoSangue.O, FatorRh.POSITIVO)).thenReturn(Collections.singletonList(new EstoqueEntity()));
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hid, TipoSangue.O, FatorRh.POSITIVO)).thenReturn(Optional.empty());
        when(estoqueRepository.save(any(EstoqueEntity.class))).thenAnswer(inv -> inv.getArgument(0));

        EstoqueEntity out = service.adicionarDoacao(hid, TipoSangue.O, FatorRh.POSITIVO, 450L, 100L);

        assertNotNull(out);
        assertEquals(Long.valueOf(450L), out.getQuantidadeMl());
        assertEquals(Long.valueOf(100L), out.getMinimoMl());
        assertNotNull(out.getDataAtualizacao());
        verify(estoqueRepository).save(any(EstoqueEntity.class));
    }
}