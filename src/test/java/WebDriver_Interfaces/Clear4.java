package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear4 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("China");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
	}

}
