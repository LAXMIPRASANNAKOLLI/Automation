package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled4 {
	@Test(enabled = false)
	public void Test() {
		Reporter.log("Manaswini",true);
	}

}
