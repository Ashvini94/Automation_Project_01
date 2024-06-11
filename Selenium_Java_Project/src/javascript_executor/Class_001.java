package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Edge");
		navigate_url("https://www.salesforce.com/in/?ir=1");
		take_screenshot("Slaesforce_homepage");
		
		//to sroll page 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,5000)");
		
		Thread.sleep(2000);
		
		//to scroll page upto bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		//to go backword button
		js.executeScript("window.history.back()");
		
		Thread.sleep(2000);
		
		//to go forward button
		js.executeScript("window.history.forward()");
		
		Thread.sleep(2000);
		
		//to refresh the page
		js.executeScript("window.history.go(0)");

	}

}
