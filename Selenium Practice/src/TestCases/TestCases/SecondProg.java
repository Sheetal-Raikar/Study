package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class SecondProg {
	
	public void main()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("bmwradio")).click();
		WebElement s=driver.findElement(By.id("carselect"));
		Select bmw=new Select(s);
		bmw.selectByValue("honda");
		driver.findElement(By.id("bmwcheck")).click();
	//	driver.findElement(By.id("name")).click().se;
		driver.findElement(By.id("name")).sendKeys("Sheetal");
		String s1=driver.findElement(By.xpath("//*[@id='product']/tbody/tr[2]/td[2]")).getText();
				//System.out.println(s1);
		
	//	String s2=driver.findElement(By.xpath("//*[text()='Selenium WebDriver With Java'])")).getText();
		System.out.println(s1);
		
		
	
	}
}
