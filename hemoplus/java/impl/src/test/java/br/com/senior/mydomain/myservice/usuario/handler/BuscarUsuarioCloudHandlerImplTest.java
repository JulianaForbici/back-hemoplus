package br.com.senior.mydomain.myservice.usuario.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
class BuscarUsuarioCloudHandlerImplTest {

    private static final String MSG_USUARIO_CLOUD_OBRIGATORIO = "br.com.senior.my_domain.my_service.usuario.buscarUsuarioCloud.usuarioCloudObrigatorio";

    @Mock
    private EntityManager em;

    @Mock
    private TranslationHubApi translationHubApi;

    @Mock
    private TypedQuery<UsuarioEntity> typedQuery;

    @InjectMocks
    private BuscarUsuarioCloudHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando usuarioCloud for null/blank")
    void buscarUsuarioCloud_deveLancarQuandoUsuarioCloudObrigatorio() {
        when(translationHubApi.getMessage(MSG_USUARIO_CLOUD_OBRIGATORIO)).thenReturn("OBRIGATORIO");
        BuscarUsuarioCloudInput in1 = new BuscarUsuarioCloudInput();
        in1.usuarioCloud = null;
        ServiceException ex1 = assertThrows(ServiceException.class, () -> handler.buscarUsuarioCloud(in1));
        assertEquals(ErrorCategory.BAD_REQUEST, ex1.getCategory());
        assertEquals("OBRIGATORIO", ex1.getMessage());
        BuscarUsuarioCloudInput in2 = new BuscarUsuarioCloudInput();
        in2.usuarioCloud = "   ";
        ServiceException ex2 = assertThrows(ServiceException.class, () -> handler.buscarUsuarioCloud(in2));
        assertEquals(ErrorCategory.BAD_REQUEST, ex2.getCategory());
        assertEquals("OBRIGATORIO", ex2.getMessage());
        verifyNoInteractions(em);
    }

    @Test
    @DisplayName("Deve retornar output com null quando não encontrar usuário")
    void buscarUsuarioCloud_deveRetornarNullQuandoNaoEncontrar() {
        when(em.createQuery(anyString(), eq(UsuarioEntity.class))).thenReturn(typedQuery);
        when(typedQuery.setParameter(eq("usuarioCloud"), eq("abc"))).thenReturn(typedQuery);
        when(typedQuery.setMaxResults(1)).thenReturn(typedQuery);
        when(typedQuery.getResultList()).thenReturn(Collections.emptyList());
        BuscarUsuarioCloudInput in = new BuscarUsuarioCloudInput();
        in.usuarioCloud = "  abc  ";

        BuscarUsuarioCloudOutput out = handler.buscarUsuarioCloud(in);
        assertNotNull(out);
        assertNull(out.usuario);
        verify(em).createQuery(eq("select u from my_domain.my_service.UsuarioEntity u where u.usuarioCloud = :usuarioCloud"), eq(UsuarioEntity.class));
        verify(typedQuery).setParameter("usuarioCloud", "abc");
        verify(typedQuery).setMaxResults(1);
        verify(typedQuery).getResultList();
    }

    @Test
    @DisplayName("Deve mapear UsuarioEntity para DTO quando encontrar usuário")
    void buscarUsuarioCloud_deveMapearQuandoEncontrar() {
        UUID id = UUID.randomUUID();
        UsuarioEntity entity = mock(UsuarioEntity.class);
        when(entity.getId()).thenReturn(id);
        when(entity.getNomeCompleto()).thenReturn("Ju");
        when(entity.getEmail()).thenReturn("ju@email.com");
        when(entity.getTelefone()).thenReturn("47999999999");
        when(entity.getCpf()).thenReturn("123.456.789-00");
        when(entity.getAtivo()).thenReturn(true);
        when(entity.getUsuarioCloud()).thenReturn("cloud-1");
        when(entity.getTipoUsuario()).thenReturn(TipoUsuario.DOADOR);
        when(entity.getTipoSangue()).thenReturn(TipoSangue.A);
        when(entity.getFatorRh()).thenReturn(FatorRh.POSITIVO);
        when(entity.getLatitude()).thenReturn(-27.1);
        when(entity.getLongitude()).thenReturn(-49.2);
        when(entity.getDataNascimento()).thenReturn(LocalDate.of(2000, 1, 1));
        when(entity.getDataCadastro()).thenReturn(Instant.parse("2026-02-24T12:00:00Z"));
        when(em.createQuery(anyString(), eq(UsuarioEntity.class))).thenReturn(typedQuery);
        when(typedQuery.setParameter(eq("usuarioCloud"), eq("abc"))).thenReturn(typedQuery);
        when(typedQuery.setMaxResults(1)).thenReturn(typedQuery);
        when(typedQuery.getResultList()).thenReturn(List.of(entity));
        BuscarUsuarioCloudInput in = new BuscarUsuarioCloudInput();
        in.usuarioCloud = "abc";
        BuscarUsuarioCloudOutput out = handler.buscarUsuarioCloud(in);
        assertNotNull(out);
        assertNotNull(out.usuario);
        Usuario dto = out.usuario;
        assertEquals(id.toString(), dto.id);
        assertEquals("Ju", dto.nomeCompleto);
        assertEquals("ju@email.com", dto.email);
        assertEquals("47999999999", dto.telefone);
        assertEquals("123.456.789-00", dto.cpf);
        assertEquals(true, dto.ativo);
        assertEquals("cloud-1", dto.usuarioCloud);
        assertEquals(TipoUsuario.DOADOR, dto.tipoUsuario);
        assertEquals(TipoSangue.A, dto.tipoSangue);
        assertEquals(FatorRh.POSITIVO, dto.fatorRh);
        assertEquals(-27.1, dto.latitude);
        assertEquals(-49.2, dto.longitude);
        assertEquals(LocalDate.of(2000, 1, 1), dto.dataNascimento);
        assertEquals(Instant.parse("2026-02-24T12:00:00Z"), dto.dataCadastro);
        verify(typedQuery).setParameter("usuarioCloud", "abc");
        verify(typedQuery).setMaxResults(1);
        verify(typedQuery).getResultList();
    }
}