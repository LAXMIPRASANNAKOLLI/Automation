package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Submit1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Abc");
		driver.findElement(By.xpath("//button[@name='login']")).submit();
	}

}
