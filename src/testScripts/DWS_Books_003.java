package testScripts;

import org.testng.annotations.Test;

import appModule.BooksModule;
import appModule.LoginModule;
import pageObjects.WelcomePage;
import utility.BaseTest;

public class DWS_Books_003 extends BaseTest {

	@Test
	public void addToCart() {
		
		//Open browser
		openBrowser();
		
		WelcomePage welcome=new WelcomePage(driver);
		
		//Login 
		LoginModule.login();
		
		//Navigate to books page
		welcome.getBooksLinkHeader().click();
		
		//Add books to the cart
		try {
			BooksModule.addBookTocart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Close browser
		closeBrowser();
	}
}
