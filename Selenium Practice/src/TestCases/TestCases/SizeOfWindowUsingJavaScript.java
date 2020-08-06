package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SizeOfWindowUsingJavaScript {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://learn.letskodeit.com/p/practice");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
		long height=(long) js.executeScript("return window.innerHeight;");
		System.out.println(height);
		long width=	(long) js.executeScript("return window.innerWidth;");
		System.out.println(width);
	}
}
