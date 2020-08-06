package TestCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ProfilesChrome {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addExtensions(new File("C:\\Users\\Sheetal.Raikar\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\aapocclcgogkmnckokdopfmhonfmgoek\\0.10_1.crx"));
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
	}
}
