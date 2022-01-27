package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAmazon {
	public WebDriver driver;
	
 @FindBy(id="twotabsearchtextbox") WebElement search;
 @FindBy(id="nav-search-submit-button") WebElement submit;
 
 
 
 public SearchAmazon (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
 

}
 public void Searchfieldkeys() {
		search.sendKeys("wallet");
		
 }
 
 public void SubmitClick () {
		submit.click();
		
 }
 
}
		
		
		
		