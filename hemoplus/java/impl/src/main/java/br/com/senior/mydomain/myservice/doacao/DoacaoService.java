package br.com.senior.mydomain.myservice.doacao;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoRepository;
import br.com.senior.mydomain.myservice.estoque.EstoqueRepository;
import br.com.senior.mydomain.myservice.estoque.EstoqueService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;
import java.time.Instant;

@Service
public class DoacaoService {

    private static final long ML_PADRAO_DOACAO = 450L;

    @Inject
    private AgendamentoRepository agendamentoRepository;

    @Inject
    private DoacaoRepository doacaoRepository;

    @Inject
    private EstoqueService estoqueService;

    @Inject
    private EstoqueRepository estoqueRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    @Transactional
    public DoacaoEntity validarPorToken(String token, String responsavelValidacao) {

        if (token == null || token.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenObrigatorio"));
        }

        final String tokenTrim = token.trim();

        final AgendamentoEntity agendamento = agendamentoRepository.findByToken(tokenTrim).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenInvalido")));

        final Instant agora = Instant.now();

        if (agendamento.getStatus() != StatusAgendamento.CONFIRMADO) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.statusAgendamentoInvalido"));
        }

        if (agendamento.getTokenExpiraEm() != null && agora.isAfter(agendamento.getTokenExpiraEm())) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenExpirado"));
        }

        if (agendamento.getTokenUsadoEm() != null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.tokenJaUtilizado"));
        }

        if (agendamento.getUsuario() == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioObrigatorio"));
        }

        if (agendamento.getHemocentro() == null || agendamento.getHemocentro().getId() == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio"));
        }

        if (agendamento.getUsuario().getTipoSangue() == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioSemTipoSangue"));
        }

        if (agendamento.getUsuario().getFatorRh() == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.usuarioSemFatorRh"));
        }

        agendamento.setTokenUsadoEm(agora);
        agendamento.setDataAtualizacao(agora);
        agendamento.setStatus(StatusAgendamento.COMPARECEU);
        agendamentoRepository.save(agendamento);
        final DoacaoEntity doacao = new DoacaoEntity();
        doacao.setDataHoraConfirmacao(agora);
        doacao.setResponsavelValidacao(responsavelValidacao);
        doacao.setAgendamento(agendamento);
        doacao.setUsuario(agendamento.getUsuario());
        doacao.setHemocentro(agendamento.getHemocentro());
        doacao.setTipoSangue(agendamento.getUsuario().getTipoSangue());
        doacao.setFatorRh(agendamento.getUsuario().getFatorRh());
        final DoacaoEntity doacaoSalva = doacaoRepository.save(doacao);

        estoqueService.adicionarDoacao(agendamento.getHemocentro().getId(), doacaoSalva.getTipoSangue(), doacaoSalva.getFatorRh(),
                ML_PADRAO_DOACAO, null);
        return doacaoSalva;
    }

    public boolean estoqueAbaixoDoMinimoAposDoacao(DoacaoEntity doacao) {
        if (doacao == null || doacao.getHemocentro() == null || doacao.getHemocentro().getId() == null) {
            return false;
        }
        if (doacao.getTipoSangue() == null || doacao.getFatorRh() == null) {
            return false;
        }

        EstoqueEntity e = estoqueRepository.findByHemocentroIdAndTipoSangueAndFatorRh(doacao.getHemocentro().getId(), doacao.getTipoSangue(), doacao.getFatorRh()).orElse(null);

        if (e == null || e.getQuantidadeMl() == null || e.getMinimoMl() == null) {
            return false;
        }
        return e.getQuantidadeMl() < e.getMinimoMl();
    }
}