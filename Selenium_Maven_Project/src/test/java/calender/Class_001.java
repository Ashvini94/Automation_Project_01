package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_001 extends BaseClass {
	
	public static String month_year;

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		navigateUrl("https://www.railyatri.in/");

		// scroll page
		scroll_page(150);

		// to locate calender dropdown element and click on it
		WebElement dropdown = driver.findElement(By.cssSelector("input#datepicker_train"));

		// to click on calender dropdown
		dropdown.click();

		while (true) {

			// capture month and year
			month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			//System.out.println(month_year);

			if (!(month_year.equalsIgnoreCase("September 2024"))) {
				// to click on next arrow
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			} else {
				break;
			}

		}

		Thread.sleep(2000);

		// locate date and click on it
		driver.findElement(By.xpath("//td[text()='20']")).click();

		// capture selected month in console
		System.out.println("Selected month is: "+month_year);

		// capture selected date in console
		System.out.println("Selected date is: "+dropdown.getAttribute("value"));
	}

}
