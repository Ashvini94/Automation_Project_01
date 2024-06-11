package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_001 extends BaseClass {
	
	public static String month_year;

	public static void main(String[] args) throws InterruptedException {
		

		launch_Browser("Chrome");
		navigate_url("https://www.railyatri.in/");
		scroll_page(200);
		
		// to locate calender dropdown
		WebElement calender_dropdown=driver.findElement(By.cssSelector("input#datepicker_train"));
		
		//to click on it
		calender_dropdown.click();
		
		while(true)
		{
			//to locate month year
			month_year=driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
		
			
			Thread.sleep(2000);
			
			if(!(month_year.equalsIgnoreCase("September 2024")))
			{
				//click on next arrow
				driver.findElement(By.xpath("//th[@class='next']")).click();
			}
			else
			{
				break;
			}
		
		}
		
		//to select date
		driver.findElement(By.xpath("//td[text()='12']")).click();
		
		//to print month year
		System.out.println("selected month is: "+month_year);
		
		//to print selected date
		System.out.println("Selected date is: "+calender_dropdown.getAttribute("value"));
	}

}
