package pageObjects;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.BaseTest;



public class BasePage extends BaseTest{
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
