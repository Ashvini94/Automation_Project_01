package selenium_practiseproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import baseclass.BaseClass;

public class Class_009TakeScreenshot extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Chrome");
		navigate_url("https://www.irctc.co.in/nget/train-search");
		
		//to get projectpath
		String projectpath=System.getProperty("user.dir");
		
		//take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		Thread.sleep(2000);
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		File source_file=new File(projectpath+"\\Screenshot\\IRCTC_Homepage.png");
		
		FileHandler.copy(file, source_file);
		
		

	}

}
