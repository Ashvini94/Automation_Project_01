package selenium_project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001 {

	public static void main(String[] args) {
		
		//to launch browser
		WebDriver driver =new ChromeDriver();
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//or
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
