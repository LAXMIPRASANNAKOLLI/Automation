package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count5 {
	@Test(invocationCount = 10)
	public void Test() {
		Reporter.log("Lalith Ram",true);
	}

}
