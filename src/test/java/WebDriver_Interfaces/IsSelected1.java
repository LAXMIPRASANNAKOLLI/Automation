package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		driver.findElement(By.id("checkbox1")).isSelected();
		driver.quit();
	}

}
