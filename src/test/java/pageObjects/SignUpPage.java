package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends BasePage {
	
	public SignUpPage(WebDriver driver) 
	{
		super(driver);

	}
	
	
	@FindBy(xpath = "//input[@id='sign-username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='sign-password']")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signUpButton;
	
	
	public void setUsername(String signupUsername)
	{
		username.sendKeys(signupUsername);
	}
	
	public void setPassword(String signupPassword)
	{
		password.sendKeys(signupPassword);
	}
	
	public void ClickSignUp()
	{
		signUpButton.click();
	}

}
