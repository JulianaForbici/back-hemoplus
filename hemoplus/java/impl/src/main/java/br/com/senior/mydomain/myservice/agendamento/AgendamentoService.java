package br.com.senior.mydomain.myservice.agendamento;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.doacao.DoacaoRepository;
import br.com.senior.mydomain.myservice.hemocentro.HemocentroRepository;
import br.com.senior.mydomain.myservice.usuario.UsuarioRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

@Service
public class AgendamentoService {

    private static final long MIN_ANTECEDENCIA_HORAS = 24;
    private static final long MAX_ANTECEDENCIA_DIAS = 90;
    private static final long INTERVALO_POS_DOACAO_DIAS = 90;
    private static final long LIMITE_CANCELAMENTO_HORAS = 2;

    @Inject
    private AgendamentoRepository agendamentoRepository;

    @Inject
    private UsuarioRepository usuarioRepository;

    @Inject
    private HemocentroRepository hemocentroRepository;

    @Inject
    private DoacaoRepository doacaoRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    private final SecureRandom secureRandom = new SecureRandom();

    public List<AgendamentoEntity> listarPorPeriodo(Instant inicio, Instant fim, UUID usuarioId, UUID hemocentroId, StatusAgendamento status) {
        return agendamentoRepository.listarPorPeriodo(inicio, fim, usuarioId, hemocentroId, status);
    }

    @Transactional
    public AgendamentoEntity criar(String usuarioIdStr, String hemocentroIdStr, Instant dataHora, String observacao) {

        final UUID usuarioId = parseUuid(usuarioIdStr, "br.com.senior.my_domain.my_service.common.usuarioId.invalido");
        final UUID hemocentroId = parseUuid(hemocentroIdStr, "br.com.senior.my_domain.my_service.common.hemocentro.invalido");
        final Instant agora = Instant.now();

        if (dataHora == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraObrigatoria"));
        }

        if (!dataHora.isAfter(agora)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraDeveSerFutura"));
        }

        final Instant minimoPermitido = agora.plus(Duration.ofHours(MIN_ANTECEDENCIA_HORAS));
        if (dataHora.isBefore(minimoPermitido)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraMinimaAntecedencia"));
        }

        final Instant maximoPermitido = agora.plus(Duration.ofDays(MAX_ANTECEDENCIA_DIAS));
        if (dataHora.isAfter(maximoPermitido)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraMaximaAntecedencia"));
        }

        final UsuarioEntity usuario = usuarioRepository.findById(usuarioId).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuario.naoEncontrado")));

        if (usuario.getAtivo() != null && !usuario.getAtivo()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.usuarioInativo"));
        }

        final DoacaoEntity ultima = doacaoRepository.findTopByUsuario_IdOrderByDataHoraConfirmacaoDesc(usuarioId);
        if (ultima != null && ultima.getDataHoraConfirmacao() != null) {
            final Instant liberadoEm = ultima.getDataHoraConfirmacao().plus(Duration.ofDays(INTERVALO_POS_DOACAO_DIAS));
            if (agora.isBefore(liberadoEm)) {
                throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.intervaloMinimoPosDoacao"));
            }
        }

        final HemocentroEntity hemocentro = hemocentroRepository.findById(hemocentroId).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.naoEncontrado"))
        );

        if (hemocentro.getAtivo() != null && !hemocentro.getAtivo()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.inativo"));
        }

        final boolean possuiAtivo = agendamentoRepository.existsByUsuario_IdAndStatusIn(usuarioId, List.of(StatusAgendamento.PENDENTE, StatusAgendamento.CONFIRMADO)
        );

