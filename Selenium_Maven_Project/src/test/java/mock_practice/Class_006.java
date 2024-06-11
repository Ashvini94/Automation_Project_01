package mock_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_006 extends BaseClass {

	// mock 2-->similar problem for practise
	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		navigateUrl("https://www.amazon.in/");

		// to locate link prime
		WebElement prime_link = driver.findElement(By.xpath("//span[text()='Prime']"));

		// use actions class
		Actions act = new Actions(driver);

		// to perform mouse hover
		act.moveToElement(prime_link).build().perform();

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("After perform mouse hover on prime link");

		// to locate link account and list
		WebElement accountandlist_link = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

		// to perform mouse hover
		act.moveToElement(accountandlist_link).build().perform();

		Thread.sleep(2000);
		
		// take screenshot
		take_Screenshot("After perform mouse hover on account and list link");
		
		//to locate element searchbox
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Guitar");

		//to press enter
		act.keyDown(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		
		//to scroll the page down
		scroll_page(1500);
		
		
		
		//to locate add to cart button
		WebElement add_to_cart=driver.findElement(By.cssSelector("button#a-autoid-3-announce"));
		
		//to click on button
		add_to_cart.click();
		
		Thread.sleep(2000);
		
		//to scroll the page up
		scroll_page(-1500);
		
		//to locate element cart and click on it
		WebElement cart=driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		
		Thread.sleep(2000);
		
		//to click on cart
		act.moveToElement(cart).click().build().perform();
		
		//take screenshot of product
		take_Screenshot("After click on cart");
	}

}
