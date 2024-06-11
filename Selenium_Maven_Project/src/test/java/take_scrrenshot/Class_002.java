package take_scrrenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class_002 {

	public static void main(String[] args) throws Exception {

		// to launch browser
		// to create object of ChromeDriver class here no need to create type casting
		ChromeDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to open url
		driver.get("https://www.facebook.com/");

		// to get project location/directory
		String projectpath = System.getProperty("user.dir");

		// to print project path in console
		System.out.println(projectpath);
		
		//to take screenshot
		TakesScreenshot ts=driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		File source_file=new File(projectpath+"\\screenshot\\homepage_2.png");
		
		FileHandler.copy(file, source_file);

	}

}
