package selenium_practiseproject;

import baseclass.BaseClass_002;

public class Class_007 extends BaseClass_002{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Chrome");
		navigate_Url("https://www.snapdeal.com/");
		take_Screenshot("Snapdeal_Homepage");
		scroll_Page(4000);
		
	}

}
