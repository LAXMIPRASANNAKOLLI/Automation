package Disable_TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {
	@Test
	public void Case1() {
		Reporter.log("Manaswini",true);
	}
	@Test
	public void Case2() {
		Reporter.log("NItya",true);
	}
	@Test
	public void Case3() {
		Reporter.log("Prasanna",true);
	}

}
