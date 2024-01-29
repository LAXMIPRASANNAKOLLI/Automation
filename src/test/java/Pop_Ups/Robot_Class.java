package Pop_Ups;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Robot_Class {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		//click on cancel button
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		//robot class scroll down
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
			}
	

}
