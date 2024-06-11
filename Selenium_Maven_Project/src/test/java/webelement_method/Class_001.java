package webelement_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001 {

	public static void main(String[] args) {

		// use different method of web element

		// launch browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to open url
		driver.get("https://www.amazon.in/");

		// to get current url
		System.out.println("To get current webpage url: " + driver.getCurrentUrl());

		// to get title of webpage
		System.out.println("To get title of webpage: " + driver.getTitle());

		// to locate element searchbox and pass input in it
		WebElement searchbox=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//to click searchbox
		searchbox.click();
		
		//to send input in searchbox
		searchbox.sendKeys("Laptop");
		
		//to clear input data of searchbox
		//searchbox.clear();
		
		//to locate element Electronics
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		
		//to get text of Electronics element
		System.out.println("To get text of bestseller element: "+electronics.getText());
		
		//to get attribute name of bestsellers
		System.out.println("To get attribute: "+electronics.getAttribute("href"));
		
		//to get value of input searchbox
		System.out.println("Search input data is: "+searchbox.getAttribute("value"));
		
		//to get location of searchbox in terms of x-axis
		System.out.println("Loaction in terms of x-axis: "+searchbox.getLocation().x);
		
		//to get location of searchbox in terms of y-axis
		System.out.println("Loaction in terms of y-axis: "+searchbox.getLocation().y);
		
		//to get size of searchbox element
		System.out.println("Size of element: "+searchbox.getSize());
		
		//to get tagname of serachbox
		System.out.println("Element Tagname is: "+searchbox.getTagName());
		
		//to check element is displayed or visible or  not
		System.out.println("Element is visible or not: "+searchbox.isDisplayed());
		
		//to check element is enable or not
		System.out.println("Element is enable or not: "+searchbox.isEnabled());
		
		
		

		
	}

}
