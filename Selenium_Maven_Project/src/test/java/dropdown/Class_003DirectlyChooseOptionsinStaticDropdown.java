package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_003DirectlyChooseOptionsinStaticDropdown extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.jeevansathi.com/");
		
		//to locate create profile for dropdown 
		WebElement dropdown=driver.findElement(By.xpath("//div[@id='relationshipBlock']"));

		//to click dropdown
		dropdown.click();
		
		//to locate option brother and click on it
		driver.findElement(By.xpath("(//div[@id='relationshipOptions']/ul/li)[4]")).click();
	
		//to print the value of selected option from dropdown in console
		//System.out.println("Selecetd option is: "+dropdown.getAttribute("value"));
		
		//WebElement dropdown1 =driver.findElement(By.xpath("//p[@id='relationship']"));
		
		//System.out.println("Selecetd option is: "+dropdown1.getAttribute("value"));
		
	}

}
