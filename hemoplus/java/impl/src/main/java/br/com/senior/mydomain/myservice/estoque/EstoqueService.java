package br.com.senior.mydomain.myservice.estoque;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.hemocentro.HemocentroRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class EstoqueService {

    @Inject
    private EstoqueRepository estoqueRepository;

    @Inject
    private HemocentroRepository hemocentroRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    public List<EstoqueEntity> listarPorHemocentro(String hemocentroIdStr) {
        final UUID hemocentroId = parseUuid(hemocentroIdStr, "br.com.senior.my_domain.my_service.common.hemocentro.invalido");
        return estoqueRepository.findByHemocentroId(hemocentroId);
    }

    public List<EstoqueEntity> listarEmFalta(String hemocentroIdStr) {
        final UUID hemocentroId = parseUuid(hemocentroIdStr, "br.com.senior.my_domain.my_service.common.hemocentro.invalido");
        return estoqueRepository.listarTipoSangueEmFalta(hemocentroId);
    }

    @Transactional
    public EstoqueEntity ajustar(String hemocentroIdStr, TipoSangue tipoSangue, FatorRh fatorRh, Long deltaMl, Long minimoMl) {

        if (hemocentroIdStr == null || hemocentroIdStr.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio"));
        }

        if (tipoSangue == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.tipoSangue.obrigatorio"));
        }

        if (fatorRh == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.fatorRh.obrigatorio"));
        }

        final boolean temDelta = deltaMl != null && deltaMl != 0L;
        final boolean temMinimo = minimoMl != null;

        if (!temDelta && !temMinimo) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.acaoObrigatoria"));
        }

        if (temMinimo && minimoMl < 0L) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.minimoInvalido"));
        }

        final UUID hemocentroId = parseUuid(hemocentroIdStr, "br.com.senior.my_domain.my_service.common.hemocentro.invalido");

        final HemocentroEntity hemocentro = hemocentroRepository.findById(hemocentroId).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND,
                        translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.naoEncontrado")));

        if (hemocentro.getAtivo() != null && !hemocentro.getAtivo()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.inativo"));
        }

        final EstoqueEntity estoque = obterOuCriar(hemocentro, tipoSangue, fatorRh, temMinimo ? minimoMl : null);
        final long atual = estoque.getQuantidadeMl() != null ? estoque.getQuantidadeMl() : 0L;
        final long deltaSeguro = temDelta ? deltaMl : 0L;
        final long novo = atual + deltaSeguro;

        if (novo < 0L) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.naoPodeFicarNegativo"));
        }

        if (temDelta) {
            estoque.setQuantidadeMl(novo);
        } else if (estoque.getQuantidadeMl() == null) {
            estoque.setQuantidadeMl(0L);
        }

        if (temMinimo) {
            estoque.setMinimoMl(minimoMl);
        } else if (estoque.getMinimoMl() == null) {
            estoque.setMinimoMl(0L);
        }

        estoque.setDataAtualizacao(Instant.now());

        return estoqueRepository.save(estoque);
    }

    @Transactional
    public EstoqueEntity adicionarDoacao(UUID hemocentroId, TipoSangue tipoSangue, FatorRh fatorRh, Long ml, Long minimoPadrao) {

        if (hemocentroId == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio"));
        }

        if (tipoSangue == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.tipoSangue.obrigatorio"));
        }

        if (fatorRh == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.fatorRh.obrigatorio"));
        }

        if (ml == null || ml <= 0L) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.doacao.mlInvalido"));
        }

        final HemocentroEntity hemocentro = hemocentroRepository.findById(hemocentroId).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND,
                        translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.naoEncontrado")));

        final EstoqueEntity estoque = obterOuCriar(hemocentro, tipoSangue, fatorRh, minimoPadrao);
        final Instant agora = Instant.now();

        final long atual = estoque.getQuantidadeMl() != null ? estoque.getQuantidadeMl() : 0L;
        estoque.setQuantidadeMl(atual + ml);

        if (estoque.getMinimoMl() == null) {
            estoque.setMinimoMl(minimoPadrao != null && minimoPadrao > 0L ? minimoPadrao : 0L);
        }

        estoque.setDataAtualizacao(agora);

        return estoqueRepository.save(estoque);
    }

    private EstoqueEntity obterOuCriar(HemocentroEntity hemocentro, TipoSangue tipoSangue, FatorRh fatorRh, Long minimoMl) {

        final UUID hemocentroId = hemocentro.getId();

        final List<EstoqueEntity> duplicados = estoqueRepository.findByKey(hemocentroId, tipoSangue, fatorRh);
        if (duplicados != null && duplicados.size() > 1) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.duplicado"));
        }

        final EstoqueEntity existente = estoqueRepository
                .findByHemocentroIdAndTipoSangueAndFatorRh(hemocentroId, tipoSangue, fatorRh)
                .orElse(null);

        if (existente != null) {
            return existente;
        }

        final EstoqueEntity novo = new EstoqueEntity();
        novo.setHemocentro(hemocentro);
        novo.setTipoSangue(tipoSangue);
        novo.setFatorRh(fatorRh);
        novo.setQuantidadeMl(0L);
        novo.setMinimoMl(minimoMl != null && minimoMl > 0L ? minimoMl : 0L);
        novo.setDataAtualizacao(Instant.now());
        return novo;
    }

    private UUID parseUuid(String value, String keyErro) {
        try {
            return UUID.fromString(value.trim());
        } catch (Exception e) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyErro));
        }
    }
}