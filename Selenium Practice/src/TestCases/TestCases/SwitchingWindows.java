package TestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchingWindows {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		String parentHandle=driver.getWindowHandle();
		System.out.println(parentHandle);
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles)
		{
			if(!handle.equals(parentHandle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("search-courses")).sendKeys("python");
				driver.close();
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Test successful");	
	}
}
