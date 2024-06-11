package action_Class_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_003Keyboardaction extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Chrome");
		navigate_url("https://www.ajio.com/shop/");

		Thread.sleep(2000);
		take_screenshot("Ajio Homepage");
		
		
		//to locate element men link
		WebElement men_link=driver.findElement(By.linkText("MEN"));
		
		//using actions class
		Actions act=new Actions(driver);
		
		//to down the page
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		//page up
		act.keyDown(Keys.PAGE_UP).build().perform();
	}

}
