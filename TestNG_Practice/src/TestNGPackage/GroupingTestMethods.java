package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupingTestMethods {

  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  System.out.println("after class");
  }

  
  @Test(groups= {"pet"})
  public void dog() {
	  System.out.println("pet");
  }
  
  @Test(groups= {"pet"})
  public void cat() {
	  System.out.println("pet");
  }
  
  @Test(groups= {"wild_an"})
  public void lion() {
	  System.out.println("wild");
  }
  
  @Test(groups= {"wild"})
  public void tiger() {
	  System.out.println("wild");
  }

}
