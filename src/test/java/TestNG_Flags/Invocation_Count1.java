package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count1 {
	@Test(invocationCount = 10)
	public void Test() {
		Reporter.log("Prasanna",true);
	}

}
