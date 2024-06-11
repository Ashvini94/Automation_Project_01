package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_draganddrop extends BaseClass{

	public static void main(String[] args) throws Exception {
	
		launch_Browser("Chrome");
		navigate_url("https://jqueryui.com/droppable/");
		take_screenshot("Homepage JQUERY");
		
		//to locate iframe first
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		//to go inside iframe
		driver.switchTo().frame(frame);
		
		//to locate element drag
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		
		//to locate element drop
		WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
		
		//using actions class
		Actions act=new Actions(driver);
		
		//to perform drag and drop using actions class
		//act.dragAndDrop(drag, drop).build().perform();
		
		//2nd way to perform drag and drop
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		//to go outside the frame
		driver.switchTo().defaultContent();
		
		//to locate element draggable link
		WebElement draggable=driver.findElement(By.xpath("//a[text()='Draggable']"));
		
		//click on link using actions class
		act.click(draggable).build().perform();
	}

}
