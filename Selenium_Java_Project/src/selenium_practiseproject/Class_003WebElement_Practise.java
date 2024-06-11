package selenium_practiseproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_003WebElement_Practise {

	public static void main(String[] args) {

		// launch browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to open url
		driver.get("https://www.facebook.com/");

		// to get title of webpage
		System.out.println("Title of webpage is: " + driver.getTitle());

		// to get current url
		System.out.println("Current url is: " + driver.getCurrentUrl());

		// to locate element email textbox and send input in it
		WebElement email = driver.findElement(By.cssSelector("input#email"));

		// to pass input in email
		email.sendKeys("Abc@gmail.com");

		// to capture input data of email textbox in console
		System.out.println("input data of email textbox: " + email.getAttribute("value"));

		// to locate element password textbox and send input in it
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Abc@123456");

		// to capture input data of password textbox in console
		System.out.println("input data of password textbox: "
				+ driver.findElement(By.cssSelector("input#pass")).getAttribute("value"));

		
		//to locate forgotten password link
	WebElement	link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//to capture the title of forgotten password link on console
		System.out.println("Title of forgotten password link is: "+link.getText());
		
		//to capture the attribute of forgotten password link
		System.out.println("Attribute of forgotten password link is: "+link.getAttribute("href"));
		
		//to click on forgotten password link
		link.click();
	}

}
