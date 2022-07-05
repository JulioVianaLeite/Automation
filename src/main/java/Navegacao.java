import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegacao {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\JULIO\\Desktop\\Accenture Academy\\academia-seleniumwebdriver-base\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		//Thread.sleep(15000);
		//driver.quit();
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email_create")).sendKeys("juliocviana35@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("juliocviana35@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("miquinho98");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("color_15")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("bankwire")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		
	}	
	
}
