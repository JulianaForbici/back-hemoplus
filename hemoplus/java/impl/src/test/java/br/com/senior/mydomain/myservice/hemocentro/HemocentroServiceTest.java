package br.com.senior.mydomain.myservice.hemocentro;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.HemocentroEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class HemocentroServiceTest {

    @Mock
    private HemocentroRepository hemocentroRepository;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private HemocentroService service;

    @Test
    @DisplayName("listarAtivosComCoordenadas deve delegar para repository")
    public void listarAtivosComCoordenadas_DeveDelegar() {
        List<HemocentroEntity> list = Arrays.asList(new HemocentroEntity(), new HemocentroEntity());
        when(hemocentroRepository.findByAtivoTrue()).thenReturn(list);
        List<HemocentroEntity> out = service.listarAtivosComCoordenadas();
        assertNotNull(out);
        assertEquals(2, out.size());
        verify(hemocentroRepository).findByAtivoTrue();
    }

    @Test
    @DisplayName("validarEPadronizarTelefone deve lançar quando telefone nulo/branco")
    public void validarTelefone_DeveLancarObrigatorio() throws Exception {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.hemocentro.TELEFONE.obrigatorio")).thenReturn("Telefone obrigatório");

        HemocentroEntity h = new HemocentroEntity();
        h.setTelefone("   ");

        try {
            invokeValidarTelefone(h);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("Telefone obrigatório", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.hemocentro.TELEFONE.obrigatorio");
    }

    @Test
    @DisplayName("validarEPadronizarTelefone deve lançar quando formato inválido (tamanho != 10/11)")
    public void validarTelefone_DeveLancarFormatoTamanho() throws Exception {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.hemocentro.TELEFONE.formato")).thenReturn("Formato inválido");

        HemocentroEntity h = new HemocentroEntity();
        h.setTelefone("999");

        try {
            invokeValidarTelefone(h);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("Formato inválido", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.hemocentro.TELEFONE.formato");
    }

    @Test
    @DisplayName("validarEPadronizarTelefone deve remover DDI 55 quando vier e padronizar para 11 dígitos")
    public void validarTelefone_DeveRemoverDDI55() throws Exception {
        HemocentroEntity h = new HemocentroEntity();
        h.setTelefone("+55 (47) 98888-7777");
        invokeValidarTelefone(h);
        assertEquals("47988887777", h.getTelefone());
        verifyNoInteractions(translationHubApi);
    }

    @Test
    @DisplayName("validarEPadronizarTelefone deve lançar quando DDD começar com 0")
    public void validarTelefone_DeveLancarDDDComZero() throws Exception {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.hemocentro.TELEFONE.formato"))
                .thenReturn("Formato inválido");

        HemocentroEntity h = new HemocentroEntity();
        h.setTelefone("01 99999-9999");

        try {
            invokeValidarTelefone(h);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("Formato inválido", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.hemocentro.TELEFONE.formato");
    }

    private void invokeValidarTelefone(HemocentroEntity entity) throws Exception {
        Method m = HemocentroService.class.getDeclaredMethod("validarEPadronizarTelefone", HemocentroEntity.class);
        m.setAccessible(true);
        try {
            m.invoke(service, entity);
        } catch (java.lang.reflect.InvocationTargetException ite) {
            if (ite.getCause() instanceof RuntimeException) throw (RuntimeException) ite.getCause();
            throw ite;
        }
    }
}