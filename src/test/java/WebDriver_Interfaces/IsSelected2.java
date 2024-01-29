package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected2 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		driver.findElement(By.id("radio2")).isSelected();
		Thread.sleep(3000);
		driver.quit();
	}

}
