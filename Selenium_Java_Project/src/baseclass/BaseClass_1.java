package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass_1 {

public static WebDriver driver;
	
	public static String projectpath=System.getProperty("user.dir");
	
	//dynamic code to launch browser
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
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("To print browser name: "+browser);
	}
	
	//dynamic code to open url
	public static void navigate_url(String url)
	{
		//to open url
		driver.get(url);
		
		//to get title of url is
		System.out.println("Title of webpage is: "+driver.getTitle());
		
		//to print current url
		System.out.println("Current url is: "+url);
	}
	

	public static void take_Scrrenshot(String screenshotname) throws Exception
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		File source_file=new File(projectpath+"\\Screenshot\\"+screenshotname+".png");
		
		FileHandler.copy(file, source_file);
	}

}
