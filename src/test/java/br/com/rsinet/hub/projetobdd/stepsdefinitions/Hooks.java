package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import br.com.rsinet.hub.projetobdd.cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext TC;

	public Hooks(TestContext context) {
		TC = context;
	}

	@Before
	public void BeforeSteps() {
		/*What all you can perform here
			Starting a webdriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/
	}

	@After
	public void AfterSteps() {
		TC.getWebDriverManager().closeDriver();
	}
}
