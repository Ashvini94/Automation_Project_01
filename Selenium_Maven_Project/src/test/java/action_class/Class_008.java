package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_008 extends BaseClass{

	//Keyboard action --> move to slider
	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		navigateUrl("https://jqueryui.com/slider/");
		
		//locate iframe
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		//go inside the frame
		driver.switchTo().frame(frame);
		
		//to locate slider
		WebElement slider=driver.findElement(By.cssSelector("div#slider"));
		
		//Use Actions class
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		//slider move in forward direction with x-axis
		//act.dragAndDropBy(slider, 200, 0).build().perform();
		
		Thread.sleep(2000);
		
		//slider move in backword direction with x-axix
		//act.dragAndDropBy(slider, -50,0).build().perform();
		
		//2nd way to move slider in forward direction
		act.clickAndHold(slider).moveByOffset(200, 0).build().perform();
		
		//2nd way to move slider in backword direction
		act.clickAndHold(slider).moveByOffset(-50, 0).build().perform();
				
		

	}

}
