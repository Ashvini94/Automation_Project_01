package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_002DropdownUsingForLoop extends BaseClass{

	//dropdown -->when static dropdown is not present in select tag  then use for loop
	
	public static void main(String[] args) {
		
		
		launchBrowser("Chrome");
		navigateUrl("https://www.jeevansathi.com/");
		
		//to locate create profile element dropdown
		driver.findElement(By.xpath("//div[@id='relationshipBlock']")).click();
		
		//to locate all options from dropdown
		List<WebElement>options=driver.findElements(By.xpath("//div[@id='relationshipOptions']/ul/li"));
		

		//to print the size of list
		System.out.println(options.size());//7
		
		//choose one option from seven
		for(int i=0;i<7;i++)
		{
			if(options.get(i).getText().equalsIgnoreCase("Daughter"))
			{
				options.get(i).click();
			}
		}
		
		
	}

}
