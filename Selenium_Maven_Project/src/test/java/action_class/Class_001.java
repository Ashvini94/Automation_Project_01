package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		//Mouse actions -->
			launchBrowser("Chrome");
			
			navigateUrl("https://www.flipkart.com/");
			
			take_Screenshot("Flipkart_homepage");
			
			//locate element Grocery 
			WebElement Grocery_link=driver.findElement(By.xpath("//span[text()='Grocery']"));
			
			//click on link using actions class
			Actions act=new Actions(driver);
			
			//act.click(Grocery_link).build().perform();
			
			Thread.sleep(2000);
			//take screenshot after click on Grocery link
			take_Screenshot("After click on Grocery_link");
			
			//to go backword 
			
			//locate element Fashion
			WebElement Fashion_link=driver.findElement(By.xpath("//span[text()='Fashion']"));
			
			//mouse hover on Fashion_link
			act.moveToElement(Fashion_link).build().perform();
			
			Thread.sleep(2000);
			take_Screenshot("After hover on Fashion_link");
			
			//Locate element Home & Furniture 
			WebElement HomeandFurniture_link=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
			
			//perform right click on Fashion link
			act.moveToElement(HomeandFurniture_link).contextClick().build().perform();
			
			Thread.sleep(3000);
			take_Screenshot("After right click on Home & Furniture link");
			
			//to locate searchbox element
			driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Laptop");
			
			//to double click on the above input
			act.doubleClick(driver.findElement(By.cssSelector("input.Pke_EE"))).build().perform();
			
			
			
	}

}
