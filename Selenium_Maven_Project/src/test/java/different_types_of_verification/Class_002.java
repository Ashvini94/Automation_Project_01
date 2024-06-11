package different_types_of_verification;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_002 extends BaseClass{

	public static void main(String[] args) {

		launchBrowser("Chrome");
		navigateUrl("https://www.flipkart.com/");
		
		String expected_link_name="Grocery";
		
		//locate grocery link and capture the text 
		String actual_link_name=driver.findElement(By.xpath("//span[text()='Grocery']")).getText();
		
		if(actual_link_name.equalsIgnoreCase(expected_link_name))
		{
			System.out.println("Both link name are same");
		}
		else
		{
			System.out.println("Both link name are not same");
		}

	}

}
