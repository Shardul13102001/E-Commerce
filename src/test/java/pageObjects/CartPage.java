package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement PlaceOrder;
	
	public void ClickPlaceOrder()
	{
		PlaceOrder.click();
	}

}
