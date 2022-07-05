import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Constantes;

public class Navegacao2Aula {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMEDRIVER);
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	//clicando no bot�o "Sing In"
	WebElement SignIn = driver.findElement(By.linkText("Sign in"));
	SignIn.click();
	//Thread.sleep(10000);

	
	//preencher o campo de create com um emal e clicar
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create"))).click();
	//driver.findElement(By.id("email_create")).click();
	//Thread.sleep(100);
	driver.findElement(By.id("email_create")).sendKeys("teste1jj@gmail.com");
	//Thread.sleep(100);
	//driver.findElement(By.id("SubmitCreate")).click();
	//Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate")));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitCreate"))).click();
	//Thread.sleep(5000);
	
	
	//
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1']")));
	WebElement RadioInline = driver.findElement(By.xpath("//input[@id='id_gender1']"));
	if (!(RadioInline.isSelected())) {	
		RadioInline.click();
	}

	
	Select comboboxDia = new Select(driver.findElement(By.id("days")));
	comboboxDia.selectByIndex(29);
	List<WebElement> dias = comboboxDia.getOptions();
	for(int i=0; i < dias.size(); i++) {
		System.out.println(dias.get(i).getText());
	}
	Select comboboxMes = new Select(driver.findElement(By.id("months")));
	comboboxMes.selectByValue("1");
	List<WebElement> meses = comboboxMes.getOptions();
	for(int i=0; i < meses.size(); i++) {
		System.out.println(meses.get(i).getText());
	}
	Select comboboxAno = new Select(driver.findElement(By.id("years")));
	comboboxAno.selectByVisibleText("2022  ");
	List<WebElement> anos = comboboxAno.getOptions();
	for(int i=0; i < anos.size(); i++) {
		System.out.println(anos.get(i).getText());
	}
	WebElement newsletter = driver.findElement(By.id("newsletter"));
	Thread.sleep(100);
	if (!(newsletter.isSelected())) {	
		newsletter.click();
	}

	WebElement uniformoptin = driver.findElement(By.id("uniform-optin"));
	Thread.sleep(100);
	if (!(uniformoptin.isSelected())) {	
		uniformoptin.click();
	}
	
	
}	


}
