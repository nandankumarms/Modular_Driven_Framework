package appModule;

import pageObjects.ShoppingCartPage;
import utility.BaseTest;

public class CartModule extends BaseTest{
	public static void checkoutItems() {
		ShoppingCartPage cartPage=new ShoppingCartPage(driver);
		
		//Click on Terms of service button
		cartPage.getTermsOfserviceButton().click();
		
		//Click on checkout button
		cartPage.getCheckOutButton().click();
		
	}
}
