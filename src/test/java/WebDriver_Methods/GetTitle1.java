package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		String tit=driver.getTitle();
		System.out.println(tit);
	}

}
