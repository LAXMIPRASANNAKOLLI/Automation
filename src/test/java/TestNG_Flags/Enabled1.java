package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled1 {
	@Test(enabled = false)
	public void test() {
		Reporter.log("Nishitha",true);
	}

}
