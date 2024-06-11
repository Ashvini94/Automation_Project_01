package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.BaseClass;

public class Class_001 extends BaseClass
{

	public static void main(String[] args) throws Exception {
		
		//call launchBrowser method
		launchBrowser("Firefox");
		
		//call navigateUrl method
		navigateUrl("https://www.jeevansathi.com/");
		
		//take screenshot of jeevansathi homepage
		take_Screenshot("Jeevansathi_homepage");
		
		//scroll down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,6000)");
		
		//take screenshot after scroll down the page
		take_Screenshot("After scroll down page");
		
		//to find facebook icon element of footer and click on that
		
		driver.findElement(By.xpath("(//div[@class='jsx-6bc99199a158f0c5 fl wid265']//a)[12]")).click();
		
		
		
		
		
		
		
	}

}
