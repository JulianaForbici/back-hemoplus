package br.com.senior.mydomain.myservice.usuario;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.FatorRh;
import br.com.senior.mydomain.myservice.TipoSangue;
import br.com.senior.mydomain.myservice.UsuarioEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
class UsuarioCrudValidatorImplTest {

    @Mock
    private TranslationHubApi translationHubApi;

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioCrudValidatorImpl validator;

    private UsuarioEntity baseValida() {
        UsuarioEntity u = new UsuarioEntity();
        u.setNomeCompleto("Juliana Forbici");
        u.setCpf("529.982.247-25");
        u.setEmail("  JU@EMAIL.COM ");
        u.setTelefone("+55 (47) 99999-9999");
        u.setTipoSangue(TipoSangue.A);
        u.setFatorRh(FatorRh.POSITIVO);
        return u;
    }

    private void stubMsg(String key) {
        when(translationHubApi.getMessage(key)).thenReturn(key);
    }

    @Test
    @DisplayName("beforeCreate: deve padronizar cpf/email/telefone e validar unicidade (create)")
    void beforeCreate_devePadronizarEValidarUnicidade() {
        UsuarioEntity u = baseValida();

        when(usuarioRepository.existsByCpf(anyString())).thenReturn(false);
        when(usuarioRepository.existsByEmail(anyString())).thenReturn(false);
        when(usuarioRepository.existsByTelefone(anyString())).thenReturn(false);

        validator.beforeCreate(u);

        assertEquals("52998224725", u.getCpf());
        assertEquals("ju@email.com", u.getEmail());
        assertEquals("47999999999", u.getTelefone());

        verify(usuarioRepository).existsByCpf("52998224725");
        verify(usuarioRepository).existsByEmail("ju@email.com");
        verify(usuarioRepository).existsByTelefone("47999999999");
    }

    @Test
    @DisplayName("beforeUpdate: deve validar unicidade usando AndIdNot (update)")
    void beforeUpdate_deveUsarAndIdNot() {
        UsuarioEntity u = baseValida();
        UUID id = UUID.randomUUID();
        u.setId(id);

        when(usuarioRepository.existsByCpfAndIdNot(anyString(), eq(id))).thenReturn(false);
        when(usuarioRepository.existsByEmailAndIdNot(anyString(), eq(id))).thenReturn(false);
        when(usuarioRepository.existsByTelefoneAndIdNot(anyString(), eq(id))).thenReturn(false);

        validator.beforeUpdate(u);

        assertEquals("52998224725", u.getCpf());
        assertEquals("ju@email.com", u.getEmail());
        assertEquals("47999999999", u.getTelefone());

        verify(usuarioRepository).existsByCpfAndIdNot("52998224725", id);
        verify(usuarioRepository).existsByEmailAndIdNot("ju@email.com", id);
        verify(usuarioRepository).existsByTelefoneAndIdNot("47999999999", id);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando tipoSangue for null")
    void beforeCreate_deveLancarQuandoSemTipoSangue() {
        stubMsg("br.com.senior.my_domain.my_service.common.tipoSangue.obrigatorio");

        UsuarioEntity u = baseValida();
        u.setTipoSangue(null);

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.common.tipoSangue.obrigatorio", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando fatorRh for null")
    void beforeCreate_deveLancarQuandoSemFatorRh() {
        stubMsg("br.com.senior.my_domain.my_service.common.fatorRh.obrigatorio");

        UsuarioEntity u = baseValida();
        u.setFatorRh(null);

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.common.fatorRh.obrigatorio", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando CPF obrigatório")
    void beforeCreate_deveLancarQuandoCpfObrigatorio() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.CPF.obrigatorio");

        UsuarioEntity u = baseValida();
        u.setCpf("   ");

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.CPF.obrigatorio", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando CPF formato inválido (não 11 dígitos)")
    void beforeCreate_deveLancarQuandoCpfFormatoInvalido() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.CPF.formato");

        UsuarioEntity u = baseValida();
        u.setCpf("123");

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.CPF.formato", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando CPF inválido (dígitos verificadores)")
    void beforeCreate_deveLancarQuandoCpfInvalido() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.CPF.invalido");

        UsuarioEntity u = baseValida();
        u.setCpf("111.111.111-11");

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.CPF.invalido", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando CPF já existe")
    void beforeCreate_deveLancarQuandoCpfJaExiste() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.CPF.jaExiste");

        UsuarioEntity u = baseValida();

        when(usuarioRepository.existsByCpf("52998224725")).thenReturn(true);

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.CPF.jaExiste", ex.getMessage());

        verify(usuarioRepository).existsByCpf("52998224725");
        verify(usuarioRepository, never()).existsByEmail(anyString());
        verify(usuarioRepository, never()).existsByTelefone(anyString());
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando email obrigatório")
    void beforeCreate_deveLancarQuandoEmailObrigatorio() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.EMAIL.obrigatorio");

        UsuarioEntity u = baseValida();
        u.setEmail(" ");

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.EMAIL.obrigatorio", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando email formato inválido")
    void beforeCreate_deveLancarQuandoEmailFormato() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.EMAIL.formato");

        UsuarioEntity u = baseValida();
        u.setEmail("sem-arroba.com");

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.EMAIL.formato", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando email já existe")
    void beforeCreate_deveLancarQuandoEmailJaExiste() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.EMAIL.jaExiste");

        UsuarioEntity u = baseValida();

        when(usuarioRepository.existsByCpf("52998224725")).thenReturn(false);
        when(usuarioRepository.existsByEmail("ju@email.com")).thenReturn(true);

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.EMAIL.jaExiste", ex.getMessage());

        verify(usuarioRepository).existsByCpf("52998224725");
        verify(usuarioRepository).existsByEmail("ju@email.com");
        verify(usuarioRepository, never()).existsByTelefone(anyString());
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando telefone obrigatório")
    void beforeCreate_deveLancarQuandoTelefoneObrigatorio() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.TELEFONE.obrigatorio");

        UsuarioEntity u = baseValida();
        u.setTelefone(null);

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.TELEFONE.obrigatorio", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando telefone formato inválido (tamanho)")
    void beforeCreate_deveLancarQuandoTelefoneFormatoTamanho() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.TELEFONE.formato");

        UsuarioEntity u = baseValida();
        u.setTelefone("123");

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.TELEFONE.formato", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando telefone formato inválido (ddd com 0)")
    void beforeCreate_deveLancarQuandoTelefoneFormatoDddZero() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.TELEFONE.formato");

        UsuarioEntity u = baseValida();
        u.setTelefone("00 9999-9999");

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.TELEFONE.formato", ex.getMessage());

        verifyNoInteractions(usuarioRepository);
    }

    @Test
    @DisplayName("beforeCreate: deve lançar quando telefone já existe")
    void beforeCreate_deveLancarQuandoTelefoneJaExiste() {
        stubMsg("br.com.senior.my_domain.my_service.usuario.TELEFONE.jaExiste");

        UsuarioEntity u = baseValida();

        when(usuarioRepository.existsByCpf("52998224725")).thenReturn(false);
        when(usuarioRepository.existsByEmail("ju@email.com")).thenReturn(false);
        when(usuarioRepository.existsByTelefone("47999999999")).thenReturn(true);

        ServiceException ex = assertThrows(ServiceException.class, () -> validator.beforeCreate(u));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("br.com.senior.my_domain.my_service.usuario.TELEFONE.jaExiste", ex.getMessage());

        verify(usuarioRepository).existsByCpf("52998224725");
        verify(usuarioRepository).existsByEmail("ju@email.com");
        verify(usuarioRepository).existsByTelefone("47999999999");
    }
}