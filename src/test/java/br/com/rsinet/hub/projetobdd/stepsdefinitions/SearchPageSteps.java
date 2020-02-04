package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.pof.SearchPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SearchPageSteps {

	WebDriver driver;
	SearchPage SP;
	TestContext TC;


	public SearchPageSteps(TestContext context) {
		TC = context;
		SP = TC.getPageObjectManager().getSearchPage();
	}

	@Quando("^clicar em um produto do fornecedor X$")
	public void clicar_em_produto_x() {
		SP.clica_na_lista_de_produtos_speakers();
		SP.clica_no_produto_3_da_lista_speakers();
	}
	
	@Quando("^clicar no produto$")
	public void clicar_em_produto_y() {
		SP.clica_no_produto_4_da_lista_mices();
	}

	@Entao("^validar se o produto aparece$")
	public void validar_se_o_produto_aparece() {
		assertTrue(SP.Produto_Existente_Aparece());
	}

	@Entao("^validar se o produto nao aparece$")
	public void validar_se_o_produto_nao_aparece() throws Exception {
		assertEquals(SP.Produto_Inexistente_Nao_Aparece(), " No results for \"Carregador\"");
	}
}