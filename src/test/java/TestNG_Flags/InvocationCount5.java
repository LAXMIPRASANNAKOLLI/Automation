package TestNG_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount5 {
	@Test
	public void Test() {
		Reporter.log("Lalith Ram",true);
		Assert.fail();
	}

}
