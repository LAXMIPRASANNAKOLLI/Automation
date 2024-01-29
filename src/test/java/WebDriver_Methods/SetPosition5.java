package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPosition5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		Point p=new Point(200, 50);
		driver.manage().window().setPosition(p);
	}

}
