package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quit1 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email"));
		Thread.sleep(3000);
		driver.quit();
	}

}
