package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate5 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.meesho.com");
		Thread.sleep(5000);
		driver.navigate().to("https://www.telegram.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
