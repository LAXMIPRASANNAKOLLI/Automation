package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample2 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\lakshmiprasanna\\Downloads\\kk.properties");
		Properties p=new Properties();
		p.load(fis);
		String UN=p.getProperty("un");
		System.out.println(UN);
		String PWD=p.getProperty("pwd");
		System.out.println(PWD);
		String BROWSER=p.getProperty("browser");
		System.out.println(BROWSER);
		String URL=p.getProperty("url");
		System.out.println(URL);
		WebDriver driver=new EdgeDriver();
		driver.get(URL);
	}

}
