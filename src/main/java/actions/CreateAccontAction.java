package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreateAccontPage;
import utils.DriverContext;

public class CreateAccontAction extends CreateAccontPage {
	protected WebDriverWait wait;
	
	public CreateAccontAction(){
		wait = new WebDriverWait(DriverContext.getDriver(), 10);
		}
	
	//comando de clicar
	public void clicarSingIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSingIn)).click();
	}
	//comando de preencher Email
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	//comando de clicar Create an account
	public void clicarSubmitCreate() {
		wait.until(ExpectedConditions.elementToBeClickable(SubmitCreate)).click();
	}
	//comando de clicar no Title de M ou F
	public void clicarSexoMasOuFem() {
		wait.until(ExpectedConditions.visibilityOf(SexoMasOuFem));
		if (!(SexoMasOuFem.isSelected())) {	
			SexoMasOuFem.click();
		}
	}
	// fazer campo firt name
	public void firstName(String name) {
		wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(name);
	}
	//fazer campo last name
	public void lastName(String sobrenome) {
		wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(sobrenome);
	}
	//fazer campo password
	public void password(String senha) {
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(senha);
	}
	//comando de clicar no campo dia
	public void clicarNoCampoDia() {
		Select comboboxDia = new Select(DateOfBirthDay);
		comboboxDia.selectByIndex(29);
	}
	//comando de clicar no campo mes
	public void clicarNoCampoMes() {
		
		Select comboboxDia = new Select(DateOfBirthMonths);
		comboboxDia.selectByIndex(1);
	}
	//comando de clicar no campo ano
	public void clicarNoCampoAno() {
		Select comboboxDia = new Select(DateOfBirthYears);
		comboboxDia.selectByIndex(25);
	}
	//comando de clicar no campo sing up
	public void clicarNoNewsLetter() {
		wait.until(ExpectedConditions.visibilityOf(newsLetter));
		if (!(newsLetter.isSelected())) {	
		newsLetter.click();
		}
	}
	//comando de clicar no campo Receive special offers from our partners!
	public void clicarNoUniformOptin() {
		wait.until(ExpectedConditions.visibilityOf(uniformOptin));
		if (!(uniformOptin.isSelected())) {	
			uniformOptin.click();
			}
		}
	//fazer campo company
	public void company(String companhia) {
		wait.until(ExpectedConditions.visibilityOf(company)).sendKeys(companhia);
		}
	//fazer campo address
	public void address(String endereco) {
		wait.until(ExpectedConditions.visibilityOf(address)).sendKeys(endereco);
		}
	//fazer campo address
	public void city(String cidade) {
		wait.until(ExpectedConditions.visibilityOf(city)).sendKeys(cidade);
		}
	//comando de clicar no campo State 
	public void clicarNoState() {
		Select comboboxDia = new Select(state);
		comboboxDia.selectByIndex(10);
	}
	//fazer campo postCode
	public void clicarNoCode(String codigoPostal) {
		wait.until(ExpectedConditions.visibilityOf(postCode)).sendKeys(codigoPostal);
		}	
	//comando de clicar no campo country 
		public void clicarNoCountry() {
			Select comboboxDia = new Select(country);
			comboboxDia.selectByIndex(1);
		}	
	//fazer campo Phone
	public void clicarNoPhone(String Phone1) {
		wait.until(ExpectedConditions.visibilityOf(Phone)).sendKeys(Phone1);
		}
	//comando de clicar no Register
		public void clicarNoRegister() {
			wait.until(ExpectedConditions.elementToBeClickable(Register)).click();
		}
	
}
