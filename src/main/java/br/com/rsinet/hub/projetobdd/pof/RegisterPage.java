package br.com.rsinet.hub.projetobdd.pof;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtbx_NomeUsuario;
	
	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtbx_Email;
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtbx_Senha;
	
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtbx_ConfirmaSenha;
	
	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtbx_PrimeiroNome;
	
	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtbx_UltimoNome;
	
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txtbx_NumeroTelefone;
	
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement drpdwn_Pais;
	
	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txtbx_Cidade;
	
	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txtbx_Endereco;
	
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txtbx_CodigoPostal;
	
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txtbx_Estado;
	
	@FindBy(how = How.NAME, using = "allowOffersPromotion")
	private WebElement chkbx_1;
	
	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement chkbx_2;
	
	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btn_Registrar;

	public void insere_nome_usuario(String userName) {
		txtbx_NomeUsuario.sendKeys(userName);
	}
	
	public void insere_email(String email) {
		txtbx_Email.sendKeys(email);
	}
	
	public void insere_senha(String senha) {
		txtbx_Senha.sendKeys(senha);
	}
	
	public void insere_confirmacao_senha(String confirmacaoSenha) {
		txtbx_ConfirmaSenha.sendKeys(confirmacaoSenha);
	}
	
	public void insere_primeiro_nome(String firstName) {
		txtbx_PrimeiroNome.sendKeys(firstName);
	}
	
	public void insere_ultimo_nome(String lastName) {
		txtbx_UltimoNome.sendKeys(lastName);
	}
	
	public void insere_numero_telefone(String telefone) {
		txtbx_NumeroTelefone.sendKeys(telefone);
	}
	
	public void insere_pais(String país) {
		Select select = new Select(drpdwn_Pais);
		select.selectByVisibleText(país);
	}
	
	public void insere_cidade(String cidade) {
		txtbx_Cidade.sendKeys(cidade);
	}	
	
	public void insere_endereco(String endereço) {
		txtbx_Endereco.sendKeys(endereço);
	}	
	
	public void insere_codigopostal(String codigoPostal) {
		txtbx_CodigoPostal.sendKeys(codigoPostal);
	}	
	
	public void insere_estado(String estado) {
		txtbx_Estado.sendKeys(estado);
	}
	
	public void clica_checkbox_1() {
		chkbx_1.click();
	}
	
	public void clica_checkbox_2() {
		chkbx_2.click();
	}
	
	public void registra_usario() {
		btn_Registrar.sendKeys(Keys.ENTER);
	}
	
	public void fill_PersonalDetails() {
		insere_nome_usuario("kaiquefs");
		insere_email("kaique.pok@hotmail.com");
		insere_senha("Kaique1");
		insere_confirmacao_senha("Kaique1");
		insere_primeiro_nome("Kaique");
		insere_ultimo_nome("Silva");
		insere_numero_telefone("+55 11 98756-5463");
		insere_pais("Brazil");
		insere_cidade("Osasco");
		insere_endereco("Osasco");
		insere_codigopostal("76857 765");
		insere_estado("São Paulo");
	}

}