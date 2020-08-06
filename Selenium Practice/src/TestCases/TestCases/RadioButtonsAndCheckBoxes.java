package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonsAndCheckBoxes {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
		driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
		WebElement w4=driver.findElement(By.xpath("//input[@id='benzradio']"));
		boolean s1=w4.isSelected();
		System.out.println(s1);
	}
}
