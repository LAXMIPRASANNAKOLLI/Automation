package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate4 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.zomato.com");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
