package TestNG_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount4 {
	@Test
	public void Test() {
		Reporter.log("Nishitha",true);
		Assert.fail();
	}

}
