import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.CreateAccontAction;
import utils.Constantes;
import utils.DriverContext;

class TextAutomationPractice {

	WebDriver driver;
	CreateAccontAction accont;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		accont = new CreateAccontAction();
	}

	@Test
	void test() {
		accont.clicarSingIn();
		accont.preencherEmail("mil021@gmail.com");
		accont.clicarSubmitCreate();
		accont.clicarSexoMasOuFem();
		accont.firstName("Julio Cezar");
		accont.lastName("Qualiy Test");
		accont.password("miquinho98");
		accont.clicarNoCampoDia();
		accont.clicarNoCampoMes();
		accont.clicarNoCampoAno();
		accont.clicarNoNewsLetter();
		accont.clicarNoUniformOptin();
		accont.company("Teste QA!");
		accont.address("Rua Andorinha da Mata, 239");
		accont.city("Sâo Paulo");
		accont.clicarNoState();
		accont.clicarNoCode("32313");
		accont.clicarNoCountry();
		accont.clicarNoPhone("11979949946");
		accont.clicarNoRegister();
	}	
	@AfterEach
	void tearDown() throws Exception {
	 //driver.quit();
	}

}
