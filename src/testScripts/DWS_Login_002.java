package testScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import appModule.LoginModule;
import utility.BaseTest;

public class DWS_Login_002 extends BaseTest{
	@Test
	public void logintest_002() {	
		//Login to application
		LoginModule.login();
		test.log(LogStatus.PASS, test.addScreenCapture(takeScreenShot()));
		
		//Close the application
		closeBrowser();
	}

}
