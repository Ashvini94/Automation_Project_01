package action_Class_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_002draganddrop extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_Browser("Chrome");
		navigate_url("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(2000);
		take_screenshot("Globalsqa Homepage");

		// locate iframe
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		// to go inside iframe
		driver.switchTo().frame(frame);

		// to locate image 1
		WebElement drag1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));

		// to locate image 2
		WebElement drag2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));

		// to locate image 3
		WebElement drag3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));

		// to locate image 4
		WebElement drag4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		// to locate drop area
		WebElement drop = driver.findElement(By.cssSelector("div#trash"));

		// use actions class
		Actions act = new Actions(driver);

		// drag and drop
	/*	act.dragAndDrop(drag1, drop).build().perform();
		act.dragAndDrop(drag2, drop).build().perform();
		act.dragAndDrop(drag3, drop).build().perform();
		act.dragAndDrop(drag4, drop).build().perform();
		
		*/
		
		//or
		
		act.clickAndHold(drag1).moveToElement(drop).release().build().perform();
		act.clickAndHold(drag2).moveToElement(drop).release().build().perform();
		act.clickAndHold(drag3).moveToElement(drop).release().build().perform();
		act.clickAndHold(drag4).moveToElement(drop).release().build().perform();

	}

}
