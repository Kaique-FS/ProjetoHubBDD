package br.com.rsinet.hub.projetobdd.cucumber;

import br.com.rsinet.hub.projetobdd.managers.PageObjectManager;
import br.com.rsinet.hub.projetobdd.managers.WebDriverManager;

public class TestContext {

	private WebDriverManager WDM;
	private PageObjectManager POM;
	public ScenarioContext SC;

	public TestContext() {
		WDM = new WebDriverManager();
		POM = new PageObjectManager(WDM.getDriver());
		SC = new ScenarioContext();

	}

	public WebDriverManager getWebDriverManager() {
		return WDM;
	}

	public PageObjectManager getPageObjectManager() {
		return POM;
	}

	public ScenarioContext getScenarioContext() {
		return SC;
	}
}
