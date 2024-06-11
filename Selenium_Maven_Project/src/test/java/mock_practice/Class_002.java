package mock_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_002 extends BaseClass {

	//problem no -->2
	
	public static void main(String[] args) throws Exception {

		launchBrowser("Firefox");

		navigateUrl("https://www.flipkart.com/");

		// take screenshot of homepage
		take_Screenshot("Flipkart homepage screenshot");

		// to locate element of groceries
		WebElement grocery = driver.findElement(By.xpath("//span[text()='Grocery']"));

		// to click on element
		grocery.click();

		Thread.sleep(3000);

		// take screenshot after click on element groceries
		take_Screenshot("After click on grocery link");

		// to go the home page back
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.history.back()");

		// to locate element mobile and click on it
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();

		Thread.sleep(3000);

		// take screenshot after click on element mobile
		take_Screenshot("After click on mobile link");

		// to go the home page back
		js.executeScript("window.history.back()");

		// to locate element travel and click on it
		driver.findElement(By.xpath("//span[text()='Travel']")).click();

		Thread.sleep(3000);

		// to take screenshot after click on travel link
		take_Screenshot("After click on travel link");


		// to go upto bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// to find element contact us of footer
		driver.findElement(By.linkText("Contact Us")).click();

		// to take screenshot after click on contact us link
		take_Screenshot("After click on contact us link");

	}

}
