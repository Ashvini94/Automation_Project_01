package different_types_of_verification;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) {

		launchBrowser("Chrome");
		navigateUrl("https://www.flipkart.com/");
		
		//to locate grocery link and verify link name is correct or not like actual link name
		String link_name1=driver.findElement(By.xpath("//span[text()='Grocery']")).getText();
		System.out.println("Link name1 is: "+link_name1);
		
		//another way for verification if getText() is not working
		String link_name2=driver.findElement(By.xpath("//span[text()='Grocery']")).getAttribute("innerHTML");
		System.out.println("Link name2 is: "+link_name2);
		
	}

}
