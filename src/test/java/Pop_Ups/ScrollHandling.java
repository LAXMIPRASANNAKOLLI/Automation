package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollHandling {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		//click on cancel button of popup
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//move the control of Selenium from WebDriver(I) to JavaScriptExecuter(I)
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000);");
	}

}
