package br.com.senior.mydomain.myservice.usuario;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.UsuarioEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    @DisplayName("buscarAtivo(UUID): deve retornar usuario quando existir e estiver ativo")
    void buscarAtivo_uuid_deveRetornarQuandoAtivo() {
        UUID id = UUID.randomUUID();
        UsuarioEntity u = new UsuarioEntity();
        u.setId(id);
        u.setAtivo(true);

        when(usuarioRepository.findById(id)).thenReturn(Optional.of(u));

        UsuarioEntity out = usuarioService.buscarAtivo(id);

        assertNotNull(out);
        assertEquals(id, out.getId());
        verify(usuarioRepository).findById(id);
    }

    @Test
    @DisplayName("buscarAtivo(UUID): deve lançar OBJECT_NOT_FOUND quando não existir")
    void buscarAtivo_uuid_deveLancarQuandoNaoEncontrar() {
        UUID id = UUID.randomUUID();

        when(usuarioRepository.findById(id)).thenReturn(Optional.empty());
        when(translationHubApi.getMessage("k.naoEncontrado")).thenReturn("NAO_ENCONTRADO");

        ServiceException ex = assertThrows(ServiceException.class, () -> usuarioService.buscarAtivo(id, "k.naoEncontrado", "k.inativo"));

        assertEquals(ErrorCategory.OBJECT_NOT_FOUND, ex.getCategory());
        assertEquals("NAO_ENCONTRADO", ex.getMessage());
    }

    @Test
    @DisplayName("buscarAtivo(UUID): deve lançar BAD_REQUEST quando usuário estiver inativo")
    void buscarAtivo_uuid_deveLancarQuandoInativo() {
        UUID id = UUID.randomUUID();
        UsuarioEntity u = new UsuarioEntity();
        u.setId(id);
        u.setAtivo(false);

        when(usuarioRepository.findById(id)).thenReturn(Optional.of(u));
        when(translationHubApi.getMessage("k.inativo")).thenReturn("INATIVO");

        ServiceException ex = assertThrows(ServiceException.class, () -> usuarioService.buscarAtivo(id, "k.naoEncontrado", "k.inativo"));

        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("INATIVO", ex.getMessage());
    }

    @Test
    @DisplayName("buscarAtivo(String): deve lançar BAD_REQUEST quando UUID inválido")
    void buscarAtivo_string_deveLancarQuandoUuidInvalido() {
        when(translationHubApi.getMessage("k.idInvalido")).thenReturn("ID_INVALIDO");

        ServiceException ex = assertThrows(ServiceException.class,
                () -> usuarioService.buscarAtivo("nao-uuid", "k.idInvalido", "k.naoEncontrado", "k.inativo"));

        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("ID_INVALIDO", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("buscarAtivo(String): deve retornar usuário quando UUID ok e usuário ativo")
    void buscarAtivo_string_deveRetornarQuandoAtivo() {
        UUID id = UUID.randomUUID();
        UsuarioEntity u = new UsuarioEntity();
        u.setId(id);
        u.setAtivo(true);

        when(usuarioRepository.findById(id)).thenReturn(Optional.of(u));

        UsuarioEntity out = usuarioService.buscarAtivo(id.toString(), "k.idInvalido", "k.naoEncontrado", "k.inativo");

        assertNotNull(out);
        assertEquals(id, out.getId());
        verify(usuarioRepository).findById(id);
    }

    @Test
    @DisplayName("buscarPorId(UUID): deve retornar usuário quando existir")
    void buscarPorId_deveRetornar() {
        UUID id = UUID.randomUUID();
        UsuarioEntity u = new UsuarioEntity();
        u.setId(id);

        when(usuarioRepository.findById(id)).thenReturn(Optional.of(u));

        UsuarioEntity out = usuarioService.buscarPorId(id, "k.naoEncontrado");

        assertNotNull(out);
        assertEquals(id, out.getId());
    }

    @Test
    @DisplayName("parseUuid: deve retornar UUID quando válido")
    void parseUuid_deveRetornarQuandoValido() {
        UUID id = UUID.randomUUID();
        UUID out = usuarioService.parseUuid("  " + id + "  ", "k.idInvalido");
        assertEquals(id, out);
    }
}