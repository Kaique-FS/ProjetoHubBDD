package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub.projetobdd.managers.PageObjectManager;
import br.com.rsinet.hub.projetobdd.managers.WebDriverManager;
import br.com.rsinet.hub.projetobdd.pof.CartPage;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import br.com.rsinet.hub.projetobdd.pof.RegisterPage;

public class CartPageSteps {

	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	CartPage CP;
	PageObjectManager POM;
	ConfigFileReader CFR;
	WebDriverManager WDM;
	TestContext TC;
	
	public CartPageSteps(TestContext context) {
		TC = context;
		CP = TC.getPageObjectManager().getCartPage();
	}
}
