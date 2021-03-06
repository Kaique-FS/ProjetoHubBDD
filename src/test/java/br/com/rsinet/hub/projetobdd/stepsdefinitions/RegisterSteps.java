package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.managers.FileReaderManager;
import br.com.rsinet.hub.projetobdd.pof.RegisterPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RegisterSteps {

	WebDriver driver;
	RegisterPage RP;
	TestContext TC;


	 public RegisterSteps(TestContext context) {
		 TC = context;
		 RP = TC.getPageObjectManager().getRegisterPage();
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
		assertEquals(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(), "http://www.advantageonlineshopping.com/#/");
		TC.getWebDriverManager().closeDriver();
	}
	
	@Entao("^aparece mensagem de usuario ja cadastrado$")
	public void conferir_cadastro() {
		assertNotEquals(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(), TC.getWebDriverManager().getDriver().getCurrentUrl());
		TC.getWebDriverManager().closeDriver();
	}
	
}
