package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentURL5 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.zomato.com");
		@SuppressWarnings("unused")
		String url="https://www.zomato.com";
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
	}

}
