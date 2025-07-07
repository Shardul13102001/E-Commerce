package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "(//li[@class='nav-item'])[7]//a")
	WebElement SignUpButton;
	
	@FindBy(xpath = "(//li[@class='nav-item'])[4]//a")
	WebElement LoginButton;
	
	@FindBy(xpath = "//a[text()='Cart']")
	WebElement Cart;
	
	
	public void ClickSignUp()
	{
		SignUpButton.click();
	}
	
	public void ClickLogin()
	{
		LoginButton.click();
	}
	
	public void ClickCart() throws InterruptedException
	{
		Cart.click();
		Thread.sleep(3000);
	}

}
