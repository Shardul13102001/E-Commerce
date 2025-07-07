package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	

	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement LoginUsername;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement LoginPassword;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement LoginButton;
	
	
	public void setLoginUsername(String Username)
	{
		LoginUsername.sendKeys(Username);
	}
	
	public void setLoginPassword(String Password)
	{
		LoginPassword.sendKeys(Password);
	}
	
	public void ClickLogin()
	{
		LoginButton.click();
	}

}
