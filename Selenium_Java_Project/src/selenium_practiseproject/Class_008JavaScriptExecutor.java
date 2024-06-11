package selenium_practiseproject;

import org.openqa.selenium.JavascriptExecutor;

import baseclass.BaseClass;

public class Class_008JavaScriptExecutor extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Chrome");
		navigate_url("https://www.naukri.com/");
		take_screenshot("Naukari_Homepage");
		
		
		//use javascript executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//to scroll down the page
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(2000);
		
		//to scroll down the page upto bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		//to navigate back
		js.executeScript("window.history.back()");
		
		Thread.sleep(2000);
		
		//to navigate forward
		js.executeScript("window.history.forward()");
		
		Thread.sleep(2000);
		
		//To refresh the page
		js.executeScript("window.history.go(0)");
	}

}
