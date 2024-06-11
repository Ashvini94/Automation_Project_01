package selenium_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_003 {

	public static void main(String[] args) {
		
		//capture link name and attribute
		
		//launch browser
		WebDriver driver=new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to open url
		driver.get("https://www.facebook.com/");
		
		//to get current url
		System.out.println("To get current url: "+driver.getCurrentUrl());
		
		//to get title of current url
		System.out.println("To get title of current url: "+driver.getTitle());
		
		//find locator of forget password webelement
		WebElement link= driver.findElement(By.linkText("Forgotten password?"));
		
		//to find link name of forget password
		System.out.println("To find link name: "+link.getText());
		
		//to find get attribute of forget password
		System.out.println("To get attribute of link: "+link.getAttribute("href"));
		
		//to click on link
		link.click();
		
		

	}

}
