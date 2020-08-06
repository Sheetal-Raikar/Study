package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelectElements {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Projects\\Selenium Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		Select s1 = new Select(driver.findElement(By.id("multiple-select-example")));
		s1.selectByIndex(3);
		s1.selectByValue("apple");
		s1.selectByVisibleText("Peach");
		s1.deselectByIndex(3);
		List<WebElement> allOptions = s1.getAllSelectedOptions();
		for (WebElement all : allOptions) {
			System.out.println(all.getText());
		}
	}
}
