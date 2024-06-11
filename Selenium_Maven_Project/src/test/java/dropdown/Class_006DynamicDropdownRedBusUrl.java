package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_006DynamicDropdownRedBusUrl extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.redbus.in/");
		
		//to locate element from city dropdown
		WebElement from_city_dropdown=driver.findElement(By.cssSelector("input#src"));
		

		//send input in from city dropdown
		from_city_dropdown.sendKeys("Nagpur");
		
		
		//to locate options from city dropdown
		List<WebElement>from_city_option=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li/div/text"));
	
		//to choose one option
		for(int i=0;i<from_city_option.size();i++)
		{
			if(from_city_option.get(i).getText().contains("Chatrapathi"))
			{
				from_city_option.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		
		//to locate element to city dropdown
		//WebElement to_city_dropdown=driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]"));
	
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]"));
		
		//send input in to city dropdown
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]")).sendKeys("Pune");
		
		//to click on to city dropdown
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]")).click();
		
		
	
	}

}
