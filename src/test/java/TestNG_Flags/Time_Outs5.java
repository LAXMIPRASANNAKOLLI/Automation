package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time_Outs5 {
	@Test(timeOut = 2000)
	public void tc() {
		Reporter.log("Manaswini",true);
	}

}
