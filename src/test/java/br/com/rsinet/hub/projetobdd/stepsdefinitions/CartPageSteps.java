package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.pof.CartPage;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import cucumber.api.java.pt.Entao;

public class CartPageSteps {

	WebDriver driver;
	HomePage HP;
	CartPage CP;
	TestContext TC;
	
	public CartPageSteps(TestContext context) {
		TC = context;
		CP = TC.getPageObjectManager().getCartPage();
	}
	
	@Entao("^clica no carrinho$")
	public void validar_se_o_produto_X_é_igual_ao_selecionado() {
		CP.clickOn_Cart();
	}
}
