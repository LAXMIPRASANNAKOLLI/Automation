package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods2 {
	@Test
	public void Login() {
		Reporter.log("Prasanna",true);
	}
	@Test(dependsOnMethods = {"Login"})
	public void Logout() {
		Reporter.log("Running Logout",true);
	}

}
