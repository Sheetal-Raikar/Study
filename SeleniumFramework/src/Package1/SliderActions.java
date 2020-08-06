package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderActions {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		
		WebElement element=driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 100, 0).perform();
		
	}
}
