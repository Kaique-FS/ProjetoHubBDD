package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.ScenarioContext;
import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.enums.Context;
import br.com.rsinet.hub.projetobdd.pof.ProductPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ProductPageSteps {

	WebDriver driver;
	ProductPage PP;
	TestContext TC;
	ScenarioContext SC;

	public ProductPageSteps(TestContext context) {
		TC = context;
		PP = TC.getPageObjectManager().getProductPage();
	}

	@Quando("^adicionar ao carrinho$")
	public void clicar_em_produto_y() {
		PP.clickOn_AddToCart();
	}
	
	@Entao("^validar se o produto X é igual ao selecionado$")
	public void validar_se_o_produto_X_é_igual_ao_selecionado() {
		String NomeProdutoX = (String) TC.SC.getContext(Context.PRODUCT_NAME);
		assertEquals(NomeProdutoX, PP.getNomeProduto());
	}

	@Entao("^validar se o produto Y é igual ao selecionado$")
	public void validar_se_o_produto_Y_é_igual_ao_selecionado() {
		String NomeProdutoY = (String) TC.SC.getContext(Context.PRODUCT_NAME);
		assertNotEquals(NomeProdutoY, PP.getNomeProduto());
	}

}
