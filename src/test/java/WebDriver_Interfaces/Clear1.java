package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear1 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//click on user name
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshmiprasannakolli35245@gmail.com");
		Thread.sleep(3000);
		//clear user name
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		}

}
