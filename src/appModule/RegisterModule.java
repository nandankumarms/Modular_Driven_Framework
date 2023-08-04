package appModule;

import org.testng.annotations.Test;

import pageObjects.RegisterPage;
import pageObjects.WelcomePage;
import utility.BaseTest;

public class RegisterModule extends BaseTest {

	public static void register() {
		WelcomePage welcome=new WelcomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		//Click on register link
		welcome.getRegisterLink().click();
		
		//Click on Male radio button
		register.getMaleGenderButton().click();
		
		//Enter First name
		register.getFirstNameTextFiled().sendKeys("Nandan");
		
		//Enter last name
		register.getLastNameTextField().sendKeys("M S");
		
		//Enter email address
		register.getEmailTextField().sendKeys("nandan@gmail.com");
		
		//Enter password
		register.getPasswordTextField().sendKeys("nandan@1234");
		
		//Enter confirm password
		register.getConfirmPasswordTextField().sendKeys("nandn@12344");
		
		//Click on Register button
		register.getRegisterButton().click();
	}

}
