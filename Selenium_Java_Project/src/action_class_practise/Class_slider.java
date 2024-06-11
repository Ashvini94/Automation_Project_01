package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_slider extends BaseClass {
	public static void main(String[] args) throws Exception {

		launch_Browser("Firefox");
		navigate_url("https://jqueryui.com/slider/");

		// to locate frame
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));

		// to go inside the frame
		driver.switchTo().frame(frame);

		// to locate element slider handle
		WebElement sliderhandle = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		// using actions class
		Actions act = new Actions(driver);

		// move slider in forward direction with respect to x axis
		// act.dragAndDropBy(sliderhandle, 200, 0).build().perform();

		Thread.sleep(2000);

		// move slider in backword direction with respect to x axis
		// act.dragAndDropBy(sliderhandle, -50, 0).build().perform();

		// 2nd way to move slider in forward direction
		act.clickAndHold(sliderhandle).moveByOffset(200, 0).build().perform();

		// 2nd way to move slider in backword direction
		act.clickAndHold(sliderhandle).moveByOffset(-50, 0).build().perform();

	}

}
