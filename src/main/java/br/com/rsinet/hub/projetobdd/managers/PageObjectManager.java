package br.com.rsinet.hub.projetobdd.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.pof.CartPage;
import br.com.rsinet.hub.projetobdd.pof.HomePage;
import br.com.rsinet.hub.projetobdd.pof.ProductPage;
import br.com.rsinet.hub.projetobdd.pof.RegisterPage;
import br.com.rsinet.hub.projetobdd.pof.SearchPage;

public class PageObjectManager {

	private WebDriver driver;

	private ProductPage PP;
	private CartPage CP;
	private HomePage HP;
	private RegisterPage RP;
	private SearchPage SP;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (HP == null) ? HP = new HomePage(driver) : HP;
	}
	
	public ProductPage getProductPage() {
		return (PP == null) ? PP = new ProductPage(driver) : PP;
	}

	public RegisterPage getRegisterPage() {
		return (RP == null) ? RP = new RegisterPage(driver) : RP;
	}

	public CartPage getCartPage() {
		return (CP == null) ? CP = new CartPage(driver) : CP;
	}

	public SearchPage getSearchPage() {
		return (SP == null) ? SP = new SearchPage(driver) : SP;
	}

}
