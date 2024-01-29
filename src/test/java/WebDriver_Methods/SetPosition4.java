package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPosition4 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com");
		Point p=new Point(300, 50);
		driver.manage().window().setPosition(p);
	}

}
