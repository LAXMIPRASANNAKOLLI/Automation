package Batch_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void TC1() {
		Reporter.log("runnning TC1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);
	}
	@Test
	public void TC3() {
		Reporter.log("running TC3",true);
	}
}
