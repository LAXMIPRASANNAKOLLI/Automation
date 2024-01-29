package TestNG_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test
	public void InvocaationCount() {
		Reporter.log("Hii..",true);
		Assert.fail();   //it is used to fail intentionally
	}

}
