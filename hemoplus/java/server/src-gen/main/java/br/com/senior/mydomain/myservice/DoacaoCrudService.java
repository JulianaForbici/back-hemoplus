/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Doacao.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface DoacaoCrudService extends CrudService<DoacaoEntity> {
	
	public DoacaoEntity createDoacao(DoacaoEntity toCreate);
	
	@Deprecated
	public DoacaoEntity createMergeDoacao(DoacaoEntity toCreateMerge);
	
	public DoacaoEntity updateDoacao(DoacaoEntity toUpdate);
	
	@Deprecated
	public DoacaoEntity updateMergeDoacao(DoacaoEntity toUpdateMerge);
	
	public void deleteDoacao(Id id);
	
	public DoacaoEntity retrieveDoacao(Id id);
	
	@Deprecated
	public List<DoacaoEntity> listDoacao(int skip, int top);
	
	public Page<DoacaoEntity> listDoacaoPageable(int skip, int top);
	
	public Page<DoacaoEntity> listDoacaoPageable(int skip, int top, String orderBy);
	
	public Page<DoacaoEntity> listDoacaoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<DoacaoEntity> listDoacaoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkDoacao(List<DoacaoEntity> entities);

	public DoacaoBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
