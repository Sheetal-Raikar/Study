package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ParameterizeTestMethods {
	
  @BeforeClass
  @Parameters({"browser","platform"})
  public void beforeClass(String browser,String platform) {
	  System.out.println("Browser is"+browser);
	  System.out.println("Platform is"+platform);
  }

  @Test
  @Parameters({"response"})
  public void f(String response) {
	  String[] array=response.split(",");
	  System.out.println("Response is"+response);
	  System.out.println(array[0]);
	  System.out.println(array[1]);
  }

}
