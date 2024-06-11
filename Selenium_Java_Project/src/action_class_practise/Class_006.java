package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_006 extends BaseClass {

	public static void main(String[] args) {
		
		//keyboard actions -->copy paste and tab

		launch_Browser("Firefox");
		navigate_url("https://www.linkedin.com/login");

		// to locate email textbox
		WebElement email = driver.findElement(By.cssSelector("input#username"));
		
		//to loacte password textbox
		WebElement password = driver.findElement(By.cssSelector("input#password"));

		// using actions class
		Actions act = new Actions(driver);
		
		
		//to pass input data in email textbox
		act.sendKeys(email, "ashvinipofare01@gmail.com").build().perform();
		
		//to capture input data of email textbox
		System.out.println("Input username: "+email.getAttribute("value"));
		
		//press control a to select input data
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//press control c to copy input data
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//to press tab
		act.keyDown(Keys.TAB).build().perform();
		
		//to press control v to paste input data
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//to capture input data of password textbox
		System.out.println("Input password: "+password.getAttribute("value"));
		
		

	}

}
