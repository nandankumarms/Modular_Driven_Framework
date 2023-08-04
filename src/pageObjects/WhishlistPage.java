package pageObjects;

/**
 * @author Nandankumar M S
 *
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WhishlistPage extends BasePage {

	public WhishlistPage(WebDriver driver) {
		super(driver);
	}

	//Get page heading
	@FindBy(xpath = "//h1")
	private WebElement pageHeading;

	public String getPageHeading() {
		return pageHeading.getText();
	}

	//Get table header
	@FindBy(xpath = "//table[@class='cart']/thead//tr")
	private WebElement tableHeader;

	public String getTableHeader() {
		return tableHeader.getText();
	}

	//Find All row elements
	@FindBy(xpath = "//table[@class='cart']/tbody/tr")
	List<WebElement> rowElements;

	// Row Count
	int rowCount;

	//Return table row size
	public int getTableRowCount() {
		if(rowElements.size()>0) {
			rowCount=rowElements.size();
			return rowCount;
		}
		return 0;

	}

	//Find column elements
	@FindBy(xpath="//table[@class='cart']/tbody/tr[1]/td")
	List<WebElement> elementsInRow;

	//column count
	int columnCount;

	public int getColumCount() {
		if(rowElements.size()>0) {

			columnCount=elementsInRow.size();
			return columnCount;
		}
		return 0;
	}

	//click on remove button
	public void clickRemoveButton(int row) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[1]/input")).click();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");

			}
		}
		else {
			System.out.println("There is no products in Wishlist");
		}
	}

	//Click add to cart button
	public void clickAddToCartButton(int row) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[2]/input")).click();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
			}
		}
		else {
			System.out.println("There is no products in Wishlist");
		}
	}

	//Get product image
	public WebElement getProductImage(int row) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/img"));
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
				return null;
			}
		}
		else {
			System.out.println("There is no products in Wishlist");
			return null;
		}
	}

	//Get product description
	public String getProductDescription(int row) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[4]/div")).getText();
			}
			else {
				return "Invalid row number or Row does not exists";
			}
		}
		else {
			return "There is no products in Wishlist";
		}
	}

	//Click on item link
	public void clickItemLink(int row) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[4]/a")).click();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
			}
		}
		else {
			System.out.println("There is no products in Wishlist");
		}
	}

	//Get product price
	public String getProductPrice(int row) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[5]/span[@class='product-unit-price']")).getText();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
				return "Price not found";
			}
		}
		else {
			System.out.println("There is no products in Wishlist");
			return null;
		}
	}

	//Enter product quantity
	public void enterQuantity(int row, String quantity) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				WebElement productQuantity = driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[6]/input"));
				productQuantity.clear();
				productQuantity.sendKeys(quantity);
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
			}
		}
		else {
			System.out.println("There is no products in Wishlist");
		}
	}

	//Get total price of each product
	public String getTotalPrice(int row) {
		if(rowCount>0) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[7]/span[@class='product-subtotal']")).getText();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
				return "Total price not found";
			}
		}
		else {
			System.out.println("There is no products in Wishlist");
			return null;
		}
	}

	//Update wishlist button
	@FindBy(xpath = "//div[@class='common-buttons']/input[@name='updatecart']")
	private WebElement updateWishListButton;

	//Add to common cart button
	@FindBy(xpath = "//div[@class='common-buttons']/input[@name='addtocartbutton']")
	private WebElement commonAddToCartButton;

	//Email a friend button
	@FindBy(xpath = "//div[@class='common-buttons']/input[@value='Email a friend']")
	private WebElement emailAFriend;

	//Wishlist URL
	@FindBy(xpath = "//div[@class='share-info']//a")
	private WebElement wishlistUrl;
}
