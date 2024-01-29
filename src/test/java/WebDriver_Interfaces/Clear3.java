package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("vaa vaathi song");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).clear();
	}

}
