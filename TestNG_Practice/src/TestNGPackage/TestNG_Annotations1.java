package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_Annotations1 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("TestClass1: This runs once before all method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TestClass1: This runs once after all method");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestClass1: This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestClass1: This runs after every method");
	}

	@Test
	public void f1() {
		System.out.println("TestClass1: Running f1");
	}

	@Test
	public void f2() {
		System.out.println("TestClass1: Running f2");
	}

}
