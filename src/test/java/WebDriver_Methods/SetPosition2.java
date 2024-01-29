package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPosition2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		Point p=new Point(300, 600);
		driver.manage().window().setPosition(p);
	}

}
