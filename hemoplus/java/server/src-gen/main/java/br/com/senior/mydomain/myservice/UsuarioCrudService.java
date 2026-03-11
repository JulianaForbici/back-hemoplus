/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Usuario.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface UsuarioCrudService extends CrudService<UsuarioEntity> {
	
	public UsuarioEntity createUsuario(UsuarioEntity toCreate);
	
	@Deprecated
	public UsuarioEntity createMergeUsuario(UsuarioEntity toCreateMerge);
	
	public UsuarioEntity updateUsuario(UsuarioEntity toUpdate);
	
	@Deprecated
	public UsuarioEntity updateMergeUsuario(UsuarioEntity toUpdateMerge);
	
	public void deleteUsuario(Id id);
	
	public UsuarioEntity retrieveUsuario(Id id);
	
	@Deprecated
	public List<UsuarioEntity> listUsuario(int skip, int top);
	
	public Page<UsuarioEntity> listUsuarioPageable(int skip, int top);
	
	public Page<UsuarioEntity> listUsuarioPageable(int skip, int top, String orderBy);
	
	public Page<UsuarioEntity> listUsuarioPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkUsuario(List<UsuarioEntity> entities);

	public UsuarioBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
