package br.com.senior.mydomain.myservice.doacao;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoRepository;
import br.com.senior.mydomain.myservice.estoque.EstoqueRepository;
import br.com.senior.mydomain.myservice.estoque.EstoqueService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
class DoacaoServiceTest {

    @Mock
    private AgendamentoRepository agendamentoRepository;

    @Mock
    private DoacaoRepository doacaoRepository;

    @Mock
    private EstoqueService estoqueService;

    @Mock
    private EstoqueRepository estoqueRepository;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private DoacaoService service;

    private void msg(String key) {
        when(translationHubApi.getMessage(key)).thenReturn(key);
    }

    private AgendamentoEntity agendamentoConfirmadoValido(String token) {
        UsuarioEntity u = new UsuarioEntity();
        u.setTipoSangue(TipoSangue.O);
        u.setFatorRh(FatorRh.POSITIVO);

        HemocentroEntity h = new HemocentroEntity();
        h.setId(UUID.randomUUID());

        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(UUID.randomUUID());
        a.setStatus(StatusAgendamento.CONFIRMADO);
        a.setToken(token);
        a.setTokenExpiraEm(Instant.now().plus(2, ChronoUnit.HOURS));
        a.setTokenUsadoEm(null);
        a.setUsuario(u);
        a.setHemocentro(h);
        return a;
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando token for nulo")
    void validarPorToken_deveLancarQuandoTokenNulo() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenObrigatorio");

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken(null, "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenObrigatorio", ex.getMessage());

        verifyNoInteractions(agendamentoRepository, doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando token estiver em branco")
    void validarPorToken_deveLancarQuandoTokenEmBranco() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenObrigatorio");

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken("   ", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenObrigatorio", ex.getMessage());

        verifyNoInteractions(agendamentoRepository, doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar OBJECT_NOT_FOUND quando token não existir")
    void validarPorToken_deveLancarQuandoTokenInvalido() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenInvalido");

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.empty());

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken(" tok ", "R"));
        assertEquals(ErrorCategory.OBJECT_NOT_FOUND, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenInvalido", ex.getMessage());

        verify(agendamentoRepository).findByToken("tok");
        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando status não for CONFIRMADO")
    void validarPorToken_deveLancarQuandoStatusInvalido() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.statusAgendamentoInvalido");

        AgendamentoEntity a = agendamentoConfirmadoValido("tok");
        a.setStatus(StatusAgendamento.PENDENTE);

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.statusAgendamentoInvalido", ex.getMessage());

        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando token estiver expirado")
    void validarPorToken_deveLancarQuandoTokenExpirado() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenExpirado");

        AgendamentoEntity a = agendamentoConfirmadoValido("tok");
        a.setTokenExpiraEm(Instant.now().minus(1, ChronoUnit.MINUTES));

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenExpirado", ex.getMessage());

        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando token já utilizado")
    void validarPorToken_deveLancarQuandoTokenJaUtilizado() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenJaUtilizado");

        AgendamentoEntity a = agendamentoConfirmadoValido("tok");
        a.setTokenUsadoEm(Instant.now().minus(1, ChronoUnit.MINUTES));

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenJaUtilizado", ex.getMessage());

        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando usuario for null")
    void validarPorToken_deveLancarQuandoUsuarioObrigatorio() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioObrigatorio");

        AgendamentoEntity a = agendamentoConfirmadoValido("tok");
        a.setUsuario(null);

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioObrigatorio", ex.getMessage());

        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando hemocentro for null ou sem id")
    void validarPorToken_deveLancarQuandoHemocentroObrigatorio() {
        msg("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio");

        AgendamentoEntity a = agendamentoConfirmadoValido("tok");

        a.setHemocentro(null);
        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));

        ServiceException ex1 = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex1.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio", ex1.getMessage());

        HemocentroEntity hSemId = new HemocentroEntity();
        a.setHemocentro(hSemId);

        ServiceException ex2 = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex2.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio", ex2.getMessage());

        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando usuario sem tipo sangue")
    void validarPorToken_deveLancarQuandoUsuarioSemTipoSangue() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioSemTipoSangue");

        AgendamentoEntity a = agendamentoConfirmadoValido("tok");
        a.getUsuario().setTipoSangue(null);

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioSemTipoSangue", ex.getMessage());

        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve lançar BAD_REQUEST quando usuario sem fator rh")
    void validarPorToken_deveLancarQuandoUsuarioSemFatorRh() {
        msg("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioSemFatorRh");

        AgendamentoEntity a = agendamentoConfirmadoValido("tok");
        a.getUsuario().setFatorRh(null);

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));

        ServiceException ex = assertThrows(ServiceException.class, () -> service.validarPorToken("tok", "R"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioSemFatorRh", ex.getMessage());

        verifyNoInteractions(doacaoRepository, estoqueService, estoqueRepository);
    }

    @Test
    @DisplayName("validarPorToken: deve salvar doacao, atualizar agendamento e adicionar no estoque")
    void validarPorToken_deveSalvarEAdicionarEstoqueQuandoOk() {
        AgendamentoEntity a = agendamentoConfirmadoValido("tok");
        UUID hemocentroId = a.getHemocentro().getId();

        when(agendamentoRepository.findByToken("tok")).thenReturn(Optional.of(a));
        when(agendamentoRepository.save(any(AgendamentoEntity.class))).thenAnswer(inv -> inv.getArgument(0));

        when(doacaoRepository.save(any(DoacaoEntity.class))).thenAnswer(inv -> {
            DoacaoEntity d = inv.getArgument(0);
            d.setId(UUID.randomUUID());
            return d;
        });

        DoacaoEntity out = service.validarPorToken(" tok ", "Admin");

        assertNotNull(out);
        assertNotNull(out.getId());
        assertEquals("Admin", out.getResponsavelValidacao());
        assertNotNull(out.getDataHoraConfirmacao());
        assertEquals(a.getUsuario().getTipoSangue(), out.getTipoSangue());
        assertEquals(a.getUsuario().getFatorRh(), out.getFatorRh());

        assertEquals(StatusAgendamento.COMPARECEU, a.getStatus());
        assertNotNull(a.getTokenUsadoEm());
        assertNotNull(a.getDataAtualizacao());

        verify(agendamentoRepository).save(a);
        verify(doacaoRepository).save(any(DoacaoEntity.class));

        verify(estoqueService).adicionarDoacao(eq(hemocentroId), eq(out.getTipoSangue()), eq(out.getFatorRh()), eq(450L), isNull());

        verifyNoInteractions(estoqueRepository);
    }

    @Test
    @DisplayName("estoqueAbaixoDoMinimoAposDoacao: deve retornar false quando doacao for null")
    void estoqueAbaixoDoMinimoAposDoacao_falseQuandoDoacaoNull() {
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(null));
        verifyNoInteractions(estoqueRepository);
    }

    @Test
    @DisplayName("estoqueAbaixoDoMinimoAposDoacao: deve retornar false quando hemocentro/id null")
    void estoqueAbaixoDoMinimoAposDoacao_falseQuandoHemocentroNullOuSemId() {
        DoacaoEntity d = new DoacaoEntity();
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
        HemocentroEntity h = new HemocentroEntity();
        d.setHemocentro(h);
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
        verifyNoInteractions(estoqueRepository);
    }

    @Test
    @DisplayName("estoqueAbaixoDoMinimoAposDoacao: deve retornar false quando tipoSangue/fatorRh null")
    void estoqueAbaixoDoMinimoAposDoacao_falseQuandoTipoOuRhNull() {
        DoacaoEntity d = new DoacaoEntity();
        HemocentroEntity h = new HemocentroEntity();
        h.setId(UUID.randomUUID());
        d.setHemocentro(h);
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
        d.setTipoSangue(TipoSangue.A);
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
        d.setTipoSangue(null);
        d.setFatorRh(FatorRh.POSITIVO);
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
        verifyNoInteractions(estoqueRepository);
    }

    @Test
    @DisplayName("estoqueAbaixoDoMinimoAposDoacao: deve retornar false quando estoque não encontrado")
    void estoqueAbaixoDoMinimoAposDoacao_falseQuandoEstoqueNaoEncontrado() {
        UUID hemocentroId = UUID.randomUUID();
        DoacaoEntity d = new DoacaoEntity();
        HemocentroEntity h = new HemocentroEntity();
        h.setId(hemocentroId);
        d.setHemocentro(h);
        d.setTipoSangue(TipoSangue.O);
        d.setFatorRh(FatorRh.NEGATIVO);
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hemocentroId, TipoSangue.O, FatorRh.NEGATIVO)).thenReturn(Optional.empty());
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
    }

    @Test
    @DisplayName("estoqueAbaixoDoMinimoAposDoacao: deve retornar false quando quantidade/minimo null")
    void estoqueAbaixoDoMinimoAposDoacao_falseQuandoCamposNull() {
        UUID hemocentroId = UUID.randomUUID();

        DoacaoEntity d = new DoacaoEntity();
        HemocentroEntity h = new HemocentroEntity();
        h.setId(hemocentroId);
        d.setHemocentro(h);
        d.setTipoSangue(TipoSangue.O);
        d.setFatorRh(FatorRh.NEGATIVO);
        EstoqueEntity e = new EstoqueEntity();
        e.setQuantidadeMl(null);
        e.setMinimoMl(1000L);
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hemocentroId, TipoSangue.O, FatorRh.NEGATIVO)).thenReturn(Optional.of(e));
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
        e.setQuantidadeMl(500L);
        e.setMinimoMl(null);
        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
    }

    @Test
    @DisplayName("estoqueAbaixoDoMinimoAposDoacao: deve retornar true quando quantidade < minimo")
    void estoqueAbaixoDoMinimoAposDoacao_trueQuandoAbaixo() {
        UUID hemocentroId = UUID.randomUUID();

        DoacaoEntity d = new DoacaoEntity();
        HemocentroEntity h = new HemocentroEntity();
        h.setId(hemocentroId);
        d.setHemocentro(h);
        d.setTipoSangue(TipoSangue.O);
        d.setFatorRh(FatorRh.NEGATIVO);
        EstoqueEntity e = new EstoqueEntity();
        e.setQuantidadeMl(500L);
        e.setMinimoMl(1000L);
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hemocentroId, TipoSangue.O, FatorRh.NEGATIVO)).thenReturn(Optional.of(e));
        assertTrue(service.estoqueAbaixoDoMinimoAposDoacao(d));
    }

    @Test
    @DisplayName("estoqueAbaixoDoMinimoAposDoacao: deve retornar false quando quantidade >= minimo")
    void estoqueAbaixoDoMinimoAposDoacao_falseQuandoNaoAbaixo() {
        UUID hemocentroId = UUID.randomUUID();

        DoacaoEntity d = new DoacaoEntity();
        HemocentroEntity h = new HemocentroEntity();
        h.setId(hemocentroId);
        d.setHemocentro(h);
        d.setTipoSangue(TipoSangue.O);
        d.setFatorRh(FatorRh.NEGATIVO);
        EstoqueEntity e = new EstoqueEntity();
        e.setQuantidadeMl(1000L);
        e.setMinimoMl(1000L);
        when(estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(hemocentroId, TipoSangue.O, FatorRh.NEGATIVO)).thenReturn(Optional.of(e));

        assertFalse(service.estoqueAbaixoDoMinimoAposDoacao(d));
    }
}