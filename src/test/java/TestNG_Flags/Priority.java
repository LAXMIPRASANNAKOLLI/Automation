package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 4)
	public void Test1() {
		Reporter.log("Hi....",true);
	}
	@Test(priority = 3)
	public void Test2() {
		Reporter.log("Hello....",true);
	}
	@Test(priority = 2)
	public void Test3() {
		Reporter.log("Hey...",true);
	}
	@Test(priority = 1)
	public void Test4() {
		Reporter.log("Hai.....",true);
	}
	@Test(priority = 0)
	public void Test5() {
		Reporter.log("Ha...Ha...Ha...",true);
	}
	@Test(priority = -1)
	public void Test6() {
		Reporter.log("Huu...Huu...Huu...",true);
	}

}
