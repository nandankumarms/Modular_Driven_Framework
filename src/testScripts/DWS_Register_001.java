package testScripts;

import appModule.RegisterModule;
import utility.BaseTest;

public class DWS_Register_001 extends BaseTest{
	public void register_001() {
		//Open browser
		openBrowser();
		
		//Register to the application
		RegisterModule.register();
		
		//Verify the login page is displayed or not
		
		//Close browser
		closeBrowser();
	}
}
