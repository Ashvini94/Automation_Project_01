package action_Class_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_004keyboardaction extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Chrome");
		navigate_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");

		Thread.sleep(2000);
		take_screenshot("Jeevansathi Homepage");
		
		//to locate element email textbox
		WebElement email=driver.findElement(By.cssSelector("input#reg_email"));
		
		//using actions class
		Actions act=new Actions(driver);
		
		//send input data in email textbox
		act.sendKeys(email, "ashvini@gmail.com").build().perform();
		
		//use tab
		//act.keyDown(Keys.TAB).build().perform();
		
		//use shift
		//act.keyDown(Keys.SHIFT).sendKeys(email,"ashvini").build().perform();
		
		//use enter
		//act.keyDown(Keys.ENTER).build().perform();
		
		//use back space
		//act.keyDown(Keys.BACK_SPACE).build().perform();
		
		//to copy paste
		
		//to press control a to select input data
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
		//to press control c for copy
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//press tab
		act.keyDown(Keys.TAB);
		
		//to press control v for paste
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
