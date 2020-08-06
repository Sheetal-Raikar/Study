package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ClassesToTest.SampleClassToTest;

public class TestNG_SoftAsserts {
  @Test
  public void f() {
	  SampleClassToTest toTest = new SampleClassToTest();
	  SoftAssert softAssert = new SoftAssert();
	  int result=toTest.add(10, 12);
	  softAssert.assertEquals(result, 20);
	  softAssert.assertEquals(result, 2);
	  System.out.println("End of program");
	  softAssert.assertAll();
  }
  
}
