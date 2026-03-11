/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Hemocentro.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface HemocentroCrudService extends CrudService<HemocentroEntity> {
	
	public HemocentroEntity createHemocentro(HemocentroEntity toCreate);
	
	@Deprecated
	public HemocentroEntity createMergeHemocentro(HemocentroEntity toCreateMerge);
	
	public HemocentroEntity updateHemocentro(HemocentroEntity toUpdate);
	
	@Deprecated
	public HemocentroEntity updateMergeHemocentro(HemocentroEntity toUpdateMerge);
	
	public void deleteHemocentro(Id id);
	
	public HemocentroEntity retrieveHemocentro(Id id);
	
	@Deprecated
	public List<HemocentroEntity> listHemocentro(int skip, int top);
	
	public Page<HemocentroEntity> listHemocentroPageable(int skip, int top);
	
	public Page<HemocentroEntity> listHemocentroPageable(int skip, int top, String orderBy);
	
	public Page<HemocentroEntity> listHemocentroPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkHemocentro(List<HemocentroEntity> entities);

	public HemocentroBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
