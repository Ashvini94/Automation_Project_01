package selenium_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_002 {

	public static void main(String[] args) {
		
		//to pass input data and clear input data
		
		//launch browser
		WebDriver driver=new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to open url
		driver.get("https://www.facebook.com/");
		
		//to capture cuurent url
		System.out.println("To capture cuurent url of webpage: "+driver.getCurrentUrl());
		
		//to get title of webpage
		System.out.println("Title of webpage is: "+driver.getTitle());
		
		//to find email textbox and pass input in it
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		
		//to find password textbox and pass input in it
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123@xyz");
		
		//to clear email input 
		driver.findElement(By.cssSelector("input#email")).clear();
		
		//to clear password input
		driver.findElement(By.cssSelector("input#pass")).clear();
		
		
	}

}
