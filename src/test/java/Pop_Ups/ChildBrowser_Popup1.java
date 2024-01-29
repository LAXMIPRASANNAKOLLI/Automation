package Pop_Ups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowser_Popup1 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.linkedin.com/");
		//Click on Continue with Google
		driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
		//Get Window Handles
		Set<String> ids=driver.getWindowHandles();
		//Create Object of ArrayList
		Thread.sleep(5000);
		ArrayList<String> al=new ArrayList<String>(ids);
		//Get the Window id
		Thread.sleep(5000);
		String cwid=al.get(1);
		Thread.sleep(5000);
		System.out.println(cwid);
		Thread.sleep(5000);
		//switch to child window
		driver.switchTo().window(cwid);
		//create on create account button
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("lakshmiprasannakolli35245@gmail.com");
	}

}
