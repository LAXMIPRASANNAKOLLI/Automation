package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void bs() {
		Reporter.log("Hii...",true);
	}
	@BeforeTest
	public void bt() {
		Reporter.log("Hello...",true);
	}
	@BeforeClass
	public void bc() {
		Reporter.log("Welcome",true);
	}
	@BeforeMethod
	public void bm() {
		Reporter.log("Eclipse",true);
	}
	@Test
	public void Test() {
		Reporter.log("Test",true);
	}
	@AfterMethod
	public void am() {
		Reporter.log("AM",true);
	}
	@AfterClass
	public void ac() {
		Reporter.log("AC",true);
	}
	@AfterTest
	public void at() {
		Reporter.log("AT",true);
	}
	@AfterSuite
	public void as() {
		Reporter.log("AS",true);
	}

}
