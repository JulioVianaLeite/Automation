package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverContext;

//Classe onde estarão os mapeamentos da página

public class FluxoDeCompraPage{
	
	
	//Construtor
	public FluxoDeCompraPage(){
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	protected WebElement linkSingIn;

	@FindBy(how=How.ID, using="email")
	protected WebElement emailAddress;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwd']")
	protected WebElement campoSenha;	
	
	@FindBy(how=How.ID, using="SubmitLogin")
	protected WebElement botaoLogin;
	
	@FindBy(how=How.ID, using="header_logo")
	protected WebElement botaoLogo;
	
	@FindBy(how=How.XPATH, using="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	protected WebElement campoTshirts;
	
	@FindBy(how=How.CLASS_NAME, using="right-block")
	protected WebElement  blockRight;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'More')]")
	protected WebElement moreCampo;
	
	@FindBy(how=How.CLASS_NAME, using="icon-plus")
	protected WebElement campoQuantidade;
	

	@FindBy(how=How.XPATH, using="//tbody/tr[@id='product_1_1_0_680412']/td[5]/div[1]/a[1]/span[1]/i[1]")
	protected WebElement campoQuantidadeMenos;
	
	
	@FindBy(how=How.XPATH, using="//select[@id='group_1']")
	protected WebElement campoSize;
	
	@FindBy(how=How.ID, using="color_14")
	protected WebElement corAzul;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Add to cart')]")
	protected WebElement addCart;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement proceedCheckout;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
	protected WebElement  botaoProceed;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	protected WebElement  botaoCheck;
	
	@FindBy(how=How.ID, using="uniform-cgv")
	protected WebElement campoCheck;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
	protected WebElement  proceedCheck;
	
	@FindBy(how=How.CLASS_NAME, using="payment_module")
	protected WebElement  bankPay;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
	protected WebElement  confirmOrder;
	
	
	
}
