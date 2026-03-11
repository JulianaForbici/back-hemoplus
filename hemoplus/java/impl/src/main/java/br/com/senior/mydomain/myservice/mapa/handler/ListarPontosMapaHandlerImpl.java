package br.com.senior.mydomain.myservice.mapa.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.DadosMapa;
import br.com.senior.mydomain.myservice.ListarPontosMapa;
import br.com.senior.mydomain.myservice.ListarPontosMapaInput;
import br.com.senior.mydomain.myservice.ListarPontosMapaOutput;
import br.com.senior.mydomain.myservice.mapa.MapaService;
import javax.inject.Inject;

@HandlerImpl
public class ListarPontosMapaHandlerImpl implements ListarPontosMapa {

    @Inject
    private MapaService mapaService;

    @Override
    public ListarPontosMapaOutput listarPontosMapa(ListarPontosMapaInput request) {

        final String usuarioId = request != null ? request.usuarioId : null;
        final DadosMapa dados = mapaService.listarPontosMapa(usuarioId);
        final ListarPontosMapaOutput out = new ListarPontosMapaOutput();
        out.dados = dados;
        return out;
    }
}