package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_006 extends BaseClass {

	public static void main(String[] args) {
		
		//Keyborad actions --> Use Of SHIFT and ENTER

		launchBrowser("Chrome");
		navigateUrl("https://www.facebook.com/");

		// to locate email textbox
		WebElement email = driver.findElement(By.cssSelector("input#email"));

		// using Actions class
		Actions act = new Actions(driver);

		// Pass input in uppercase
		act.keyDown(Keys.SHIFT).sendKeys("mahesh").build().perform();

		// act.sendKeys(Keys.SHIFT).sendKeys("mahesh").build().perform();

		// to press enter
		act.keyDown(Keys.ENTER).build().perform();
	}

}
