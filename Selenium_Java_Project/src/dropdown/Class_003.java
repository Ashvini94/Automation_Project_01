package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.BaseClass;

public class Class_003 extends BaseClass {

	public static void main(String[] args) {

		launch_Browser("Chrome");
		navigate_url(
				"https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");

		// to locate date of birth dropdown
		WebElement dob = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));

		// click on dob
		dob.click();

		// to select date from options
		Select s = new Select(dob);

		// select daate by visisble text
		s.selectByVisibleText("8");

		// to locate month dropdown
		WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));

		// click on month
		dob.click();

		// to select month from options
		Select se = new Select(month);

		// select month by value
		se.selectByValue("8");

		// to locate year dropdown
		WebElement year = driver.findElement(By.cssSelector("select#reg_dtofbirth_year"));

		// click on month
		year.click();

		// to select month from options
		Select sel = new Select(year);

		// select year by index
		sel.selectByIndex(5);
	}
}
