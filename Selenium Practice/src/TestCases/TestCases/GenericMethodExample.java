package TestCases;

import org.openqa.selenium.WebElement;

public class GenericMethodExample {

	public static void main(String[] args) {

		GenericMethodDemo demo = new GenericMethodDemo();
		WebElement w1=demo.FindingElement("opentab", "id");
		w1.click();
		System.out.println("done");

	}

}
