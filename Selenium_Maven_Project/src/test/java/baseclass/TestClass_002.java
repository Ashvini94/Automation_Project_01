package baseclass;

public class TestClass_002 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("Firefox");
		
		navigateUrl("https://www.facebook.com/");
		
		take_Screenshot("homepage");
		take_Screenshot("facebook_homepage");

	}

}
