package action_class_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_007 extends BaseClass {
	
	//slider code 

	public static void main(String[] args) {

		launch_Browser("Chrome");
		navigate_url("https://groww.in/calculators/simple-interest-calculator");

		// to locate slider1 element
		WebElement slider1 = driver.findElement(By.xpath("(//div[@class='cis93SliderTrack cis93SliderTrack-0'])[1]"));

		// to locate slider2 element
		WebElement slider2 = driver.findElement(By.xpath("(//div[@class='cis93SliderTrack cis93SliderTrack-1'])[2]"));

		// to locate slider3 element
		WebElement slider3 = driver.findElement(By.xpath("(//div[@class='cis93SliderTrack cis93SliderTrack-1'])[3]"));

		// Use actions class
		Actions act = new Actions(driver);

		// to move slider 1 forward direction to x-axis
		act.dragAndDropBy(slider1, 200, 0).build().perform();

		// to move slider 1 backword direction to x-axis
		act.dragAndDropBy(slider1, -100, 0).build().perform();

		// to move slider 2 forward direction to x-axis
		act.dragAndDropBy(slider2, 200, 0).build().perform();

		// to move slider 2 backword direction to x-axis
		act.dragAndDropBy(slider2, -100, 0).build().perform();

		// to move slider 3 forward direction to x-axis
		act.dragAndDropBy(slider3, 200, 0).build().perform();

		// to move slider 3 backword direction to x-axis
		act.dragAndDropBy(slider3, -100, 0).build().perform();

	}

}
