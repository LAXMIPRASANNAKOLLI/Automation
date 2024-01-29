package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time_Outs1 {
	@Test(timeOut = 8000)
	public void tc() {
		Reporter.log("Prasanna",true);
	}

}
