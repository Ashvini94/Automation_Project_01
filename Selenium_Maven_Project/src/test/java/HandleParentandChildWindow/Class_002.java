package HandleParentandChildWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_002 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser("Chrome");
		navigateUrl("https://www.naukri.com/");
		scroll_page(300);

		// locate MNC element and click on it
		driver.findElement(By.xpath("//span[text()='MNC']")).click();

		// to capture window tab id
		Set<String> window_id = driver.getWindowHandles();

		// to pull window id
		Iterator<String> it = window_id.iterator();

		// to shift parent window id
		String parent_window_id = it.next();

		// to shift child window id
		String child_winodw_id = it.next();

		// to print parent window id in console
		System.out.println("Parent window is is: "+parent_window_id);

		// to print child window id in console
		System.out.println("Child winodw id is: "+child_winodw_id);
		
		//to capture title of window in console
		System.out.println("Title of webpage is: "+driver.getTitle());
		
		//switch parent tab to child tab
		driver.switchTo().window(child_winodw_id);
		
		Thread.sleep(1000);
		
		//to capture title of window in console
		System.out.println("Title of webpage is: "+driver.getTitle());
		
		//to locate login button from child window and click on it
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
