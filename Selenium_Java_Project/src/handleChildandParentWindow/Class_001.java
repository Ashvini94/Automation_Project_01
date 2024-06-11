package handleChildandParentWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_001 extends BaseClass {

	public static void main(String[] args) {

		launch_Browser("Chrome");
		navigate_url("https://www.naukri.com/");
		scroll_page(350);

		// to locate internship element and click on it
		driver.findElement(By.xpath("//span[text()='MNC']")).click();

		// to capture window id
		Set<String> window_id = driver.getWindowHandles();

		// pull window id
		Iterator<String> it = window_id.iterator();

		// shift to parent id
		String parent_id = it.next();

		// shift to child id
		String child_id = it.next();

		System.out.println(parent_id);
		System.out.println(child_id);

		// capture title of parent tab
		System.out.println("Parent tab title is: " + driver.getTitle());

		// switch parent to child tab
		 driver.switchTo().window(child_id);
		 
		 //capture title of child tab
		 System.out.println("Child tab title is: "+driver.getTitle());
		 
		 //to locate register button and click on it
		 driver.findElement(By.xpath("//a[text()='Register']")).click();

	}

}
