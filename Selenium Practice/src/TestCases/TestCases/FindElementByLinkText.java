package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementByLinkText {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in");
//		driver.findElement(By.linkText("Login")).click();
//		Thread.sleep(3000);		
//		driver.findElement(By.partialLinkText("Pract")).click();
		driver.findElement(By.xpath("//div[@title='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search TripAdvisor']")).sendKeys("Club Mahindra");

		driver.findElement(By.xpath("//div[@id='SEARCH_BUTTON_CONTENT']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")).click();
		driver.findElement(By.linkText("Write a review")).click();

	}
}
