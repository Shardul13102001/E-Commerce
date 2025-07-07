package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()=\"Laptops\"]")
	WebElement Laptop;
	
	@FindBy(xpath = "//a[text()='MacBook air']")
	WebElement macbook;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addCart;
	
	public void ClickLaptop()
	{
		Laptop.click();
	}
	
	public void ClickMacBook()
	{
		macbook.click();
	}
	
	public void ClickAddCart()
	{
		addCart.click();
	}

}
