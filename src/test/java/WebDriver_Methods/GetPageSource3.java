package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSource3 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.swiggy.com");
		String tit=driver.getPageSource();
		System.out.println(tit);
		
	}

}
