package mock_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_004 extends BaseClass{

	//mock 2-->problem
	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.netmeds.com/");

		// locate element wellness
		WebElement wellness = driver.findElement(By.xpath("//a[text()='Wellness']"));

		// use actions class
		Actions act = new Actions(driver);

		// to perform mouse hover
		act.moveToElement(wellness).build().perform();

		Thread.sleep(3000);

		// take screenshot
		take_Screenshot("after mouse hover on wellness link");

		// loacte element beauty
		WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));

		// to perform mouse hover
		act.moveToElement(beauty).build().perform();

		Thread.sleep(4000);

		// take screenshot
		take_Screenshot("after mouse hover on beauty link");
		
		//to locate element searchbox 
		WebElement searchbox=driver.findElement(By.cssSelector("input#search"));
		
		//send input in searchbox
		searchbox.sendKeys("dolo");
		
		//capture the name of medicine in console
		System.out.println("Name of medicine is: "+searchbox.getAttribute("value"));
		
		
		//press enter
		act.keyDown(Keys.ENTER).build().perform();
		
		//scroll page
		scroll_page(250);
		
		//to locate add to cart button
		WebElement add_to_cart=driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
		
		
		
		Thread.sleep(2000);
		//to click on button
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		
		
		
		//to locate cart element
		WebElement cart=driver.findElement(By.xpath(" //span[@class='counter-number']"));
		
		//to click on cart 
		cart.click();
		
		//take screenshot
		take_Screenshot("After product add in cart");
		
		
		
	}

}
