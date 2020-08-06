package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PrioritizingTestMethods {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Runs once before all methods start executing");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Runs once after all methods excution is done");
  }
  @Test(priority=2)
  public void f1() {
	  System.out.println("f1");
  }
  @Test(priority=1)
  public void f2() {
	  System.out.println("f2");
  }
  @Test(priority=0)
  public void f3() {
	  System.out.println("f3");
  }

}
