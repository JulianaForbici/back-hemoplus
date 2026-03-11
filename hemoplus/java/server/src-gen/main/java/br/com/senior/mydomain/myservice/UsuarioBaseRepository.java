/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import org.springframework.data.jpa.repository.Query;
import br.com.senior.messaging.customspringdata.CustomRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UsuarioBaseRepository extends CustomRepository<UsuarioEntity, java.util.UUID> {
	
	@Query("select d from my_domain.my_service.UsuarioEntity p left join p.agendamentos d where p.id = ?1 and d.id = ?2")
	AgendamentoEntity findAgendamentosByUsuarioIdAndAgendamentoId(java.util.UUID UsuarioId, java.util.UUID AgendamentoId);
	
}
