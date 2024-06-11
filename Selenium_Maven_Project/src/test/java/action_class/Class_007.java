package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_007 extends BaseClass {

	public static void main(String[] args) {

		// keyboard actions --> copy paste

		launchBrowser("Chrome");
		navigateUrl("https://www.facebook.com");

		// to locate email textbox
		WebElement email = driver.findElement(By.cssSelector("input#email"));

		// to locate password textbox
		WebElement password = driver.findElement(By.cssSelector("input#pass"));

		// Use Actions class
		Actions act = new Actions(driver);

		// to send input in email textbox using actions class
		act.sendKeys(email, "ashvini01@gmail.com").build().perform();

		// to press control a for select data
		act.moveToElement(email).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// to press control c for copy input data
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		// to press tab to shift password textbox
		act.sendKeys(Keys.TAB).build().perform();


		// to press control v for paste input data
		 act.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();

	}

}
