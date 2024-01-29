package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority4 {
	@Test(priority = 0)
	public void TC() {
		Reporter.log("....",true);
	}
	@Test(priority = 0)
	public void TC1() {
		Reporter.log(",,,,,",true);
	}

}
