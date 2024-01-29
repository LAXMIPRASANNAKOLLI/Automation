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

public class Annotations3 {
	@BeforeSuite
	public void Test1() {
		Reporter.log("Hi....",true);
	}
	@BeforeTest
	public void Test2() {
		Reporter.log("Hello....",true);
	}
	@BeforeClass
	public void Test3() {
		Reporter.log("Hey....",true);
	}
	@BeforeMethod
	public void Test4() {
		Reporter.log("Hoooo....",true);
	}
	@Test
	public void Test() {
		Reporter.log("Heee...",true);
	}
	@AfterMethod
	public void Test5() {
		Reporter.log("ho...",true);
	}
	@AfterClass
	public void Test6() {
		Reporter.log("HaHa..",true);
	}
	@AfterTest
	public void Test7() {
		Reporter.log("HeHe...",true);
	}
	@AfterSuite
	public void Test8() {
		Reporter.log("HoHo...",true);
	}

}
