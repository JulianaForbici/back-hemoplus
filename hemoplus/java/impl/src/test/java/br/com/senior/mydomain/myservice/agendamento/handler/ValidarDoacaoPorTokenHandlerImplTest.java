package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.mydomain.myservice.Doacao;
import br.com.senior.mydomain.myservice.DoacaoEntity;
import br.com.senior.mydomain.myservice.ValidarDoacaoPorTokenInput;
import br.com.senior.mydomain.myservice.ValidarDoacaoPorTokenOutput;
import br.com.senior.mydomain.myservice.doacao.DoacaoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.Instant;
import java.util.UUID;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ValidarDoacaoPorTokenHandlerImplTest {

    @Mock
    private DoacaoService doacaoService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private ValidarDoacaoPorTokenHandlerImpl handler;

    @Test
    @DisplayName("Deve validar doacao passando null quando request for nulo e retornar dto/retorno")
    public void deveValidarQuandoRequestNulo() {
        // Arrange
        DoacaoEntity entity = new DoacaoEntity();
        entity.setId(null); // cobre ternário id null
        entity.setDataHoraConfirmacao(Instant.parse("2026-02-10T10:00:00Z"));
        entity.setResponsavelValidacao(null);

        when(doacaoService.validarPorToken(null, null)).thenReturn(entity);
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.sucesso"))
                .thenReturn("Sucesso");

        // Act
        ValidarDoacaoPorTokenOutput out = handler.validarDoacaoPorToken(null);

        // Assert
        assertNotNull(out);
        assertNotNull(out.retorno);
        assertEquals("Sucesso", out.retorno.mensagem);
        assertNull(out.retorno.codigo);
        assertFalse(Boolean.TRUE.equals(out.retorno.contemErro));

        assertNotNull(out.doacao);
        assertNull(out.doacao.id);
        assertEquals(entity.getDataHoraConfirmacao(), out.doacao.dataHoraConfirmacao);
        assertNull(out.doacao.responsavelValidacao);
        assertNull(out.doacao.usuario);
        assertNull(out.doacao.hemocentro);
        assertNull(out.doacao.agendamento);

        verify(doacaoService, times(1)).validarPorToken(null, null);
        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.sucesso");
    }

    @Test
    @DisplayName("Deve validar doacao passando token/responsavel quando request valido e retornar dto/retorno")
    public void deveValidarQuandoRequestValido() {
        // Arrange
        ValidarDoacaoPorTokenInput in = new ValidarDoacaoPorTokenInput();
        in.token = "tok123";
        in.responsavelValidacao = "Admin";

        UUID id = UUID.randomUUID();

        DoacaoEntity entity = new DoacaoEntity();
        entity.setId(id);
        entity.setDataHoraConfirmacao(Instant.parse("2026-02-10T10:00:00Z"));
        entity.setResponsavelValidacao("Admin");

        when(doacaoService.validarPorToken("tok123", "Admin")).thenReturn(entity);
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.sucesso"))
                .thenReturn("Sucesso");

        // Act
        ValidarDoacaoPorTokenOutput out = handler.validarDoacaoPorToken(in);

        // Assert
        assertNotNull(out);
        assertNotNull(out.retorno);
        assertEquals("Sucesso", out.retorno.mensagem);
        assertEquals(id.toString(), out.retorno.codigo);
        assertFalse(Boolean.TRUE.equals(out.retorno.contemErro));

        Doacao dto = out.doacao;
        assertNotNull(dto);
        assertEquals(id.toString(), dto.id);
        assertEquals(entity.getDataHoraConfirmacao(), dto.dataHoraConfirmacao);
        assertEquals("Admin", dto.responsavelValidacao);
        assertNull(dto.usuario);
        assertNull(dto.hemocentro);
        assertNull(dto.agendamento);

        verify(doacaoService, times(1)).validarPorToken("tok123", "Admin");
        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.sucesso");
    }
}