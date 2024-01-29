package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabled1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement button=driver.findElement(By.xpath("//button[text()='Log in']"));
		if (button.isEnabled()) {
			System.out.println("Element is Enabled");
		}
		else {
			System.out.println("Element is Disabled");
		}
	}

}
