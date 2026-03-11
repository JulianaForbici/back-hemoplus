/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Agendamento.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface AgendamentoCrudService extends CrudService<AgendamentoEntity> {
	
	public AgendamentoEntity createAgendamento(AgendamentoEntity toCreate);
	
	@Deprecated
	public AgendamentoEntity createMergeAgendamento(AgendamentoEntity toCreateMerge);
	
	public AgendamentoEntity updateAgendamento(AgendamentoEntity toUpdate);
	
	@Deprecated
	public AgendamentoEntity updateMergeAgendamento(AgendamentoEntity toUpdateMerge);
	
	public void deleteAgendamento(Id id);
	
	public AgendamentoEntity retrieveAgendamento(Id id);
	
	@Deprecated
	public List<AgendamentoEntity> listAgendamento(int skip, int top);
	
	public Page<AgendamentoEntity> listAgendamentoPageable(int skip, int top);
	
	public Page<AgendamentoEntity> listAgendamentoPageable(int skip, int top, String orderBy);
	
	public Page<AgendamentoEntity> listAgendamentoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<AgendamentoEntity> listAgendamentoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkAgendamento(List<AgendamentoEntity> entities);

	public AgendamentoBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
