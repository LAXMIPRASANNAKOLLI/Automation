package Pop_Ups;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.google.common.io.Files;
public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		//move the control of selenium from WebDriver(I) to TakesScreenShot(I)
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\lakshmiprasanna\\OneDrive\\Desktop\\ScreenShot\\ABC.png");
		Files.copy(src,trg);
		
	}
}
