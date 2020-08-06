package TestNGPackage;

import org.testng.annotations.Test;

public class TestParallel2 {
  @Test
  public void f1() {
	  System.out.println("TestParallel2, f1");
  }

	  @Test
	  public void f2() {
		  System.out.println("TestParallel2, f2");
	  }
}
