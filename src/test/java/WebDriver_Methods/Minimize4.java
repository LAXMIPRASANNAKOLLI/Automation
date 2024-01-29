package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Minimize4 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//open the app
		driver.get("https://www.myntra.com");
		//minimize it
		driver.manage().window().minimize();
		}

}
