package mock_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.BaseClass;

public class Class_003 extends BaseClass {

	//problem no -->3
	public static void main(String[] args) throws Exception {

		// call launchBrowser method
		launchBrowser("Edge");

		// call navigateUrl method
		navigateUrl("https://www.amazon.in/");

		// take screenshot of homepage
		take_Screenshot("amazon_homepage_screenshot");

		// find element amazon mini tv and click on it
		driver.findElement(By.linkText("Amazon miniTV")).click();

		Thread.sleep(3000);

		// take screenshot after click on amazon mini tv link
		take_Screenshot("After click on amazon mini tv link");

		// go to backword button
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.history.back()");

		// find element Today's deal and click on it
		driver.findElement(By.linkText("Today's Deals")).click();

		Thread.sleep(3000);

		// take screenshot after click on today's deal link
		take_Screenshot("After click on Today's deal link");


		// go to backword button
		
		js.executeScript("window.history.back()");
		
		//find element fashion and click on it
		driver.findElement(By.linkText("Fashion")).click();
		
		Thread.sleep(3000);

		// take screenshot after click on Fashion link
		take_Screenshot("After click on Fashion link");


		// go to backword button
	
		js.executeScript("window.history.back()");
		
		//find element new releases and click on it
		driver.findElement(By.linkText("New Releases")).click();
		
		Thread.sleep(3000);

		// take screenshot after click on New Releases link
		take_Screenshot("After click on New Releases link");


		// go to backword button
	
		js.executeScript("window.history.back()");
	
		
		
		
		
		
	}

}
