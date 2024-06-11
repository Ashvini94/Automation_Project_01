package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

	//dynamic code of launch browser and get url
	
	//we have to use static variable of driver
	
	public static WebDriver driver;
	
	public static String projectpath=System.getProperty("user.dir");
	
	//dynamic code to launch browser
	
	public static void launchBrowser(String browser)
	{
		//to handle browser notification popup
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("disable-notifications");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver(options);
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to print browser name
		System.out.println("Launch browser is: "+browser);
		
	}
	
	//dynamic code to open url
	public static void navigateUrl(String url)
	{
		//to open url
		driver.get(url);
		
		//to print url name
		System.out.println("navigate url is: "+url);
		
		//to get title of webpage
		System.out.println("Title of webpage is: "+driver.getTitle());
	}
	
	//dynamic code to take scrrenshot
	public static void take_Screenshot(String screenshotname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File target_file=ts.getScreenshotAs(OutputType.FILE);
		
		File source_file=new File(projectpath+"\\screenshot\\"+screenshotname+".png");
		
		FileHandler.copy(target_file, source_file);
	}
	
	//dynamic code for scroll the page using javascript executor
	
	public static void scroll_page(int ypoint)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,"+ypoint+")");
	}
	
	
}
