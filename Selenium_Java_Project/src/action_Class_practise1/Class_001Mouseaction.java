package action_Class_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_001Mouseaction extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Chrome");
		navigate_url("https://www.netmeds.com/");
		
		Thread.sleep(2000);
		take_screenshot("Netmeds Homepage");
		
		//to locate element Lab tests
		WebElement labtest_link=driver.findElement(By.xpath("(//a[text()='Lab Tests'])[1]"));
		
		//use actions class
		Actions act=new Actions(driver);
		
		//to click on lab test link
		act.click(labtest_link).build().perform();
		
		
		Thread.sleep(2000);
		//take screenshot after click on lab test link
		take_screenshot("After click on lab test link");
		
		
		//to locate element beauty
		WebElement beauty_link=driver.findElement(By.linkText("Beauty"));
		
		//to perform mouse hover
		act.moveToElement(beauty_link).build().perform();
		
		Thread.sleep(2000);
		//take screenshot after perform mouse hover 
		take_screenshot("After perform mouse hover on beauty link");
		
		//to locate element health corner
		WebElement health_corner_link=driver.findElement(By.xpath("//a[text()=' Health Corner']"));
		 
		
		//to perform right click
		act.moveToElement(health_corner_link).contextClick().build().perform();
		
		//take screenshot after perform right click
		Thread.sleep(2000);
		take_screenshot("After perform right click");
		
		//to locate searchbox
		WebElement searchbox=driver.findElement(By.cssSelector("input#search"));
		
		//to send input in searchbox
		searchbox.sendKeys("paracetamol");
		
		//perform double click
		act.doubleClick(searchbox).build().perform();
		
		//to take screenshot after double click
		Thread.sleep(2000);
		take_screenshot("After double click");
		

	}

}
