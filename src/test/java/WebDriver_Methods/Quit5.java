package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quit5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.quit();
	}

}
