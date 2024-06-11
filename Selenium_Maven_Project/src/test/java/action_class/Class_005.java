package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_005 extends BaseClass{

	public static void main(String[] args) throws Exception {
	
		//Keyboard actions --> Use of Tab
		
		launchBrowser("Chrome");
		navigateUrl("https://www.facebook.com/");
		
		
		//to locate element email textbox 
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		
		
		//use Actions class
		Actions act=new Actions(driver);
		
		//move to the element
		act.moveToElement(email).build().perform();
		
		
		//pass input data in email textbox
		act.sendKeys("Ashvini").build().perform();
		
		//use tab
		act.keyDown(Keys.TAB).build().perform();
		
		
		
		
		
	}

}
