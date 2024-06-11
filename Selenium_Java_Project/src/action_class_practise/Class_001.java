package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		//mouse actions -->
		
		//call launch_Browser method
		launch_Browser("Firefox");
		
		//call navigate_Url method
		navigate_url("https://www.jiomart.com/");
		
		//take screenshot of Jiomart homepage
		take_screenshot("JioMart_Hompage");
		
		//to loacte element Premium Fruits 
		WebElement PremiumFruit_link=driver.findElement(By.linkText("Premium Fruits"));
		
		//Click on Premium Fruits link using actions class
		Actions act=new Actions(driver);
		act.click(PremiumFruit_link).build().perform();
		
		//take screenshot after click on Premium Fruit link
		Thread.sleep(3000);
		take_screenshot("After click on Premium Fruit link");
		
		//to locate element Home & Kitchen
		WebElement HomeandKitchen_link=driver.findElement(By.linkText("Home & Kitchen"));
		
		//to perform mouse hover on Home & Kitchen link using actions class
		act.moveToElement(HomeandKitchen_link).build().perform();
		
		//take screenshot after mouse hover on Home & Kitchen link
		Thread.sleep(3000);
		take_screenshot("After hover on Home & Kitchen link");
		
		//to locate element Beauty 
		WebElement Beauty_link=driver.findElement(By.linkText("Beauty"));
		
		//to perform right click on Beauty element using actions class
		
		act.moveToElement(Beauty_link).contextClick().build().perform();
		
		//take screenshot after right click on Beauty link
		Thread.sleep(1000);
		take_screenshot("After right click on Beauty link");//it does not allow to take screenshot after right click
		
		Thread.sleep(3000);
		
		//to locate element searchbox and pass input in it
		driver.findElement(By.cssSelector("input#autocomplete-0-input")).sendKeys("Fruits");
		
		//to perform double click on input data using actions class
		act.doubleClick(driver.findElement(By.cssSelector("input#autocomplete-0-input"))).build().perform();
		
		//take screenshot after double click on input data
		Thread.sleep(3000);
		take_screenshot("After double click on input data");
		
		
		
		
		
		
	}

}
