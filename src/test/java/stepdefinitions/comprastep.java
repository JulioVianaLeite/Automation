package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverPrincipal;
import actions.FluxoDeCompraAction;

public class comprastep {
	
	DriverPrincipal principal = new DriverPrincipal();
	WebDriver driver = principal.AbrirUrl();
	FluxoDeCompraAction action = PageFactory.initElements(driver, FluxoDeCompraAction.class);
	
	public comprastep() throws Exception {

	}
	
	// comeco do cenario  @compra_feliz ----------------------------------------------------------------------------------------------------------------------------------
	@Given("usuario acessa o site {string}")
	public void usuario_acessa_o_site(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@And("clica em Sing In e faz seu login com o {string} no campo de email e {string} no campo de senha")
	public void clica_em_sing_in_e_faz_seu_login_com_o_no_campo_de_email_e_no_campo_de_senha(String string, String string2) {
		action.clicarSingIn();
		action.emailAd(string);
		action.campoSenhaPassword(string2);
	}

	@And("clica no botao para logar")
	public void clica_no_botao_para_logar() {
		action.submitLogin();
	}

	@When("a pagina My Account abre para o usuario")
	public void a_pagina_my_account_abre_para_o_usuario() {
	   driver.get("http://automationpractice.com/index.php?controller=my-account");
	   assertEquals("My account - My Store", driver.getTitle());
	   System.out.println("  " + driver.getTitle());
	}

	@And("o usuario clica na aba T-shirts")
	public void o_usuario_clica_na_aba_t_shirts() {
		action.botaoTshirts();
	}

	@And("clica no botao More")
	public void clica_no_botao_more() {
		action.botaoBlockRight();
	    action.botaoMore();
	}
	

	@And("acrescenta tres pecas, escolhendo o tamanho L, escolhendo a cor azul e prosseguindo para a compra")
	public void acrescenta_tres_pecas_escolhendo_o_tamanho_l_escolhendo_a_cor_azul_e_prosseguindo_para_a_compra() {
		 action.escolherCor();
		 action.campoTamanho();
		 action.campoQuantity();
		 action.campoQuantity();
		 action.cartAdd();
	}

	@And("clicando no botao proceed to checkout ate que o mesmo nao exista mais")
	public void clicando_no_botao_proceed_to_checkout_ate_que_o_mesmo_nao_exista_mais() {
		action.toCheckout();
		action.botaoProceedCheckout();
		action.botaoCheckout();
		action.checkboxShipping();
		action.botaoProceed();
	}

	@Then("o usuario poderar escolher como pagar")
	public void o_usuario_poderar_escolher_como_pagar() {
		action.payBank();
	}

	@And("ele confirma a compra clicando no botao I confirm my order")
	public void ele_confirma_a_compra_clicando_no_botao_i_confirm_my_order() {
		action.myOrder();
	}
		
	@Then("podera fechar o navegador")
	public void podera_fechar_o_navegador() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	// final do cenario  @compra_feliz  -----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
	
	// comeco do cenario  @compra_feliz2 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@And("prosseguindo para a compra")
	public void prosseguindo_para_a_compra() {
		action.cartAdd();
	}
	// final do cenario  @compra_feliz2  --------------------------------------------------------------------------------------------------------------------------	
	

}
