package br.com.rsinet.hub.projetobdd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_AddToCart;

	public void clickOn_AddToCart() {
		btn_AddToCart.click();
	}

}
