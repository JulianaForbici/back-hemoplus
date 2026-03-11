/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

public interface MyServiceConstants {
    String DOMAIN = "my_domain";
    String SERVICE = "my_service";
    
    interface Commands {
    	/**
    	 * query de exemplo retorna uma mensagem de ola com o nome informado
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * actions de agendamento
    	 * @see CriarAgendamentoInput the request payload
    	 */
    	String CRIAR_AGENDAMENTO = "criarAgendamento";
    	/**
    	 * The success response primitive for criarAgendamento.
    	 *
    	 * @see #CRIAR_AGENDAMENTO the request primitive
    	 * @see CriarAgendamentoOutput the response payload
    	 */
    	String CRIAR_AGENDAMENTO_RESPONSE = "criarAgendamentoResponse";
    	/**
    	 * An error response primitive for criarAgendamento.
    	 *
    	 * @see #CRIAR_AGENDAMENTO the request primitive
    	 */
    	String CRIAR_AGENDAMENTO_ERROR = "criarAgendamentoError";
    	/**
    	 * @see ConfirmarAgendamentoInput the request payload
    	 */
    	String CONFIRMAR_AGENDAMENTO = "confirmarAgendamento";
    	/**
    	 * The success response primitive for confirmarAgendamento.
    	 *
    	 * @see #CONFIRMAR_AGENDAMENTO the request primitive
    	 * @see ConfirmarAgendamentoOutput the response payload
    	 */
    	String CONFIRMAR_AGENDAMENTO_RESPONSE = "confirmarAgendamentoResponse";
    	/**
    	 * An error response primitive for confirmarAgendamento.
    	 *
    	 * @see #CONFIRMAR_AGENDAMENTO the request primitive
    	 */
    	String CONFIRMAR_AGENDAMENTO_ERROR = "confirmarAgendamentoError";
    	/**
    	 * @see CancelarAgendamentoInput the request payload
    	 */
    	String CANCELAR_AGENDAMENTO = "cancelarAgendamento";
    	/**
    	 * The success response primitive for cancelarAgendamento.
    	 *
    	 * @see #CANCELAR_AGENDAMENTO the request primitive
    	 * @see CancelarAgendamentoOutput the response payload
    	 */
    	String CANCELAR_AGENDAMENTO_RESPONSE = "cancelarAgendamentoResponse";
    	/**
    	 * An error response primitive for cancelarAgendamento.
    	 *
    	 * @see #CANCELAR_AGENDAMENTO the request primitive
    	 */
    	String CANCELAR_AGENDAMENTO_ERROR = "cancelarAgendamentoError";
    	/**
    	 * @see MarcarNaoCompareceuPorPeriodoInput the request payload
    	 */
    	String MARCAR_NAO_COMPARECEU_POR_PERIODO = "marcarNaoCompareceuPorPeriodo";
    	/**
    	 * The success response primitive for marcarNaoCompareceuPorPeriodo.
    	 *
    	 * @see #MARCAR_NAO_COMPARECEU_POR_PERIODO the request primitive
    	 * @see MarcarNaoCompareceuPorPeriodoOutput the response payload
    	 */
    	String MARCAR_NAO_COMPARECEU_POR_PERIODO_RESPONSE = "marcarNaoCompareceuPorPeriodoResponse";
    	/**
    	 * An error response primitive for marcarNaoCompareceuPorPeriodo.
    	 *
    	 * @see #MARCAR_NAO_COMPARECEU_POR_PERIODO the request primitive
    	 */
    	String MARCAR_NAO_COMPARECEU_POR_PERIODO_ERROR = "marcarNaoCompareceuPorPeriodoError";
    	/**
    	 * validacao de doacao por token
    	 * @see ValidarDoacaoPorTokenInput the request payload
    	 */
    	String VALIDAR_DOACAO_POR_TOKEN = "validarDoacaoPorToken";
    	/**
    	 * The success response primitive for validarDoacaoPorToken.
    	 *
    	 * @see #VALIDAR_DOACAO_POR_TOKEN the request primitive
    	 * @see ValidarDoacaoPorTokenOutput the response payload
    	 */
    	String VALIDAR_DOACAO_POR_TOKEN_RESPONSE = "validarDoacaoPorTokenResponse";
    	/**
    	 * An error response primitive for validarDoacaoPorToken.
    	 *
    	 * @see #VALIDAR_DOACAO_POR_TOKEN the request primitive
    	 */
    	String VALIDAR_DOACAO_POR_TOKEN_ERROR = "validarDoacaoPorTokenError";
    	/**
    	 * actions de estoque
    	 * @see AjustarEstoqueInput the request payload
    	 */
    	String AJUSTAR_ESTOQUE = "ajustarEstoque";
    	/**
    	 * The success response primitive for ajustarEstoque.
    	 *
    	 * @see #AJUSTAR_ESTOQUE the request primitive
    	 * @see AjustarEstoqueOutput the response payload
    	 */
    	String AJUSTAR_ESTOQUE_RESPONSE = "ajustarEstoqueResponse";
    	/**
    	 * An error response primitive for ajustarEstoque.
    	 *
    	 * @see #AJUSTAR_ESTOQUE the request primitive
    	 */
    	String AJUSTAR_ESTOQUE_ERROR = "ajustarEstoqueError";
    	/**
    	 * queries de agendamento
    	 * @see ListarAgendamentosPorPeriodoInput the request payload
    	 */
    	String LISTAR_AGENDAMENTOS_POR_PERIODO = "listarAgendamentosPorPeriodo";
    	/**
    	 * The success response primitive for listarAgendamentosPorPeriodo.
    	 *
    	 * @see #LISTAR_AGENDAMENTOS_POR_PERIODO the request primitive
    	 * @see ListarAgendamentosPorPeriodoOutput the response payload
    	 */
    	String LISTAR_AGENDAMENTOS_POR_PERIODO_RESPONSE = "listarAgendamentosPorPeriodoResponse";
    	/**
    	 * An error response primitive for listarAgendamentosPorPeriodo.
    	 *
    	 * @see #LISTAR_AGENDAMENTOS_POR_PERIODO the request primitive
    	 */
    	String LISTAR_AGENDAMENTOS_POR_PERIODO_ERROR = "listarAgendamentosPorPeriodoError";
    	/**
    	 * queries de mapa e usuario
    	 * @see ListarPontosMapaInput the request payload
    	 */
    	String LISTAR_PONTOS_MAPA = "listarPontosMapa";
    	/**
    	 * The success response primitive for listarPontosMapa.
    	 *
    	 * @see #LISTAR_PONTOS_MAPA the request primitive
    	 * @see ListarPontosMapaOutput the response payload
    	 */
    	String LISTAR_PONTOS_MAPA_RESPONSE = "listarPontosMapaResponse";
    	/**
    	 * An error response primitive for listarPontosMapa.
    	 *
    	 * @see #LISTAR_PONTOS_MAPA the request primitive
    	 */
    	String LISTAR_PONTOS_MAPA_ERROR = "listarPontosMapaError";
    	/**
    	 * @see BuscarUsuarioCloudInput the request payload
    	 */
    	String BUSCAR_USUARIO_CLOUD = "buscarUsuarioCloud";
    	/**
    	 * The success response primitive for buscarUsuarioCloud.
    	 *
    	 * @see #BUSCAR_USUARIO_CLOUD the request primitive
    	 * @see BuscarUsuarioCloudOutput the response payload
    	 */
    	String BUSCAR_USUARIO_CLOUD_RESPONSE = "buscarUsuarioCloudResponse";
    	/**
    	 * An error response primitive for buscarUsuarioCloud.
    	 *
    	 * @see #BUSCAR_USUARIO_CLOUD the request primitive
    	 */
    	String BUSCAR_USUARIO_CLOUD_ERROR = "buscarUsuarioCloudError";
    	/**
    	 * queries de dashboard
    	 * @see BuscarDashboardResumoAgendamentosInput the request payload
    	 */
    	String BUSCAR_DASHBOARD_RESUMO_AGENDAMENTOS = "buscarDashboardResumoAgendamentos";
    	/**
    	 * The success response primitive for buscarDashboardResumoAgendamentos.
    	 *
    	 * @see #BUSCAR_DASHBOARD_RESUMO_AGENDAMENTOS the request primitive
    	 * @see BuscarDashboardResumoAgendamentosOutput the response payload
    	 */
    	String BUSCAR_DASHBOARD_RESUMO_AGENDAMENTOS_RESPONSE = "buscarDashboardResumoAgendamentosResponse";
    	/**
    	 * An error response primitive for buscarDashboardResumoAgendamentos.
    	 *
    	 * @see #BUSCAR_DASHBOARD_RESUMO_AGENDAMENTOS the request primitive
    	 */
    	String BUSCAR_DASHBOARD_RESUMO_AGENDAMENTOS_ERROR = "buscarDashboardResumoAgendamentosError";
    	/**
    	 * @see BuscarDashboardSerieAgendamentosPorDiaInput the request payload
    	 */
    	String BUSCAR_DASHBOARD_SERIE_AGENDAMENTOS_POR_DIA = "buscarDashboardSerieAgendamentosPorDia";
    	/**
    	 * The success response primitive for buscarDashboardSerieAgendamentosPorDia.
    	 *
    	 * @see #BUSCAR_DASHBOARD_SERIE_AGENDAMENTOS_POR_DIA the request primitive
    	 * @see BuscarDashboardSerieAgendamentosPorDiaOutput the response payload
    	 */
    	String BUSCAR_DASHBOARD_SERIE_AGENDAMENTOS_POR_DIA_RESPONSE = "buscarDashboardSerieAgendamentosPorDiaResponse";
    	/**
    	 * An error response primitive for buscarDashboardSerieAgendamentosPorDia.
    	 *
    	 * @see #BUSCAR_DASHBOARD_SERIE_AGENDAMENTOS_POR_DIA the request primitive
    	 */
    	String BUSCAR_DASHBOARD_SERIE_AGENDAMENTOS_POR_DIA_ERROR = "buscarDashboardSerieAgendamentosPorDiaError";
    	/**
    	 * queries de estoque
    	 * @see ListarEstoquePorHemocentroInput the request payload
    	 */
    	String LISTAR_ESTOQUE_POR_HEMOCENTRO = "listarEstoquePorHemocentro";
    	/**
    	 * The success response primitive for listarEstoquePorHemocentro.
    	 *
    	 * @see #LISTAR_ESTOQUE_POR_HEMOCENTRO the request primitive
    	 * @see ListarEstoquePorHemocentroOutput the response payload
    	 */
    	String LISTAR_ESTOQUE_POR_HEMOCENTRO_RESPONSE = "listarEstoquePorHemocentroResponse";
    	/**
    	 * An error response primitive for listarEstoquePorHemocentro.
    	 *
    	 * @see #LISTAR_ESTOQUE_POR_HEMOCENTRO the request primitive
    	 */
    	String LISTAR_ESTOQUE_POR_HEMOCENTRO_ERROR = "listarEstoquePorHemocentroError";
    	/**
    	 * @see ListarTiposEmFaltaInput the request payload
    	 */
    	String LISTAR_TIPOS_EM_FALTA = "listarTiposEmFalta";
    	/**
    	 * The success response primitive for listarTiposEmFalta.
    	 *
    	 * @see #LISTAR_TIPOS_EM_FALTA the request primitive
    	 * @see ListarTiposEmFaltaOutput the response payload
    	 */
    	String LISTAR_TIPOS_EM_FALTA_RESPONSE = "listarTiposEmFaltaResponse";
    	/**
    	 * An error response primitive for listarTiposEmFalta.
    	 *
    	 * @see #LISTAR_TIPOS_EM_FALTA the request primitive
    	 */
    	String LISTAR_TIPOS_EM_FALTA_ERROR = "listarTiposEmFaltaError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	String ODATA = "odata";
    	/**
    	 * The success response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_RESPONSE = "odataResponse";
    	/**
    	 * An error response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_ERROR = "odataError";
    	/**
    	 * @see ImportUsuarioInput the request payload
    	 */
    	String IMPORT_USUARIO = "importUsuario";
    	/**
    	 * The success response primitive for importUsuario.
    	 *
    	 * @see #IMPORT_USUARIO the request primitive
    	 * @see ImportUsuarioOutput the response payload
    	 */
    	String IMPORT_USUARIO_RESPONSE = "importUsuarioResponse";
    	/**
    	 * An error response primitive for importUsuario.
    	 *
    	 * @see #IMPORT_USUARIO the request primitive
    	 */
    	String IMPORT_USUARIO_ERROR = "importUsuarioError";
    	/**
    	 * @see ExportUsuarioInput the request payload
    	 */
    	String EXPORT_USUARIO = "exportUsuario";
    	/**
    	 * The success response primitive for exportUsuario.
    	 *
    	 * @see #EXPORT_USUARIO the request primitive
    	 * @see ExportUsuarioOutput the response payload
    	 */
    	String EXPORT_USUARIO_RESPONSE = "exportUsuarioResponse";
    	/**
    	 * An error response primitive for exportUsuario.
    	 *
    	 * @see #EXPORT_USUARIO the request primitive
    	 */
    	String EXPORT_USUARIO_ERROR = "exportUsuarioError";
    	/**
    	 * @see ImportHemocentroInput the request payload
    	 */
    	String IMPORT_HEMOCENTRO = "importHemocentro";
    	/**
    	 * The success response primitive for importHemocentro.
    	 *
    	 * @see #IMPORT_HEMOCENTRO the request primitive
    	 * @see ImportHemocentroOutput the response payload
    	 */
    	String IMPORT_HEMOCENTRO_RESPONSE = "importHemocentroResponse";
    	/**
    	 * An error response primitive for importHemocentro.
    	 *
    	 * @see #IMPORT_HEMOCENTRO the request primitive
    	 */
    	String IMPORT_HEMOCENTRO_ERROR = "importHemocentroError";
    	/**
    	 * @see ExportHemocentroInput the request payload
    	 */
    	String EXPORT_HEMOCENTRO = "exportHemocentro";
    	/**
    	 * The success response primitive for exportHemocentro.
    	 *
    	 * @see #EXPORT_HEMOCENTRO the request primitive
    	 * @see ExportHemocentroOutput the response payload
    	 */
    	String EXPORT_HEMOCENTRO_RESPONSE = "exportHemocentroResponse";
    	/**
    	 * An error response primitive for exportHemocentro.
    	 *
    	 * @see #EXPORT_HEMOCENTRO the request primitive
    	 */
    	String EXPORT_HEMOCENTRO_ERROR = "exportHemocentroError";
    	/**
    	 * @see ImportEstoqueInput the request payload
    	 */
    	String IMPORT_ESTOQUE = "importEstoque";
    	/**
    	 * The success response primitive for importEstoque.
    	 *
    	 * @see #IMPORT_ESTOQUE the request primitive
    	 * @see ImportEstoqueOutput the response payload
    	 */
    	String IMPORT_ESTOQUE_RESPONSE = "importEstoqueResponse";
    	/**
    	 * An error response primitive for importEstoque.
    	 *
    	 * @see #IMPORT_ESTOQUE the request primitive
    	 */
    	String IMPORT_ESTOQUE_ERROR = "importEstoqueError";
    	/**
    	 * @see ExportEstoqueInput the request payload
    	 */
    	String EXPORT_ESTOQUE = "exportEstoque";
    	/**
    	 * The success response primitive for exportEstoque.
    	 *
    	 * @see #EXPORT_ESTOQUE the request primitive
    	 * @see ExportEstoqueOutput the response payload
    	 */
    	String EXPORT_ESTOQUE_RESPONSE = "exportEstoqueResponse";
    	/**
    	 * An error response primitive for exportEstoque.
    	 *
    	 * @see #EXPORT_ESTOQUE the request primitive
    	 */
    	String EXPORT_ESTOQUE_ERROR = "exportEstoqueError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Usuario entity.
    	 * @see Usuario the request payload
    	 */
    	String CREATE_USUARIO = "createUsuario";
    	/**
    	 * The success response primitive for createUsuario.
    	 *
    	 * @see #CREATE_USUARIO the request primitive
    	 */
    	String CREATE_USUARIO_RESPONSE = "createUsuarioResponse";
    	/**
    	 * An error response primitive for createUsuario.
    	 *
    	 * @see #CREATE_USUARIO the request primitive
    	 */
    	String CREATE_USUARIO_ERROR = "createUsuarioError";
    	/**
    	 * The 'createBulk' request primitive for the Usuario entity.
    	 * @see CreateBulkUsuarioInput the request payload
    	 */
    	String CREATE_BULK_USUARIO = "createBulkUsuario";
    	/**
    	 * The success response primitive for createBulkUsuario.
    	 *
    	 * @see #CREATE_BULK_USUARIO the request primitive
    	 * @see CreateBulkUsuarioOutput the response payload
    	 */
    	String CREATE_BULK_USUARIO_RESPONSE = "createBulkUsuarioResponse";
    	/**
    	 * An error response primitive for createBulkUsuario.
    	 *
    	 * @see #CREATE_BULK_USUARIO the request primitive
    	 */
    	String CREATE_BULK_USUARIO_ERROR = "createBulkUsuarioError";
    	/**
    	 * The 'createMerge' request primitive for the Usuario entity.
    	 * @see Usuario the request payload
    	 */
    	String CREATE_MERGE_USUARIO = "createMergeUsuario";
    	/**
    	 * The success response primitive for createMergeUsuario.
    	 *
    	 * @see #CREATE_MERGE_USUARIO the request primitive
    	 */
    	String CREATE_MERGE_USUARIO_RESPONSE = "createMergeUsuarioResponse";
    	/**
    	 * An error response primitive for createMergeUsuario.
    	 *
    	 * @see #CREATE_MERGE_USUARIO the request primitive
    	 */
    	String CREATE_MERGE_USUARIO_ERROR = "createMergeUsuarioError";
    	/**
    	 * The 'retrieve' request primitive for the Usuario entity.
    	 * @see Usuario.GetRequest the request payload
    	 */
    	String RETRIEVE_USUARIO = "retrieveUsuario";
    	/**
    	 * The success response primitive for retrieveUsuario.
    	 *
    	 * @see #RETRIEVE_USUARIO the request primitive
    	 */
    	String RETRIEVE_USUARIO_RESPONSE = "retrieveUsuarioResponse";
    	/**
    	 * An error response primitive for retrieveUsuario.
    	 *
    	 * @see #RETRIEVE_USUARIO the request primitive
    	 */
    	String RETRIEVE_USUARIO_ERROR = "retrieveUsuarioError";
    	/**
    	 * The 'list' request primitive for the Usuario entity.
    	 * @see usuario.pageRequest the request payload
    	 */
    	String LIST_USUARIO = "listUsuario";
    	/**
    	 * The success response primitive for listUsuario.
    	 *
    	 * @see #LIST_USUARIO the request primitive
    	 * @see Usuario.PagedResults the response payload
    	 */
    	String LIST_USUARIO_RESPONSE = "listUsuarioResponse";
    	/**
    	 * An error response primitive for listUsuario.
    	 *
    	 * @see #LIST_USUARIO the request primitive
    	 */
    	String LIST_USUARIO_ERROR = "listUsuarioError";
    	/**
    	 * The 'update' request primitive for the Usuario entity.
    	 * @see Usuario the request payload
    	 */
    	String UPDATE_USUARIO = "updateUsuario";
    	/**
    	 * The success response primitive for updateUsuario.
    	 *
    	 * @see #UPDATE_USUARIO the request primitive
    	 */
    	String UPDATE_USUARIO_RESPONSE = "updateUsuarioResponse";
    	/**
    	 * An error response primitive for updateUsuario.
    	 *
    	 * @see #UPDATE_USUARIO the request primitive
    	 */
    	String UPDATE_USUARIO_ERROR = "updateUsuarioError";
    	/**
    	 * The 'updateMerge' request primitive for the Usuario entity.
    	 * @see Usuario the request payload
    	 */
    	String UPDATE_MERGE_USUARIO = "updateMergeUsuario";
    	/**
    	 * The success response primitive for updateMergeUsuario.
    	 *
    	 * @see #UPDATE_MERGE_USUARIO the request primitive
    	 */
    	String UPDATE_MERGE_USUARIO_RESPONSE = "updateMergeUsuarioResponse";
    	/**
    	 * An error response primitive for updateMergeUsuario.
    	 *
    	 * @see #UPDATE_MERGE_USUARIO the request primitive
    	 */
    	String UPDATE_MERGE_USUARIO_ERROR = "updateMergeUsuarioError";
    	/**
    	 * The 'delete' request primitive for the Usuario entity.
    	 * @see Usuario.Id the request payload
    	 */
    	String DELETE_USUARIO = "deleteUsuario";
    	/**
    	 * The success response primitive for deleteUsuario.
    	 *
    	 * @see #DELETE_USUARIO the request primitive
    	 */
    	String DELETE_USUARIO_RESPONSE = "deleteUsuarioResponse";
    	/**
    	 * An error response primitive for deleteUsuario.
    	 *
    	 * @see #DELETE_USUARIO the request primitive
    	 */
    	String DELETE_USUARIO_ERROR = "deleteUsuarioError";
    	/**
    	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
    	 * @see Agendamento the request payload
    	 */
    	String CREATE_USUARIO_AGENDAMENTOS = "createUsuario_Agendamentos";
    	/**
    	 * The success response primitive for createUsuario_Agendamentos.
    	 *
    	 * @see #CREATE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String CREATE_USUARIO_AGENDAMENTOS_RESPONSE = "createUsuario_AgendamentosResponse";
    	/**
    	 * An error response primitive for createUsuario_Agendamentos.
    	 *
    	 * @see #CREATE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String CREATE_USUARIO_AGENDAMENTOS_ERROR = "createUsuario_AgendamentosError";
    	/**
    	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
    	 * @see Agendamento the request payload
    	 */
    	String CREATE_MERGE_USUARIO_AGENDAMENTOS = "createMergeUsuario_Agendamentos";
    	/**
    	 * The success response primitive for createMergeUsuario_Agendamentos.
    	 *
    	 * @see #CREATE_MERGE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String CREATE_MERGE_USUARIO_AGENDAMENTOS_RESPONSE = "createMergeUsuario_AgendamentosResponse";
    	/**
    	 * An error response primitive for createMergeUsuario_Agendamentos.
    	 *
    	 * @see #CREATE_MERGE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String CREATE_MERGE_USUARIO_AGENDAMENTOS_ERROR = "createMergeUsuario_AgendamentosError";
    	/**
    	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
    	 * @see Agendamento the request payload
    	 */
    	String UPDATE_USUARIO_AGENDAMENTOS = "updateUsuario_Agendamentos";
    	/**
    	 * The success response primitive for updateUsuario_Agendamentos.
    	 *
    	 * @see #UPDATE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String UPDATE_USUARIO_AGENDAMENTOS_RESPONSE = "updateUsuario_AgendamentosResponse";
    	/**
    	 * An error response primitive for updateUsuario_Agendamentos.
    	 *
    	 * @see #UPDATE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String UPDATE_USUARIO_AGENDAMENTOS_ERROR = "updateUsuario_AgendamentosError";
    	/**
    	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
    	 * @see Agendamento the request payload
    	 */
    	String UPDATE_MERGE_USUARIO_AGENDAMENTOS = "updateMergeUsuario_Agendamentos";
    	/**
    	 * The success response primitive for updateMergeUsuario_Agendamentos.
    	 *
    	 * @see #UPDATE_MERGE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String UPDATE_MERGE_USUARIO_AGENDAMENTOS_RESPONSE = "updateMergeUsuario_AgendamentosResponse";
    	/**
    	 * An error response primitive for updateMergeUsuario_Agendamentos.
    	 *
    	 * @see #UPDATE_MERGE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String UPDATE_MERGE_USUARIO_AGENDAMENTOS_ERROR = "updateMergeUsuario_AgendamentosError";
    	/**
    	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
    	 * @see Agendamento.GetRequest the request payload
    	 */
    	String RETRIEVE_USUARIO_AGENDAMENTOS = "retrieveUsuario_Agendamentos";
    	/**
    	 * The success response primitive for retrieveUsuario_Agendamentos.
    	 *
    	 * @see #RETRIEVE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String RETRIEVE_USUARIO_AGENDAMENTOS_RESPONSE = "retrieveUsuario_AgendamentosResponse";
    	/**
    	 * An error response primitive for retrieveUsuario_Agendamentos.
    	 *
    	 * @see #RETRIEVE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String RETRIEVE_USUARIO_AGENDAMENTOS_ERROR = "retrieveUsuario_AgendamentosError";
    	/**
    	 * The 'delete' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
    	 * @see Agendamento.Id the request payload
    	 */
    	String DELETE_USUARIO_AGENDAMENTOS = "deleteUsuario_Agendamentos";
    	/**
    	 * The success response primitive for deleteUsuario_Agendamentos.
    	 *
    	 * @see #DELETE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String DELETE_USUARIO_AGENDAMENTOS_RESPONSE = "deleteUsuario_AgendamentosResponse";
    	/**
    	 * An error response primitive for deleteUsuario_Agendamentos.
    	 *
    	 * @see #DELETE_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String DELETE_USUARIO_AGENDAMENTOS_ERROR = "deleteUsuario_AgendamentosError";
    	/**
    	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
    	 * @see agendamento.pageRequest the request payload
    	 */
    	String LIST_USUARIO_AGENDAMENTOS = "listUsuario_Agendamentos";
    	/**
    	 * The success response primitive for listUsuario_Agendamentos.
    	 *
    	 * @see #LIST_USUARIO_AGENDAMENTOS the request primitive
    	 * @see Agendamento.PagedResults the response payload
    	 */
    	String LIST_USUARIO_AGENDAMENTOS_RESPONSE = "listUsuario_AgendamentosResponse";
    	/**
    	 * An error response primitive for listUsuario_Agendamentos.
    	 *
    	 * @see #LIST_USUARIO_AGENDAMENTOS the request primitive
    	 */
    	String LIST_USUARIO_AGENDAMENTOS_ERROR = "listUsuario_AgendamentosError";
    	/**
    	 * The 'create' request primitive for the Hemocentro entity.
    	 * @see Hemocentro the request payload
    	 */
    	String CREATE_HEMOCENTRO = "createHemocentro";
    	/**
    	 * The success response primitive for createHemocentro.
    	 *
    	 * @see #CREATE_HEMOCENTRO the request primitive
    	 */
    	String CREATE_HEMOCENTRO_RESPONSE = "createHemocentroResponse";
    	/**
    	 * An error response primitive for createHemocentro.
    	 *
    	 * @see #CREATE_HEMOCENTRO the request primitive
    	 */
    	String CREATE_HEMOCENTRO_ERROR = "createHemocentroError";
    	/**
    	 * The 'createBulk' request primitive for the Hemocentro entity.
    	 * @see CreateBulkHemocentroInput the request payload
    	 */
    	String CREATE_BULK_HEMOCENTRO = "createBulkHemocentro";
    	/**
    	 * The success response primitive for createBulkHemocentro.
    	 *
    	 * @see #CREATE_BULK_HEMOCENTRO the request primitive
    	 * @see CreateBulkHemocentroOutput the response payload
    	 */
    	String CREATE_BULK_HEMOCENTRO_RESPONSE = "createBulkHemocentroResponse";
    	/**
    	 * An error response primitive for createBulkHemocentro.
    	 *
    	 * @see #CREATE_BULK_HEMOCENTRO the request primitive
    	 */
    	String CREATE_BULK_HEMOCENTRO_ERROR = "createBulkHemocentroError";
    	/**
    	 * The 'createMerge' request primitive for the Hemocentro entity.
    	 * @see Hemocentro the request payload
    	 */
    	String CREATE_MERGE_HEMOCENTRO = "createMergeHemocentro";
    	/**
    	 * The success response primitive for createMergeHemocentro.
    	 *
    	 * @see #CREATE_MERGE_HEMOCENTRO the request primitive
    	 */
    	String CREATE_MERGE_HEMOCENTRO_RESPONSE = "createMergeHemocentroResponse";
    	/**
    	 * An error response primitive for createMergeHemocentro.
    	 *
    	 * @see #CREATE_MERGE_HEMOCENTRO the request primitive
    	 */
    	String CREATE_MERGE_HEMOCENTRO_ERROR = "createMergeHemocentroError";
    	/**
    	 * The 'retrieve' request primitive for the Hemocentro entity.
    	 * @see Hemocentro.GetRequest the request payload
    	 */
    	String RETRIEVE_HEMOCENTRO = "retrieveHemocentro";
    	/**
    	 * The success response primitive for retrieveHemocentro.
    	 *
    	 * @see #RETRIEVE_HEMOCENTRO the request primitive
    	 */
    	String RETRIEVE_HEMOCENTRO_RESPONSE = "retrieveHemocentroResponse";
    	/**
    	 * An error response primitive for retrieveHemocentro.
    	 *
    	 * @see #RETRIEVE_HEMOCENTRO the request primitive
    	 */
    	String RETRIEVE_HEMOCENTRO_ERROR = "retrieveHemocentroError";
    	/**
    	 * The 'list' request primitive for the Hemocentro entity.
    	 * @see hemocentro.pageRequest the request payload
    	 */
    	String LIST_HEMOCENTRO = "listHemocentro";
    	/**
    	 * The success response primitive for listHemocentro.
    	 *
    	 * @see #LIST_HEMOCENTRO the request primitive
    	 * @see Hemocentro.PagedResults the response payload
    	 */
    	String LIST_HEMOCENTRO_RESPONSE = "listHemocentroResponse";
    	/**
    	 * An error response primitive for listHemocentro.
    	 *
    	 * @see #LIST_HEMOCENTRO the request primitive
    	 */
    	String LIST_HEMOCENTRO_ERROR = "listHemocentroError";
    	/**
    	 * The 'update' request primitive for the Hemocentro entity.
    	 * @see Hemocentro the request payload
    	 */
    	String UPDATE_HEMOCENTRO = "updateHemocentro";
    	/**
    	 * The success response primitive for updateHemocentro.
    	 *
    	 * @see #UPDATE_HEMOCENTRO the request primitive
    	 */
    	String UPDATE_HEMOCENTRO_RESPONSE = "updateHemocentroResponse";
    	/**
    	 * An error response primitive for updateHemocentro.
    	 *
    	 * @see #UPDATE_HEMOCENTRO the request primitive
    	 */
    	String UPDATE_HEMOCENTRO_ERROR = "updateHemocentroError";
    	/**
    	 * The 'updateMerge' request primitive for the Hemocentro entity.
    	 * @see Hemocentro the request payload
    	 */
    	String UPDATE_MERGE_HEMOCENTRO = "updateMergeHemocentro";
    	/**
    	 * The success response primitive for updateMergeHemocentro.
    	 *
    	 * @see #UPDATE_MERGE_HEMOCENTRO the request primitive
    	 */
    	String UPDATE_MERGE_HEMOCENTRO_RESPONSE = "updateMergeHemocentroResponse";
    	/**
    	 * An error response primitive for updateMergeHemocentro.
    	 *
    	 * @see #UPDATE_MERGE_HEMOCENTRO the request primitive
    	 */
    	String UPDATE_MERGE_HEMOCENTRO_ERROR = "updateMergeHemocentroError";
    	/**
    	 * The 'delete' request primitive for the Hemocentro entity.
    	 * @see Hemocentro.Id the request payload
    	 */
    	String DELETE_HEMOCENTRO = "deleteHemocentro";
    	/**
    	 * The success response primitive for deleteHemocentro.
    	 *
    	 * @see #DELETE_HEMOCENTRO the request primitive
    	 */
    	String DELETE_HEMOCENTRO_RESPONSE = "deleteHemocentroResponse";
    	/**
    	 * An error response primitive for deleteHemocentro.
    	 *
    	 * @see #DELETE_HEMOCENTRO the request primitive
    	 */
    	String DELETE_HEMOCENTRO_ERROR = "deleteHemocentroError";
    	/**
    	 * The 'create' request primitive for the Agendamento entity.
    	 * @see Agendamento the request payload
    	 */
    	String CREATE_AGENDAMENTO = "createAgendamento";
    	/**
    	 * The success response primitive for createAgendamento.
    	 *
    	 * @see #CREATE_AGENDAMENTO the request primitive
    	 */
    	String CREATE_AGENDAMENTO_RESPONSE = "createAgendamentoResponse";
    	/**
    	 * An error response primitive for createAgendamento.
    	 *
    	 * @see #CREATE_AGENDAMENTO the request primitive
    	 */
    	String CREATE_AGENDAMENTO_ERROR = "createAgendamentoError";
    	/**
    	 * The 'createBulk' request primitive for the Agendamento entity.
    	 * @see CreateBulkAgendamentoInput the request payload
    	 */
    	String CREATE_BULK_AGENDAMENTO = "createBulkAgendamento";
    	/**
    	 * The success response primitive for createBulkAgendamento.
    	 *
    	 * @see #CREATE_BULK_AGENDAMENTO the request primitive
    	 * @see CreateBulkAgendamentoOutput the response payload
    	 */
    	String CREATE_BULK_AGENDAMENTO_RESPONSE = "createBulkAgendamentoResponse";
    	/**
    	 * An error response primitive for createBulkAgendamento.
    	 *
    	 * @see #CREATE_BULK_AGENDAMENTO the request primitive
    	 */
    	String CREATE_BULK_AGENDAMENTO_ERROR = "createBulkAgendamentoError";
    	/**
    	 * The 'createMerge' request primitive for the Agendamento entity.
    	 * @see Agendamento the request payload
    	 */
    	String CREATE_MERGE_AGENDAMENTO = "createMergeAgendamento";
    	/**
    	 * The success response primitive for createMergeAgendamento.
    	 *
    	 * @see #CREATE_MERGE_AGENDAMENTO the request primitive
    	 */
    	String CREATE_MERGE_AGENDAMENTO_RESPONSE = "createMergeAgendamentoResponse";
    	/**
    	 * An error response primitive for createMergeAgendamento.
    	 *
    	 * @see #CREATE_MERGE_AGENDAMENTO the request primitive
    	 */
    	String CREATE_MERGE_AGENDAMENTO_ERROR = "createMergeAgendamentoError";
    	/**
    	 * The 'retrieve' request primitive for the Agendamento entity.
    	 * @see Agendamento.GetRequest the request payload
    	 */
    	String RETRIEVE_AGENDAMENTO = "retrieveAgendamento";
    	/**
    	 * The success response primitive for retrieveAgendamento.
    	 *
    	 * @see #RETRIEVE_AGENDAMENTO the request primitive
    	 */
    	String RETRIEVE_AGENDAMENTO_RESPONSE = "retrieveAgendamentoResponse";
    	/**
    	 * An error response primitive for retrieveAgendamento.
    	 *
    	 * @see #RETRIEVE_AGENDAMENTO the request primitive
    	 */
    	String RETRIEVE_AGENDAMENTO_ERROR = "retrieveAgendamentoError";
    	/**
    	 * The 'list' request primitive for the Agendamento entity.
    	 * @see agendamento.pageRequest the request payload
    	 */
    	String LIST_AGENDAMENTO = "listAgendamento";
    	/**
    	 * The success response primitive for listAgendamento.
    	 *
    	 * @see #LIST_AGENDAMENTO the request primitive
    	 * @see Agendamento.PagedResults the response payload
    	 */
    	String LIST_AGENDAMENTO_RESPONSE = "listAgendamentoResponse";
    	/**
    	 * An error response primitive for listAgendamento.
    	 *
    	 * @see #LIST_AGENDAMENTO the request primitive
    	 */
    	String LIST_AGENDAMENTO_ERROR = "listAgendamentoError";
    	/**
    	 * The 'update' request primitive for the Agendamento entity.
    	 * @see Agendamento the request payload
    	 */
    	String UPDATE_AGENDAMENTO = "updateAgendamento";
    	/**
    	 * The success response primitive for updateAgendamento.
    	 *
    	 * @see #UPDATE_AGENDAMENTO the request primitive
    	 */
    	String UPDATE_AGENDAMENTO_RESPONSE = "updateAgendamentoResponse";
    	/**
    	 * An error response primitive for updateAgendamento.
    	 *
    	 * @see #UPDATE_AGENDAMENTO the request primitive
    	 */
    	String UPDATE_AGENDAMENTO_ERROR = "updateAgendamentoError";
    	/**
    	 * The 'updateMerge' request primitive for the Agendamento entity.
    	 * @see Agendamento the request payload
    	 */
    	String UPDATE_MERGE_AGENDAMENTO = "updateMergeAgendamento";
    	/**
    	 * The success response primitive for updateMergeAgendamento.
    	 *
    	 * @see #UPDATE_MERGE_AGENDAMENTO the request primitive
    	 */
    	String UPDATE_MERGE_AGENDAMENTO_RESPONSE = "updateMergeAgendamentoResponse";
    	/**
    	 * An error response primitive for updateMergeAgendamento.
    	 *
    	 * @see #UPDATE_MERGE_AGENDAMENTO the request primitive
    	 */
    	String UPDATE_MERGE_AGENDAMENTO_ERROR = "updateMergeAgendamentoError";
    	/**
    	 * The 'delete' request primitive for the Agendamento entity.
    	 * @see Agendamento.Id the request payload
    	 */
    	String DELETE_AGENDAMENTO = "deleteAgendamento";
    	/**
    	 * The success response primitive for deleteAgendamento.
    	 *
    	 * @see #DELETE_AGENDAMENTO the request primitive
    	 */
    	String DELETE_AGENDAMENTO_RESPONSE = "deleteAgendamentoResponse";
    	/**
    	 * An error response primitive for deleteAgendamento.
    	 *
    	 * @see #DELETE_AGENDAMENTO the request primitive
    	 */
    	String DELETE_AGENDAMENTO_ERROR = "deleteAgendamentoError";
    	/**
    	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
    	 * @see Doacao the request payload
    	 */
    	String CREATE_AGENDAMENTO_DOACOES = "createAgendamento_Doacoes";
    	/**
    	 * The success response primitive for createAgendamento_Doacoes.
    	 *
    	 * @see #CREATE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String CREATE_AGENDAMENTO_DOACOES_RESPONSE = "createAgendamento_DoacoesResponse";
    	/**
    	 * An error response primitive for createAgendamento_Doacoes.
    	 *
    	 * @see #CREATE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String CREATE_AGENDAMENTO_DOACOES_ERROR = "createAgendamento_DoacoesError";
    	/**
    	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
    	 * @see Doacao the request payload
    	 */
    	String CREATE_MERGE_AGENDAMENTO_DOACOES = "createMergeAgendamento_Doacoes";
    	/**
    	 * The success response primitive for createMergeAgendamento_Doacoes.
    	 *
    	 * @see #CREATE_MERGE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String CREATE_MERGE_AGENDAMENTO_DOACOES_RESPONSE = "createMergeAgendamento_DoacoesResponse";
    	/**
    	 * An error response primitive for createMergeAgendamento_Doacoes.
    	 *
    	 * @see #CREATE_MERGE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String CREATE_MERGE_AGENDAMENTO_DOACOES_ERROR = "createMergeAgendamento_DoacoesError";
    	/**
    	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
    	 * @see Doacao the request payload
    	 */
    	String UPDATE_AGENDAMENTO_DOACOES = "updateAgendamento_Doacoes";
    	/**
    	 * The success response primitive for updateAgendamento_Doacoes.
    	 *
    	 * @see #UPDATE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String UPDATE_AGENDAMENTO_DOACOES_RESPONSE = "updateAgendamento_DoacoesResponse";
    	/**
    	 * An error response primitive for updateAgendamento_Doacoes.
    	 *
    	 * @see #UPDATE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String UPDATE_AGENDAMENTO_DOACOES_ERROR = "updateAgendamento_DoacoesError";
    	/**
    	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
    	 * @see Doacao the request payload
    	 */
    	String UPDATE_MERGE_AGENDAMENTO_DOACOES = "updateMergeAgendamento_Doacoes";
    	/**
    	 * The success response primitive for updateMergeAgendamento_Doacoes.
    	 *
    	 * @see #UPDATE_MERGE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String UPDATE_MERGE_AGENDAMENTO_DOACOES_RESPONSE = "updateMergeAgendamento_DoacoesResponse";
    	/**
    	 * An error response primitive for updateMergeAgendamento_Doacoes.
    	 *
    	 * @see #UPDATE_MERGE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String UPDATE_MERGE_AGENDAMENTO_DOACOES_ERROR = "updateMergeAgendamento_DoacoesError";
    	/**
    	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
    	 * @see Doacao.GetRequest the request payload
    	 */
    	String RETRIEVE_AGENDAMENTO_DOACOES = "retrieveAgendamento_Doacoes";
    	/**
    	 * The success response primitive for retrieveAgendamento_Doacoes.
    	 *
    	 * @see #RETRIEVE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String RETRIEVE_AGENDAMENTO_DOACOES_RESPONSE = "retrieveAgendamento_DoacoesResponse";
    	/**
    	 * An error response primitive for retrieveAgendamento_Doacoes.
    	 *
    	 * @see #RETRIEVE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String RETRIEVE_AGENDAMENTO_DOACOES_ERROR = "retrieveAgendamento_DoacoesError";
    	/**
    	 * The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
    	 * @see Doacao.Id the request payload
    	 */
    	String DELETE_AGENDAMENTO_DOACOES = "deleteAgendamento_Doacoes";
    	/**
    	 * The success response primitive for deleteAgendamento_Doacoes.
    	 *
    	 * @see #DELETE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String DELETE_AGENDAMENTO_DOACOES_RESPONSE = "deleteAgendamento_DoacoesResponse";
    	/**
    	 * An error response primitive for deleteAgendamento_Doacoes.
    	 *
    	 * @see #DELETE_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String DELETE_AGENDAMENTO_DOACOES_ERROR = "deleteAgendamento_DoacoesError";
    	/**
    	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
    	 * @see doacao.pageRequest the request payload
    	 */
    	String LIST_AGENDAMENTO_DOACOES = "listAgendamento_Doacoes";
    	/**
    	 * The success response primitive for listAgendamento_Doacoes.
    	 *
    	 * @see #LIST_AGENDAMENTO_DOACOES the request primitive
    	 * @see Doacao.PagedResults the response payload
    	 */
    	String LIST_AGENDAMENTO_DOACOES_RESPONSE = "listAgendamento_DoacoesResponse";
    	/**
    	 * An error response primitive for listAgendamento_Doacoes.
    	 *
    	 * @see #LIST_AGENDAMENTO_DOACOES the request primitive
    	 */
    	String LIST_AGENDAMENTO_DOACOES_ERROR = "listAgendamento_DoacoesError";
    	/**
    	 * The 'create' request primitive for the Doacao entity.
    	 * @see Doacao the request payload
    	 */
    	String CREATE_DOACAO = "createDoacao";
    	/**
    	 * The success response primitive for createDoacao.
    	 *
    	 * @see #CREATE_DOACAO the request primitive
    	 */
    	String CREATE_DOACAO_RESPONSE = "createDoacaoResponse";
    	/**
    	 * An error response primitive for createDoacao.
    	 *
    	 * @see #CREATE_DOACAO the request primitive
    	 */
    	String CREATE_DOACAO_ERROR = "createDoacaoError";
    	/**
    	 * The 'createBulk' request primitive for the Doacao entity.
    	 * @see CreateBulkDoacaoInput the request payload
    	 */
    	String CREATE_BULK_DOACAO = "createBulkDoacao";
    	/**
    	 * The success response primitive for createBulkDoacao.
    	 *
    	 * @see #CREATE_BULK_DOACAO the request primitive
    	 * @see CreateBulkDoacaoOutput the response payload
    	 */
    	String CREATE_BULK_DOACAO_RESPONSE = "createBulkDoacaoResponse";
    	/**
    	 * An error response primitive for createBulkDoacao.
    	 *
    	 * @see #CREATE_BULK_DOACAO the request primitive
    	 */
    	String CREATE_BULK_DOACAO_ERROR = "createBulkDoacaoError";
    	/**
    	 * The 'createMerge' request primitive for the Doacao entity.
    	 * @see Doacao the request payload
    	 */
    	String CREATE_MERGE_DOACAO = "createMergeDoacao";
    	/**
    	 * The success response primitive for createMergeDoacao.
    	 *
    	 * @see #CREATE_MERGE_DOACAO the request primitive
    	 */
    	String CREATE_MERGE_DOACAO_RESPONSE = "createMergeDoacaoResponse";
    	/**
    	 * An error response primitive for createMergeDoacao.
    	 *
    	 * @see #CREATE_MERGE_DOACAO the request primitive
    	 */
    	String CREATE_MERGE_DOACAO_ERROR = "createMergeDoacaoError";
    	/**
    	 * The 'retrieve' request primitive for the Doacao entity.
    	 * @see Doacao.GetRequest the request payload
    	 */
    	String RETRIEVE_DOACAO = "retrieveDoacao";
    	/**
    	 * The success response primitive for retrieveDoacao.
    	 *
    	 * @see #RETRIEVE_DOACAO the request primitive
    	 */
    	String RETRIEVE_DOACAO_RESPONSE = "retrieveDoacaoResponse";
    	/**
    	 * An error response primitive for retrieveDoacao.
    	 *
    	 * @see #RETRIEVE_DOACAO the request primitive
    	 */
    	String RETRIEVE_DOACAO_ERROR = "retrieveDoacaoError";
    	/**
    	 * The 'list' request primitive for the Doacao entity.
    	 * @see doacao.pageRequest the request payload
    	 */
    	String LIST_DOACAO = "listDoacao";
    	/**
    	 * The success response primitive for listDoacao.
    	 *
    	 * @see #LIST_DOACAO the request primitive
    	 * @see Doacao.PagedResults the response payload
    	 */
    	String LIST_DOACAO_RESPONSE = "listDoacaoResponse";
    	/**
    	 * An error response primitive for listDoacao.
    	 *
    	 * @see #LIST_DOACAO the request primitive
    	 */
    	String LIST_DOACAO_ERROR = "listDoacaoError";
    	/**
    	 * The 'update' request primitive for the Doacao entity.
    	 * @see Doacao the request payload
    	 */
    	String UPDATE_DOACAO = "updateDoacao";
    	/**
    	 * The success response primitive for updateDoacao.
    	 *
    	 * @see #UPDATE_DOACAO the request primitive
    	 */
    	String UPDATE_DOACAO_RESPONSE = "updateDoacaoResponse";
    	/**
    	 * An error response primitive for updateDoacao.
    	 *
    	 * @see #UPDATE_DOACAO the request primitive
    	 */
    	String UPDATE_DOACAO_ERROR = "updateDoacaoError";
    	/**
    	 * The 'updateMerge' request primitive for the Doacao entity.
    	 * @see Doacao the request payload
    	 */
    	String UPDATE_MERGE_DOACAO = "updateMergeDoacao";
    	/**
    	 * The success response primitive for updateMergeDoacao.
    	 *
    	 * @see #UPDATE_MERGE_DOACAO the request primitive
    	 */
    	String UPDATE_MERGE_DOACAO_RESPONSE = "updateMergeDoacaoResponse";
    	/**
    	 * An error response primitive for updateMergeDoacao.
    	 *
    	 * @see #UPDATE_MERGE_DOACAO the request primitive
    	 */
    	String UPDATE_MERGE_DOACAO_ERROR = "updateMergeDoacaoError";
    	/**
    	 * The 'delete' request primitive for the Doacao entity.
    	 * @see Doacao.Id the request payload
    	 */
    	String DELETE_DOACAO = "deleteDoacao";
    	/**
    	 * The success response primitive for deleteDoacao.
    	 *
    	 * @see #DELETE_DOACAO the request primitive
    	 */
    	String DELETE_DOACAO_RESPONSE = "deleteDoacaoResponse";
    	/**
    	 * An error response primitive for deleteDoacao.
    	 *
    	 * @see #DELETE_DOACAO the request primitive
    	 */
    	String DELETE_DOACAO_ERROR = "deleteDoacaoError";
    	/**
    	 * The 'create' request primitive for the Estoque entity.
    	 * @see Estoque the request payload
    	 */
    	String CREATE_ESTOQUE = "createEstoque";
    	/**
    	 * The success response primitive for createEstoque.
    	 *
    	 * @see #CREATE_ESTOQUE the request primitive
    	 */
    	String CREATE_ESTOQUE_RESPONSE = "createEstoqueResponse";
    	/**
    	 * An error response primitive for createEstoque.
    	 *
    	 * @see #CREATE_ESTOQUE the request primitive
    	 */
    	String CREATE_ESTOQUE_ERROR = "createEstoqueError";
    	/**
    	 * The 'createBulk' request primitive for the Estoque entity.
    	 * @see CreateBulkEstoqueInput the request payload
    	 */
    	String CREATE_BULK_ESTOQUE = "createBulkEstoque";
    	/**
    	 * The success response primitive for createBulkEstoque.
    	 *
    	 * @see #CREATE_BULK_ESTOQUE the request primitive
    	 * @see CreateBulkEstoqueOutput the response payload
    	 */
    	String CREATE_BULK_ESTOQUE_RESPONSE = "createBulkEstoqueResponse";
    	/**
    	 * An error response primitive for createBulkEstoque.
    	 *
    	 * @see #CREATE_BULK_ESTOQUE the request primitive
    	 */
    	String CREATE_BULK_ESTOQUE_ERROR = "createBulkEstoqueError";
    	/**
    	 * The 'createMerge' request primitive for the Estoque entity.
    	 * @see Estoque the request payload
    	 */
    	String CREATE_MERGE_ESTOQUE = "createMergeEstoque";
    	/**
    	 * The success response primitive for createMergeEstoque.
    	 *
    	 * @see #CREATE_MERGE_ESTOQUE the request primitive
    	 */
    	String CREATE_MERGE_ESTOQUE_RESPONSE = "createMergeEstoqueResponse";
    	/**
    	 * An error response primitive for createMergeEstoque.
    	 *
    	 * @see #CREATE_MERGE_ESTOQUE the request primitive
    	 */
    	String CREATE_MERGE_ESTOQUE_ERROR = "createMergeEstoqueError";
    	/**
    	 * The 'retrieve' request primitive for the Estoque entity.
    	 * @see Estoque.GetRequest the request payload
    	 */
    	String RETRIEVE_ESTOQUE = "retrieveEstoque";
    	/**
    	 * The success response primitive for retrieveEstoque.
    	 *
    	 * @see #RETRIEVE_ESTOQUE the request primitive
    	 */
    	String RETRIEVE_ESTOQUE_RESPONSE = "retrieveEstoqueResponse";
    	/**
    	 * An error response primitive for retrieveEstoque.
    	 *
    	 * @see #RETRIEVE_ESTOQUE the request primitive
    	 */
    	String RETRIEVE_ESTOQUE_ERROR = "retrieveEstoqueError";
    	/**
    	 * The 'list' request primitive for the Estoque entity.
    	 * @see estoque.pageRequest the request payload
    	 */
    	String LIST_ESTOQUE = "listEstoque";
    	/**
    	 * The success response primitive for listEstoque.
    	 *
    	 * @see #LIST_ESTOQUE the request primitive
    	 * @see Estoque.PagedResults the response payload
    	 */
    	String LIST_ESTOQUE_RESPONSE = "listEstoqueResponse";
    	/**
    	 * An error response primitive for listEstoque.
    	 *
    	 * @see #LIST_ESTOQUE the request primitive
    	 */
    	String LIST_ESTOQUE_ERROR = "listEstoqueError";
    	/**
    	 * The 'update' request primitive for the Estoque entity.
    	 * @see Estoque the request payload
    	 */
    	String UPDATE_ESTOQUE = "updateEstoque";
    	/**
    	 * The success response primitive for updateEstoque.
    	 *
    	 * @see #UPDATE_ESTOQUE the request primitive
    	 */
    	String UPDATE_ESTOQUE_RESPONSE = "updateEstoqueResponse";
    	/**
    	 * An error response primitive for updateEstoque.
    	 *
    	 * @see #UPDATE_ESTOQUE the request primitive
    	 */
    	String UPDATE_ESTOQUE_ERROR = "updateEstoqueError";
    	/**
    	 * The 'updateMerge' request primitive for the Estoque entity.
    	 * @see Estoque the request payload
    	 */
    	String UPDATE_MERGE_ESTOQUE = "updateMergeEstoque";
    	/**
    	 * The success response primitive for updateMergeEstoque.
    	 *
    	 * @see #UPDATE_MERGE_ESTOQUE the request primitive
    	 */
    	String UPDATE_MERGE_ESTOQUE_RESPONSE = "updateMergeEstoqueResponse";
    	/**
    	 * An error response primitive for updateMergeEstoque.
    	 *
    	 * @see #UPDATE_MERGE_ESTOQUE the request primitive
    	 */
    	String UPDATE_MERGE_ESTOQUE_ERROR = "updateMergeEstoqueError";
    	/**
    	 * The 'delete' request primitive for the Estoque entity.
    	 * @see Estoque.Id the request payload
    	 */
    	String DELETE_ESTOQUE = "deleteEstoque";
    	/**
    	 * The success response primitive for deleteEstoque.
    	 *
    	 * @see #DELETE_ESTOQUE the request primitive
    	 */
    	String DELETE_ESTOQUE_RESPONSE = "deleteEstoqueResponse";
    	/**
    	 * An error response primitive for deleteEstoque.
    	 *
    	 * @see #DELETE_ESTOQUE the request primitive
    	 */
    	String DELETE_ESTOQUE_ERROR = "deleteEstoqueError";
    }
    
    interface Events {
    	/**
    	 * events de dominio
    	 */
    	String DOACAO_CONFIRMADA = "doacaoConfirmada";
    	String AGENDAMENTO_CRIADO = "agendamentoCriado";
    	String AGENDAMENTO_CANCELADO = "agendamentoCancelado";
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_USUARIO_EVENT = "importUsuarioEvent";
    	String EXPORT_USUARIO_EVENT = "exportUsuarioEvent";
    	String IMPORT_HEMOCENTRO_EVENT = "importHemocentroEvent";
    	String EXPORT_HEMOCENTRO_EVENT = "exportHemocentroEvent";
    	String IMPORT_AGENDAMENTO_EVENT = "importAgendamentoEvent";
    	String EXPORT_AGENDAMENTO_EVENT = "exportAgendamentoEvent";
    	String IMPORT_DOACAO_EVENT = "importDoacaoEvent";
    	String EXPORT_DOACAO_EVENT = "exportDoacaoEvent";
    	String IMPORT_ESTOQUE_EVENT = "importEstoqueEvent";
    	String EXPORT_ESTOQUE_EVENT = "exportEstoqueEvent";
    }
    
}
