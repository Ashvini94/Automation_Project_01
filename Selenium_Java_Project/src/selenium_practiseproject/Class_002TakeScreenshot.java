package selenium_practiseproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class_002TakeScreenshot {

	public static void main(String[] args) throws Exception {

		// to launch browser
		WebDriver driver = new ChromeDriver();

		// to maximize browser
		driver.manage().window().maximize();

		// to give implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//go open url
		driver.get("https://www.flipkart.com/");
		
		//to get title of webpage
		System.out.println("Title of webpage is: "+driver.getTitle());
		
		//to get current url of webpage
		System.out.println("To get current url is: "+driver.getCurrentUrl());
		
		//to get project path
		String projectpath=System.getProperty("user.dir");
		
		//to print project path
		System.out.println("Project path is: "+projectpath);
		
		//to take scrrenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		File source_file=new File(projectpath+"\\Screenshot\\flipkart_homepage.png");

		FileHandler.copy(file, source_file);
	}

}
