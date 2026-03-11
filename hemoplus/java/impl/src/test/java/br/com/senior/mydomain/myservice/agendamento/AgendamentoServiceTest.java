package br.com.senior.mydomain.myservice.agendamento;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.doacao.DoacaoRepository;
import br.com.senior.mydomain.myservice.hemocentro.HemocentroRepository;
import br.com.senior.mydomain.myservice.usuario.UsuarioRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AgendamentoServiceTest {

    @Mock
    private AgendamentoRepository agendamentoRepository;

    @Mock
    private UsuarioRepository usuarioRepository;

    @Mock
    private HemocentroRepository hemocentroRepository;

    @Mock
    private DoacaoRepository doacaoRepository;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private AgendamentoService service;

    @Test
    @DisplayName("listarPorPeriodo deve delegar para repository")
    public void listarPorPeriodo_DeveDelegar() {
        Instant ini = Instant.parse("2026-02-01T00:00:00Z");
        Instant fim = Instant.parse("2026-02-02T00:00:00Z");
        UUID u = UUID.randomUUID();
        UUID h = UUID.randomUUID();
        List<AgendamentoEntity> list = Collections.singletonList(new AgendamentoEntity());
        when(agendamentoRepository.listarPorPeriodo(ini, fim, u, h, StatusAgendamento.PENDENTE)).thenReturn(list);
        List<AgendamentoEntity> out = service.listarPorPeriodo(ini, fim, u, h, StatusAgendamento.PENDENTE);
        assertNotNull(out);
        assertEquals(1, out.size());
        verify(agendamentoRepository).listarPorPeriodo(ini, fim, u, h, StatusAgendamento.PENDENTE);
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando usuarioId invalido")
    public void criar_DeveLancarUsuarioIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuarioId.invalido")).thenReturn("usuarioId invalido");

        try {
            service.criar("abc", UUID.randomUUID().toString(), Instant.now().plus(2, ChronoUnit.DAYS), null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("usuarioId invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando hemocentroId invalido")
    public void criar_DeveLancarHemocentroIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.invalido")).thenReturn("hemocentroId invalido");

        try {
            service.criar(UUID.randomUUID().toString(), "abc", Instant.now().plus(2, ChronoUnit.DAYS), null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("hemocentroId invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando dataHora nula")
    public void criar_DeveLancarDataHoraObrigatoria() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraObrigatoria")).thenReturn("dataHora obrigatoria");

        try {
            service.criar(UUID.randomUUID().toString(), UUID.randomUUID().toString(), null, null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("dataHora obrigatoria", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando dataHora não for futura")
    public void criar_DeveLancarDataHoraDeveSerFutura() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraDeveSerFutura")).thenReturn("dataHora deve ser futura");

        Instant passada = Instant.now().minus(2, ChronoUnit.DAYS);

        try {
            service.criar(UUID.randomUUID().toString(), UUID.randomUUID().toString(), passada, null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("dataHora deve ser futura", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar OBJECT_NOT_FOUND quando usuário não encontrado")
    public void criar_DeveLancarUsuarioNaoEncontrado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuario.naoEncontrado")).thenReturn("usuario nao encontrado");
        UUID usuarioId = UUID.randomUUID();
        UUID hemocentroId = UUID.randomUUID();
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.empty());

        try {
            service.criar(usuarioId.toString(), hemocentroId.toString(), Instant.now().plus(2, ChronoUnit.DAYS), null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.OBJECT_NOT_FOUND, e.getCategory());
            assertEquals("usuario nao encontrado", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando usuário inativo")
    public void criar_DeveLancarUsuarioInativo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.usuarioInativo")).thenReturn("usuario inativo");

        UUID usuarioId = UUID.randomUUID();
        UUID hemocentroId = UUID.randomUUID();
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setId(usuarioId);
        usuario.setAtivo(false);

        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.of(usuario));

        try {
            service.criar(usuarioId.toString(), hemocentroId.toString(), Instant.now().plus(2, ChronoUnit.DAYS), null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("usuario inativo", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar OBJECT_NOT_FOUND quando hemocentro não encontrado")
    public void criar_DeveLancarHemocentroNaoEncontrado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.naoEncontrado")).thenReturn("hemocentro nao encontrado");

        UUID usuarioId = UUID.randomUUID();
        UUID hemocentroId = UUID.randomUUID();
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setId(usuarioId);
        usuario.setAtivo(true);
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.of(usuario));
        when(doacaoRepository.findTopByUsuario_IdOrderByDataHoraConfirmacaoDesc(usuarioId)).thenReturn(null);
        when(hemocentroRepository.findById(hemocentroId)).thenReturn(Optional.empty());

        try {
            service.criar(usuarioId.toString(), hemocentroId.toString(), Instant.now().plus(2, ChronoUnit.DAYS), null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.OBJECT_NOT_FOUND, e.getCategory());
            assertEquals("hemocentro nao encontrado", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando hemocentro inativo")
    public void criar_DeveLancarHemocentroInativo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.inativo")).thenReturn("hemocentro inativo");

        UUID usuarioId = UUID.randomUUID();
        UUID hemocentroId = UUID.randomUUID();
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setId(usuarioId);
        usuario.setAtivo(true);
        HemocentroEntity hemocentro = new HemocentroEntity();
        hemocentro.setId(hemocentroId);
        hemocentro.setAtivo(false);
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.of(usuario));
        when(doacaoRepository.findTopByUsuario_IdOrderByDataHoraConfirmacaoDesc(usuarioId)).thenReturn(null);
        when(hemocentroRepository.findById(hemocentroId)).thenReturn(Optional.of(hemocentro));

        try {
            service.criar(usuarioId.toString(), hemocentroId.toString(), Instant.now().plus(2, ChronoUnit.DAYS), null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("hemocentro inativo", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando usuário já possui agendamento ativo")
    public void criar_DeveLancarPossuiAtivo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.usuarioJaPossuiAgendamentoAtivo")).thenReturn("ja possui ativo");

        UUID usuarioId = UUID.randomUUID();
        UUID hemocentroId = UUID.randomUUID();
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setId(usuarioId);
        usuario.setAtivo(true);
        HemocentroEntity hemocentro = new HemocentroEntity();
        hemocentro.setId(hemocentroId);
        hemocentro.setAtivo(true);
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.of(usuario));
        when(doacaoRepository.findTopByUsuario_IdOrderByDataHoraConfirmacaoDesc(usuarioId)).thenReturn(null);
        when(hemocentroRepository.findById(hemocentroId)).thenReturn(Optional.of(hemocentro));
        when(agendamentoRepository.existsByUsuario_IdAndStatusIn(eq(usuarioId), anyList())).thenReturn(true);

        try {
            service.criar(usuarioId.toString(), hemocentroId.toString(), Instant.now().plus(2, ChronoUnit.DAYS), null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("ja possui ativo", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve lançar BAD_REQUEST quando mesmo horário")
    public void criar_DeveLancarDuplicadoHorario() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.agendamentoDuplicadoHorario")).thenReturn("duplicado horario");

        UUID usuarioId = UUID.randomUUID();
        UUID hemocentroId = UUID.randomUUID();
        Instant dataFutura = Instant.now().plus(2, ChronoUnit.DAYS);
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setId(usuarioId);
        usuario.setAtivo(true);
        HemocentroEntity hemocentro = new HemocentroEntity();
        hemocentro.setId(hemocentroId);
        hemocentro.setAtivo(true);
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.of(usuario));
        when(doacaoRepository.findTopByUsuario_IdOrderByDataHoraConfirmacaoDesc(usuarioId)).thenReturn(null);
        when(hemocentroRepository.findById(hemocentroId)).thenReturn(Optional.of(hemocentro));
        when(agendamentoRepository.existsByUsuario_IdAndStatusIn(eq(usuarioId), anyList())).thenReturn(false);
        when(agendamentoRepository.existsByUsuario_IdAndDataHora(usuarioId, dataFutura)).thenReturn(true);

        try {
            service.criar(usuarioId.toString(), hemocentroId.toString(), dataFutura, null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("duplicado horario", e.getMessage());
        }
    }

    @Test
    @DisplayName("criar deve salvar e retornar entidade quando tudo ok")
    public void criar_DeveSalvarQuandoOk() {
        UUID usuarioId = UUID.randomUUID();
        UUID hemocentroId = UUID.randomUUID();
        Instant dataFutura = Instant.now().plus(2, ChronoUnit.DAYS);
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setId(usuarioId);
        usuario.setAtivo(true);
        HemocentroEntity hemocentro = new HemocentroEntity();
        hemocentro.setId(hemocentroId);
        hemocentro.setAtivo(true);
        when(usuarioRepository.findById(usuarioId)).thenReturn(Optional.of(usuario));
        when(doacaoRepository.findTopByUsuario_IdOrderByDataHoraConfirmacaoDesc(usuarioId)).thenReturn(null);
        when(hemocentroRepository.findById(hemocentroId)).thenReturn(Optional.of(hemocentro));
        when(agendamentoRepository.existsByUsuario_IdAndStatusIn(eq(usuarioId), anyList())).thenReturn(false);
        when(agendamentoRepository.existsByUsuario_IdAndDataHora(usuarioId, dataFutura)).thenReturn(false);
        when(agendamentoRepository.save(any(AgendamentoEntity.class))).thenAnswer(inv -> inv.getArgument(0));
        AgendamentoEntity saved = service.criar(usuarioId.toString(), hemocentroId.toString(), dataFutura, "obs");

        assertNotNull(saved);
        assertEquals(StatusAgendamento.PENDENTE, saved.getStatus());
        assertEquals("obs", saved.getObservacao());
        assertEquals(usuario, saved.getUsuario());
        assertEquals(hemocentro, saved.getHemocentro());
        assertNotNull(saved.getDataCriacao());
        assertNotNull(saved.getDataAtualizacao());

        verify(agendamentoRepository, times(1)).save(any(AgendamentoEntity.class));
    }

    @Test
    @DisplayName("confirmar deve lançar BAD_REQUEST quando agendamentoId inválido")
    public void confirmar_DeveLancarAgendamentoIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.invalido")).thenReturn("id invalido");

        try {
            service.confirmar("abc");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("id invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("confirmar deve lançar OBJECT_NOT_FOUND quando não encontrar")
    public void confirmar_DeveLancarNaoEncontrado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.naoEncontrado")).thenReturn("nao encontrado");

        UUID id = UUID.randomUUID();
        when(agendamentoRepository.findById(id)).thenReturn(Optional.empty());

        try {
            service.confirmar(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.OBJECT_NOT_FOUND, e.getCategory());
            assertEquals("nao encontrado", e.getMessage());
        }
    }

    @Test
    @DisplayName("confirmar deve lançar BAD_REQUEST quando status não for PENDENTE")
    public void confirmar_DeveLancarStatusInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.confirmar.statusInvalido")).thenReturn("status invalido");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.CONFIRMADO);
        a.setDataHora(Instant.now().plus(2, ChronoUnit.DAYS));

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.confirmar(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("status invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("confirmar deve lançar BAD_REQUEST quando dataHora inválida")
    public void confirmar_DeveLancarDataHoraInvalida() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.confirmar.dataHoraInvalida")).thenReturn("data invalida");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.PENDENTE);
        a.setDataHora(Instant.now().minus(2, ChronoUnit.DAYS));

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.confirmar(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("data invalida", e.getMessage());
        }
    }

    @Test
    @DisplayName("confirmar deve setar token, expiração, status e salvar")
    public void confirmar_DeveSalvarQuandoOk() {
        UUID id = UUID.randomUUID();
        Instant futura = Instant.now().plus(2, ChronoUnit.DAYS);

        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.PENDENTE);
        a.setDataHora(futura);
        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));
        when(agendamentoRepository.save(any(AgendamentoEntity.class))).thenAnswer(inv -> inv.getArgument(0));
        AgendamentoEntity saved = service.confirmar(id.toString());
        assertNotNull(saved);
        assertEquals(StatusAgendamento.CONFIRMADO, saved.getStatus());
        assertNotNull(saved.getToken());
        assertNotNull(saved.getTokenExpiraEm());
        assertNull(saved.getTokenUsadoEm());
        assertNotNull(saved.getDataAtualizacao());
        assertTrue(saved.getToken().length() > 10);
        verify(agendamentoRepository, times(1)).save(any(AgendamentoEntity.class));
    }

    @Test
    @DisplayName("cancelar deve lançar BAD_REQUEST quando id inválido")
    public void cancelar_DeveLancarIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.invalido")).thenReturn("id invalido");

        try {
            service.cancelar("abc", "m");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("id invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("cancelar deve lançar OBJECT_NOT_FOUND quando não encontrar")
    public void cancelar_DeveLancarNaoEncontrado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.naoEncontrado")).thenReturn("nao encontrado");

        UUID id = UUID.randomUUID();
        when(agendamentoRepository.findById(id)).thenReturn(Optional.empty());

        try {
            service.cancelar(id.toString(), "m");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.OBJECT_NOT_FOUND, e.getCategory());
            assertEquals("nao encontrado", e.getMessage());
        }
    }

    @Test
    @DisplayName("cancelar deve lançar BAD_REQUEST quando já cancelado")
    public void cancelar_DeveLancarJaCancelado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.cancelar.jaCancelado")).thenReturn("ja cancelado");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.CANCELADO);

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.cancelar(id.toString(), "m");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("ja cancelado", e.getMessage());
        }
    }

    @Test
    @DisplayName("cancelar deve lançar BAD_REQUEST quando status final (compareceu/nao compareceu)")
    public void cancelar_DeveLancarStatusFinal() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.cancelar.statusFinalNaoPermite")).thenReturn("final nao permite");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.COMPARECEU);

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.cancelar(id.toString(), "m");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("final nao permite", e.getMessage());
        }
    }

    @Test
    @DisplayName("cancelar deve setar status cancelado, limpar token e salvar")
    public void cancelar_DeveSalvarQuandoOk() {
        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.CONFIRMADO);
        a.setToken("t");
        a.setTokenExpiraEm(Instant.now().plus(2, ChronoUnit.DAYS));
        a.setTokenUsadoEm(Instant.now());

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));
        when(agendamentoRepository.save(any(AgendamentoEntity.class))).thenAnswer(inv -> inv.getArgument(0));

        AgendamentoEntity saved = service.cancelar(id.toString(), "motivo");

        assertEquals(StatusAgendamento.CANCELADO, saved.getStatus());
        assertEquals("motivo", saved.getMotivoStatus());
        assertNull(saved.getToken());
        assertNull(saved.getTokenExpiraEm());
        assertNull(saved.getTokenUsadoEm());
        assertNotNull(saved.getDataAtualizacao());
        verify(agendamentoRepository).save(any(AgendamentoEntity.class));
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve lançar BAD_REQUEST quando id inválido")
    public void naoCompareceu_DeveLancarIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.invalido")).thenReturn("id invalido");

        try {
            service.marcarNaoCompareceu("abc");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("id invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve lançar OBJECT_NOT_FOUND quando não encontrar")
    public void naoCompareceu_DeveLancarNaoEncontrado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.naoEncontrado")).thenReturn("nao encontrado");

        UUID id = UUID.randomUUID();
        when(agendamentoRepository.findById(id)).thenReturn(Optional.empty());

        try {
            service.marcarNaoCompareceu(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.OBJECT_NOT_FOUND, e.getCategory());
            assertEquals("nao encontrado", e.getMessage());
        }
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve lançar BAD_REQUEST quando cancelado")
    public void naoCompareceu_DeveLancarCancelado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.canceladoNaoPermite")).thenReturn("cancelado nao permite");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.CANCELADO);
        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.marcarNaoCompareceu(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("cancelado nao permite", e.getMessage());
        }
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve lançar BAD_REQUEST quando status compareceu")
    public void naoCompareceu_DeveLancarCompareceu() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.statusInvalido")).thenReturn("status invalido");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.COMPARECEU);

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.marcarNaoCompareceu(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("status invalido", e.getMessage());
        }
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve lançar BAD_REQUEST quando já marcado nao compareceu")
    public void naoCompareceu_DeveLancarJaMarcado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.jaMarcado")).thenReturn("ja marcado");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.NAO_COMPARECEU);

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.marcarNaoCompareceu(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("ja marcado", e.getMessage());
        }
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve lançar BAD_REQUEST quando não estiver confirmado")
    public void naoCompareceu_DeveLancarDeveEstarConfirmado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.deveEstarConfirmado")).thenReturn("deve estar confirmado");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.PENDENTE);

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.marcarNaoCompareceu(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("deve estar confirmado", e.getMessage());
        }
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve lançar BAD_REQUEST quando ainda não chegou o horário")
    public void naoCompareceu_DeveLancarAindaNaoChegouHorario() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.aindaNaoChegouHorario")).thenReturn("ainda nao chegou");

        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.CONFIRMADO);
        a.setDataHora(Instant.now().plus(2, ChronoUnit.DAYS));

        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));

        try {
            service.marcarNaoCompareceu(id.toString());
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("ainda nao chegou", e.getMessage());
        }
    }

    @Test
    @DisplayName("marcarNaoCompareceu deve setar status, limpar token e salvar quando ok")
    public void naoCompareceu_DeveSalvarQuandoOk() {
        UUID id = UUID.randomUUID();
        AgendamentoEntity a = new AgendamentoEntity();
        a.setId(id);
        a.setStatus(StatusAgendamento.CONFIRMADO);
        a.setDataHora(Instant.now().minus(2, ChronoUnit.DAYS));
        a.setToken("t");
        a.setTokenExpiraEm(Instant.now().plus(2, ChronoUnit.DAYS));
        a.setTokenUsadoEm(Instant.now());
        when(agendamentoRepository.findById(id)).thenReturn(Optional.of(a));
        when(agendamentoRepository.save(any(AgendamentoEntity.class))).thenAnswer(inv -> inv.getArgument(0));
        AgendamentoEntity saved = service.marcarNaoCompareceu(id.toString());
        assertEquals(StatusAgendamento.NAO_COMPARECEU, saved.getStatus());
        assertNull(saved.getToken());
        assertNull(saved.getTokenExpiraEm());
        assertNull(saved.getTokenUsadoEm());
        assertNotNull(saved.getDataAtualizacao());

        verify(agendamentoRepository).save(any(AgendamentoEntity.class));
    }
}