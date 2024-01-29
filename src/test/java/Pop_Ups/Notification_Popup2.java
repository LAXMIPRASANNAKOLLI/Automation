package Pop_Ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup2 {
	public static void main(String[] args) {
		//create object of chrome options class
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.instagram.com");
	}


}
