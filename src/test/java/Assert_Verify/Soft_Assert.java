package Assert_Verify;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void Sample1() {
		String str="Prasanna";
		String str1="prasanna";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(str,str1);
		System.out.println("Hi,I am after failing fisrt verification");
		soft.assertAll();
	}
	@Test
	public void Sample2() {
		Reporter.log("Hello",true);
	}

}
