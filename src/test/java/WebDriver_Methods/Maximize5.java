package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Maximize5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//open the app
		driver.get("https://www.twitter.com");
		//maximize it
		driver.manage().window().maximize();
	}

}
