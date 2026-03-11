package br.com.senior.mydomain.myservice.mapa;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.hemocentro.HemocentroRepository;
import br.com.senior.mydomain.myservice.usuario.UsuarioRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MapaServiceTest {

    @Mock
    private HemocentroRepository hemocentroRepository;

    @Mock private
    UsuarioRepository usuarioRepository;

    @Mock private
    TranslationHubApi translationHubApi;

    @InjectMocks
    private MapaService service;

    private HemocentroEntity hemocentro(UUID id, String nome, Double lat, Double lng) {
        HemocentroEntity h = new HemocentroEntity();
        h.setId(id);
        h.setNome(nome);
        h.setLatitude(lat);
        h.setLongitude(lng);
        return h;
    }

    private UsuarioEntity usuario(UUID id, String nome, Double lat, Double lng) {
        UsuarioEntity u = new UsuarioEntity();
        u.setId(id);
        u.setNomeCompleto(nome);
        u.setLatitude(lat);
        u.setLongitude(lng);
        return u;
    }

    @Test
    @DisplayName("Deve retornar hemocentros mapeados mesmo quando usuarioId for null")
    void listarPontosMapa_deveRetornarSomenteHemocentrosQuandoUsuarioIdNull() {
        UUID h1 = UUID.randomUUID();
        UUID h2 = UUID.randomUUID();

        when(hemocentroRepository.findAtivosComCoordenadas()).thenReturn(List.of(hemocentro(h1, "Hemo 1", -27.0, -49.0), hemocentro(h2, "Hemo 2", -26.9, -48.9)));
        DadosMapa out = service.listarPontosMapa(null);

        assertNotNull(out);
        assertNotNull(out.hemocentros);
        assertEquals(2, out.hemocentros.size());
        assertNull(out.usuario);

        PontoMapa p1 = out.hemocentros.get(0);
        assertEquals(h1.toString(), p1.id);
        assertEquals("Hemo 1", p1.nome);
        assertEquals(-27.0, p1.latitude);
        assertEquals(-49.0, p1.longitude);
        assertEquals("HEMOCENTRO", p1.tipo);

        verify(hemocentroRepository).findAtivosComCoordenadas();
        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("Quando usuarioId for blank, não deve buscar usuário e não deve preencher ponto do usuário")
    void listarPontosMapa_naoDeveBuscarUsuarioQuandoUsuarioIdBlank() {
        when(hemocentroRepository.findAtivosComCoordenadas()).thenReturn(List.of(
                hemocentro(UUID.randomUUID(), "Hemo", -27.0, -49.0)));

        DadosMapa out = service.listarPontosMapa("   ");

        assertNotNull(out);
        assertEquals(1, out.hemocentros.size());
        assertNull(out.usuario);

        verify(hemocentroRepository).findAtivosComCoordenadas();
        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando usuarioId não for UUID válido")
    void listarPontosMapa_deveLancarQuandoUsuarioIdInvalido() {
        when(hemocentroRepository.findAtivosComCoordenadas()).thenReturn(Collections.emptyList());

        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuarioId.invalido")).thenReturn("ID_INVALIDO");

        ServiceException ex = assertThrows(ServiceException.class, () -> service.listarPontosMapa("nao-uuid"));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("ID_INVALIDO", ex.getMessage());
        verify(hemocentroRepository).findAtivosComCoordenadas();
        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("Deve lançar OBJECT_NOT_FOUND quando usuário não existir")
    void listarPontosMapa_deveLancarQuandoUsuarioNaoEncontrado() {
        UUID userId = UUID.randomUUID();
        when(hemocentroRepository.findAtivosComCoordenadas()).thenReturn(Collections.emptyList());
        when(usuarioRepository.findById(userId)).thenReturn(Optional.empty());
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.usuario.naoEncontrado")).thenReturn("USUARIO_NAO_ENCONTRADO");

        ServiceException ex = assertThrows(ServiceException.class, () -> service.listarPontosMapa(" " + userId + " "));

        assertEquals(ErrorCategory.OBJECT_NOT_FOUND, ex.getCategory());
        assertEquals("USUARIO_NAO_ENCONTRADO", ex.getMessage());

        verify(usuarioRepository).findById(userId);
    }

    @Test
    @DisplayName("Se usuário existir mas não tiver latitude/longitude, não deve preencher out.usuario")
    void listarPontosMapa_usuarioSemCoordenadas_naoPreenche() {
        UUID userId = UUID.randomUUID();

        when(hemocentroRepository.findAtivosComCoordenadas()).thenReturn(List.of(hemocentro(UUID.randomUUID(), "Hemo", -27.0, -49.0)));

        UsuarioEntity u = usuario(userId, "Ju", null, -49.1);
        when(usuarioRepository.findById(userId)).thenReturn(Optional.of(u));

        DadosMapa out = service.listarPontosMapa(userId.toString());

        assertNotNull(out);
        assertEquals(1, out.hemocentros.size());
        assertNull(out.usuario);

        verify(usuarioRepository).findById(userId);
    }

    @Test
    @DisplayName("Deve preencher ponto do usuário quando existir e tiver latitude/longitude")
    void listarPontosMapa_devePreencherUsuarioQuandoTemCoordenadas() {
        UUID userId = UUID.randomUUID();

        when(hemocentroRepository.findAtivosComCoordenadas()).thenReturn(List.of(hemocentro(UUID.randomUUID(), "Hemo", -27.0, -49.0)));

        UsuarioEntity u = usuario(userId, "Juliana", -27.123, -49.321);
        when(usuarioRepository.findById(userId)).thenReturn(Optional.of(u));

        DadosMapa out = service.listarPontosMapa(userId.toString());

        assertNotNull(out);
        assertEquals(1, out.hemocentros.size());
        assertNotNull(out.usuario);

        assertEquals(userId.toString(), out.usuario.id);
        assertEquals("Juliana", out.usuario.nome);
        assertEquals(-27.123, out.usuario.latitude);
        assertEquals(-49.321, out.usuario.longitude);
        assertEquals("USUARIO", out.usuario.tipo);
    }
}