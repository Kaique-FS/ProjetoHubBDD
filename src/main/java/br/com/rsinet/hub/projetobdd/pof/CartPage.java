package br.com.rsinet.hub.projetobdd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuCart")
	private WebElement btn_Cart;

	@FindBy(how = How.ID, using = "checkOutButton")
	private WebElement btn_ContinueToCheckout;

	public void clickOn_Cart() {
		btn_Cart.click();
	}

	public void clickOn_Checkout() {
		btn_ContinueToCheckout.click();
	}
}
