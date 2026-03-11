package br.com.senior.mydomain.myservice.usuario;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.UsuarioEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.UUID;

@Service
public class UsuarioService {

    @Inject
    private UsuarioRepository usuarioRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    public UsuarioEntity buscarAtivo(UUID usuarioId) {
        return buscarAtivo(usuarioId, "br.com.senior.my_domain.my_service.common.usuario.naoEncontrado", "br.com.senior.my_domain.my_service.agendamento.criar.usuarioInativo");
    }

    public UsuarioEntity buscarAtivo(UUID usuarioId, String keyNaoEncontrado, String keyInativo) {

        if (usuarioId == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuarioId.invalido"));
        }

        final UsuarioEntity usuario = usuarioRepository.findById(usuarioId).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage(keyNaoEncontrado)));

        validarAtivo(usuario, keyInativo);
        return usuario;
    }

    public UsuarioEntity buscarAtivo(String usuarioIdStr, String keyIdInvalido, String keyNaoEncontrado, String keyInativo) {
        final UUID usuarioId = parseUuid(usuarioIdStr, keyIdInvalido);
        return buscarAtivo(usuarioId, keyNaoEncontrado, keyInativo);
    }

    public UsuarioEntity buscarPorId(UUID usuarioId, String keyNaoEncontrado) {
        if (usuarioId == null) {throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuarioId.invalido"));
        }

        return usuarioRepository.findById(usuarioId).orElseThrow(() ->
                new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage(keyNaoEncontrado)));
    }

    public UUID parseUuid(String value, String keyErro) {
        try {
            if (value == null || value.trim().isEmpty()) {
                throw new IllegalArgumentException("blank");
            }
            return UUID.fromString(value.trim());
        } catch (Exception e) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyErro));
        }
    }

    public void validarAtivo(UsuarioEntity usuario, String keyInativo) {
        if (usuario == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuario.naoEncontrado"));
        }
        if (usuario.getAtivo() != null && !usuario.getAtivo()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyInativo)
            );
        }
    }
}