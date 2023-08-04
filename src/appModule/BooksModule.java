package appModule;

import pageObjects.BooksPage;
import pageObjects.WelcomePage;
import utility.BaseTest;

public class BooksModule extends BaseTest{
	public static void addBookTocart() throws InterruptedException {
		
		BooksPage book=new BooksPage(driver);
		WelcomePage welcome=new WelcomePage(driver);
		//Click o the books link in the home page
		welcome.getBooksLinkHeader().click();
		
		//Click on add to cart button of all Books
		for(int i=0;i<book.getAddToCartButtonOfAllBooks().size();i++) {
			Thread.sleep(500);
			book.getAddToCartButtonOfAllBooks().get(i).click();
		}
		
	}


}
