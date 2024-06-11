package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_001 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		navigateUrl("https://demoqa.com/alerts");
		scroll_page(300);

		// locate first click me button and click on it
		driver.findElement(By.cssSelector("button#alertButton")).click();

		Thread.sleep(2000);

		// to switch alert
		Alert al = driver.switchTo().alert();

		// to click on ok button
		al.accept();

		// locate third click me button and click on it
		driver.findElement(By.cssSelector("button#confirmButton")).click();

		Thread.sleep(2000);

		// to switch alert
		Alert alt = driver.switchTo().alert();

		// to click on cancel button
		alt.dismiss();

		// locate fourth click me button and click on it
		driver.findElement(By.cssSelector("button#promtButton")).click();

		Thread.sleep(2000);

		// to switch alert
		Alert alte = driver.switchTo().alert();

		// send input in textbox
		alte.sendKeys("hello");

		// to click on ok button
		alte.accept();
	}

}
