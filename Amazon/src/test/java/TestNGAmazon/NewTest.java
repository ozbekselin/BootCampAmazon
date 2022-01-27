package TestNGAmazon;

import org.testng.annotations.Test;

import Common.Utility;
import PageObjectModel.AddtoCart;
import PageObjectModel.SearchAmazon;

public class NewTest extends Utility {
 
	
	@Test
  public void Amazontest() throws InterruptedException {
		SearchAmazon ob=new SearchAmazon (driver);
		Thread.sleep(2000);
		ob.Searchfieldkeys();
	    Thread.sleep(2000);
		ob.SubmitClick();
		Thread.sleep(2000);
	
		AddtoCart ob1=new AddtoCart (driver);
		Thread.sleep(2000);
		ob1.ProductSelect();
	    Thread.sleep(2000);
		ob1.AddtoCart();
		Thread.sleep(2000);
	
  }
	
	
	
	
}
