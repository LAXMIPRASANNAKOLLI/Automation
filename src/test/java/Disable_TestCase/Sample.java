package Disable_TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void Test1() {
		Reporter.log("Hi....,Good Morning",true);
	}
		@Test
		public void Test2() {
			Reporter.log("Hello...,GM",true);
			
		}
		@Test
		public void Test3() {
			Reporter.log("Heyy...",true);
	}

}
