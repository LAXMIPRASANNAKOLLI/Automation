package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentURL2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		@SuppressWarnings("unused")
		String url="https://www.instagram.com";
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
	}

}
