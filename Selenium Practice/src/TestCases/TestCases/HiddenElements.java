package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElements {
//	@Test
//	public void main() throws InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://learn.letskodeit.com/p/practice");
//		WebElement w1=driver.findElement(By.id("displayed-text"));
//		System.out.println(w1.isDisplayed());
//		Thread.sleep(2000);
//		driver.findElement(By.id("hide-textbox")).click();
//		System.out.println(w1.isDisplayed());
//		Thread.sleep(2000);
//		driver.findElement(By.id("show-textbox")).click();
//		System.out.println(w1.isDisplayed());
//	
//		
//	}
	@Test
	public void main1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		WebElement w1=driver.findElement(By.className("gcw-storeable gcw-toggles-field-by-value gcw-child-age-select gcw-child-age-1-1-hc"));
		System.out.println(w1.isDisplayed());
		
	}
}
