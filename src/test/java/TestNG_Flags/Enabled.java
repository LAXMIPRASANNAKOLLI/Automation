package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled = false)
	public void Test1() {
		Reporter.log("Prasanna",true);
	}
	

}
