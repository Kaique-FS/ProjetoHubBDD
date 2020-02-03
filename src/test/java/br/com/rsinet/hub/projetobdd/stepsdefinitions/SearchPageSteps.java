package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub.projetobdd.managers.FileReaderManager;
import br.com.rsinet.hub.projetobdd.managers.PageObjectManager;
import br.com.rsinet.hub.projetobdd.managers.WebDriverManager;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import br.com.rsinet.hub.projetobdd.pof.RegisterPage;
import br.com.rsinet.hub.projetobdd.pof.SearchPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SearchPageSteps {

	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	SearchPage SP;
	PageObjectManager POM;
	ConfigFileReader CFR;
	WebDriverManager WDM;
	TestContext TC;
	FileReaderManager FRM;

	public SearchPageSteps(TestContext context) {
		TC = context;
		SP = TC.getPageObjectManager().getSearchPage();
	}

	@Quando("^clicar em um produto do fornecedor X$")
	public void clicar_em_produto_x() {
		SP.clica_na_lista_de_produtos_speakers();
		SP.clica_no_produto_3_da_lista_speakers();
	}

	@Entao("^validar se o produto aparece$")
	public void validar_se_o_produto_aparece() {

	}

	@Entao("^validar se o produto nao aparece$")
	public void validar_se_o_produto_nao_aparece() {

	}
}
