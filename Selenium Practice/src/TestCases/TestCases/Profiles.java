package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class Profiles {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium Projects\\Selenium Practice\\drivers\\geckodriver.exe");
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile fxprofile=profiles.getProfile("automationprofile");
		FirefoxOptions fxoptions=new FirefoxOptions();
		fxoptions.setProfile(fxprofile);
		WebDriver driver = new FirefoxDriver(fxoptions);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
	}
}
