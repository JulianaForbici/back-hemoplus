package br.com.senior.mydomain.myservice.mapa.handler;

import br.com.senior.mydomain.myservice.DadosMapa;
import br.com.senior.mydomain.myservice.ListarPontosMapaInput;
import br.com.senior.mydomain.myservice.ListarPontosMapaOutput;
import br.com.senior.mydomain.myservice.mapa.MapaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ListarPontosMapaHandlerImplTest {

    @Mock
    private MapaService mapaService;

    @InjectMocks
    private ListarPontosMapaHandlerImpl handler;

    @Test
    @DisplayName("Deve chamar service com usuarioId quando request não for null e retornar dados no output")
    void listarPontosMapa_devePassarUsuarioIdEMapearOutput() {
        ListarPontosMapaInput in = new ListarPontosMapaInput();
        in.usuarioId = "abc";
        DadosMapa dados = new DadosMapa();
        when(mapaService.listarPontosMapa("abc")).thenReturn(dados);

        ListarPontosMapaOutput out = handler.listarPontosMapa(in);

        assertNotNull(out);
        assertSame(dados, out.dados);
        verify(mapaService).listarPontosMapa("abc");
    }

    @Test
    @DisplayName("Deve chamar service com null quando request for null")
    void listarPontosMapa_devePassarNullQuandoRequestNull() {
        DadosMapa dados = new DadosMapa();
        when(mapaService.listarPontosMapa(null)).thenReturn(dados);

        ListarPontosMapaOutput out = handler.listarPontosMapa(null);

        assertNotNull(out);
        assertSame(dados, out.dados);
        verify(mapaService).listarPontosMapa(null);
    }
}