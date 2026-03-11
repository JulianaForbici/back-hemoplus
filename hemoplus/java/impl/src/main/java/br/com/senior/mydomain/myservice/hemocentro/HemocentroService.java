package br.com.senior.mydomain.myservice.hemocentro;

import br.com.senior.mydomain.myservice.HemocentroEntity;
import br.com.senior.mydomain.myservice.validator.TelefoneValidator;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.List;

@Service
public class HemocentroService {

    @Inject
    private HemocentroRepository hemocentroRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    public List<HemocentroEntity> listarAtivosComCoordenadas() {
        return hemocentroRepository.findByAtivoTrue();
    }

    public void validarEPadronizarTelefone(HemocentroEntity entity) {
        final String digits = TelefoneValidator.validarEPadronizar(entity.getTelefone(), translationHubApi, "br.com.senior.my_domain.my_service.hemocentro.TELEFONE.obrigatorio", "br.com.senior.my_domain.my_service.hemocentro.TELEFONE.formato");
        entity.setTelefone(digits);
    }
}