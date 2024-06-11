package HandleParentandChildWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) {

		launchBrowser("Chrome");
		navigateUrl("https://www.salesforce.com/in/?ir=1");
		scroll_page(250);
		
		//locate watch demo button and click on it
		driver.findElement(By.xpath("//a[@label='Watch demo' ]")).click();
		
		//to capture window tab id
		Set<String> window_id = driver.getWindowHandles();
		
		//to pull window id
		Iterator<String> it = window_id.iterator();
		
		//to shift parent window id
		String parent_window_id=it.next();
		
		//to shift child window id
		String child_window_id=it.next();
		
		//print parent window id in console
		System.out.println(parent_window_id);
		
		//print child window id in console
		System.out.println(child_window_id);
		
		//switch parent tab to child tab
		driver.switchTo().window(child_window_id);
		
		//to locate first name element and send input data in it
		//driver.findElement(By.cssSelector("input#UserFirstName-0Fus")).sendKeys("Ashvini");

	}

}
