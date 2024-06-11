package take_scrrenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class_001 {

	public static void main(String[] args) throws Exception {

		// launch browser
		WebDriver driver = new ChromeDriver();

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

		// to take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);// to capture scrrenshot

		File source_file = new File(projectpath + "\\screenshot\\homepage_1.png");// create object of File class and
																					// pass argument as folder path

		FileHandler.copy(file, source_file);// copy source file into folder using Filehandler method

		// to locate email textbox element and pass input in it
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ankit@gmail.com");

		// to locate password textbox element and pass input in it
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc@123");

		// to take screenshot
		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File file1 = ts1.getScreenshotAs(OutputType.FILE);// to capture scrrenshot

		File source_file1 = new File(projectpath + "\\screenshot\\insertdata_textbox.png");// create object of File class and
																					// pass argument as folder path

		FileHandler.copy(file1, source_file1);// copy source file into folder using Filehandler method

	}

}
