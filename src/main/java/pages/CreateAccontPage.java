package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverContext;

//Classe onde estarão os mapeamentos da página

public class CreateAccontPage{
	
	
	//Construtor
	public CreateAccontPage(){
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	protected WebElement linkSingIn;

	@FindBy(how=How.ID, using="email_create")
	protected WebElement txtEmail;
	
	@FindBy(how=How.ID, using="SubmitCreate")
	protected WebElement SubmitCreate;

	@FindBy(how=How.XPATH, using="//input[@id='id_gender1']") 
	protected WebElement SexoMasOuFem;

	@FindBy(how=How.ID, using="customer_firstname")
	protected WebElement firstName;
	
	@FindBy(how=How.ID, using="customer_lastname")
	protected WebElement lastName;
	
	@FindBy(how=How.ID, using="passwd")
	protected WebElement password;
	
	@FindBy(how=How.ID, using="days")
	protected WebElement DateOfBirthDay;
	
	@FindBy(how=How.ID, using="months")
	protected WebElement DateOfBirthMonths;

	@FindBy(how=How.ID, using="years")
	protected WebElement DateOfBirthYears;
	
	@FindBy(how=How.ID, using="uniform-newsletter")
	protected WebElement newsLetter;
	
	@FindBy(how=How.ID, using="uniform-optin")
	protected WebElement uniformOptin;
	
	@FindBy(how=How.ID, using="company")
	protected WebElement company;
	
	@FindBy(how=How.ID, using="address1")
	protected WebElement address;
	
	@FindBy(how=How.ID, using="city")
	protected WebElement city;
	
	@FindBy(how=How.ID, using="id_state")
	protected WebElement state;
	
	@FindBy(how=How.ID, using="postcode")
	protected WebElement postCode;
	
	@FindBy(how=How.ID, using="id_country")
	protected WebElement country;
	
	@FindBy(how=How.ID, using="phone")
	protected WebElement Phone;
	
	@FindBy(how=How.XPATH, using="//button[@id='submitAccount']") 
	protected WebElement Register;	
}
