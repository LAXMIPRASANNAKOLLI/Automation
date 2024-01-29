package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText4 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.twitter.com/");
		Thread.sleep(3000);
		String name=driver.findElement(By.xpath("//span[text()='Create account']")).getText();
		System.out.println(name);
		
	}

}
