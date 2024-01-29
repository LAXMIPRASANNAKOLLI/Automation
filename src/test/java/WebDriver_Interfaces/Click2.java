package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Click2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		//enter username
		driver.findElement(By.name("username")).sendKeys("_prasanna_kolli_");
		//enter password
		driver.findElement(By.name("password")).sendKeys("Prasanna@10");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
