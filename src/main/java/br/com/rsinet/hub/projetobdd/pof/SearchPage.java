package br.com.rsinet.hub.projetobdd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "speakersImg")
	private WebElement btn_Speakers;
	
	@FindBy(how = How.ID, using = "21")
	private WebElement btn_Product;
	
	@FindBy(how = How.ID, using = "tabletsImg")
	private WebElement btn_Tablets;
	
	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement btn_Laptops;

	@FindBy(how = How.ID, using = "miceImg")
	private WebElement btn_Mice;
	
	@FindBy(how = How.ID, using = "30")
	private WebElement btn_Mice4;
	
	@FindBy(how = How.ID, using = "headphonesImg")
	private WebElement btn_Headphones;
	
	@FindBy(how = How.ID, using = "searchResultLabel")
	private WebElement txt_ResultadoPesquisa;
	
	@FindBy(how = How.CLASS_NAME, using = "noProducts roboto-bold ")
	private WebElement txt_SemResultadoDePesquisa;
		
	public void clica_na_lista_de_produtos_speakers() {
		btn_Speakers.click();
	}
	
	public void clica_no_produto_3_da_lista_speakers() {
		btn_Product.click();
	}
	
	public void clica_na_lista_de_produtos_tablets() {
		btn_Tablets.click();
	}
	
	public void clica_na_lista_de_produtos_laptops() {
		btn_Laptops.click();
	}
	
	public void clica_na_lista_de_produtos_mices() {
		btn_Mice.click();
	}
	
	public void clica_no_produto_4_da_lista_mices() {
		btn_Mice4.click();
	}
	
	public void clica_na_lista_de_produtos_headphones() {
		btn_Headphones.click();
	}
	
	public boolean Produto_Existente_Aparece() {
		return txt_ResultadoPesquisa.isDisplayed();
	}
	
	public String Produto_Inexistente_Nao_Aparece() throws Exception {
		return txt_SemResultadoDePesquisa.getText();
	}
}
