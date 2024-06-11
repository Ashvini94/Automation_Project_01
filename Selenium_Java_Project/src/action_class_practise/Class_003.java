package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_003 extends BaseClass {
	
	//mouse actions

	public static void main(String[] args) throws Exception {

		launch_Browser("Chrome");
		navigate_url("https://www.amazon.in/");
		take_screenshot("Amazon_homepage");

		// to locate element Bestsellers link
		WebElement Bestsellers_link = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));

		// clik on BestSellers link using actions class
		Actions act = new Actions(driver);

		act.click(Bestsellers_link).build().perform();

		// take scrrenshot
		Thread.sleep(2000);
		take_screenshot("After click on Best Sellers link");

		// to locate element Prime
		WebElement Prime_link = driver.findElement(By.xpath("//span[text()='Prime']"));

		// to perform mouse hover
		act.moveToElement(Prime_link).build().perform();

		// take scrrenshot
		Thread.sleep(2000);
		take_screenshot("After mouse hover on Prime link");

		// to locate element Account & List link
		WebElement AccountandList_link = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

		act.moveToElement(AccountandList_link).contextClick().build().perform();

		// to loacte element searchbox
		WebElement searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

		// to click on searchbox
		searchbox.click();

		// to pass input in searchbox
		searchbox.sendKeys("Camera");

		// to select the input of serachbox
		act.doubleClick(searchbox).build().perform();

		// take scrrenshot
		Thread.sleep(2000);
		take_screenshot("After double click on input data");

	}

}
