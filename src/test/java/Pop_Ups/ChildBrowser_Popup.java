package Pop_Ups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_Popup {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		//click on continue with google
		driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
		//get window handles
		Set<String> ids = driver.getWindowHandles();
		//create object of ArrayList
		Thread.sleep(5000);
		ArrayList<String> al = new ArrayList<String>(ids);
		//get the window id
		Thread.sleep(5000);
		String cwid = al.get(1);
		Thread.sleep(5000);
		System.out.println(cwid);
		Thread.sleep(5000);
		//switch to child window
		driver.switchTo().window(cwid);
		//create on create account button
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("lakshmiprasannakolli35245@gmail.com");		

	
	
	}

}
