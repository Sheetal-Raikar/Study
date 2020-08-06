package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class FirstProg {

	public void Test1() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",	"D:\\Selenium Projects\\Selenium Practice\\drivers\\geckodriver.exe");
		 //WebDriver driver= new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://learn.letskodeit.com/p/practice");
		// driver.get("www.google.com");
		//driver.get("https://www.tripadvisor.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();

		/*driver.findElement(By.xpath("//input[@id='mainSearch']")).sendKeys("club mahindra");
		driver.findElement(By.xpath("//div[@id='SEARCH_BUTTON_CONTENT']")).click();
*/
		 driver.findElement(By.id("name")).click();
		 driver.findElement(By.id("name")).sendKeys("Sheetal");
		//BMW.click();
		
		Thread.sleep(5000);
		

		

	}

}
