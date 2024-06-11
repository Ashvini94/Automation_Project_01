package selenium_practiseproject;

import baseclass.BaseClass_1;

public class Class_006 extends BaseClass_1{

	public static void main(String[] args) throws Exception {
		
		launch_Browser("Firefox");
		
		navigate_url("https://www.salesforce.com/in/?ir=1");
		
		take_Scrrenshot("Salesforce_homepage");
	}

}
