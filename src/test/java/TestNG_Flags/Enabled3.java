package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled3 {
	@Test(enabled = false)
	public void Test() {
		Reporter.log("Nitya",true);
	}

}
