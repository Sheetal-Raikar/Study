package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateWebPages {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Url="https://letskodeit.teachable.com/";
		driver.get(Url);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title=driver.getTitle();
		System.out.println(title);
		
		String navigateToUrl="https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(navigateToUrl);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get(navigateToUrl);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
	}
	
}
