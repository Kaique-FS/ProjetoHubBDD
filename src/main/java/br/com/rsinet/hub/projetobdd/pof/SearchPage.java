package br.com.rsinet.hub.projetobdd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
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
	
	public void clica_na_lista_de_produtos_speakers() {
		btn_Speakers.click();
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
	
	public void clica_na_lista_de_produtos_headphones() {
		btn_Headphones.click();
	}
}