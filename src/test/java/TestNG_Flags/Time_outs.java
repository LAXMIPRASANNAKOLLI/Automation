package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time_outs {
	@Test(timeOut = 2000)
	public void Test1() {
		Reporter.log("Prasanna",true);
	}

}
