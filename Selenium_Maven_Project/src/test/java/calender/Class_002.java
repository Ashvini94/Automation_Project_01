package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_002 extends BaseClass{
	public static String month;

	public static void main(String[] args) {

		launchBrowser("Chrome");
		navigateUrl("https://www.irctc.co.in/nget/train-search");
		
		scroll_page(200);
		
		//to locate calender dropdown
		WebElement dropdown=driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));

		//to click on calender
		dropdown.click();
		
		//to locate month
		while(true)
		{
			month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
		
			System.out.println(month);
			
			if(!(month.equalsIgnoreCase("August")))
			{
				// locate next arrow and click on next arrow
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			}
			else
			{
				break;
			}
		
		}
		
		
		
		//to select date and click on it
		driver.findElement(By.xpath("//a[text()='15']")).click();
		
		//to capture month
		System.out.println("Selected month is: "+month);
		
		
		//to capture selected date in console
		System.out.println("Selected date is: "+dropdown.getAttribute("value"));
	}

}