        if (possuiAtivo) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.usuarioJaPossuiAgendamentoAtivo"));
        }

        final boolean mesmoHorario = agendamentoRepository.existsByUsuario_IdAndDataHora(usuarioId, dataHora);
        if (mesmoHorario) {throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.agendamentoDuplicadoHorario"));
        }

        final AgendamentoEntity agendamento = new AgendamentoEntity();
        agendamento.setDataHora(dataHora);
        agendamento.setStatus(StatusAgendamento.PENDENTE);
        agendamento.setObservacao(observacao);
        agendamento.setDataCriacao(agora);
        agendamento.setDataAtualizacao(agora);
        agendamento.setUsuario(usuario);
        agendamento.setHemocentro(hemocentro);
        return agendamentoRepository.save(agendamento);
    }

    @Transactional
    public AgendamentoEntity confirmar(String agendamentoIdStr) {

        final UUID agendamentoId = parseUuid(agendamentoIdStr, "br.com.senior.my_domain.my_service.common.agendamento.invalido");
        final AgendamentoEntity agendamento = agendamentoRepository.findById(agendamentoId).orElseThrow(() -> new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.naoEncontrado")));

        final Instant agora = Instant.now();

        if (agendamento.getStatus() != StatusAgendamento.PENDENTE) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.confirmar.statusInvalido"));
        }

        if (agendamento.getDataHora() == null || !agendamento.getDataHora().isAfter(agora)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.confirmar.dataHoraInvalida"));
        }

        final String token = gerarToken();
        final Instant expiraEm = agendamento.getDataHora().plus(2, ChronoUnit.HOURS);
        agendamento.setStatus(StatusAgendamento.CONFIRMADO);
        agendamento.setToken(token);
        agendamento.setTokenExpiraEm(expiraEm);
        agendamento.setTokenUsadoEm(null);
        agendamento.setDataAtualizacao(agora);
        return agendamentoRepository.save(agendamento);
    }

    @Transactional
    public AgendamentoEntity cancelar(String agendamentoIdStr, String motivo) {

        final UUID agendamentoId = parseUuid(agendamentoIdStr, "br.com.senior.my_domain.my_service.common.agendamento.invalido");
        final AgendamentoEntity agendamento = agendamentoRepository.findById(agendamentoId).orElseThrow(() -> new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.naoEncontrado")));

        if (agendamento.getStatus() == StatusAgendamento.CANCELADO) {throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.cancelar.jaCancelado"));
        }

        if (agendamento.getStatus() == StatusAgendamento.COMPARECEU || agendamento.getStatus() == StatusAgendamento.NAO_COMPARECEU) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.cancelar.statusFinalNaoPermite"));
        }

        final Instant agora = Instant.now();

        if (agendamento.getDataHora() != null) {
            final Instant limiteCancelamento = agendamento.getDataHora().minus(Duration.ofHours(LIMITE_CANCELAMENTO_HORAS));
            if (agora.isAfter(limiteCancelamento)) {
                throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.cancelar.prazoMinimo"));
            }
        }

        agendamento.setStatus(StatusAgendamento.CANCELADO);
        agendamento.setMotivoStatus(motivo);
        agendamento.setToken(null);
        agendamento.setTokenExpiraEm(null);
        agendamento.setTokenUsadoEm(null);
        agendamento.setDataAtualizacao(agora);
        return agendamentoRepository.save(agendamento);
    }

    @Transactional
    public AgendamentoEntity marcarNaoCompareceu(String agendamentoIdStr) {

        final UUID agendamentoId = parseUuid(agendamentoIdStr, "br.com.senior.my_domain.my_service.common.agendamento.invalido");
        final AgendamentoEntity agendamento = agendamentoRepository.findById(agendamentoId).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.naoEncontrado"))
        );

        if (agendamento.getStatus() == StatusAgendamento.CANCELADO) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.canceladoNaoPermite"));
        }

        if (agendamento.getStatus() == StatusAgendamento.COMPARECEU) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.statusInvalido"));
        }

        if (agendamento.getStatus() == StatusAgendamento.NAO_COMPARECEU) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.jaMarcado"));
        }

        if (agendamento.getStatus() != StatusAgendamento.CONFIRMADO) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.deveEstarConfirmado"));
        }

        final Instant agora = Instant.now();

        if (agendamento.getDataHora() == null || !agendamento.getDataHora().isBefore(agora)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.aindaNaoChegouHorario"));
        }

        agendamento.setStatus(StatusAgendamento.NAO_COMPARECEU);
        agendamento.setToken(null);
        agendamento.setTokenExpiraEm(null);
        agendamento.setTokenUsadoEm(null);
        agendamento.setDataAtualizacao(agora);
        return agendamentoRepository.save(agendamento);
    }

    private UUID parseUuid(String value, String keyErro) {
        try { if (value == null || value.trim().isEmpty()) {
                throw new IllegalArgumentException("blank");
            }
            return UUID.fromString(value.trim());
        } catch (Exception e) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyErro));
        }
    }

    private String gerarToken() {
        byte[] bytes = new byte[24];
        secureRandom.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }
}