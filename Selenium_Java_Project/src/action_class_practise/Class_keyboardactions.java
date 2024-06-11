package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_keyboardactions extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Firefox");
		navigate_url("https://www.shaadi.com/");
		
		//using actions class
		Actions act=new Actions(driver);
		
		//to page down
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(1000);
		
		//to page up
		act.keyDown(Keys.PAGE_UP).build().perform();
		
		

	}

}
