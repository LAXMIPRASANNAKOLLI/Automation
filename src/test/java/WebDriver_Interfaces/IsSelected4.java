package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected4 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blospot.com");
		driver.findElement(By.id("radio2")).isSelected();
		driver.quit();
	}

}
