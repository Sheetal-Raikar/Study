package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyPressEvents1 {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("test@abc.com");
		driver.findElement(By.id("user_password")).sendKeys("123234");
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
		
	}
	
}
