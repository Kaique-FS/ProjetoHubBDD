package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.ScenarioContext;
import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub.projetobdd.enums.Context;
import br.com.rsinet.hub.projetobdd.managers.FileReaderManager;
import br.com.rsinet.hub.projetobdd.managers.PageObjectManager;
import br.com.rsinet.hub.projetobdd.managers.WebDriverManager;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import br.com.rsinet.hub.projetobdd.pof.ProductPage;
import br.com.rsinet.hub.projetobdd.pof.RegisterPage;
import cucumber.api.java.pt.Entao;

public class ProductPageSteps {

	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	ProductPage PP;
	PageObjectManager POM;
	ConfigFileReader CFR;
	WebDriverManager WDM;
	TestContext TC;
	FileReaderManager FRM;
	ScenarioContext SC;
	
	 public ProductPageSteps(TestContext context) {
		 TC = context;
		 PP = TC.getPageObjectManager().getProductPage();
		 }
	 
	 @Entao("^validar se o produto X é igual ao selecionado$")
	 public void validar_se_o_produto_X_é_igual_ao_selecionado() {
		String NomeProduto = (String) TC.SC.getContext(Context.PRODUCT_NAME);
		assertNotEquals(NomeProduto, PP.getNomeProduto());
	 }
	 
	 @Entao("^validar se o produto Y é igual ao selecionado$")
	 public void validar_se_o_produto_Y_é_igual_ao_selecionado() {
		 String NomeProduto = (String) TC.SC.getContext(Context.PRODUCT_NAME);
		 assertNotEquals(NomeProduto, PP.getNomeProduto());
	 }

}
