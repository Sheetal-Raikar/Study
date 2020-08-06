package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdProgram {
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://myaccount.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='gb_4 gb_5 gb_ae gb_Wc']")).click();
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("sraikarsheetal7@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sheetal1996");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		
	}

}
