package selenium_practiseproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class_005TakeScreenshot {

	public static void main(String[] args) throws Exception {
		
		// to launch browser
				WebDriver driver = new ChromeDriver();

				// to maximize browser
				driver.manage().window().maximize();

				// to give implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//go open url
				driver.get("https://www.salesforce.com/in/?ir=1");
				
				//to get title of webpage
				System.out.println("Title of webpage is: "+driver.getTitle());
				
				//to get current url of webpage
				System.out.println("To get current url is: "+driver.getCurrentUrl());
				
				//to get projet path
				String projectpath=System.getProperty("user.dir");
				
				//to print project path on console
				System.out.println(projectpath);
				
				//take screenshot
				TakesScreenshot ts=(TakesScreenshot)driver; 
				
				File file=ts.getScreenshotAs(OutputType.FILE);
				
				File source_file=new File(projectpath+"\\Screenshot\\Salesforce_hompage.png");
				
				FileHandler.copy(file, source_file);

	}

}
