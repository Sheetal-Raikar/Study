package TestNGPackage;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ParallelTestinChrome {

  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Url="https://www.google.com";
		driver.get(Url);
  }
  @Test
  public void f() {
  }

}
