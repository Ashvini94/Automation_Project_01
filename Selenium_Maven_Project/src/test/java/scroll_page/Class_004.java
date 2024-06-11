package scroll_page;

import baseclass.BaseClass;

public class Class_004 extends BaseClass{

	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.facebook.com/");
		scroll_page(1000);//call scroll page method directly
		

	}

}
