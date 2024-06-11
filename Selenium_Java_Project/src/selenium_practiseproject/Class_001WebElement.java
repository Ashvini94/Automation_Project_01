package selenium_practiseproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001WebElement {

	public static void main(String[] args) {

		// to launch browser
		WebDriver driver = new ChromeDriver();

		// to maximize browser
		driver.manage().window().maximize();

		// to give implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to open url
		driver.get("https://www.flipkart.com/");

		// to get title of webpage
		System.out.println("Title of webpage is: " + driver.getTitle());

		// to get current url of webpage
		System.out.println("Current url of webpage is: " + driver.getCurrentUrl());

		// to find from searchbox element
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));

		// to pass input in searchbox
		searchbox.sendKeys("Mobile");

		// to capture input data value
		System.out.println("From textbox attribute value: " + searchbox.getAttribute("value"));

		// to find locator of login link
		WebElement link = driver.findElement(By.xpath("//a[@title='Login'][@class='_1TOQfO']"));

		// to get text of link
		System.out.println("To get text of link element: " + link.getText());

		// to get attribute of link
		System.out.println("To get attribute of link: " + link.getAttribute("href"));

		// to click on link
		//link.click();

		// to get loaction of searchbox in terms of x-axis
		System.out.println("Loaction in terms of x-axis: "+searchbox.getLocation().x);

		// to get loaction of searchbox in terms of y-axis
		System.out.println("Loaction in terms of y-axis: "+searchbox.getLocation().y);
		
		//to get size of searchbox element
		System.out.println("size "+searchbox.getSize());

	}

}
