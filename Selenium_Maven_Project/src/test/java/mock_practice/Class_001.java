package mock_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{
	
	//Problem no -->1

	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		
		navigateUrl("https://www.amazon.in/");
		
		take_Screenshot("Amazon_homepage");

		
		//find element searchbox
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//click on searchbox
		searchbox.click();
		
		//to pass input in searchbox
		searchbox.sendKeys("Mobile");
		
		//to capture the input of search box
		System.out.println("Capture the input of searchbox: "+searchbox.getAttribute("value"));
		
		//find element search button 
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		//click on search button
		searchbutton.click();
		
		//take screenshot
		take_Screenshot("after serach product");
		
		//to click on back arrow
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.history.back()");
		
		//take screenshot after click on back arrow
		take_Screenshot("after click on back arrow");
	}

}
