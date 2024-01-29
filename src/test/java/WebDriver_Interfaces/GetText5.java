package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		String name=driver.findElement(By.xpath("//span[text()='Sign in']")).getText();
		System.out.println(name);
	}

}
