package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.ConfigReader;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC02_Login extends BaseClass {
	
	@Test
	public void Login() throws IOException, InterruptedException
	{
		prop = ConfigReader.getProperty();
		
		HomePage hp = new HomePage(driver);
		hp.ClickLogin();
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.setLoginUsername(prop.getProperty("username"));
		lp.setLoginPassword(prop.getProperty("password"));
		lp.ClickLogin();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement msg =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log out']")));
		Assert.assertEquals(msg.isDisplayed(), true);
	}
}
