package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_004DynamicDropdown extends BaseClass {

	// dynamic dropdown
	public static void main(String[] args) {

		launchBrowser("Chrome");
		navigateUrl("https://www.railyatri.in/");

		// to scroll page down
		scroll_page(250);

		// to locate element from dropdown
		WebElement from_dropdown = driver.findElement(By.xpath("//input[@id='from_stn_input']"));

		// to pass input data in from dropdown
		from_dropdown.sendKeys("Mumbai");

		//locate from dropdown options
		List<WebElement> from_options = driver.findElements(By.xpath("//ul[@id='ui-id-5']//li"));

		// to print all options
		// System.out.println(options.size());

		// to choose one option from multiple option using for loop
		for (int i = 0; i < from_options.size(); i++) {
			if (from_options.get(i).getText().contains("MUMBAI BANDRA TERMINUS | BDTS")) {
				from_options.get(i).click();
			}
		}

		// to print the value of selected option in console
		System.out.println("Selected from city  is: " + from_dropdown.getAttribute("value"));// MUMBAI BANDRA TERMINUS | BDTS

		// to locate element to dropdown
		WebElement to_dropdown = driver.findElement(By.xpath("//input[@id='to_stn_input']"));
		
		//to send data in  to dropdown
		to_dropdown.sendKeys("Nagpur");
		
		//to locate to dropdown options
		List<WebElement> to_options = driver.findElements(By.xpath("//ul[@id='ui-id-6']//li"));
		
		//to choose one option from multiple options using for loop
		for(int i=0;i<to_options.size();i++)
		{
			if(to_options.get(i).getText().contains("NAGPUR MOTI BAGH | MIB"))
			{
				to_options.get(i).click();
			}
		}
		
		//to print the value of selected option in console
		System.out.println("Selected to city is: "+to_dropdown.getAttribute("value"));

	}

}
