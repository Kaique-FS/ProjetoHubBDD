package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub.projetobdd.managers.FileReaderManager;
import br.com.rsinet.hub.projetobdd.managers.PageObjectManager;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import br.com.rsinet.hub.projetobdd.pof.RegisterPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Register {

	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	PageObjectManager POM;
	ConfigFileReader CFR;

	@Dado("^usuário em questão está Pagina inicial$")
	public void usuário_em_questão_está_Pagina_inicial() {
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		POM = new PageObjectManager(driver);
		HP = POM.getHomePage();
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

	@Quando("^inserir detalhes da conta$")
	public void inserir_detalhes_da_conta() {
		RP = new RegisterPage(driver);
		RP = POM.getRegisterPage();
		RP.fill_PersonalDetails();

		RP.clica_checkbox_1();
		RP.clica_checkbox_2();
		RP.registra_usario();
	}

	@Entao("^entrar na conta cadastrada$")
	public void entrar_na_conta_cadastrada() {
		driver.close();
	}

}
