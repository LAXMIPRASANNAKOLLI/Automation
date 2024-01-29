package TestNG_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount2 {
	@Test
	public void Test() {
		Reporter.log("manaswini",true);
		Assert.fail();
	}

}
