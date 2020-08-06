package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListOfElements {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		List<WebElement> l1=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i).isSelected())
			{
				System.out.println("clicked");
			}
			else
			{
			l1.get(i).click();
			}
			}
	}
}
