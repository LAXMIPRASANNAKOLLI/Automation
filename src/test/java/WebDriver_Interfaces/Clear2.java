package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear2 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		//click on user name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("_prasanna_kolli_");
		Thread.sleep(3000);
		//clear user name
		driver.findElement(By.xpath("//input[@name='username']")).clear();
	}

}
