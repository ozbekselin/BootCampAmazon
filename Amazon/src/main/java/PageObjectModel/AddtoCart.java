package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	
	public WebDriver driver;
	
	@FindBy(linkText="Women's Genuine Leather Wallet RFID Blocking Credit Card Holder Zipper Purse Cell Phone Handbag") WebElement Select;
	@FindBy(id="add-to-cart-button") WebElement AddtoCart;

	public AddtoCart (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	
	}
	
	public void ProductSelect() {
		Select.click();

}
	public void AddtoCart() {
		AddtoCart.click();
		
 }
	}
	
	
