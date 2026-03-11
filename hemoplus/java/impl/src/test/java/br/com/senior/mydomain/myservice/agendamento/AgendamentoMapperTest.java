package br.com.senior.mydomain.myservice.agendamento;

import br.com.senior.mydomain.myservice.Agendamento;
import br.com.senior.mydomain.myservice.AgendamentoEntity;
import br.com.senior.mydomain.myservice.StatusAgendamento;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

class AgendamentoMapperTest {

    @Test
    @DisplayName("toDto deve retornar null quando entity for null")
    void toDto_deveRetornarNullQuandoEntityNull() {
        assertNull(AgendamentoMapper.toDto(null));
    }

    @Test
    @DisplayName("toDto deve mapear todos os campos simples e manter relacionamentos como null")
    void toDto_deveMapearCamposSimples() {
        UUID id = UUID.randomUUID();
        Instant dataHora = Instant.parse("2026-02-25T10:00:00Z");
        Instant dataCriacao = Instant.parse("2026-02-20T12:00:00Z");
        Instant dataAtualizacao = Instant.parse("2026-02-21T13:00:00Z");
        Instant tokenExpiraEm = Instant.parse("2026-02-26T10:00:00Z");
        Instant tokenUsadoEm = Instant.parse("2026-02-25T11:00:00Z");
        AgendamentoEntity e = new AgendamentoEntity();
        e.setId(id);
        e.setDataHora(dataHora);
        e.setStatus(StatusAgendamento.CONFIRMADO);
        e.setObservacao("obs");
        e.setMotivoStatus("motivo");
        e.setDataCriacao(dataCriacao);
        e.setDataAtualizacao(dataAtualizacao);
        e.setToken("tok");
        e.setTokenExpiraEm(tokenExpiraEm);
        e.setTokenUsadoEm(tokenUsadoEm);
        Agendamento dto = AgendamentoMapper.toDto(e);
        assertNotNull(dto);
        assertEquals(id.toString(), dto.id);
        assertEquals(dataHora, dto.dataHora);
        assertEquals(StatusAgendamento.CONFIRMADO, dto.status);
        assertEquals("obs", dto.observacao);
        assertEquals("motivo", dto.motivoStatus);
        assertEquals(dataCriacao, dto.dataCriacao);
        assertEquals(dataAtualizacao, dto.dataAtualizacao);
        assertEquals("tok", dto.token);
        assertEquals(tokenExpiraEm, dto.tokenExpiraEm);
        assertEquals(tokenUsadoEm, dto.tokenUsadoEm);
        assertNull(dto.usuario);
        assertNull(dto.hemocentro);
        assertNull(dto.doacoes);
    }

    @Test
    @DisplayName("toDto deve setar id null quando entity.id for null")
    void toDto_deveSetarIdNullQuandoEntityIdNull() {
        AgendamentoEntity e = new AgendamentoEntity();
        e.setId(null);
        Agendamento dto = AgendamentoMapper.toDto(e);
        assertNotNull(dto);
        assertNull(dto.id);
    }
}