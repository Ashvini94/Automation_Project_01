package selenium_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001 {

	public static void main(String[] args) {
		
		
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to open url
		//driver.get("https://www.salesforce.com/in/");  //or
		
		driver.navigate().to("https://www.salesforce.com/in/");
		
		//to capture title of webpage
		System.out.println("The title of webpage is: "+driver.getTitle());
		
		//to find web element start free trial and then click on element 
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']")).click();
		
		

	}

}
