package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Close5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//open the app
		driver.get("https://www.facebook.com");
		//close the app
		driver.close();
	}

}
