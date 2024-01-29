package TestNG_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount1 {
	@Test
	public void Test() {
		Reporter.log("Prasanna",true);
		Assert.fail();
	}

}
