package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
	driver.findElement(By.linkText("Login")).click();
	WebDriverWait wait=new WebDriverWait(driver, 3);
	WebElement wele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
	wele.sendKeys("test");
	
		
	}
}
