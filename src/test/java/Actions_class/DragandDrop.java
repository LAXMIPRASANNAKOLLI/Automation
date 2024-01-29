package Actions_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop{
public static void main(String[] args) throws Throwable{
WebDriver driver=new EdgeDriver();
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//Inspect SourceElement
WebElement srcelement=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
//Inspect TargetElement
WebElement trgelement=driver.findElement(By.xpath("//p[text()='Drop here']"));
//create object for Actions class
Thread.sleep(5000);
Actions act=new Actions(driver);
act.dragAndDrop(srcelement,trgelement).perform();
}
}
