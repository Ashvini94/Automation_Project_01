package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass_002 {
	
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	
	
	//dynamic code to launch browser
	public static void launch_Browser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to print launch browser name
		System.out.println("Launch browser is: "+browser);
	}
	
	//dynamic code to open url
	public static void navigate_Url(String url)
	{
		//to navigate url or open url
		driver.get(url);
		
		//to capture the title of url
		System.out.println("Title of url is: "+driver.getTitle());
		
		//to print current url
		System.out.println("Current url is: "+url);
	}
	
	//dynamic code to take screenshot
	public static void take_Screenshot(String screenshotimage) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		File source_file=new File(projectpath+"\\Screenshot\\"+screenshotimage+".png");
		
		FileHandler.copy(file, source_file);
	}
	
	//dynamic code for scroll the page
	public static void scroll_Page(int ypoint)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,"+ypoint+")");
	}

}
