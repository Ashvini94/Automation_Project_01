package action_Class_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_005Slider extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_Browser("Chrome");
		navigate_url("https://jqueryui.com/slider/");

		Thread.sleep(2000);
		take_screenshot("JQUERY Homepage");
		
		//to locate iframe
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		//to go inside iframe
		driver.switchTo().frame(frame);

		// to locate slider element
		WebElement slider = driver.findElement(By.cssSelector("div#slider"));

		// using actions class
		Actions act = new Actions(driver);

		// slider move to forward direction with x-axis
		//act.dragAndDropBy(slider, 300, 0).build().perform();
		
		//Thread.sleep(2000);

		// slider move to backword direction with x-axis
		//act.dragAndDropBy(slider, -50, 0).build().perform();
		
		//slider move to forward direction with x-axis
		act.clickAndHold(slider).moveByOffset(200, 0).build().perform();
		
		// slider move to backword direction with x-axis
		act.clickAndHold(slider).moveByOffset(-50, 0).build().perform();
	}

}
