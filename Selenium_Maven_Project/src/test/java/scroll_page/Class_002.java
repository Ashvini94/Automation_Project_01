package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.BaseClass;

public class Class_002 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		
		launchBrowser("Edge");
		
		navigateUrl("https://www.redbus.in/");
		
		take_Screenshot("redbus_homepage");
		
		//to scroll page upto bottom
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//take screenshot after scroll page
		take_Screenshot("After scroll page upto bottom");
		
		//to stop execution for sometime
		Thread.sleep(2000);
		
		//to go backword arrow
		js.executeScript("window.history.back()");
		
		//to take screenshot after going back 
		take_Screenshot("After going back");
		
		Thread.sleep(3000);
		
		//to go forward arrow
		js.executeScript("window.history.forward()");
		
		Thread.sleep(3000);
		
		//to refresh the page
		js.executeScript("window.history.go(0)");
		
		
		
	}

}
