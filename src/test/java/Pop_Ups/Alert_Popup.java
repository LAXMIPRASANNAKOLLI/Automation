package Pop_Ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Popup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//give customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1012");
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//move the control selenium from webpage to particular popup
		Alert alt=driver.switchTo().alert();
		//click on ok button
		alt.accept();
		Thread.sleep(5000);
		//click on cancel button
		alt.dismiss();
		Thread.sleep(5000);
		//get the text which is present on Alert popup
		String text=alt.getText();
		System.out.println(text);
		
	}

}
