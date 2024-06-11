package upload_fileUsingRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) throws AWTException {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.ilovepdf.com/word_to_pdf");
		
		//to locate select/upload word files button and click on it
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		//Use StringSelection class for select desired file
		//create object of StringSelection class
		
		StringSelection s=new StringSelection("\"C:\\Users\\vaibh\\OneDrive\\Desktop\\Wedding Menu-suggestion.docx\"");
		
		//to copy file location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Use robot class
		Robot r=new Robot();
		
		r.delay(3000);
		
		//press control v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//release control v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.delay(3000);
		
		//to press enter
		r.keyPress(KeyEvent.VK_ENTER);
		
		//to release enter
		r.keyPress(KeyEvent.VK_ENTER);
		
		//to locate convert to pdf button and click on it
		driver.findElement(By.xpath("//button[@id='processTask']")).click();


	}

}
