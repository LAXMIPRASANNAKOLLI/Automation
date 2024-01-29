package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.gmail.com/");
		String name=driver.findElement(By.xpath("//span[text()='Create account']")).getText();
		System.out.println(name);
	}

}
