package br.com.rsinet.hub.projetobdd.pof;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub.projetobdd.managers.FileReaderManager;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[8]/a")
	private WebElement btn_OurProducts;

	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[7]/a")
	private WebElement btn_SpecialOffer;
	
	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[6]/a")
	private WebElement btn_PopularItems;
	
	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[5]/a")
	private WebElement btn_ContactUs;
	
	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement btn_Pesquisa;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement txtbx_CampoDePesquisa;
	
	@FindBy(how = How.ID, using = "menuUserLink")
	private WebElement btn_Login;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement btn_NovoUsuario;
	
	@FindBy(how = How.ID, using = "details_16")
	private WebElement btn_Product1;
	
	@FindBy(how = How.ID, using = "details_10")
	private WebElement btn_Product2;
	
	@FindBy(how = How.ID, using = "details_21")
	private WebElement btn_Product3;

	public void navegar_para_pagina_principal() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void clica_em_produtos() {
		btn_OurProducts.click();
	}
	
	public void clica_em_ofertas_especiais() {
		btn_SpecialOffer.click();
	}
	
	public void clica_em_items_populares() {
		btn_PopularItems.click();
	}
	
	public void clica_em_nos_contate() {
		btn_ContactUs.click();
	}
	
	public void clica_em_pesquisar() {
		btn_Pesquisa.click();
	}
	
	public void digita_o_texto_de_pesquisa_valido() {
		txtbx_CampoDePesquisa.sendKeys("mice" + Keys.ENTER);
	}
	
	public void digita_o_texto_de_pesquisa_invalido() {
		txtbx_CampoDePesquisa.sendKeys("Carregador" + Keys.ENTER);
	}
	
	public void clica_em_logIn() {
		btn_Login.click();
	}
	
	public void clica_em_novo_usuario() {
		btn_NovoUsuario.sendKeys(Keys.ENTER);
	}
	
	public void clica_no_produto_popular_1() {
		btn_Product1.click();
	}
	
	public void clica_no_produto_popular_2() {
		btn_Product2.click();
	}
	
	public void clica_no_produto_popular_3() {
		btn_Product3.click();
	}

}
