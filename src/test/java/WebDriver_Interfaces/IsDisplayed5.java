package WebDriver_Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisplayed5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).isDisplayed();
		driver.quit();
	}

}
