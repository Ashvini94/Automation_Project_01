import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class action_class1_practise extends BaseClass {

	public static void main(String[] args) throws Exception {
		

		launch_Browser("edge");
		navigate_url("https://www.jeevansathi.com/");
		take_screenshot("Jeevansathi_Homepage");
		
		//locate element Help link
		WebElement help_link=driver.findElement(By.xpath("//p[text()='HELP']"));
		
		//using actions class
		Actions act=new Actions(driver);
		
		//click on medicine link using actions class using actions class
		act.click(help_link).build().perform();
		
		Thread.sleep(2000);
		
		//to locate element browse profiles by
		WebElement browseprofilesby_link=driver.findElement(By.xpath("//a[text()='BROWSE PROFILES BY']"));
		
		Thread.sleep(2000);
		
		//to perform mouse hover on browse profiles by link using actions class
		act.moveToElement(browseprofilesby_link).build().perform();
		
		//to locate element search link
		WebElement search_link=driver.findElement(By.xpath("//a[text()='SEARCH']"));
		
		//to perform right click on link using actions class
		act.moveToElement(search_link).contextClick().build().perform();
		
		Thread.sleep(2000);
		
		//to navigate back
		driver.navigate().back();
		
		//to locate element email textbox
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		
		//to pass input in it
		email.sendKeys("ashvini");
		
		//to perfrom double click on input data
		act.doubleClick(email).build().perform();
		
		
	}

}
