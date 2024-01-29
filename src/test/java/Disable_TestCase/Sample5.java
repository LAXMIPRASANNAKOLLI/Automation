package Disable_TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample5 {
	@Test
	public void TC1() {
		Reporter.log("Hi...Prasanna",true);
	}
	@Test
	public void TC2() {
		Reporter.log("Hello...Manaswini",true);
	}
	@Test
	public void TC3() {
		Reporter.log("Hey...Nitya",true);
	}

}
