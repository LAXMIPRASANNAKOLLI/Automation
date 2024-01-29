package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods {
	@Test	
	public void Login1() {
		Reporter.log("Running Login1",true);
	}
	@Test
	public void Login2() {
		Reporter.log("Running Login2",true);
	}
	@Test(dependsOnMethods = {"Login1","Login2"})
	public void Logout() {
		Reporter.log("Running Logout",true);
	}

}
