package TestNGPackage;

import org.testng.annotations.Test;

public class TestParallel1 {
  @Test
  public void f1() {
	  System.out.println("TestParallel1, f1");
  }

	  @Test
	  public void f2() {
		  System.out.println("TestParallel1, f2");
	  }
}
