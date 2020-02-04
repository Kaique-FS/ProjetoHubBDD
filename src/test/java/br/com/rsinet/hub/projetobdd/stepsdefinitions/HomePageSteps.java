package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class HomePageSteps {

	WebDriver driver;
	HomePage HP;
	TestContext TC;

	public HomePageSteps(TestContext context) {
		TC = context;
		HP = TC.getPageObjectManager().getHomePage();
	}

	@Dado("^usuário em questão está Pagina inicial$")
	public void usuário_em_questão_está_Pagina_inicial() {
//		WDM = new WebDriverManager();
//		driver = WDM.getDriver();
//		POM = new PageObjectManager(driver);
//		HP = POM.getHomePage();
		HP.navegar_para_pagina_principal();
	}

	@Quando("^clicar em login$")
	public void clicar_em_novo_login() {
		HP.clica_em_logIn();
	}

	@Quando("^clicar em novo usuario$")
	public void clicar_em_novo_usuario() {
		HP.clica_em_novo_usuario();
	}
	
	@Quando("^voltar a pagina inicial$")
	public void volta_home_page() {
		HP.navegar_para_pagina_principal();
	}
	
	@Quando("^buscar um produto$")
	public void busca_produto() {
		HP.clica_em_pesquisar();
		HP.digita_o_texto_de_pesquisa_valido();
	}
	
	@Quando("^clicar em um produto do fornecedor Y$")
	public void clicar_em_produto_y() {
		HP.clica_em_items_populares();
		HP.clica_no_produto_popular_2();
	}
	
	@Quando("^realizar a pesquisa do produto existente$")
	public void pesquisa_produto_existente() {
		HP.clica_em_pesquisar();
		HP.digita_o_texto_de_pesquisa_valido();
	}
	
	@Quando("^realizar a pesquisa do produto nao existente$")
	public void pesquisa_produto_inexistente() {
		HP.clica_em_pesquisar();
		HP.digita_o_texto_de_pesquisa_invalido();
	}
}
