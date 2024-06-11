package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_004 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_Browser("Edge");
		navigate_url("https://www.linkedin.com/login");
		
		//keyborad actions-->
		
		//to loacte element email textbox
		WebElement email=driver.findElement(By.cssSelector("input#username"));
		
		//use actions class
		Actions  act =new Actions(driver);
		
		//page down
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		//page up
		act.keyDown(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(2000);
		
		//send input in email textbox
		act.sendKeys(email, "ashvini01@1994").build().perform();
		
		//move to element
		//act.moveToElement(email).build().perform();
		
		Thread.sleep(2000);
		
		//press tab
		act.keyDown(Keys.TAB).build().perform();
		


	}

}
