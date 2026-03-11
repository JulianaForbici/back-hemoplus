/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import br.com.senior.messaging.*;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

import java.util.concurrent.CompletableFuture;


/**
* 
*/
@SuppressWarnings("deprecation") // To prevent warnings in generated code about known deprecated methods.
public class MyServiceStubImpl  implements MyServiceStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #MyServiceStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public MyServiceStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new br.com.senior.mydomain.myservice.InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public MyServiceStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		return this.helloWorldRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * query de exemplo retorna uma mensagem de ola com o nome informado
	*/
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método criarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CriarAgendamentoOutput criarAgendamento(CriarAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CriarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CriarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.criarAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método criarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	 */
	@Override
	public void criarAgendamento(CriarAgendamentoInput input) {
		br.com.senior.mydomain.myservice.impl.CriarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CriarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.criarAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método criarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	 */
	@Override
	public CompletableFuture<CriarAgendamentoOutput> criarAgendamentoRequest(CriarAgendamentoInput input) {
		return this.criarAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método criarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de agendamento
	*/
	@Override
	public CompletableFuture<CriarAgendamentoOutput> criarAgendamentoRequest(CriarAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CriarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CriarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.criarAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método confirmarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ConfirmarAgendamentoOutput confirmarAgendamento(ConfirmarAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ConfirmarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.ConfirmarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.confirmarAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método confirmarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void confirmarAgendamento(ConfirmarAgendamentoInput input) {
		br.com.senior.mydomain.myservice.impl.ConfirmarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.ConfirmarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.confirmarAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método confirmarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ConfirmarAgendamentoOutput> confirmarAgendamentoRequest(ConfirmarAgendamentoInput input) {
		return this.confirmarAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método confirmarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ConfirmarAgendamentoOutput> confirmarAgendamentoRequest(ConfirmarAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ConfirmarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.ConfirmarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.confirmarAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método cancelarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CancelarAgendamentoOutput cancelarAgendamento(CancelarAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CancelarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CancelarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.cancelarAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método cancelarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void cancelarAgendamento(CancelarAgendamentoInput input) {
		br.com.senior.mydomain.myservice.impl.CancelarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CancelarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.cancelarAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método cancelarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<CancelarAgendamentoOutput> cancelarAgendamentoRequest(CancelarAgendamentoInput input) {
		return this.cancelarAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método cancelarAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<CancelarAgendamentoOutput> cancelarAgendamentoRequest(CancelarAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CancelarAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CancelarAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.cancelarAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método marcarNaoCompareceuPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public MarcarNaoCompareceuPorPeriodoOutput marcarNaoCompareceuPorPeriodo(MarcarNaoCompareceuPorPeriodoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.MarcarNaoCompareceuPorPeriodoImpl impl = new br.com.senior.mydomain.myservice.impl.MarcarNaoCompareceuPorPeriodoImpl(messengerSupplier, userId, messageSupplier);
		return impl.marcarNaoCompareceuPorPeriodo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método marcarNaoCompareceuPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void marcarNaoCompareceuPorPeriodo(MarcarNaoCompareceuPorPeriodoInput input) {
		br.com.senior.mydomain.myservice.impl.MarcarNaoCompareceuPorPeriodoImpl impl = new br.com.senior.mydomain.myservice.impl.MarcarNaoCompareceuPorPeriodoImpl(messengerSupplier, userId, messageSupplier);
		impl.marcarNaoCompareceuPorPeriodo(input);
	}
	
	/**
	 * Chamada assíncrona para o método marcarNaoCompareceuPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<MarcarNaoCompareceuPorPeriodoOutput> marcarNaoCompareceuPorPeriodoRequest(MarcarNaoCompareceuPorPeriodoInput input) {
		return this.marcarNaoCompareceuPorPeriodoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método marcarNaoCompareceuPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<MarcarNaoCompareceuPorPeriodoOutput> marcarNaoCompareceuPorPeriodoRequest(MarcarNaoCompareceuPorPeriodoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.MarcarNaoCompareceuPorPeriodoImpl impl = new br.com.senior.mydomain.myservice.impl.MarcarNaoCompareceuPorPeriodoImpl(messengerSupplier, userId, messageSupplier);
		return impl.marcarNaoCompareceuPorPeriodoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método validarDoacaoPorToken
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ValidarDoacaoPorTokenOutput validarDoacaoPorToken(ValidarDoacaoPorTokenInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ValidarDoacaoPorTokenImpl impl = new br.com.senior.mydomain.myservice.impl.ValidarDoacaoPorTokenImpl(messengerSupplier, userId, messageSupplier);
		return impl.validarDoacaoPorToken(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método validarDoacaoPorToken
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	 */
	@Override
	public void validarDoacaoPorToken(ValidarDoacaoPorTokenInput input) {
		br.com.senior.mydomain.myservice.impl.ValidarDoacaoPorTokenImpl impl = new br.com.senior.mydomain.myservice.impl.ValidarDoacaoPorTokenImpl(messengerSupplier, userId, messageSupplier);
		impl.validarDoacaoPorToken(input);
	}
	
	/**
	 * Chamada assíncrona para o método validarDoacaoPorToken
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	 */
	@Override
	public CompletableFuture<ValidarDoacaoPorTokenOutput> validarDoacaoPorTokenRequest(ValidarDoacaoPorTokenInput input) {
		return this.validarDoacaoPorTokenRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método validarDoacaoPorToken
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * validacao de doacao por token
	*/
	@Override
	public CompletableFuture<ValidarDoacaoPorTokenOutput> validarDoacaoPorTokenRequest(ValidarDoacaoPorTokenInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ValidarDoacaoPorTokenImpl impl = new br.com.senior.mydomain.myservice.impl.ValidarDoacaoPorTokenImpl(messengerSupplier, userId, messageSupplier);
		return impl.validarDoacaoPorTokenRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método ajustarEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public AjustarEstoqueOutput ajustarEstoque(AjustarEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.AjustarEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.AjustarEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.ajustarEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método ajustarEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	 */
	@Override
	public void ajustarEstoque(AjustarEstoqueInput input) {
		br.com.senior.mydomain.myservice.impl.AjustarEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.AjustarEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.ajustarEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método ajustarEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	 */
	@Override
	public CompletableFuture<AjustarEstoqueOutput> ajustarEstoqueRequest(AjustarEstoqueInput input) {
		return this.ajustarEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método ajustarEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * actions de estoque
	*/
	@Override
	public CompletableFuture<AjustarEstoqueOutput> ajustarEstoqueRequest(AjustarEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.AjustarEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.AjustarEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.ajustarEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listarAgendamentosPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ListarAgendamentosPorPeriodoOutput listarAgendamentosPorPeriodo(ListarAgendamentosPorPeriodoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarAgendamentosPorPeriodoImpl impl = new br.com.senior.mydomain.myservice.impl.ListarAgendamentosPorPeriodoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarAgendamentosPorPeriodo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listarAgendamentosPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	 */
	@Override
	public void listarAgendamentosPorPeriodo(ListarAgendamentosPorPeriodoInput input) {
		br.com.senior.mydomain.myservice.impl.ListarAgendamentosPorPeriodoImpl impl = new br.com.senior.mydomain.myservice.impl.ListarAgendamentosPorPeriodoImpl(messengerSupplier, userId, messageSupplier);
		impl.listarAgendamentosPorPeriodo(input);
	}
	
	/**
	 * Chamada assíncrona para o método listarAgendamentosPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	 */
	@Override
	public CompletableFuture<ListarAgendamentosPorPeriodoOutput> listarAgendamentosPorPeriodoRequest(ListarAgendamentosPorPeriodoInput input) {
		return this.listarAgendamentosPorPeriodoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listarAgendamentosPorPeriodo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de agendamento
	*/
	@Override
	public CompletableFuture<ListarAgendamentosPorPeriodoOutput> listarAgendamentosPorPeriodoRequest(ListarAgendamentosPorPeriodoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarAgendamentosPorPeriodoImpl impl = new br.com.senior.mydomain.myservice.impl.ListarAgendamentosPorPeriodoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarAgendamentosPorPeriodoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listarPontosMapa
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ListarPontosMapaOutput listarPontosMapa(ListarPontosMapaInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarPontosMapaImpl impl = new br.com.senior.mydomain.myservice.impl.ListarPontosMapaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarPontosMapa(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listarPontosMapa
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	 */
	@Override
	public void listarPontosMapa(ListarPontosMapaInput input) {
		br.com.senior.mydomain.myservice.impl.ListarPontosMapaImpl impl = new br.com.senior.mydomain.myservice.impl.ListarPontosMapaImpl(messengerSupplier, userId, messageSupplier);
		impl.listarPontosMapa(input);
	}
	
	/**
	 * Chamada assíncrona para o método listarPontosMapa
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	 */
	@Override
	public CompletableFuture<ListarPontosMapaOutput> listarPontosMapaRequest(ListarPontosMapaInput input) {
		return this.listarPontosMapaRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listarPontosMapa
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de mapa e usuario
	*/
	@Override
	public CompletableFuture<ListarPontosMapaOutput> listarPontosMapaRequest(ListarPontosMapaInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarPontosMapaImpl impl = new br.com.senior.mydomain.myservice.impl.ListarPontosMapaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarPontosMapaRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método buscarUsuarioCloud
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public BuscarUsuarioCloudOutput buscarUsuarioCloud(BuscarUsuarioCloudInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.BuscarUsuarioCloudImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarUsuarioCloudImpl(messengerSupplier, userId, messageSupplier);
		return impl.buscarUsuarioCloud(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método buscarUsuarioCloud
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void buscarUsuarioCloud(BuscarUsuarioCloudInput input) {
		br.com.senior.mydomain.myservice.impl.BuscarUsuarioCloudImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarUsuarioCloudImpl(messengerSupplier, userId, messageSupplier);
		impl.buscarUsuarioCloud(input);
	}
	
	/**
	 * Chamada assíncrona para o método buscarUsuarioCloud
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<BuscarUsuarioCloudOutput> buscarUsuarioCloudRequest(BuscarUsuarioCloudInput input) {
		return this.buscarUsuarioCloudRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método buscarUsuarioCloud
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<BuscarUsuarioCloudOutput> buscarUsuarioCloudRequest(BuscarUsuarioCloudInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.BuscarUsuarioCloudImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarUsuarioCloudImpl(messengerSupplier, userId, messageSupplier);
		return impl.buscarUsuarioCloudRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método buscarDashboardResumoAgendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public BuscarDashboardResumoAgendamentosOutput buscarDashboardResumoAgendamentos(BuscarDashboardResumoAgendamentosInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.BuscarDashboardResumoAgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarDashboardResumoAgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.buscarDashboardResumoAgendamentos(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método buscarDashboardResumoAgendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	 */
	@Override
	public void buscarDashboardResumoAgendamentos(BuscarDashboardResumoAgendamentosInput input) {
		br.com.senior.mydomain.myservice.impl.BuscarDashboardResumoAgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarDashboardResumoAgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.buscarDashboardResumoAgendamentos(input);
	}
	
	/**
	 * Chamada assíncrona para o método buscarDashboardResumoAgendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	 */
	@Override
	public CompletableFuture<BuscarDashboardResumoAgendamentosOutput> buscarDashboardResumoAgendamentosRequest(BuscarDashboardResumoAgendamentosInput input) {
		return this.buscarDashboardResumoAgendamentosRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método buscarDashboardResumoAgendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de dashboard
	*/
	@Override
	public CompletableFuture<BuscarDashboardResumoAgendamentosOutput> buscarDashboardResumoAgendamentosRequest(BuscarDashboardResumoAgendamentosInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.BuscarDashboardResumoAgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarDashboardResumoAgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.buscarDashboardResumoAgendamentosRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método buscarDashboardSerieAgendamentosPorDia
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public BuscarDashboardSerieAgendamentosPorDiaOutput buscarDashboardSerieAgendamentosPorDia(BuscarDashboardSerieAgendamentosPorDiaInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.BuscarDashboardSerieAgendamentosPorDiaImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarDashboardSerieAgendamentosPorDiaImpl(messengerSupplier, userId, messageSupplier);
		return impl.buscarDashboardSerieAgendamentosPorDia(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método buscarDashboardSerieAgendamentosPorDia
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void buscarDashboardSerieAgendamentosPorDia(BuscarDashboardSerieAgendamentosPorDiaInput input) {
		br.com.senior.mydomain.myservice.impl.BuscarDashboardSerieAgendamentosPorDiaImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarDashboardSerieAgendamentosPorDiaImpl(messengerSupplier, userId, messageSupplier);
		impl.buscarDashboardSerieAgendamentosPorDia(input);
	}
	
	/**
	 * Chamada assíncrona para o método buscarDashboardSerieAgendamentosPorDia
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<BuscarDashboardSerieAgendamentosPorDiaOutput> buscarDashboardSerieAgendamentosPorDiaRequest(BuscarDashboardSerieAgendamentosPorDiaInput input) {
		return this.buscarDashboardSerieAgendamentosPorDiaRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método buscarDashboardSerieAgendamentosPorDia
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<BuscarDashboardSerieAgendamentosPorDiaOutput> buscarDashboardSerieAgendamentosPorDiaRequest(BuscarDashboardSerieAgendamentosPorDiaInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.BuscarDashboardSerieAgendamentosPorDiaImpl impl = new br.com.senior.mydomain.myservice.impl.BuscarDashboardSerieAgendamentosPorDiaImpl(messengerSupplier, userId, messageSupplier);
		return impl.buscarDashboardSerieAgendamentosPorDiaRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listarEstoquePorHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ListarEstoquePorHemocentroOutput listarEstoquePorHemocentro(ListarEstoquePorHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarEstoquePorHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ListarEstoquePorHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarEstoquePorHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listarEstoquePorHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	 */
	@Override
	public void listarEstoquePorHemocentro(ListarEstoquePorHemocentroInput input) {
		br.com.senior.mydomain.myservice.impl.ListarEstoquePorHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ListarEstoquePorHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.listarEstoquePorHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método listarEstoquePorHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	 */
	@Override
	public CompletableFuture<ListarEstoquePorHemocentroOutput> listarEstoquePorHemocentroRequest(ListarEstoquePorHemocentroInput input) {
		return this.listarEstoquePorHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listarEstoquePorHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * queries de estoque
	*/
	@Override
	public CompletableFuture<ListarEstoquePorHemocentroOutput> listarEstoquePorHemocentroRequest(ListarEstoquePorHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarEstoquePorHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ListarEstoquePorHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarEstoquePorHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listarTiposEmFalta
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ListarTiposEmFaltaOutput listarTiposEmFalta(ListarTiposEmFaltaInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarTiposEmFaltaImpl impl = new br.com.senior.mydomain.myservice.impl.ListarTiposEmFaltaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarTiposEmFalta(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listarTiposEmFalta
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void listarTiposEmFalta(ListarTiposEmFaltaInput input) {
		br.com.senior.mydomain.myservice.impl.ListarTiposEmFaltaImpl impl = new br.com.senior.mydomain.myservice.impl.ListarTiposEmFaltaImpl(messengerSupplier, userId, messageSupplier);
		impl.listarTiposEmFalta(input);
	}
	
	/**
	 * Chamada assíncrona para o método listarTiposEmFalta
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ListarTiposEmFaltaOutput> listarTiposEmFaltaRequest(ListarTiposEmFaltaInput input) {
		return this.listarTiposEmFaltaRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listarTiposEmFalta
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ListarTiposEmFaltaOutput> listarTiposEmFaltaRequest(ListarTiposEmFaltaInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListarTiposEmFaltaImpl impl = new br.com.senior.mydomain.myservice.impl.ListarTiposEmFaltaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listarTiposEmFaltaRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		return this.getMetadataRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	*/
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportUsuarioOutput importUsuario(ImportUsuarioInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ImportUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.importUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importUsuario(ImportUsuarioInput input) {
		br.com.senior.mydomain.myservice.impl.ImportUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ImportUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.importUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método importUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportUsuarioOutput> importUsuarioRequest(ImportUsuarioInput input) {
		return this.importUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportUsuarioOutput> importUsuarioRequest(ImportUsuarioInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ImportUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.importUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportUsuarioOutput exportUsuario(ExportUsuarioInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ExportUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportUsuario(ExportUsuarioInput input) {
		br.com.senior.mydomain.myservice.impl.ExportUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ExportUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.exportUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportUsuarioOutput> exportUsuarioRequest(ExportUsuarioInput input) {
		return this.exportUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportUsuarioOutput> exportUsuarioRequest(ExportUsuarioInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ExportUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportHemocentroOutput importHemocentro(ImportHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ImportHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.importHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importHemocentro(ImportHemocentroInput input) {
		br.com.senior.mydomain.myservice.impl.ImportHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ImportHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.importHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método importHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportHemocentroOutput> importHemocentroRequest(ImportHemocentroInput input) {
		return this.importHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportHemocentroOutput> importHemocentroRequest(ImportHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ImportHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.importHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportHemocentroOutput exportHemocentro(ExportHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ExportHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportHemocentro(ExportHemocentroInput input) {
		br.com.senior.mydomain.myservice.impl.ExportHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ExportHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.exportHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportHemocentroOutput> exportHemocentroRequest(ExportHemocentroInput input) {
		return this.exportHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportHemocentroOutput> exportHemocentroRequest(ExportHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ExportHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportEstoqueOutput importEstoque(ImportEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ImportEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.importEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importEstoque(ImportEstoqueInput input) {
		br.com.senior.mydomain.myservice.impl.ImportEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ImportEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.importEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método importEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportEstoqueOutput> importEstoqueRequest(ImportEstoqueInput input) {
		return this.importEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportEstoqueOutput> importEstoqueRequest(ImportEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ImportEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.importEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportEstoqueOutput exportEstoque(ExportEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ExportEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportEstoque(ExportEstoqueInput input) {
		br.com.senior.mydomain.myservice.impl.ExportEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ExportEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.exportEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportEstoqueOutput> exportEstoqueRequest(ExportEstoqueInput input) {
		return this.exportEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportEstoqueOutput> exportEstoqueRequest(ExportEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ExportEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		return this.getDependenciesRequest(0l);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	*/
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest(long timeout) {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest(timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createUsuario
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Usuario createUsuario(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createUsuario
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	 */
	@Override
	public void createUsuario(Usuario input) {
		br.com.senior.mydomain.myservice.impl.CreateUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.createUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método createUsuario
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	 */
	@Override
	public CompletableFuture<Usuario> createUsuarioRequest(Usuario input) {
		return this.createUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createUsuario
	 * This is a public operation
	 * The 'create' request primitive for the Usuario entity.
	*/
	@Override
	public CompletableFuture<Usuario> createUsuarioRequest(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkUsuario
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkUsuarioOutput createBulkUsuario(CreateBulkUsuarioInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkUsuario
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	 */
	@Override
	public void createBulkUsuario(CreateBulkUsuarioInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkUsuario
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	 */
	@Override
	public CompletableFuture<CreateBulkUsuarioOutput> createBulkUsuarioRequest(CreateBulkUsuarioInput input) {
		return this.createBulkUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkUsuario
	 * This is a public operation
	 * The 'createBulk' request primitive for the Usuario entity.
	*/
	@Override
	public CompletableFuture<CreateBulkUsuarioOutput> createBulkUsuarioRequest(CreateBulkUsuarioInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeUsuario
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Usuario createMergeUsuario(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeUsuario
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	 */
	@Override
	public void createMergeUsuario(Usuario input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeUsuario
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	 */
	@Override
	public CompletableFuture<Usuario> createMergeUsuarioRequest(Usuario input) {
		return this.createMergeUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeUsuario
	 * This is a public operation
	 * The 'createMerge' request primitive for the Usuario entity.
	*/
	@Override
	public CompletableFuture<Usuario> createMergeUsuarioRequest(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveUsuario
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Usuario retrieveUsuario(Usuario.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveUsuario
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	 */
	@Override
	public void retrieveUsuario(Usuario.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveUsuario
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	 */
	@Override
	public CompletableFuture<Usuario> retrieveUsuarioRequest(Usuario.GetRequest input) {
		return this.retrieveUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveUsuario
	 * This is a public operation
	 * The 'retrieve' request primitive for the Usuario entity.
	*/
	@Override
	public CompletableFuture<Usuario> retrieveUsuarioRequest(Usuario.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Usuario.PagedResults listUsuario(Usuario.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ListUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.listUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	 */
	@Override
	public void listUsuario(Usuario.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ListUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.listUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método listUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	 */
	@Override
	public CompletableFuture<Usuario.PagedResults> listUsuarioRequest(Usuario.PageRequest input) {
		return this.listUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listUsuario
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Usuario entity.
	*/
	@Override
	public CompletableFuture<Usuario.PagedResults> listUsuarioRequest(Usuario.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.ListUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.listUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateUsuario
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Usuario updateUsuario(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateUsuario
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	 */
	@Override
	public void updateUsuario(Usuario input) {
		br.com.senior.mydomain.myservice.impl.UpdateUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.updateUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateUsuario
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	 */
	@Override
	public CompletableFuture<Usuario> updateUsuarioRequest(Usuario input) {
		return this.updateUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateUsuario
	 * This is a public operation
	 * The 'update' request primitive for the Usuario entity.
	*/
	@Override
	public CompletableFuture<Usuario> updateUsuarioRequest(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeUsuario
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Usuario updateMergeUsuario(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeUsuario
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	 */
	@Override
	public void updateMergeUsuario(Usuario input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeUsuario(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeUsuario
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	 */
	@Override
	public CompletableFuture<Usuario> updateMergeUsuarioRequest(Usuario input) {
		return this.updateMergeUsuarioRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeUsuario
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Usuario entity.
	*/
	@Override
	public CompletableFuture<Usuario> updateMergeUsuarioRequest(Usuario input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeUsuarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeUsuarioRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteUsuario
	 * This is a public operation
	 * The 'delete' request primitive for the Usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteUsuario(Usuario.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteUsuario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteUsuario
	 * This is a public operation
	 * The 'delete' request primitive for the Usuario entity.
	 */
	@Override
	public void deleteUsuario(Usuario.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteUsuarioImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteUsuarioImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteUsuario(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento createUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createUsuario_Agendamentos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public void createUsuario_Agendamentos(Usuario.Id parentId, Agendamento input) {
		br.com.senior.mydomain.myservice.impl.CreateUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.createUsuario_Agendamentos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public CompletableFuture<Agendamento> createUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input) {
		return this.createUsuario_AgendamentosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	@Override
	public CompletableFuture<Agendamento> createUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createUsuario_AgendamentosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento createMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeUsuario_Agendamentos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public void createMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeUsuario_Agendamentos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public CompletableFuture<Agendamento> createMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input) {
		return this.createMergeUsuario_AgendamentosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	@Override
	public CompletableFuture<Agendamento> createMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeUsuario_AgendamentosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento updateUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateUsuario_Agendamentos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public void updateUsuario_Agendamentos(Usuario.Id parentId, Agendamento input) {
		br.com.senior.mydomain.myservice.impl.UpdateUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.updateUsuario_Agendamentos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updateUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public CompletableFuture<Agendamento> updateUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input) {
		return this.updateUsuario_AgendamentosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	@Override
	public CompletableFuture<Agendamento> updateUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateUsuario_AgendamentosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento updateMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeUsuario_Agendamentos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public void updateMergeUsuario_Agendamentos(Usuario.Id parentId, Agendamento input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeUsuario_Agendamentos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public CompletableFuture<Agendamento> updateMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input) {
		return this.updateMergeUsuario_AgendamentosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	@Override
	public CompletableFuture<Agendamento> updateMergeUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeUsuario_AgendamentosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento retrieveUsuario_Agendamentos(Usuario.Id parentId, Agendamento.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveUsuario_Agendamentos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public void retrieveUsuario_Agendamentos(Usuario.Id parentId, Agendamento.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveUsuario_Agendamentos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public CompletableFuture<Agendamento> retrieveUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.GetRequest input) {
		return this.retrieveUsuario_AgendamentosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	@Override
	public CompletableFuture<Agendamento> retrieveUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveUsuario_AgendamentosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteUsuario_Agendamentos(Usuario.Id parentId, Agendamento.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteUsuario_Agendamentos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public void deleteUsuario_Agendamentos(Usuario.Id parentId, Agendamento.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteUsuario_Agendamentos(parentId, input);
	}
	
	
	/**
	 * Chamada síncrona para o método listUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento.PagedResults listUsuario_Agendamentos(Usuario.Id parentId, Agendamento.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.ListUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.listUsuario_Agendamentos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public void listUsuario_Agendamentos(Usuario.Id parentId, Agendamento.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.ListUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		impl.listUsuario_Agendamentos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método listUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	 */
	@Override
	public CompletableFuture<Agendamento.PagedResults> listUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.PageRequest input) {
		return this.listUsuario_AgendamentosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listUsuario_Agendamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	@Override
	public CompletableFuture<Agendamento.PagedResults> listUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListUsuario_AgendamentosImpl impl = new br.com.senior.mydomain.myservice.impl.ListUsuario_AgendamentosImpl(messengerSupplier, userId, messageSupplier);
		return impl.listUsuario_AgendamentosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createHemocentro
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Hemocentro createHemocentro(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createHemocentro
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	 */
	@Override
	public void createHemocentro(Hemocentro input) {
		br.com.senior.mydomain.myservice.impl.CreateHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.createHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método createHemocentro
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	 */
	@Override
	public CompletableFuture<Hemocentro> createHemocentroRequest(Hemocentro input) {
		return this.createHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createHemocentro
	 * This is a public operation
	 * The 'create' request primitive for the Hemocentro entity.
	*/
	@Override
	public CompletableFuture<Hemocentro> createHemocentroRequest(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkHemocentro
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkHemocentroOutput createBulkHemocentro(CreateBulkHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkHemocentro
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	 */
	@Override
	public void createBulkHemocentro(CreateBulkHemocentroInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkHemocentro
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	 */
	@Override
	public CompletableFuture<CreateBulkHemocentroOutput> createBulkHemocentroRequest(CreateBulkHemocentroInput input) {
		return this.createBulkHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkHemocentro
	 * This is a public operation
	 * The 'createBulk' request primitive for the Hemocentro entity.
	*/
	@Override
	public CompletableFuture<CreateBulkHemocentroOutput> createBulkHemocentroRequest(CreateBulkHemocentroInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeHemocentro
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Hemocentro createMergeHemocentro(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeHemocentro
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	 */
	@Override
	public void createMergeHemocentro(Hemocentro input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeHemocentro
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	 */
	@Override
	public CompletableFuture<Hemocentro> createMergeHemocentroRequest(Hemocentro input) {
		return this.createMergeHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeHemocentro
	 * This is a public operation
	 * The 'createMerge' request primitive for the Hemocentro entity.
	*/
	@Override
	public CompletableFuture<Hemocentro> createMergeHemocentroRequest(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveHemocentro
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Hemocentro retrieveHemocentro(Hemocentro.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveHemocentro
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	 */
	@Override
	public void retrieveHemocentro(Hemocentro.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveHemocentro
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	 */
	@Override
	public CompletableFuture<Hemocentro> retrieveHemocentroRequest(Hemocentro.GetRequest input) {
		return this.retrieveHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveHemocentro
	 * This is a public operation
	 * The 'retrieve' request primitive for the Hemocentro entity.
	*/
	@Override
	public CompletableFuture<Hemocentro> retrieveHemocentroRequest(Hemocentro.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Hemocentro.PagedResults listHemocentro(Hemocentro.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ListHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.listHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	 */
	@Override
	public void listHemocentro(Hemocentro.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ListHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.listHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método listHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	 */
	@Override
	public CompletableFuture<Hemocentro.PagedResults> listHemocentroRequest(Hemocentro.PageRequest input) {
		return this.listHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listHemocentro
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Hemocentro entity.
	*/
	@Override
	public CompletableFuture<Hemocentro.PagedResults> listHemocentroRequest(Hemocentro.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.ListHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.listHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateHemocentro
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Hemocentro updateHemocentro(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateHemocentro
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	 */
	@Override
	public void updateHemocentro(Hemocentro input) {
		br.com.senior.mydomain.myservice.impl.UpdateHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.updateHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateHemocentro
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	 */
	@Override
	public CompletableFuture<Hemocentro> updateHemocentroRequest(Hemocentro input) {
		return this.updateHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateHemocentro
	 * This is a public operation
	 * The 'update' request primitive for the Hemocentro entity.
	*/
	@Override
	public CompletableFuture<Hemocentro> updateHemocentroRequest(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeHemocentro
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Hemocentro updateMergeHemocentro(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeHemocentro
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	 */
	@Override
	public void updateMergeHemocentro(Hemocentro input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeHemocentro(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeHemocentro
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	 */
	@Override
	public CompletableFuture<Hemocentro> updateMergeHemocentroRequest(Hemocentro input) {
		return this.updateMergeHemocentroRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeHemocentro
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Hemocentro entity.
	*/
	@Override
	public CompletableFuture<Hemocentro> updateMergeHemocentroRequest(Hemocentro input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeHemocentroImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeHemocentroRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteHemocentro
	 * This is a public operation
	 * The 'delete' request primitive for the Hemocentro entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteHemocentro(Hemocentro.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteHemocentro(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteHemocentro
	 * This is a public operation
	 * The 'delete' request primitive for the Hemocentro entity.
	 */
	@Override
	public void deleteHemocentro(Hemocentro.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteHemocentroImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteHemocentroImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteHemocentro(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createAgendamento
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento createAgendamento(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAgendamento
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	 */
	@Override
	public void createAgendamento(Agendamento input) {
		br.com.senior.mydomain.myservice.impl.CreateAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.createAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createAgendamento
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	 */
	@Override
	public CompletableFuture<Agendamento> createAgendamentoRequest(Agendamento input) {
		return this.createAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createAgendamento
	 * This is a public operation
	 * The 'create' request primitive for the Agendamento entity.
	*/
	@Override
	public CompletableFuture<Agendamento> createAgendamentoRequest(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkAgendamento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkAgendamentoOutput createBulkAgendamento(CreateBulkAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAgendamento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	 */
	@Override
	public void createBulkAgendamento(CreateBulkAgendamentoInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAgendamento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	 */
	@Override
	public CompletableFuture<CreateBulkAgendamentoOutput> createBulkAgendamentoRequest(CreateBulkAgendamentoInput input) {
		return this.createBulkAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAgendamento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Agendamento entity.
	*/
	@Override
	public CompletableFuture<CreateBulkAgendamentoOutput> createBulkAgendamentoRequest(CreateBulkAgendamentoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeAgendamento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento createMergeAgendamento(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAgendamento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	 */
	@Override
	public void createMergeAgendamento(Agendamento input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAgendamento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	 */
	@Override
	public CompletableFuture<Agendamento> createMergeAgendamentoRequest(Agendamento input) {
		return this.createMergeAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAgendamento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Agendamento entity.
	*/
	@Override
	public CompletableFuture<Agendamento> createMergeAgendamentoRequest(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveAgendamento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento retrieveAgendamento(Agendamento.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAgendamento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	 */
	@Override
	public void retrieveAgendamento(Agendamento.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAgendamento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	 */
	@Override
	public CompletableFuture<Agendamento> retrieveAgendamentoRequest(Agendamento.GetRequest input) {
		return this.retrieveAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAgendamento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Agendamento entity.
	*/
	@Override
	public CompletableFuture<Agendamento> retrieveAgendamentoRequest(Agendamento.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento.PagedResults listAgendamento(Agendamento.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.ListAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	 */
	@Override
	public void listAgendamento(Agendamento.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.ListAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.listAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método listAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	 */
	@Override
	public CompletableFuture<Agendamento.PagedResults> listAgendamentoRequest(Agendamento.PageRequest input) {
		return this.listAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listAgendamento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Agendamento entity.
	*/
	@Override
	public CompletableFuture<Agendamento.PagedResults> listAgendamentoRequest(Agendamento.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.ListAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateAgendamento
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento updateAgendamento(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAgendamento
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	 */
	@Override
	public void updateAgendamento(Agendamento input) {
		br.com.senior.mydomain.myservice.impl.UpdateAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAgendamento
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	 */
	@Override
	public CompletableFuture<Agendamento> updateAgendamentoRequest(Agendamento input) {
		return this.updateAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateAgendamento
	 * This is a public operation
	 * The 'update' request primitive for the Agendamento entity.
	*/
	@Override
	public CompletableFuture<Agendamento> updateAgendamentoRequest(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeAgendamento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Agendamento updateMergeAgendamento(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAgendamento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	 */
	@Override
	public void updateMergeAgendamento(Agendamento input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAgendamento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAgendamento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	 */
	@Override
	public CompletableFuture<Agendamento> updateMergeAgendamentoRequest(Agendamento input) {
		return this.updateMergeAgendamentoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAgendamento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Agendamento entity.
	*/
	@Override
	public CompletableFuture<Agendamento> updateMergeAgendamentoRequest(Agendamento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAgendamentoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteAgendamento
	 * This is a public operation
	 * The 'delete' request primitive for the Agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAgendamento(Agendamento.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAgendamento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAgendamento
	 * This is a public operation
	 * The 'delete' request primitive for the Agendamento entity.
	 */
	@Override
	public void deleteAgendamento(Agendamento.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteAgendamentoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteAgendamentoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAgendamento(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao createAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAgendamento_Doacoes(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public void createAgendamento_Doacoes(Agendamento.Id parentId, Doacao input) {
		br.com.senior.mydomain.myservice.impl.CreateAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.createAgendamento_Doacoes(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public CompletableFuture<Doacao> createAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input) {
		return this.createAgendamento_DoacoesRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	@Override
	public CompletableFuture<Doacao> createAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAgendamento_DoacoesRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao createMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAgendamento_Doacoes(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public void createMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAgendamento_Doacoes(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public CompletableFuture<Doacao> createMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input) {
		return this.createMergeAgendamento_DoacoesRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	@Override
	public CompletableFuture<Doacao> createMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAgendamento_DoacoesRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao updateAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAgendamento_Doacoes(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public void updateAgendamento_Doacoes(Agendamento.Id parentId, Doacao input) {
		br.com.senior.mydomain.myservice.impl.UpdateAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAgendamento_Doacoes(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public CompletableFuture<Doacao> updateAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input) {
		return this.updateAgendamento_DoacoesRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	@Override
	public CompletableFuture<Doacao> updateAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAgendamento_DoacoesRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao updateMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAgendamento_Doacoes(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public void updateMergeAgendamento_Doacoes(Agendamento.Id parentId, Doacao input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAgendamento_Doacoes(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public CompletableFuture<Doacao> updateMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input) {
		return this.updateMergeAgendamento_DoacoesRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	@Override
	public CompletableFuture<Doacao> updateMergeAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAgendamento_DoacoesRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao retrieveAgendamento_Doacoes(Agendamento.Id parentId, Doacao.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAgendamento_Doacoes(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public void retrieveAgendamento_Doacoes(Agendamento.Id parentId, Doacao.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAgendamento_Doacoes(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public CompletableFuture<Doacao> retrieveAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.GetRequest input) {
		return this.retrieveAgendamento_DoacoesRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	@Override
	public CompletableFuture<Doacao> retrieveAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAgendamento_DoacoesRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAgendamento_Doacoes(Agendamento.Id parentId, Doacao.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAgendamento_Doacoes(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public void deleteAgendamento_Doacoes(Agendamento.Id parentId, Doacao.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAgendamento_Doacoes(parentId, input);
	}
	
	
	/**
	 * Chamada síncrona para o método listAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao.PagedResults listAgendamento_Doacoes(Agendamento.Id parentId, Doacao.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.ListAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAgendamento_Doacoes(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public void listAgendamento_Doacoes(Agendamento.Id parentId, Doacao.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.ListAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		impl.listAgendamento_Doacoes(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método listAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	 */
	@Override
	public CompletableFuture<Doacao.PagedResults> listAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.PageRequest input) {
		return this.listAgendamento_DoacoesRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listAgendamento_Doacoes
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	@Override
	public CompletableFuture<Doacao.PagedResults> listAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListAgendamento_DoacoesImpl impl = new br.com.senior.mydomain.myservice.impl.ListAgendamento_DoacoesImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAgendamento_DoacoesRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createDoacao
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao createDoacao(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createDoacao
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	 */
	@Override
	public void createDoacao(Doacao input) {
		br.com.senior.mydomain.myservice.impl.CreateDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createDoacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createDoacao
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	 */
	@Override
	public CompletableFuture<Doacao> createDoacaoRequest(Doacao input) {
		return this.createDoacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createDoacao
	 * This is a public operation
	 * The 'create' request primitive for the Doacao entity.
	*/
	@Override
	public CompletableFuture<Doacao> createDoacaoRequest(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createDoacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkDoacao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkDoacaoOutput createBulkDoacao(CreateBulkDoacaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkDoacao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	 */
	@Override
	public void createBulkDoacao(CreateBulkDoacaoInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkDoacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkDoacao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	 */
	@Override
	public CompletableFuture<CreateBulkDoacaoOutput> createBulkDoacaoRequest(CreateBulkDoacaoInput input) {
		return this.createBulkDoacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkDoacao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Doacao entity.
	*/
	@Override
	public CompletableFuture<CreateBulkDoacaoOutput> createBulkDoacaoRequest(CreateBulkDoacaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkDoacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeDoacao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao createMergeDoacao(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeDoacao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	 */
	@Override
	public void createMergeDoacao(Doacao input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeDoacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeDoacao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	 */
	@Override
	public CompletableFuture<Doacao> createMergeDoacaoRequest(Doacao input) {
		return this.createMergeDoacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeDoacao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Doacao entity.
	*/
	@Override
	public CompletableFuture<Doacao> createMergeDoacaoRequest(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeDoacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveDoacao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao retrieveDoacao(Doacao.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveDoacao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	 */
	@Override
	public void retrieveDoacao(Doacao.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveDoacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveDoacao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	 */
	@Override
	public CompletableFuture<Doacao> retrieveDoacaoRequest(Doacao.GetRequest input) {
		return this.retrieveDoacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveDoacao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Doacao entity.
	*/
	@Override
	public CompletableFuture<Doacao> retrieveDoacaoRequest(Doacao.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveDoacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listDoacao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao.PagedResults listDoacao(Doacao.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.ListDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listDoacao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	 */
	@Override
	public void listDoacao(Doacao.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.ListDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.listDoacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método listDoacao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	 */
	@Override
	public CompletableFuture<Doacao.PagedResults> listDoacaoRequest(Doacao.PageRequest input) {
		return this.listDoacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listDoacao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Doacao entity.
	*/
	@Override
	public CompletableFuture<Doacao.PagedResults> listDoacaoRequest(Doacao.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.ListDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listDoacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateDoacao
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao updateDoacao(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateDoacao
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	 */
	@Override
	public void updateDoacao(Doacao input) {
		br.com.senior.mydomain.myservice.impl.UpdateDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateDoacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateDoacao
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	 */
	@Override
	public CompletableFuture<Doacao> updateDoacaoRequest(Doacao input) {
		return this.updateDoacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateDoacao
	 * This is a public operation
	 * The 'update' request primitive for the Doacao entity.
	*/
	@Override
	public CompletableFuture<Doacao> updateDoacaoRequest(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateDoacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeDoacao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Doacao updateMergeDoacao(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeDoacao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	 */
	@Override
	public void updateMergeDoacao(Doacao input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeDoacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeDoacao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	 */
	@Override
	public CompletableFuture<Doacao> updateMergeDoacaoRequest(Doacao input) {
		return this.updateMergeDoacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeDoacao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Doacao entity.
	*/
	@Override
	public CompletableFuture<Doacao> updateMergeDoacaoRequest(Doacao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeDoacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeDoacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteDoacao
	 * This is a public operation
	 * The 'delete' request primitive for the Doacao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteDoacao(Doacao.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteDoacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteDoacao
	 * This is a public operation
	 * The 'delete' request primitive for the Doacao entity.
	 */
	@Override
	public void deleteDoacao(Doacao.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteDoacaoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteDoacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteDoacao(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createEstoque
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Estoque createEstoque(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createEstoque
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	 */
	@Override
	public void createEstoque(Estoque input) {
		br.com.senior.mydomain.myservice.impl.CreateEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.createEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método createEstoque
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	 */
	@Override
	public CompletableFuture<Estoque> createEstoqueRequest(Estoque input) {
		return this.createEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createEstoque
	 * This is a public operation
	 * The 'create' request primitive for the Estoque entity.
	*/
	@Override
	public CompletableFuture<Estoque> createEstoqueRequest(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkEstoque
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkEstoqueOutput createBulkEstoque(CreateBulkEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEstoque
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	 */
	@Override
	public void createBulkEstoque(CreateBulkEstoqueInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEstoque
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	 */
	@Override
	public CompletableFuture<CreateBulkEstoqueOutput> createBulkEstoqueRequest(CreateBulkEstoqueInput input) {
		return this.createBulkEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEstoque
	 * This is a public operation
	 * The 'createBulk' request primitive for the Estoque entity.
	*/
	@Override
	public CompletableFuture<CreateBulkEstoqueOutput> createBulkEstoqueRequest(CreateBulkEstoqueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeEstoque
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Estoque createMergeEstoque(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEstoque
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	 */
	@Override
	public void createMergeEstoque(Estoque input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEstoque
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	 */
	@Override
	public CompletableFuture<Estoque> createMergeEstoqueRequest(Estoque input) {
		return this.createMergeEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEstoque
	 * This is a public operation
	 * The 'createMerge' request primitive for the Estoque entity.
	*/
	@Override
	public CompletableFuture<Estoque> createMergeEstoqueRequest(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveEstoque
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Estoque retrieveEstoque(Estoque.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEstoque
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	 */
	@Override
	public void retrieveEstoque(Estoque.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEstoque
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	 */
	@Override
	public CompletableFuture<Estoque> retrieveEstoqueRequest(Estoque.GetRequest input) {
		return this.retrieveEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEstoque
	 * This is a public operation
	 * The 'retrieve' request primitive for the Estoque entity.
	*/
	@Override
	public CompletableFuture<Estoque> retrieveEstoqueRequest(Estoque.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Estoque.PagedResults listEstoque(Estoque.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ListEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	 */
	@Override
	public void listEstoque(Estoque.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ListEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.listEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método listEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	 */
	@Override
	public CompletableFuture<Estoque.PagedResults> listEstoqueRequest(Estoque.PageRequest input) {
		return this.listEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listEstoque
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Estoque entity.
	*/
	@Override
	public CompletableFuture<Estoque.PagedResults> listEstoqueRequest(Estoque.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.ListEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateEstoque
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Estoque updateEstoque(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateEstoque
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	 */
	@Override
	public void updateEstoque(Estoque input) {
		br.com.senior.mydomain.myservice.impl.UpdateEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.updateEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateEstoque
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	 */
	@Override
	public CompletableFuture<Estoque> updateEstoqueRequest(Estoque input) {
		return this.updateEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateEstoque
	 * This is a public operation
	 * The 'update' request primitive for the Estoque entity.
	*/
	@Override
	public CompletableFuture<Estoque> updateEstoqueRequest(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeEstoque
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Estoque updateMergeEstoque(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEstoque
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	 */
	@Override
	public void updateMergeEstoque(Estoque input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEstoque
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	 */
	@Override
	public CompletableFuture<Estoque> updateMergeEstoqueRequest(Estoque input) {
		return this.updateMergeEstoqueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEstoque
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Estoque entity.
	*/
	@Override
	public CompletableFuture<Estoque> updateMergeEstoqueRequest(Estoque input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEstoqueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteEstoque
	 * This is a public operation
	 * The 'delete' request primitive for the Estoque entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteEstoque(Estoque.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteEstoque
	 * This is a public operation
	 * The 'delete' request primitive for the Estoque entity.
	 */
	@Override
	public void deleteEstoque(Estoque.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteEstoqueImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEstoque(input);
	}
	
	

	
	private Message createMessage(ExportUsuarioEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportAgendamentoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportUsuarioEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportHemocentroEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportDoacaoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportHemocentroEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportAgendamentoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(AgendamentoCriadoPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportDoacaoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ServiceStartedPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportEstoqueEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(DoacaoConfirmadaPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportEstoqueEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(AgendamentoCanceladoPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(NotifyUserEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	

	/**
	 * Chamada assíncrona para o método publishDoacaoConfirmada
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishDoacaoConfirmada( DoacaoConfirmadaPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.DOACAO_CONFIRMADA);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishAgendamentoCriado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishAgendamentoCriado( AgendamentoCriadoPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.AGENDAMENTO_CRIADO);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishAgendamentoCancelado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishAgendamentoCancelado( AgendamentoCanceladoPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.AGENDAMENTO_CANCELADO);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishServiceStarted
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishServiceStarted( ServiceStartedPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.SERVICE_STARTED);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishNotifyUserEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.NOTIFY_USER_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportUsuarioEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportUsuarioEvent( ImportUsuarioEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_USUARIO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportUsuarioEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportUsuarioEvent( ExportUsuarioEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_USUARIO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportHemocentroEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportHemocentroEvent( ImportHemocentroEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_HEMOCENTRO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportHemocentroEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportHemocentroEvent( ExportHemocentroEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_HEMOCENTRO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportAgendamentoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportAgendamentoEvent( ImportAgendamentoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_AGENDAMENTO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportAgendamentoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportAgendamentoEvent( ExportAgendamentoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_AGENDAMENTO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportDoacaoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportDoacaoEvent( ImportDoacaoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_DOACAO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportDoacaoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportDoacaoEvent( ExportDoacaoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_DOACAO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportEstoqueEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportEstoqueEvent( ImportEstoqueEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_ESTOQUE_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportEstoqueEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportEstoqueEvent( ExportEstoqueEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_ESTOQUE_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
