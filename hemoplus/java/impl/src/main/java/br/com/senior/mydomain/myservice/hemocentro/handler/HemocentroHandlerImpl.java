package br.com.senior.mydomain.myservice.hemocentro.handler;

import br.com.senior.mydomain.myservice.Hemocentro;
import br.com.senior.mydomain.myservice.HemocentroCrudValidator;
import br.com.senior.mydomain.myservice.HemocentroEntity;
import br.com.senior.mydomain.myservice.hemocentro.HemocentroService;
import javax.inject.Inject;

public class HemocentroHandlerImpl implements HemocentroCrudValidator {

    @Inject
    private HemocentroService hemocentroService;

    @Override
    public void beforeCreate(HemocentroEntity entity) {
        hemocentroService.validarEPadronizarTelefone(entity);
    }

    @Override
    public void beforeUpdate(HemocentroEntity entity) {
        hemocentroService.validarEPadronizarTelefone(entity);
    }

    @Override
    public void beforeDelete(Hemocentro.Id id) {
    }
}
