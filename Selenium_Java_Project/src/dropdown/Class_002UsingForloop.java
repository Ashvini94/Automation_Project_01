package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_002UsingForloop extends BaseClass {

	public static void main(String[] args) {
		
		launch_Browser("Chrome");
		navigate_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
	
		scroll_page(300);
	
		//to locate dynamic dropdown religion 
		WebElement religion_dropdown=driver.findElement(By.cssSelector("div#reg_religion_chzn"));
	
		
		//to click on religion dropdown 
		religion_dropdown.click();
		
	/*	//to locate options from dropdown
		List<WebElement> religion_option = driver.findElements(By.xpath("//ul[@class='chzn-results']//li"));
	
	
		//choose one option
		for(int i=0;i<religion_option.size();i++)
		{
			if(religion_option.get(i).getText().contains("Hindu"))
			{
				religion_option.get(i).click();
			}
		}
		
		
		//to capture selecetd option
		System.out.println(religion_dropdown.getAttribute("value"));
		
		*/
	
		//to locate element option Christian from dropdown
		WebElement option=driver.findElement(By.xpath("(//ul[@class='chzn-results']//li)[4]"));
		
		//to click on Christian option
		option.click();
		
		System.out.println(option.getText());
		
		System.out.println("selected option is: "+religion_dropdown.getAttribute("value"));
		
	/*	//to locate city dropdown 
		WebElement  city_dropdown=driver.findElement(By.xpath("//div[@id='reg_city_res_chzn']"));
			
		//click on city dropdown
		 city_dropdown.click();
		 
		 */
		
		
		 
		 
		 
		 
		
	}
}
