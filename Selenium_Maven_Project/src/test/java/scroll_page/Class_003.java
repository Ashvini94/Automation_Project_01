package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.BaseClass;

public class Class_003 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launchBrowser("Edge");

		navigateUrl("https://www.redbus.in/");

		take_Screenshot("redbus_homepage");

		// find element Train Tickets and to click on element Train Tickets link
		driver.findElement(By.xpath("//span[text()='Train Tickets']")).click();
		
		Thread.sleep(3000);

		// to go backword arrow
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");

		Thread.sleep(3000);

		// to go forward arrow
		js.executeScript("window.history.forward()");
		
		Thread.sleep(3000);

		// to take screenshot after going forward
		take_Screenshot("After going forward");
		
		Thread.sleep(3000);
		
		//to refresh the page
		js.executeScript("window.history.go(0)");

	}

}
