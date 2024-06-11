package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_keyboardactions2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		launch_Browser("Firefox");
		navigate_url("https://www.facebook.com/");
		
		//using actions class
		Actions act=new Actions(driver);
		
		//to page down
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(1000);
		
		//to page up
		act.keyDown(Keys.PAGE_UP).build().perform();
		
		//to loacte element email textbox
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		
		//to locate password texbox
		WebElement password=driver.findElement(By.cssSelector("input#pass"));
		
		//to send input in uppercase in email textbox
		//act.keyDown(Keys.SHIFT).sendKeys("Ankit").build().perform();
		act.sendKeys(email, "ankit01@gmail.com").build().perform();
		
		//to press control a for select input
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//to press control c for copy input
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//to press tab
		act.keyDown(Keys.TAB).build().perform();
		
		//to press control v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//to press enter
		//act.keyDown(Keys.ENTER).build().perform();
		
		//to press tab
		//act.moveToElement(password).keyDown(Keys.TAB).build().perform();
		
		//move to element
		act.moveToElement(password).build().perform();
		
		//to press backspace
		act.keyDown(Keys.BACK_SPACE);

	}

}
