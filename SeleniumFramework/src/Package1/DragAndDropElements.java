package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropElements {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement fromElement=driver.findElement(By.id("draggable"));
		WebElement toElement=driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//action.dragAndDrop(fromElement, toElement).build().perform();
		
		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
	}
}
