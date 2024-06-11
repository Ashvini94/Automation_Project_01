package action_class;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_003 extends BaseClass{

	// Mouse actions -->Another way to perform drag and drop
	
	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		navigateUrl("https://jqueryui.com/droppable/");
		take_Screenshot("JQUERY_HOmepage");
		
		//to locate iframe
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		//to go inside iframe
		driver.switchTo().frame(frame);
		
		//to locate element drag
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		
		//to locate element drop
		WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
		
		//Another way to perform drag and drop
		Actions act=new Actions(driver);
		
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		//to go out from the frame
		driver.switchTo().defaultContent();
		
		//to locate element draggable link element and click on it
		driver.findElement(By.linkText("Draggable")).click();
		
		//take screenshot after click on Draggable link
		take_Screenshot("After click on Draggable link");
		
		

	}

}
