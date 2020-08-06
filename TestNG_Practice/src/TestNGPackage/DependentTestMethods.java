package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import ClassesToTest.SampleClassToTest;

public class DependentTestMethods {
           SampleClassToTest obj;
  @BeforeClass
  public void beforeClass() {
	  obj=new SampleClassToTest();
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }
  @Test()
  public void f1() {
	  System.out.println("f1");
	  int result=obj.add(1,2);
	  Assert.assertEquals(result, 2);
  }
  @Test(dependsOnMethods = {"f1"})
  public void f2() {
	  System.out.println("f2");
  }
  @Test(dependsOnMethods = {"f2"},alwaysRun=true)
  public void f3() {
	  System.out.println("f3");
  }
  @Test
  public void f4() {
	  System.out.println("f4");
  }
}
