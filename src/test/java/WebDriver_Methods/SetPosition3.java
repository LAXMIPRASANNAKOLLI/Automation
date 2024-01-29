package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPosition3 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.swiggy.com");
		Point p=new Point(200, 100);
		driver.manage().window().setPosition(p);
	}

}
