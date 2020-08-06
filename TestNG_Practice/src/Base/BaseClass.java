package Base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseClass {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Base Suite: Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Base Suite: After Class");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Base Suite: Before Test");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("Base Suite: After Test");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Base Suite: Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Base Suite: Before Suite");
  }

}
