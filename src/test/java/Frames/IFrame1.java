package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrame1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//move the control of Selenium from WebPage to Frame
		driver.switchTo().frame("iframeResult");
		//enter the first name
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Manaswini");
		//enter the last name
		driver.findElement(By.xpath("//input[@id='lname']")).clear();
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Nitya Naina");
		
		//click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
	}

}
