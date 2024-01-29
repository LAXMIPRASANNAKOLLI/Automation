package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	//movetoelement method
	WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
	//create object for select class
	Actions act=new Actions(driver);
	act.moveToElement(gmail).perform();
	}
}
