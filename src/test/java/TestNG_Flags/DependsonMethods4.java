package TestNG_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods4 {
	@Test
	public void Login1() {
		Reporter.log("Manaswini",true);
	}
	@Test
	public void Login2() {
		Reporter.log("Lalith Ram",true);
	}
	@Test(dependsOnMethods = {"Login1","Login2"})
	public void Logout() {
		Reporter.log("Nishitha",true);
	}

}
