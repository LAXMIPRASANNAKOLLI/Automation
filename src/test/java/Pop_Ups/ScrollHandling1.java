package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollHandling1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		//click on cancel button of popup
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//move the control of Selenium from WebDriver(I) to JavaScriptExecuter(I)
		driver.findElement(By.xpath("//span[text()='Home & Kitchen']")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000);");

	}

}
