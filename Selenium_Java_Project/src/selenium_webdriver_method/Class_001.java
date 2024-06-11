package selenium_webdriver_method;

import java.time.Duration;

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
		
		//to get url or open url
		driver.get("https://www.jeevansathi.com/");
		
		//to get title of webpage
		driver.getTitle();
		
		//close browser
		driver.close();
		
		
		
	}

}
