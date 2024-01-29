package Disable_TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void Case1() {
		Reporter.log("Prasanna",true);
	}
	@Test
	public void Case2() {
		Reporter.log("Manaswini",true);
	}
	@Test
	public void Case3() {
		Reporter.log("Nitya",true);
	}

}
