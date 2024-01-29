package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSize5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://google.com");
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
	}

}
