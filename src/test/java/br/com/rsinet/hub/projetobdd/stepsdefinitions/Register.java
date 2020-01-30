package br.com.rsinet.hub.projetobdd.stepsdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Register {

	WebDriver driver;

	@Dado("^usuário em questão está Pagina inicial$")
	public void usuário_em_questão_está_Pagina_inicial() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.advantageonlineshopping.com/#/");
	}

	@Quando("^clicar em novo login$")
	public void clicar_em_novo_login() {
		driver.findElement(By.id("menuUser")).click();
	}

	@Quando("^clicar em novo usuario$")
	public void clicar_em_novo_usuario() {
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).sendKeys(Keys.ENTER);
	}

	@Quando("^inserir detalhes da conta$")
	public void inserir_detalhes_da_conta() {
		// Account Details
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("kaiquefs");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Kaique1");
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Kaique1");
		driver.findElement(By.name("emailRegisterPage")).sendKeys("kaique.pok@gmail.com");
		// Personal Details
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Kaique");
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Silva");
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("+55 11 91234 5678");
		// Address
		Select oSelect = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		oSelect.selectByVisibleText("Brazil");
		// driver.findElement(By.name("countryListboxRegisterPage")).sendKeys("Greece");
		driver.findElement(By.name("cityRegisterPage")).sendKeys("Osasco");
		driver.findElement(By.name("addressRegisterPage")).sendKeys("Osasco");
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("76857 765");
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("São Paulo");
		// Check Box
		driver.findElement(By.name("allowOffersPromotion")).click();
		driver.findElement(By.name("i_agree")).click();
		// Register
		driver.findElement(By.id("register_btnundefined")).sendKeys(Keys.ENTER);
	}

	@Entao("^entrar na conta cadastrada$")
	public void entrar_na_conta_cadastrada() {

	}

}
