package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_002 extends BaseClass {
	
	//mouse actions -->drag and drop

	public static void main(String[] args) throws Exception {

		launch_Browser("Chrome");

		navigate_url("https://www.globalsqa.com/demo-site/draganddrop/");

		take_screenshot("GLOBALSQ_Homepage");

		// to locate iframe
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		// to enter inside iframe
		driver.switchTo().frame(frame);

		// to locate image 1 element
		WebElement drag1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));

		// to locate image 2 element
		WebElement drag2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));

		// to locate image 3 element
		WebElement drag3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));

		// to locate image 4 element
		WebElement drag4= driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		
		//to locate drag element i.e trash
		WebElement drop = driver.findElement(By.cssSelector("div#trash"));
		
		
		//Using Actions class to drag and drop
		Actions act=new Actions(driver);
		
		//Thread.sleep(2000);
	/*	act.dragAndDrop(drag1, drop).build().perform();
		act.dragAndDrop(drag2, drop).build().perform();
		act.dragAndDrop(drag3, drop).build().perform();
		act.dragAndDrop(drag4, drop).build().perform();
		
		*/
		act.clickAndHold(drag1).moveToElement(drop).release().build().perform();
		act.clickAndHold(drag2).moveToElement(drop).release().build().perform();
		act.clickAndHold(drag3).moveToElement(drop).release().build().perform();
		act.clickAndHold(drag4).moveToElement(drop).release().build().perform();

	}

}
