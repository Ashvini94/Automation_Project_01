package selenium_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_004 {

	public static void main(String[] args) {

		//inserted input in email and password textbox and cpature data of email and password textbox
		
		
		// launch browser
		WebDriver driver = new FirefoxDriver();

		// maximize window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to open url
		driver.get("https://www.facebook.com/");

		// to get current url
		System.out.println("To get current url: " + driver.getCurrentUrl());

		// to get title of current url
		System.out.println("To get title of current url: " + driver.getTitle());
		
		
		//to find locator of email text box 
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		//pass input in email textbox
		email.sendKeys("xyz@gmail.com");
		
		//to capture input data
		System.out.println("To cpature input data of email textbox: "+email.getAttribute("value"));
		
		//to find locator of password textbox
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		
		//to pass input in password textbox
		password.sendKeys("123@Mahesh");
		
		//to capture input data
		System.out.println("To capture input data of password textbox: "+password.getAttribute("value"));
		
	}

}
