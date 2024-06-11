package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.BaseClass;

public class Class_001_SelectOptionsUsingSelectClass extends BaseClass {

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		navigateUrl(
				"https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
		take_Screenshot("Jeevansathi_Homepage");

		// to locate element email textbox and send input in it
		driver.findElement(By.cssSelector("input#reg_email")).sendKeys("ashvinipofare01@gmail.com");

		// to locate element password textbox and send input in it
		driver.findElement(By.cssSelector("input#reg_password")).sendKeys("ashvini@1234");

		// to loacte element create profile for
		WebElement Createprofile_dropdown = driver.findElement(By.cssSelector("select#reg_relationship"));

		// use select class to select options from dropdown
		Select s = new Select(Createprofile_dropdown);

		s.selectByVisibleText("Daughter");

		// s.selectByValue("6D");

		// s.selectByIndex(7);

		// to locate element day
		WebElement day_dropdown = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));

		// use select class to select options from dropdown
		Select se = new Select(day_dropdown);

		se.selectByValue("3");

		// to locate element month
		WebElement month_dropdown = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));

		// use select class to select options from dropdown
		Select sel = new Select(month_dropdown);

		sel.selectByVisibleText("May");

		// to locate element year
		WebElement year_dropdown = driver.findElement(By.cssSelector("select#reg_dtofbirth_year"));

		// use select class to select options from dropdown
		Select sel1 = new Select(year_dropdown);

		sel1.selectByVisibleText("2004");

		// to locate element height
		WebElement height_dropdown = driver.findElement(By.cssSelector("select#reg_height"));

		// use select class to select options from dropdown
		Select sel2 = new Select(height_dropdown);

		sel2.selectByValue("5");

		// to locate element marital status
		WebElement maritalstatus_dropdown = driver.findElement(By.cssSelector("select#reg_mstatus"));

		// use select class to select options from dropdown
		Select sel3 = new Select(maritalstatus_dropdown);

		sel3.selectByValue("M");

		// to locate element have children
		WebElement havechildren_dropdown = driver.findElement(By.cssSelector("select#reg_havechild"));

		// use select class to select options from dropdown
		Select sel4 = new Select(havechildren_dropdown);

		sel4.selectByValue("N");

		// to locate element mother tongue
		WebElement mothertongue = driver.findElement(By.cssSelector("select#reg_mtongue"));

		// use select class to select options from dropdown
		Select sel5 = new Select(mothertongue);

		sel5.selectByVisibleText("Marathi");

		// to scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(1000);

		// to scroll the page upto bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		//to locate element twitter link and click on it
		driver.findElement(By.xpath("//img[@alt='Twitter']")).click();
		
		

	}

}
