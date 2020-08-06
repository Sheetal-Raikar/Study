package TestCases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before all class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After all class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before every class");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After every class");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
