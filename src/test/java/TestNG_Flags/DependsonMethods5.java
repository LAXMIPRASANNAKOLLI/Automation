package TestNG_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods5 {
	@Test
	public void login1() {
		Reporter.log("Prasanna",true);
		Assert.fail();
	}
	@Test
	public void login2() {
		Reporter.log("Manaswini",true);
	}
	@Test(dependsOnMethods = {"login1","login2"})
	public void logout() {
		Reporter.log("Nishitha",true);
	}

}
