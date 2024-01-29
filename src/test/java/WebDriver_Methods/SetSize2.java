package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSize2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com");
		Dimension d=new Dimension(50,100);
		driver.manage().window().setSize(d);
	}

}
