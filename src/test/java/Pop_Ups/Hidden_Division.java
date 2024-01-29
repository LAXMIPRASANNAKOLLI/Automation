package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hidden_Division {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		//click on cancel button of popup
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
	}

}
