package Disable_TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void Test1() {
		Reporter.log("Manaswini",true);
	}
	@Test
	public void Test2() {
		Reporter.log("Nishitha",true);
	}
	@Test
	public void Test3() {
		Reporter.log("Lalith",true);
	}

}
