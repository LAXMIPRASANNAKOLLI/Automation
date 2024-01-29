package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time_Outs3 {
	@Test(timeOut = 4000)
	public void tc() {
		Reporter.log("Lalith",true);
	}

}
