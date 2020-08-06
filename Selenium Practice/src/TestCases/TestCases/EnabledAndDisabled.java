package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnabledAndDisabled {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Url="https://www.google.com";
		driver.get(Url);
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("sheetal");
	WebElement w=	driver.findElement(By.xpath("//input[@title='Search']"));
	System.out.println(w.isEnabled());
		Thread.sleep(2000);
	}
}
