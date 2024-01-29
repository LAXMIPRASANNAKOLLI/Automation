package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time_Outs2 {
	@Test(timeOut = 5000)
	public void tc() {
	Reporter.log("Nishi",true);
}
	

}
