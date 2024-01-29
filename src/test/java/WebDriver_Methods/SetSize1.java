package WebDriver_Methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSize1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		Dimension d=new Dimension(10,20);
		driver.manage().window().setSize(d);
	}

}
