package TestNGPackage;

import ClassesToTest.SampleClassToTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Demo {
	  SampleClassToTest toTest = new SampleClassToTest();
  @Test
  public void f1() 
  {
//	  SampleClassToTest toTest = new SampleClassToTest();
	  int result=toTest.add(10, 15);
	  Assert.assertEquals(result, 25);
	  System.out.println("....");
  }
  @Test
  public void f2()
  {
	  String result=toTest.concatenation("Good", "Day");
	  String expected="Good Day";
	  Assert.assertEquals(result, expected);
  }
  @Test
  public void f3()
  {
	  int[] resultArray= {1,2,3,4};
	  int[] result=toTest.intArray();
	  Assert.assertEquals(result, resultArray);
  }
  
}
