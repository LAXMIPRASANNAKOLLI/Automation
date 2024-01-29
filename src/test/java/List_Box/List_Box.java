package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//Click on Create New Account Button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Inspect the Day which we need to Handle
		Thread.sleep(5000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		//Create Object of Select Class
		Select s=new Select(day);
		s.selectByVisibleText("10");
		//Inspect the Month which we need to Handle
		Thread.sleep(5000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		//Create Object of Select Class
		Select ss=new Select(month);
		ss.selectByVisibleText("Dec");
		//Inspect the Year which we need to Handle
		Thread.sleep(5000);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		//Create Object of Select Class
		Select sss=new Select(year);
		sss.selectByVisibleText("2001");
	}

}
