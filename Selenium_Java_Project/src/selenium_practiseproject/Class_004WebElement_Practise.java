package selenium_practiseproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_004WebElement_Practise {

	public static void main(String[] args) {
		
		// launch browser
				WebDriver driver = new ChromeDriver();

				// maximize browser
				driver.manage().window().maximize();

				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// to open url
				driver.get("https://www.flipkart.com/");
				
				//to get title of webpage
				System.out.println("Title of webpage is: "+driver.getTitle());
				
				//to get current url of webpage is
				System.out.println("Current url of webpage is: "+driver.getCurrentUrl());
				
				//to locate element searchbox
				WebElement searchbox=driver.findElement(By.cssSelector("input.Pke_EE"));
				
				//to find location of searchbox in terms of x-axis on console
				System.out.println(searchbox.getLocation().x);
				
				//to find location of searchbox in terms of y-axis on console
				System.out.println(searchbox.getLocation().y); 
				
				//to get size of searchbox
				System.out.println(searchbox.getSize());
				
				//to check element is enabled or not
				System.out.println(searchbox.isEnabled());
				
				

	}

}
