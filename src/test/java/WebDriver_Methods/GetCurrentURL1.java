package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentURL1{
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		@SuppressWarnings("unused")
		String url="https://www.facebook.com";
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		}

}
