package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 1)
	public void Tc1() {
		Reporter.log("Prasanna",true);
	}
	@Test(priority = -1)
	public void Tc2() {
		Reporter.log("Manaswini",true);
	}
	@Test(priority = 0)
	public void Tc3() {
		Reporter.log("Nitya",true);
	}

}
