package tests;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.ConfigReader;
import pageObjects.HomePage;
import pageObjects.SignUpPage;
import testBase.BaseClass;

public class TC01_Signup extends BaseClass {

	@Test
	public void SignUp() throws IOException, InterruptedException
	{
		prop = ConfigReader.getProperty();
		
		HomePage hp = new HomePage(driver);
		hp.ClickSignUp();
		
		SignUpPage signup = new SignUpPage(driver);
		Thread.sleep(2000);
		signup.setUsername(prop.getProperty("username"));
		signup.setPassword(prop.getProperty("password"));
		signup.ClickSignUp();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("User succesfully sign in");
		
		
	

	}
}
