package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchToIframe {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.switchTo().frame("courses-iframe");
	//	driver.switchTo().frame("iframe-name");
	//	driver.switchTo().frame(0);
		driver.findElement(By.id("search-courses")).sendKeys("Python");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("test success");
	}
}
