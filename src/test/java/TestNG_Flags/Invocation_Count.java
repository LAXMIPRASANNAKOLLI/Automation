package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationCount = 10)
	public void Count() {
		Reporter.log("Prasanna",true);
	}

}
