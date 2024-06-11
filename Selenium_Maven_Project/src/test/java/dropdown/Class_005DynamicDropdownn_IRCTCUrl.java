package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_005DynamicDropdownn_IRCTCUrl extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.irctc.co.in/nget/train-search");
		
		//to locate from city dropdown
		WebElement from_city_dropdown=driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));

		//to pass input in from city dropdown
		from_city_dropdown.sendKeys("Bengaluru");
		
		//to locate from_city dropdown options
		List<WebElement>from_city_options=driver.findElements(By.xpath("//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c57-8 ui-autocomplete-panel ui-widget ui-widget-content ui-corner-all ui-shadow ng-star-inserted']/ul/li/span"));
	
		//List<WebElement>dropdown=driver.findElements(By.xpath("//ul[@id='pr_id_1_list']/li/span"));
	
		//to choose one option from multiple options using for loop
		for(int i=0;i<from_city_options.size();i++)
		{
			if(from_city_options.get(i).getText().contains("BENGALURU EAST - BNCE"))//here at the time of capture this text there is a space in dom but we have to remove that space first in contains method
			{
				from_city_options.get(i).click();
			}
		}
		
		//to capture selecetd optinos in console
		System.out.println("option selected from city is: "+from_city_dropdown.getAttribute("value"));
		
		
		//to locate to city dropdown 
		WebElement to_city_dropdown=driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		
		//send input in to city dropdown
		to_city_dropdown.sendKeys("Mumbai");
		
		//to locate options of to city dropdown
		List<WebElement>to_city_options=driver.findElements(By.xpath("//ul[@id='pr_id_2_list']/li"));
		
		//to choose one option
		for(int i=0;i<to_city_options.size();i++)
		{
			if(to_city_options.get(i).getText().contains("C SHIVAJI MAH T - CSMT"))
			{
				to_city_options.get(i).click();
			}
		}
		
		Thread.sleep(1000);
		
		//to cpature selected option in console
		System.out.println("option selected to city is: "+to_city_dropdown.getAttribute("value"));
	
	
	
	}

}
