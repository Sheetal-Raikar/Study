package Package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sample {
@Test
public void main()
{
//	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
//	WebDriver chromeDriver = new ChromeDriver();
	System.setProperty("webdriver.gecko.driver",	"D:\\Selenium Projects\\Selenium Practice\\drivers\\geckodriver.exe");
	WebDriver chromeDriver = new FirefoxDriver();
	chromeDriver.get("https://learn.letskodeit.com/p/practice");
	chromeDriver.manage().window().maximize();
	chromeDriver.manage().deleteAllCookies();
	chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	chromeDriver.findElement(By.id("bmwradio")).click();
	List<WebElement> elements=chromeDriver.findElements(By.id("multiple-select-example"));
	for(WebElement ele:elements)
	{
		System.out.println(ele.getText());
	}
//	WebElement selectelements=chromeDriver.findElement(By.id("multiple-select-example"));
//
//	Select select = new Select(selectelements);
//	select.selectByIndex(2);
//	List<WebElement> options=select.getOptions();
//	for(WebElement op:options)
//	{
//		System.out.println(op.getText());
//	}
	
	WebElement ele=chromeDriver.findElement(By.id("carselect"));
	Select s=new Select(ele);
	s.selectByVisibleText("Benz");
	List<WebElement> eleoptions=chromeDriver.findElements(By.id("carselect"));
	for(WebElement op:eleoptions)
		{
			System.out.println(op.getText());
		}
	

}
}
