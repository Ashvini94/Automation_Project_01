package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_004 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		//Keyboard actions -->
		
		launchBrowser("Chrome");
		navigateUrl("https://www.linkedin.com/");
		take_Screenshot("LinkedIn_Homepage");
		
		//to perform keyboard actions using actions class
		Actions act=new Actions(driver);
		
		//to go down the page using keyboard actions
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		//to go up the page using keyboard actions
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		
		
		
		
		

	}

}
