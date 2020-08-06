package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverActions {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900);");
		Thread.sleep(2000);
		WebElement mainElement=driver.findElement(By.id("mousehover"));
		Actions action =new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
		
		WebElement subElement=driver.findElement(By.xpath("//a[text()='Top']"));
		action.moveToElement(subElement).click().perform();
		
	}
}
