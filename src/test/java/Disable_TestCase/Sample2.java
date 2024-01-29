package Disable_TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void TC1() {
		Reporter.log("Prasanna",true);
	}
	@Test
	public void TC2() {
		Reporter.log("Lakshmi Prasanna",true);
	}
	@Test
	public void TC3() {
		Reporter.log("Kolli Lakshmi Prasanna",true);
	}

}
