package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 {
	@Test(priority = 1)
	public void tc1() {
		Reporter.log("Prasanna",true);
	}
	@Test(priority = -2)
	public void tc2() {
		Reporter.log("Manaswini",true);
	}
	@Test(priority = 0)
	public void tc3() {
		Reporter.log("Nitya",true);
	}
	@Test(priority = -1)
	public void tc4() {
		Reporter.log("Lalith ram",true);
	}
	@Test(priority = -3)
		public void tc5() {
		Reporter.log("Nishitha",true);
	}
	@Test(priority = 3)
	public void tc6() {
		Reporter.log("Srinadh",true);
	}
	@Test(priority = 4)
	public void tc7() {
		Reporter.log("madhu",true);
	}
	@Test(priority = 2)
	public void tc8() {
		Reporter.log("malli",true);
	}
	@Test(priority = 5)
	public void tc9() {
		Reporter.log("mahendra",true);
	}

}
