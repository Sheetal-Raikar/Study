package TestNGPackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class AssertAndReport {

	@Test(priority=0)
	public void StringAssert()
	{
//		String string = new String();
		String actualString="Testing Assert and Report";
		Reporter.log("the acutal string is"+actualString, true);
		Assert.assertEquals(actualString, "Testing Assert and Report");
		Reporter.log("verifying actual and expected string", true);

	}
	
	@Test(priority=1)
	public void IntAssert()
	{
		int actualInt=3;
		Reporter.log("the actual int is"+actualInt, true);
		Assert.assertEquals(actualInt, 3);
		Reporter.log("verifying actual and expected int", false);
	}
	
	@Test
	public void ArrayAssert()
	{
		int[] actualArray= {1,2,3};
		int[] expectedArray= {1,2,3};
		Reporter.log("the actual array is"+actualArray, true);
		Assert.assertEquals(actualArray, expectedArray);
	}
	

}
