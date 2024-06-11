package selenium_practiseproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.BaseClass;

public class Class_001LaunchBrowser_OpenUrl_Takescreenshot_PageScroll extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		
		launch_Browser("Chrome");
		navigate_url("https://www.redbus.in/");
		
		//take screenshot of homepage
		take_screenshot("redbus_homepage");
		
		//to scroll down page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,7000)");
		
		//take screenshot after scroll down the page
		take_screenshot("After scroll down page");
		
		//to loacte  facebook icon element and click on it
		driver.findElement(By.xpath("//a[@id='redbus_facebook']")).click();
		
		
		
	}

}
