package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchToJavaScriptPopUp {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.id("name")).sendKeys("hello");
//		driver.findElement(By.id("alertbtn")).click();
//		Thread.sleep(3000);
//		Alert switchingToAlert=driver.switchTo().alert();
//		switchingToAlert.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		Alert switchingToAlert2=driver.switchTo().alert();
		Thread.sleep(3000);
		switchingToAlert2.accept();
		//switchingToAlert2.dismiss();
	}
	
}
