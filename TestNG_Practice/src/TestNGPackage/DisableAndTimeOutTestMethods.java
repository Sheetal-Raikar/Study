package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DisableAndTimeOutTestMethods {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }
  @Test(timeOut=100)
  public void f1() throws InterruptedException {
	  System.out.println("f1");
	  Thread.sleep(200);
  }
  @Test(enabled=false)
  public void f2() {
	  System.out.println("f2");
  }
}
