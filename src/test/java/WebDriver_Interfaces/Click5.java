package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Click5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//enter the email
		driver.findElement(By.id("email")).sendKeys("lakshmiprasannakolli1012@gmail.com");
		//enter the password
		driver.findElement(By.id("pass")).sendKeys("Prasanna@10");
		//click on Login Button
		driver.findElement(By.name("login")).click();

	}

}
