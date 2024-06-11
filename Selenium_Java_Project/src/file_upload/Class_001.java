package file_upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) throws AWTException {
		
		launch_Browser("Chrome");
		navigate_url("https://www.ilovepdf.com/word_to_pdf");
		
		//locate upload file button
		driver.findElement(By.cssSelector("a#pickfiles")).click();
		
		//to select desired file
		StringSelection s=new StringSelection("\"C:\\Users\\vaibh\\OneDrive\\Desktop\\Wedding Menu-suggestion.docx\"");
		
		//to copy file location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//use robot class
		Robot r=new Robot();
		
		//to stop execution for sometime
		r.delay(2000);
		
		//to press control v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//to release control v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//to press enter
		r.keyPress(KeyEvent.VK_ENTER);
		
		//to release enter
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//to locate convert tom pdf button and click on it
		driver.findElement(By.cssSelector("button#processTask")).click();
		

	}

}
