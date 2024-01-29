package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled2 {
	@Test(enabled = false)
	public void test() {
		Reporter.log("Lalith Ram",true);
	}

}
