import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyTestbuilder{
	
	@BeforeClass
	public static void initTest() {
		System.out.println("Run before executing tests");
	}
	
	@Before
	public void runBeforeTest() {
		System.out.println("Run before every test");
	}
	
	@Test
	public void myFirstTest() {
		System.out.println("Running test - 1");
		int a = 1;
		assertEquals(a, 1);
	}
	
	@Test
	public void mySecondTest() {
		System.out.println("Running test -2");
		String msg = "This is 2nd test";
		assertEquals("This is 2nd test", msg);
	}
	
	@After
	public void runAfterTest() {
		System.out.println("Run after every test");

	}
	
	@AfterClass
	public static void endTest() {
		System.out.println("Run at end of test");
	}
	
	
	
}