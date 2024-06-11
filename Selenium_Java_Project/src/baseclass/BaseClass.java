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

public class BaseClass {

	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	
	//dynamic code to open browser
	
	public static void launch_Browser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//to give implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to print browser name
		System.out.println("Launch browser name: "+browser);
	}
	
	//to open url in dynamic way
	public static void navigate_url(String url)
	{
		//to open url
		driver.get(url);
		
		//to get title of webpage
		System.out.println("Title of webpage: "+driver.getTitle());
		
		//to print launch url name
		System.out.println("Launch url name is: "+url);
	}
	
	//to take scrrenshot dynamically
	public static void take_screenshot(String screenshotname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		File source_file=new File(projectpath+"\\Screenshot\\"+screenshotname+".png");
	
		FileHandler.copy(file, source_file);
	
	}
	
	//to scroll page
	public static void scroll_page(int ypoint)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,"+ypoint+")");
	}
	
	
	
}
