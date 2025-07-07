package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import config.ConfigReader;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.PlaceOrderPage;
import testBase.BaseClass;

public class TC04_PlaceOrder extends BaseClass {
	
	@Test
	public void placeOrder() throws IOException, InterruptedException
	{
		prop = ConfigReader.getProperty();
		
		/*
		TC02_Login login = new TC02_Login();
		login.Login();
		Thread.sleep(5000);
		*/
		
		HomePage hp = new HomePage(driver);
		hp.ClickCart();
		
		CartPage cp = new CartPage(driver);
		cp.ClickPlaceOrder();
		
		Thread.sleep(2000);
		
		PlaceOrderPage po = new PlaceOrderPage(driver);
		po.setName(prop.getProperty("name"));
		po.setCountry(prop.getProperty("country"));
		po.setCity(prop.getProperty("city"));
		po.setCard(prop.getProperty("card"));
		po.setMonth(prop.getProperty("month"));
		po.setYear(prop.getProperty("year"));
		po.ClickPurchase();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.cssSelector("div.sweet-alert.showSweetAlert.visible"))
		);

		// Capture the "Thank you" line
		WebElement thankYouHeader = driver.findElement(By.cssSelector("div.sweet-alert h2"));
		String thankYouText = thankYouHeader.getText();

		// Capture the full purchase details (Id, Amount, etc.)
		WebElement message = driver.findElement(By.cssSelector("p.lead.text-muted"));
		String purchaseDetails = message.getText();
		
		System.out.println(thankYouText);
		System.out.println(purchaseDetails);
	
	}

}
