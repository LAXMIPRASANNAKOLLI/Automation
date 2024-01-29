package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.zomato.com");
		String tit=driver.getTitle();
		System.out.println(tit);
	}

}
