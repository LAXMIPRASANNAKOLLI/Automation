package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText3 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		String name=driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
		System.out.println(name);
	}

}
