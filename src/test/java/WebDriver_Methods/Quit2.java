package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quit2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@name='username']"));
		driver.quit();
	}

}
