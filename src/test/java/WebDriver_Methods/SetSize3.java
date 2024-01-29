package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSize3 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.zomato.com");
		Dimension d=new Dimension(400, 800);
		driver.manage().window().setSize(d);
	}

}
