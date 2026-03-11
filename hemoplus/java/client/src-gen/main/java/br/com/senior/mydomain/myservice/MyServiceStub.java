/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.concurrent.CompletableFuture;


/**
* 
*/
public interface MyServiceStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	 * Chamada assíncrona
	 */
	void helloWorld(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CriarAgendamentoOutput criarAgendamento(CriarAgendamentoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	 * Chamada assíncrona
	 */
	void criarAgendamento(CriarAgendamentoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CriarAgendamentoOutput> criarAgendamentoRequest(CriarAgendamentoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CriarAgendamentoOutput> criarAgendamentoRequest(CriarAgendamentoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ConfirmarAgendamentoOutput confirmarAgendamento(ConfirmarAgendamentoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void confirmarAgendamento(ConfirmarAgendamentoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ConfirmarAgendamentoOutput> confirmarAgendamentoRequest(ConfirmarAgendamentoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ConfirmarAgendamentoOutput> confirmarAgendamentoRequest(ConfirmarAgendamentoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CancelarAgendamentoOutput cancelarAgendamento(CancelarAgendamentoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void cancelarAgendamento(CancelarAgendamentoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CancelarAgendamentoOutput> cancelarAgendamentoRequest(CancelarAgendamentoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CancelarAgendamentoOutput> cancelarAgendamentoRequest(CancelarAgendamentoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	MarcarNaoCompareceuPorPeriodoOutput marcarNaoCompareceuPorPeriodo(MarcarNaoCompareceuPorPeriodoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void marcarNaoCompareceuPorPeriodo(MarcarNaoCompareceuPorPeriodoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MarcarNaoCompareceuPorPeriodoOutput> marcarNaoCompareceuPorPeriodoRequest(MarcarNaoCompareceuPorPeriodoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MarcarNaoCompareceuPorPeriodoOutput> marcarNaoCompareceuPorPeriodoRequest(MarcarNaoCompareceuPorPeriodoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ValidarDoacaoPorTokenOutput validarDoacaoPorToken(ValidarDoacaoPorTokenInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	 * Chamada assíncrona
	 */
	void validarDoacaoPorToken(ValidarDoacaoPorTokenInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ValidarDoacaoPorTokenOutput> validarDoacaoPorTokenRequest(ValidarDoacaoPorTokenInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ValidarDoacaoPorTokenOutput> validarDoacaoPorTokenRequest(ValidarDoacaoPorTokenInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	AjustarEstoqueOutput ajustarEstoque(AjustarEstoqueInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	 * Chamada assíncrona
	 */
	void ajustarEstoque(AjustarEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<AjustarEstoqueOutput> ajustarEstoqueRequest(AjustarEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<AjustarEstoqueOutput> ajustarEstoqueRequest(AjustarEstoqueInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ListarAgendamentosPorPeriodoOutput listarAgendamentosPorPeriodo(ListarAgendamentosPorPeriodoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	 * Chamada assíncrona
	 */
	void listarAgendamentosPorPeriodo(ListarAgendamentosPorPeriodoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarAgendamentosPorPeriodoOutput> listarAgendamentosPorPeriodoRequest(ListarAgendamentosPorPeriodoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarAgendamentosPorPeriodoOutput> listarAgendamentosPorPeriodoRequest(ListarAgendamentosPorPeriodoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ListarPontosMapaOutput listarPontosMapa(ListarPontosMapaInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	 * Chamada assíncrona
	 */
	void listarPontosMapa(ListarPontosMapaInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarPontosMapaOutput> listarPontosMapaRequest(ListarPontosMapaInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarPontosMapaOutput> listarPontosMapaRequest(ListarPontosMapaInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	BuscarUsuarioCloudOutput buscarUsuarioCloud(BuscarUsuarioCloudInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void buscarUsuarioCloud(BuscarUsuarioCloudInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<BuscarUsuarioCloudOutput> buscarUsuarioCloudRequest(BuscarUsuarioCloudInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<BuscarUsuarioCloudOutput> buscarUsuarioCloudRequest(BuscarUsuarioCloudInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	BuscarDashboardResumoAgendamentosOutput buscarDashboardResumoAgendamentos(BuscarDashboardResumoAgendamentosInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	 * Chamada assíncrona
	 */
	void buscarDashboardResumoAgendamentos(BuscarDashboardResumoAgendamentosInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<BuscarDashboardResumoAgendamentosOutput> buscarDashboardResumoAgendamentosRequest(BuscarDashboardResumoAgendamentosInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<BuscarDashboardResumoAgendamentosOutput> buscarDashboardResumoAgendamentosRequest(BuscarDashboardResumoAgendamentosInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	BuscarDashboardSerieAgendamentosPorDiaOutput buscarDashboardSerieAgendamentosPorDia(BuscarDashboardSerieAgendamentosPorDiaInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void buscarDashboardSerieAgendamentosPorDia(BuscarDashboardSerieAgendamentosPorDiaInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<BuscarDashboardSerieAgendamentosPorDiaOutput> buscarDashboardSerieAgendamentosPorDiaRequest(BuscarDashboardSerieAgendamentosPorDiaInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<BuscarDashboardSerieAgendamentosPorDiaOutput> buscarDashboardSerieAgendamentosPorDiaRequest(BuscarDashboardSerieAgendamentosPorDiaInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ListarEstoquePorHemocentroOutput listarEstoquePorHemocentro(ListarEstoquePorHemocentroInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	 * Chamada assíncrona
	 */
	void listarEstoquePorHemocentro(ListarEstoquePorHemocentroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarEstoquePorHemocentroOutput> listarEstoquePorHemocentroRequest(ListarEstoquePorHemocentroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarEstoquePorHemocentroOutput> listarEstoquePorHemocentroRequest(ListarEstoquePorHemocentroInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ListarTiposEmFaltaOutput listarTiposEmFalta(ListarTiposEmFaltaInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void listarTiposEmFalta(ListarTiposEmFaltaInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarTiposEmFaltaOutput> listarTiposEmFaltaRequest(ListarTiposEmFaltaInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ListarTiposEmFaltaOutput> listarTiposEmFaltaRequest(ListarTiposEmFaltaInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportUsuarioOutput importUsuario(ImportUsuarioInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importUsuario(ImportUsuarioInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportUsuarioOutput> importUsuarioRequest(ImportUsuarioInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportUsuarioOutput> importUsuarioRequest(ImportUsuarioInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportUsuarioOutput exportUsuario(ExportUsuarioInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportUsuario(ExportUsuarioInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportUsuarioOutput> exportUsuarioRequest(ExportUsuarioInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportUsuarioOutput> exportUsuarioRequest(ExportUsuarioInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportHemocentroOutput importHemocentro(ImportHemocentroInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importHemocentro(ImportHemocentroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportHemocentroOutput> importHemocentroRequest(ImportHemocentroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportHemocentroOutput> importHemocentroRequest(ImportHemocentroInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportHemocentroOutput exportHemocentro(ExportHemocentroInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportHemocentro(ExportHemocentroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportHemocentroOutput> exportHemocentroRequest(ExportHemocentroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportHemocentroOutput> exportHemocentroRequest(ExportHemocentroInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportEstoqueOutput importEstoque(ImportEstoqueInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importEstoque(ImportEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportEstoqueOutput> importEstoqueRequest(ImportEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportEstoqueOutput> importEstoqueRequest(ImportEstoqueInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportEstoqueOutput exportEstoque(ExportEstoqueInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportEstoque(ExportEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportEstoqueOutput> exportEstoqueRequest(ExportEstoqueInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportEstoqueOutput> exportEstoqueRequest(ExportEstoqueInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest(long timeout);
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Usuario createUsuario(Usuario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void createUsuario(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> createUsuarioRequest(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> createUsuarioRequest(Usuario input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkUsuarioOutput createBulkUsuario(CreateBulkUsuarioInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void createBulkUsuario(CreateBulkUsuarioInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkUsuarioOutput> createBulkUsuarioRequest(CreateBulkUsuarioInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkUsuarioOutput> createBulkUsuarioRequest(CreateBulkUsuarioInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Usuario createMergeUsuario(Usuario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void createMergeUsuario(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> createMergeUsuarioRequest(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> createMergeUsuarioRequest(Usuario input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Usuario retrieveUsuario(Usuario.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void retrieveUsuario(Usuario.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> retrieveUsuarioRequest(Usuario.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> retrieveUsuarioRequest(Usuario.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Usuario.PagedResults listUsuario(Usuario.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void listUsuario(Usuario.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario.PagedResults> listUsuarioRequest(Usuario.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario.PagedResults> listUsuarioRequest(Usuario.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Usuario updateUsuario(Usuario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void updateUsuario(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> updateUsuarioRequest(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> updateUsuarioRequest(Usuario input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Usuario updateMergeUsuario(Usuario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void updateMergeUsuario(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> updateMergeUsuarioRequest(Usuario input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Usuario> updateMergeUsuarioRequest(Usuario input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteUsuario(Usuario.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Usuario entity.
	 * Chamada assíncrona
	 */
	void deleteUsuario(Usuario.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento createUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona
	 */
	void createUsuario_Agendamentos(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento createMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona
	 */
	void createMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento updateUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona
	 */
	void updateUsuario_Agendamentos(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento updateMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona
	 */
	void updateMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento retrieveUsuario_Agendamentos(Usuario.Id parentId, Agendamento.GetRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona
	 */
	void retrieveUsuario_Agendamentos(Usuario.Id parentId, Agendamento.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> retrieveUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> retrieveUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteUsuario_Agendamentos(Usuario.Id parentId, Agendamento.Id input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona
	 */
	void deleteUsuario_Agendamentos(Usuario.Id parentId, Agendamento.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento.PagedResults listUsuario_Agendamentos(Usuario.Id parentId, Agendamento.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona
	 */
	void listUsuario_Agendamentos(Usuario.Id parentId, Agendamento.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento.PagedResults> listUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento.PagedResults> listUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Hemocentro createHemocentro(Hemocentro input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void createHemocentro(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> createHemocentroRequest(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> createHemocentroRequest(Hemocentro input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkHemocentroOutput createBulkHemocentro(CreateBulkHemocentroInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void createBulkHemocentro(CreateBulkHemocentroInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkHemocentroOutput> createBulkHemocentroRequest(CreateBulkHemocentroInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkHemocentroOutput> createBulkHemocentroRequest(CreateBulkHemocentroInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Hemocentro createMergeHemocentro(Hemocentro input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void createMergeHemocentro(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> createMergeHemocentroRequest(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> createMergeHemocentroRequest(Hemocentro input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Hemocentro retrieveHemocentro(Hemocentro.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void retrieveHemocentro(Hemocentro.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> retrieveHemocentroRequest(Hemocentro.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> retrieveHemocentroRequest(Hemocentro.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Hemocentro.PagedResults listHemocentro(Hemocentro.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void listHemocentro(Hemocentro.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro.PagedResults> listHemocentroRequest(Hemocentro.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro.PagedResults> listHemocentroRequest(Hemocentro.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Hemocentro updateHemocentro(Hemocentro input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void updateHemocentro(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> updateHemocentroRequest(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> updateHemocentroRequest(Hemocentro input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Hemocentro updateMergeHemocentro(Hemocentro input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void updateMergeHemocentro(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> updateMergeHemocentroRequest(Hemocentro input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Hemocentro> updateMergeHemocentroRequest(Hemocentro input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Hemocentro entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteHemocentro(Hemocentro.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Hemocentro entity.
	 * Chamada assíncrona
	 */
	void deleteHemocentro(Hemocentro.Id input);
	
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento createAgendamento(Agendamento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void createAgendamento(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createAgendamentoRequest(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createAgendamentoRequest(Agendamento input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkAgendamentoOutput createBulkAgendamento(CreateBulkAgendamentoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void createBulkAgendamento(CreateBulkAgendamentoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkAgendamentoOutput> createBulkAgendamentoRequest(CreateBulkAgendamentoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkAgendamentoOutput> createBulkAgendamentoRequest(CreateBulkAgendamentoInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento createMergeAgendamento(Agendamento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void createMergeAgendamento(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createMergeAgendamentoRequest(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> createMergeAgendamentoRequest(Agendamento input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento retrieveAgendamento(Agendamento.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void retrieveAgendamento(Agendamento.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> retrieveAgendamentoRequest(Agendamento.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> retrieveAgendamentoRequest(Agendamento.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento.PagedResults listAgendamento(Agendamento.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void listAgendamento(Agendamento.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento.PagedResults> listAgendamentoRequest(Agendamento.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento.PagedResults> listAgendamentoRequest(Agendamento.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento updateAgendamento(Agendamento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void updateAgendamento(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateAgendamentoRequest(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateAgendamentoRequest(Agendamento input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Agendamento updateMergeAgendamento(Agendamento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void updateMergeAgendamento(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateMergeAgendamentoRequest(Agendamento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Agendamento> updateMergeAgendamentoRequest(Agendamento input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteAgendamento(Agendamento.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Agendamento entity.
	 * Chamada assíncrona
	 */
	void deleteAgendamento(Agendamento.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao createAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona
	 */
	void createAgendamento_Doacoes(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao createMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona
	 */
	void createMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao updateAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona
	 */
	void updateAgendamento_Doacoes(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao updateMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona
	 */
	void updateMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao retrieveAgendamento_Doacoes(Agendamento.Id parentId, Doacao.GetRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona
	 */
	void retrieveAgendamento_Doacoes(Agendamento.Id parentId, Doacao.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> retrieveAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> retrieveAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteAgendamento_Doacoes(Agendamento.Id parentId, Doacao.Id input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona
	 */
	void deleteAgendamento_Doacoes(Agendamento.Id parentId, Doacao.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao.PagedResults listAgendamento_Doacoes(Agendamento.Id parentId, Doacao.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona
	 */
	void listAgendamento_Doacoes(Agendamento.Id parentId, Doacao.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao.PagedResults> listAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao.PagedResults> listAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao createDoacao(Doacao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void createDoacao(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createDoacaoRequest(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createDoacaoRequest(Doacao input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkDoacaoOutput createBulkDoacao(CreateBulkDoacaoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void createBulkDoacao(CreateBulkDoacaoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkDoacaoOutput> createBulkDoacaoRequest(CreateBulkDoacaoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkDoacaoOutput> createBulkDoacaoRequest(CreateBulkDoacaoInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao createMergeDoacao(Doacao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void createMergeDoacao(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createMergeDoacaoRequest(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> createMergeDoacaoRequest(Doacao input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao retrieveDoacao(Doacao.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void retrieveDoacao(Doacao.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> retrieveDoacaoRequest(Doacao.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> retrieveDoacaoRequest(Doacao.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao.PagedResults listDoacao(Doacao.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void listDoacao(Doacao.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao.PagedResults> listDoacaoRequest(Doacao.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao.PagedResults> listDoacaoRequest(Doacao.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao updateDoacao(Doacao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void updateDoacao(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateDoacaoRequest(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateDoacaoRequest(Doacao input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Doacao updateMergeDoacao(Doacao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void updateMergeDoacao(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateMergeDoacaoRequest(Doacao input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Doacao> updateMergeDoacaoRequest(Doacao input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Doacao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteDoacao(Doacao.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Doacao entity.
	 * Chamada assíncrona
	 */
	void deleteDoacao(Doacao.Id input);
	
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Estoque createEstoque(Estoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void createEstoque(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> createEstoqueRequest(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> createEstoqueRequest(Estoque input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkEstoqueOutput createBulkEstoque(CreateBulkEstoqueInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void createBulkEstoque(CreateBulkEstoqueInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkEstoqueOutput> createBulkEstoqueRequest(CreateBulkEstoqueInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkEstoqueOutput> createBulkEstoqueRequest(CreateBulkEstoqueInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Estoque createMergeEstoque(Estoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void createMergeEstoque(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> createMergeEstoqueRequest(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> createMergeEstoqueRequest(Estoque input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Estoque retrieveEstoque(Estoque.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void retrieveEstoque(Estoque.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> retrieveEstoqueRequest(Estoque.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> retrieveEstoqueRequest(Estoque.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Estoque.PagedResults listEstoque(Estoque.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void listEstoque(Estoque.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque.PagedResults> listEstoqueRequest(Estoque.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque.PagedResults> listEstoqueRequest(Estoque.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Estoque updateEstoque(Estoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void updateEstoque(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> updateEstoqueRequest(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> updateEstoqueRequest(Estoque input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Estoque updateMergeEstoque(Estoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void updateMergeEstoque(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> updateMergeEstoqueRequest(Estoque input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Estoque> updateMergeEstoqueRequest(Estoque input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Estoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteEstoque(Estoque.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Estoque entity.
	 * Chamada assíncrona
	 */
	void deleteEstoque(Estoque.Id input);
	
	


	/**
	 * Chamada assíncrona para o método publishDoacaoConfirmada 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishDoacaoConfirmada( DoacaoConfirmadaPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishAgendamentoCriado 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishAgendamentoCriado( AgendamentoCriadoPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishAgendamentoCancelado 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishAgendamentoCancelado( AgendamentoCanceladoPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishServiceStarted 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishNotifyUserEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportUsuarioEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportUsuarioEvent( ImportUsuarioEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportUsuarioEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportUsuarioEvent( ExportUsuarioEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportHemocentroEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportHemocentroEvent( ImportHemocentroEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportHemocentroEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportHemocentroEvent( ExportHemocentroEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportAgendamentoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportAgendamentoEvent( ImportAgendamentoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportAgendamentoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportAgendamentoEvent( ExportAgendamentoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportDoacaoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportDoacaoEvent( ImportDoacaoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportDoacaoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportDoacaoEvent( ExportDoacaoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportEstoqueEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportEstoqueEvent( ImportEstoqueEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportEstoqueEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportEstoqueEvent( ExportEstoqueEventPayload input );
			
	

}
