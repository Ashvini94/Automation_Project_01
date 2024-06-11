package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_002 extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		//Mouse actions -->
		
		launchBrowser("Chrome");
		
		navigateUrl("https://jqueryui.com/droppable/");
		
		take_Screenshot("JQuery_Homepage");
		
		//to loacte iframe
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//to enter insside iframe
		driver.switchTo().frame(frame);
		
		//to locate element drag
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		
		//to locate element drop
		WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
		
		//use Actions class to drag and drop
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		take_Screenshot("After perform drag and drop");
		
		

	}

}
