package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_005 extends BaseClass {
	
	//keyboard actions --> use enter

	public static void main(String[] args) {

		launch_Browser("Chrome");
		navigate_url("https://www.linkedin.com/login");

		// to locate email textbox
		WebElement email = driver.findElement(By.cssSelector("input#username"));
		
		//using actions class
		Actions act=new Actions(driver);
		
		//pass input data in email textbox
		act.sendKeys("ashvinipofare01@gmail.com").build().perform();
	
		//to press enter
		act.keyDown(Keys.ENTER).build().perform();
		
		

	}

}
