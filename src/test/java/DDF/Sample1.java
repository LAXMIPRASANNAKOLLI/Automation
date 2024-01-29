package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Sample1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\lakshmiprasanna\\Downloads\\credentials.properties.txt");
		Properties p=new Properties();
		p.load(fis);
		String UN = p.getProperty("browser");
		System.out.println(UN);

	}

}
