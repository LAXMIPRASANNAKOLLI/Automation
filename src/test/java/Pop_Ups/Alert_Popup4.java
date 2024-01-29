package Pop_Ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Popup4 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//Enter Customer ID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1012");
		//Click on Submit Button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//Move the Control Selenium from WebPage to Particular Popup
		Alert alt=driver.switchTo().alert();
		//Click on OK Button
		//alt.accept();
		Thread.sleep(5000);
		//Click on Cancel Button
		//alt.dismiss();
		Thread.sleep(5000);
		//Get the Text which is Present on Alert Popup
		String text=alt.getText();
		System.out.println(text);
	}

}
