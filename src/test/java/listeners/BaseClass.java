package listeners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	@BeforeSuite
	public void suiteConfig() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void testConfig() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void classConfig() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void methodConfig() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void methodTearDown() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void classTearDown() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void testTearDown() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void suiteTearDown() {
		System.out.println("AfterSuite");
	}
	

}
