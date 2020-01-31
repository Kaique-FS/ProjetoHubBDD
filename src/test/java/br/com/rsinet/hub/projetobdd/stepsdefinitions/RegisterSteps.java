package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub.projetobdd.managers.PageObjectManager;
import br.com.rsinet.hub.projetobdd.managers.WebDriverManager;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import br.com.rsinet.hub.projetobdd.pof.RegisterPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RegisterSteps {

	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	PageObjectManager POM;
	ConfigFileReader CFR;
	WebDriverManager WDM;
	TestContext testContext;

	 public RegisterSteps(TestContext context) {
		 testContext = context;
		 RP = testContext.getPageObjectManager().getRegisterPage();
		 }

	@Quando("^inserir detalhes da conta$")
	public void inserir_detalhes_da_conta() {
		//Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		RP.fill_PersonalDetails();	

		RP.clica_checkbox_1();
		RP.clica_checkbox_2();
		RP.registra_usario();
	}

	@Entao("^entrar na conta cadastrada$")
	public void entrar_na_conta_cadastrada() {
		testContext.getWebDriverManager().closeDriver();
	}
	
	@Entao("^aparece mensagem de usuario ja cadastrado$")
	public void conferir_cadastro() {
		testContext.getWebDriverManager().closeDriver();
	}
	
}
