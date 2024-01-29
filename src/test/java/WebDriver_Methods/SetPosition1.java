package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPosition1 {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	Point p=new Point(100, 200);
	driver.manage().window().setPosition(p);
}
}
