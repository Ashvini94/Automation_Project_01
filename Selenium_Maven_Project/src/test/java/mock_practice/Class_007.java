package mock_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_007 extends BaseClass {
	public static String month_year;

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		navigateUrl("https://www.railyatri.in/");
		scroll_page(280);

		// to locate from city dropdown
		WebElement from_city_dropdown = driver.findElement(By.cssSelector("input#from_stn_input"));

		// send input data in dropdown
		from_city_dropdown.sendKeys("Nagpur");

		// to locate list of options
		List<WebElement> from_city_options = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));

		// to choose one option from list
		for (int i = 0; i < from_city_options.size(); i++) {
			if (from_city_options.get(i).getText().equalsIgnoreCase("NAGPUR MOTI BAGH | MIB")) {
				from_city_options.get(i).click();
			}
		}

		// to capture selected option
		System.out.println("Selected from city is: " + from_city_dropdown.getAttribute("value"));

		// to locate dropdown to city
		WebElement to_city_dropdown = driver.findElement(By.cssSelector("input#to_stn_input"));

		// send input data in dropdown
		to_city_dropdown.sendKeys("Mumbai");

		// to locate list of options
		List<WebElement> to_city_option = driver.findElements(By.xpath("//ul[@id='ui-id-6']/li"));

		// to choose one option from list
		for (int i = 0; i < to_city_option.size(); i++) {
			if (to_city_option.get(i).getText().equalsIgnoreCase("MUMBAI DADAR CENTRAL | DR")) {
				to_city_option.get(i).click();
			}

		}

		// to capture selected option
		System.out.println("Selected to city is: " + to_city_dropdown.getAttribute("value"));

		// to locate calender dropdown and click on it
		WebElement calender_dropdown = driver.findElement(By.xpath("//input[@id='datepicker_train']"));

		// scroll up page
		scroll_page(-100);

		// click on calender
		calender_dropdown.click();

		while (true) {
			// to locate month year
			month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();

			// System.out.println(month_year);

			if (!(month_year.equalsIgnoreCase("August 2024"))) {
				// locate next button and click on it
				driver.findElement((By.xpath("(//th[@class='next'])[1]"))).click();
			} else {
				break;
			}
		}

		// to locate date and click on it
		driver.findElement(By.xpath("//td[text()='15']")).click();

		// to print selected month is
		System.out.println("Selected month is: " + month_year);

		// to print selected date is
		System.out.println("Selected date is: " + calender_dropdown.getAttribute("value"));

		// to locate search button and click on it
		driver.findElement(By.cssSelector("button#search_btn_dweb")).click();

		Thread.sleep(3000);

		// take screenshot
		take_Screenshot("After search the train");

		// to locate duronto express
		// driver.findElement(By.xpath("(//a[@class='MuiTypography-root
		// MuiTypography-inherit MuiLink-root MuiLink-underlineAlways
		// css-1blvkmy'])[1]"));

		// scroll the page
		scroll_page(300);

		// to locate book now button and click on it
		driver.findElement(By.xpath("(//button[text()='Book Now'])[2]")).click();

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("After click on book now button");

		// scroll the page
		scroll_page(350);

		// to locate gender and click on it
		driver.findElement(By.xpath("//li[text()='Female']")).click();

		// to locate full name and send data in it
		driver.findElement(By.cssSelector("input#adult_add_fullname")).sendKeys("Ashvini Vinod Pofare");

		// to locate age and send data in it
		driver.findElement(By.cssSelector("input#adult_add_age")).sendKeys("29");

		// to locate birth and click on it
		driver.findElement(By.cssSelector("input#adult_add_berth")).click();

		// to locate lower birth and click on it
		driver.findElement(By.xpath("//li[text()='Lower']")).click();

		// to locate button save and next and click on it
		driver.findElement(By.xpath("//button[text()='Save & Add next']")).click();

		Thread.sleep(3000);

		// take screenshot
		take_Screenshot("After click on save and next button");

		scroll_page(250);

		// to locate email textbox and send data in it
		driver.findElement(By.cssSelector("input#user_email")).sendKeys("ashvinipofare01@gmail.com");

		// to locate phone no and send data in it
		driver.findElement(By.cssSelector("input#user_phone")).sendKeys("9923681282");

		// to locate IRCTC user id and send data in it
		driver.findElement(By.cssSelector("input#no_call_irctc")).sendKeys("maheshkhere11");

		// to locate verify button and click on it
		driver.findElement(By.cssSelector("button#verifyIdBtn")).click();

		// take screenshot
		take_Screenshot("After click on verified button");

		// to locate continue button and click on it
		driver.findElement(By.xpath("//div[text()='Continue ']")).click();

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("After click on continue button");

	}

}
