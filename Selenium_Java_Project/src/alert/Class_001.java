package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_001 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_Browser("Chrome");
		navigate_url("https://demoqa.com/alerts");
		scroll_page(380);

		// to locate first button and click on it
		driver.findElement(By.cssSelector("button#alertButton")).click();

		// switch to alert
		Alert al = driver.switchTo().alert();

		Thread.sleep(2000);

		// click on ok button
		al.accept();

		// to locate third button confirmation and click on it
		driver.findElement(By.cssSelector("button#confirmButton")).click();

		// switch to alert
		Alert alt = driver.switchTo().alert();

		Thread.sleep(2000);

		// to click on cancel button
		alt.dismiss();

		
		//to click on fourth prompt button and click on it
		driver.findElement(By.cssSelector("button#promtButton")).click();

		// switch to alert
		Alert alte = driver.switchTo().alert();
		
		//send input in it
		alte.sendKeys("bye");

		Thread.sleep(2000);
		
		//click on ok button
		alte.accept();

		
	}

}
