package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_009 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.facebook.com/");
		
		//to locate element email textbox
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		
		//using Actions class
		Actions act=new Actions(driver);
		
		//send input data to email textbox
		act.moveToElement(email).sendKeys("ashvini").build().perform();
		
		Thread.sleep(2000);
		
		//use bacespace
		act.keyDown(Keys.BACK_SPACE).build().perform();
		
		
		
		
		
		

	}

}
