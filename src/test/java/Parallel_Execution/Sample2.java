package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void Test2() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
	}
	
	
}
