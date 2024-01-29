package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hidden_Division5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		//click on cancel button
		driver.findElement(By.xpath("//span[text()='✕']")).click();
	}


}
