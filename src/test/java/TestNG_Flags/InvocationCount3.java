package TestNG_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount3 {
	@Test
	public void Test() {
		Reporter.log("Nitya",true);
		Assert.fail();
	}

}
