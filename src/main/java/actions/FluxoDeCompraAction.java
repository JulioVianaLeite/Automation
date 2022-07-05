package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.FluxoDeCompraPage;
import utils.DriverContext;

public class FluxoDeCompraAction extends FluxoDeCompraPage {
	protected WebDriverWait wait;
	
	public FluxoDeCompraAction(){
		wait = new WebDriverWait(DriverContext.getDriver(), 60);
		}
	
	//clicar em Sing In
	public void clicarSingIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSingIn)).click();
	}
	
	//clicar em Email Address
	public void emailAd(String email) {
		wait.until(ExpectedConditions.visibilityOf(emailAddress)).sendKeys(email);
	}
	
	//clicar no campo senha 
	public void campoSenhaPassword(String senha) {
		wait.until(ExpectedConditions.visibilityOf(campoSenha)).sendKeys(senha);
	}
	
	//clicar no campo de efetuar login
	public void submitLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoLogin)).click();
	}
	
	//clicar no campo de efetuar login
	public void logoHeader() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoLogo)).click();
	}
	
	//clicar no campo T-shirts
	public void botaoTshirts() {
		wait.until(ExpectedConditions.elementToBeClickable(campoTshirts)).click();
	}
	
	//clicar no botao More de uma peça no campo T-shirts
	public void botaoBlockRight() {
		wait.until(ExpectedConditions.visibilityOf(blockRight)).click();
	}
		
	//clicar no botao More de uma peça no campo T-shirts
	public void botaoMore() {
		wait.until(ExpectedConditions.elementToBeClickable(moreCampo)).click();
		
	}
	
	//clicar no botao quantity
	public void campoQuantity() {
		wait.until(ExpectedConditions.elementToBeClickable(campoQuantidade)).click();
	}
	
	//clicar no botao quantity
	public void campoQuantityNegativo() {
		wait.until(ExpectedConditions.elementToBeClickable(campoQuantidadeMenos)).click();
	}
	
	// clicar no campo size
	public void campoTamanho() {
		Select comboboxSize = new Select(campoSize);
		comboboxSize.selectByVisibleText("L");
	}
	
	//clicar no botao de cor azul
	public void escolherCor() {
		wait.until(ExpectedConditions.elementToBeClickable(corAzul)).click();
	}
	
	//clicar no botao Add to Cart
	public void cartAdd() {
		wait.until(ExpectedConditions.elementToBeClickable(addCart)).click();
	}
	
	//clicar no botao proceed to checkout 1 
	public void toCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedCheckout)).click();
	}
	
	//clicar no botao proceed to checkout 2
	public void botaoProceedCheckout() {
		wait.until(ExpectedConditions.visibilityOf(botaoProceed)).click();
	}
			
	//clicar no botao proceed to checkout 3
	public void botaoCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoCheck)).click();
	}
	
	//clicar no botao checkbox na tela de Shipping
	public void checkboxShipping() {
		wait.until(ExpectedConditions.elementToBeClickable(campoCheck)).click();
	}
	
	//clicar no botao proceed to checkout 4
	public void botaoProceed() {
		wait.until(ExpectedConditions.visibilityOf(proceedCheck)).click();
	}
	
	//clicar no botao Pay by bank wire 
	public void payBank() {
		wait.until(ExpectedConditions.elementToBeClickable(bankPay)).click();
	}	
	
	//clicar no botao Pay by bank wire 
	public void myOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(confirmOrder)).click();
	}	
		
}
