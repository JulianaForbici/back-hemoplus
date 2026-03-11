package br.com.senior.mydomain.myservice.mapa;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.DadosMapa;
import br.com.senior.mydomain.myservice.HemocentroEntity;
import br.com.senior.mydomain.myservice.PontoMapa;
import br.com.senior.mydomain.myservice.UsuarioEntity;
import br.com.senior.mydomain.myservice.hemocentro.HemocentroRepository;
import br.com.senior.mydomain.myservice.usuario.UsuarioRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class MapaService {

    @Inject
    private HemocentroRepository hemocentroRepository;

    @Inject
    private UsuarioRepository usuarioRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    public DadosMapa listarPontosMapa(String usuarioId) {
        final List<HemocentroEntity> hemocentros = hemocentroRepository.findAtivosComCoordenadas();
        final List<PontoMapa> pontosHemocentro = hemocentros.stream().map(this::toPontoHemocentro).collect(Collectors.toList());
        final DadosMapa out = new DadosMapa();
        out.hemocentros = pontosHemocentro;

        if (usuarioId != null && !usuarioId.isBlank()) {
            final UUID id = parseUuid(usuarioId, "br.com.senior.my_domain.my_service.common.usuarioId.invalido");
            final UsuarioEntity usuario = usuarioRepository.findById(id).orElseThrow(()
                    -> new ServiceException(ErrorCategory.OBJECT_NOT_FOUND,
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuario.naoEncontrado")));

            if (usuario.getLatitude() != null && usuario.getLongitude() != null) {
                out.usuario = toPontoUsuario(usuario);
            }
        }
        return out;
    }

    private UUID parseUuid(String value, String keyErro) {
        try {
            return UUID.fromString(value.trim());
        } catch (Exception e) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyErro));
        }
    }

    private PontoMapa toPontoHemocentro(HemocentroEntity h) {
        final PontoMapa p = new PontoMapa();
        p.id = h.getId() != null ? h.getId().toString() : null;
        p.nome = h.getNome();
        p.latitude = h.getLatitude();
        p.longitude = h.getLongitude();
        p.tipo = "HEMOCENTRO";
        return p;
    }

    private PontoMapa toPontoUsuario(UsuarioEntity u) {
        final PontoMapa p = new PontoMapa();
        p.id = u.getId() != null ? u.getId().toString() : null;
        p.nome = u.getNomeCompleto();
        p.latitude = u.getLatitude();
        p.longitude = u.getLongitude();
        p.tipo = "USUARIO";
        return p;
    }
}