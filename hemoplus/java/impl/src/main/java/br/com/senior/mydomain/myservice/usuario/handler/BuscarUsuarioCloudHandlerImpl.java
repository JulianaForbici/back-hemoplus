package br.com.senior.mydomain.myservice.usuario.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.BuscarUsuarioCloud;
import br.com.senior.mydomain.myservice.BuscarUsuarioCloudInput;
import br.com.senior.mydomain.myservice.BuscarUsuarioCloudOutput;
import br.com.senior.mydomain.myservice.Usuario;
import br.com.senior.mydomain.myservice.UsuarioEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@HandlerImpl
public class BuscarUsuarioCloudHandlerImpl implements BuscarUsuarioCloud {

    @PersistenceContext
    private EntityManager em;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    public BuscarUsuarioCloudOutput buscarUsuarioCloud(BuscarUsuarioCloudInput request) {

        final String usuarioCloud = request.usuarioCloud;

        if (usuarioCloud == null || usuarioCloud.trim().isEmpty()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.buscarUsuarioCloud.usuarioCloudObrigatorio"));
        }

        TypedQuery<UsuarioEntity> q = em.createQuery("select u from my_domain.my_service.UsuarioEntity u where u.usuarioCloud = :usuarioCloud", UsuarioEntity.class);
        q.setParameter("usuarioCloud", usuarioCloud.trim());
        List<UsuarioEntity> encontrados = q.setMaxResults(1).getResultList();
        UsuarioEntity entity = encontrados.isEmpty() ? null : encontrados.get(0);
        if (entity == null) {
            return new BuscarUsuarioCloudOutput(null);
        }

        Usuario dto = new Usuario();
        dto.id = entity.getId() != null ? entity.getId().toString() : null;
        dto.nomeCompleto = entity.getNomeCompleto();
        dto.email = entity.getEmail();
        dto.telefone = entity.getTelefone();
        dto.cpf = entity.getCpf();
        dto.ativo = entity.getAtivo();
        dto.usuarioCloud = entity.getUsuarioCloud();
        dto.tipoUsuario = entity.getTipoUsuario();
        dto.tipoSangue = entity.getTipoSangue();
        dto.fatorRh = entity.getFatorRh();
        dto.latitude = entity.getLatitude();
        dto.longitude = entity.getLongitude();
        dto.dataNascimento = entity.getDataNascimento();
        dto.dataCadastro = entity.getDataCadastro();
        return new BuscarUsuarioCloudOutput(dto);
    }
}