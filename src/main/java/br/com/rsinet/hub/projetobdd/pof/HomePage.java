package br.com.rsinet.hub.projetobdd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(how = How.ID, using = "speakersLink")
	private WebElement btn_Speakers;
	
	@FindBy(how = How.ID, using = "tabletsLink")
	private WebElement btn_Tablets;
	
	@FindBy(how = How.ID, using = "laptosLink")
	private WebElement btn_Laptops;

	@FindBy(how = How.ID, using = "miceLink")
	private WebElement btn_Mice;
	
	@FindBy(how = How.ID, using = "headphonesLink")
	private WebElement btn_Headphones;
	
	@FindBy(how = How.ID, using = "details_16")
	private WebElement btn_Product1;
	
	@FindBy(how = How.ID, using = "details_10")
	private WebElement btn_Product2;
	
	@FindBy(how = How.ID, using = "details_21")
	private WebElement btn_Product3;
	
	public void perform_Search(String search) {
		driver.navigate().to("http://www.advantageonlineshopping.com/#/register");
	}

	public void navegar_para_pagina_principal() {
		driver.get("http://www.advantageonlineshopping.com/#/");
	}
	
}
