package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority5 {
	@Test(priority = 0)
	public void Tc1() {
		Reporter.log("",true);
	}
	@Test(priority = 0)
	public void tc2() {
		Reporter.log("",true);
	}

}
