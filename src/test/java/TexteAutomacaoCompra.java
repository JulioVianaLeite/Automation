import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.FluxoDeCompraAction;
import utils.Constantes;
import utils.DriverContext;

class TexteAutomacaoCompra {

	WebDriver driver;
	FluxoDeCompraAction accont;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		accont = new FluxoDeCompraAction();
	}

	@Test
	void test() throws InterruptedException {
		accont.clicarSingIn();
		accont.emailAd("teste1millsz@gmail.com");
		accont.campoSenhaPassword("@Miquinho98");
		accont.submitLogin();
		accont.logoHeader();
		Thread.sleep(2000);
		accont.botaoTshirts();
		Thread.sleep(1500);
		accont.botaoBlockRight();
		accont.botaoMore();
		accont.campoQuantity();
		Thread.sleep(1000);
		accont.campoQuantity();
		Thread.sleep(1000);
		accont.campoTamanho();
		Thread.sleep(1000);
		accont.escolherCor();
		Thread.sleep(1000);
		accont.cartAdd();
		Thread.sleep(1000);
		//accont.campoQuantityNegativo();
		accont.toCheckout();
		Thread.sleep(1000);
		accont.botaoProceedCheckout();
		Thread.sleep(1000);
		accont.botaoCheckout();
		Thread.sleep(1000);
		accont.checkboxShipping();
		Thread.sleep(1000);
		accont.botaoProceed();
		Thread.sleep(1000);
		accont.payBank();
		Thread.sleep(1000);
		accont.myOrder();

	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
