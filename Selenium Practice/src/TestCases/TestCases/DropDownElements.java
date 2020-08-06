package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownElements {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
//		Select s=new Select(driver.findElement(By.id("carselect")));
//		s.selectByValue("benz");
		WebElement w=driver.findElement(By.id("carselect"));
		Select s1=new Select(w);
		s1.selectByVisibleText("Benz");
		s1.selectByIndex(2);
		s1.selectByValue("bmw");
		List<WebElement> values =s1.getOptions();
	int size=values.size();
	for (int i=0;i<size;i++)
	{
		System.out.println(values.get(i).getText());
	}
	}
}
