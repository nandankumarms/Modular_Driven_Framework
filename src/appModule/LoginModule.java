package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import utility.BaseTest;

public class LoginModule extends BaseTest{
	public static void login() {
		
		WelcomePage welcome=new WelcomePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		
		//Click on login link in the home page
		welcome.getLogInLink().click();
		
		//Enter email
		loginPage.getEmailTextField().sendKeys("nandanms@gmail.com");
		
		//Enter password
		loginPage.getPasswordTextField().sendKeys("nandan@1234");
		
		//Click on login button
		loginPage.getLoginButton().click();
		
		
	}
	
}
