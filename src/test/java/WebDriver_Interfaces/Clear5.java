package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear5 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.zomato.com");
		driver.findElement(By.xpath("//input[@class='sc-gFXMyG fEokXR']")).sendKeys("Biryani");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='sc-gFXMyG fEokXR']")).clear();
	}
}