/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Estoque.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface EstoqueCrudService extends CrudService<EstoqueEntity> {
	
	public EstoqueEntity createEstoque(EstoqueEntity toCreate);
	
	@Deprecated
	public EstoqueEntity createMergeEstoque(EstoqueEntity toCreateMerge);
	
	public EstoqueEntity updateEstoque(EstoqueEntity toUpdate);
	
	@Deprecated
	public EstoqueEntity updateMergeEstoque(EstoqueEntity toUpdateMerge);
	
	public void deleteEstoque(Id id);
	
	public EstoqueEntity retrieveEstoque(Id id);
	
	@Deprecated
	public List<EstoqueEntity> listEstoque(int skip, int top);
	
	public Page<EstoqueEntity> listEstoquePageable(int skip, int top);
	
	public Page<EstoqueEntity> listEstoquePageable(int skip, int top, String orderBy);
	
	public Page<EstoqueEntity> listEstoquePageable(int skip, int top, String orderBy, String filter);
	
	public Page<EstoqueEntity> listEstoquePageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkEstoque(List<EstoqueEntity> entities);

	public EstoqueBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
