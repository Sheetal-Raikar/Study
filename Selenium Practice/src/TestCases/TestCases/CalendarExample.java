package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarExample {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-departing-hp-flight")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[@data-day='31']")).click();
		
	}
}
