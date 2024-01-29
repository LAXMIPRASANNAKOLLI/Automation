package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time_Outs4 {
	@Test(timeOut = 3000)
	public void tc() {
		Reporter.log("Nitya",true);
	}

}
