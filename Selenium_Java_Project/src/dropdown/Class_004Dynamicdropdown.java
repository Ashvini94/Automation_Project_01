package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_004Dynamicdropdown extends BaseClass {

	public static void main(String[] args) {

		launch_Browser("Chrome");
		navigate_url("https://www.railyatri.in/");
		scroll_page(280);

		// to locate fromcity dropdown
		WebElement from_city_dropdown = driver.findElement(By.xpath("//input[@name='boarding_from']"));

		// pass input on it
		from_city_dropdown.sendKeys("Nagpur");

		// to locate list of options
		List<WebElement> from_cityoptions = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));

		// to choose one option
		for (int i = 0; i < from_cityoptions.size(); i++) {
			if (from_cityoptions.get(i).getText().contains("NAGPUR (SE) BG | NGPA")) {
				from_cityoptions.get(i).click();
			}
		}

		// to capture select city text on console
		System.out.println("Selcted from city is: " + from_city_dropdown.getAttribute("value"));

		// to locate to city dropdown
		WebElement to_city_dropdown = driver.findElement(By.xpath("//input[@name='boarding_to']"));

		// pass input in it
		to_city_dropdown.sendKeys("Mumbai");

		// to locate list of options
		List<WebElement> to_cityoptions = driver.findElements(By.xpath("//ul[@id='ui-id-6']//li"));

		// choose one city
		for (int i = 0; i < to_cityoptions.size(); i++) {
			if (to_cityoptions.get(i).getText().contains("MUMBAI DADAR WEST | DDR")) {
				to_cityoptions.get(i).click();
			}
		}

		// to capture city name on console
		System.out.println("Slected to city is: " + to_city_dropdown.getAttribute("value"));
	}

}
