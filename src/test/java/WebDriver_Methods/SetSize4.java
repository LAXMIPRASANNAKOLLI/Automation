package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSize4 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		Dimension d=new Dimension(200, 400);
		driver.manage().window().setSize(d);
		}

}
