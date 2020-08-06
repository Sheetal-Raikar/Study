package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestionExcample {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("del");
		WebElement w1=driver.findElement(By.id("react-autosuggest-1"));
	
		String togetHTML=w1.getAttribute("innerHTML");
		System.out.println(togetHTML);
			
		List<WebElement> w2=w1.findElements(By.tagName("li"));
		for(WebElement element:w2)
		{
			if(element.getText().contains("Delhi, India"))
			{
				element.click();
				break;
			}
		}
		
		
	}
}
