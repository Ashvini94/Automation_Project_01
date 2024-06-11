package selenium_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_005 {

	public static void main(String[] args) {

		// launch browser
		WebDriver driver = new FirefoxDriver();

		// maximize window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to open url
		driver.get("https://www.amazon.in/");

		// to get current url
		System.out.println("To get current url: " + driver.getCurrentUrl());

		// to get title of current url
		System.out.println("To get title of current url: " + driver.getTitle());

		// to find locaotor of search box element
		WebElement searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

		//to get location with respect to x axis
		System.out.println("Get location with respect to x-axis: "+searchbox.getLocation().x);
		
		//to get location with respect to y axis
		System.out.println("Get location with respect to y-axis: "+searchbox.getLocation().y);
		
		//to find size of searchbox
		System.out.println("To find size of searchbox: "+searchbox.getSize());
		
	}

}
