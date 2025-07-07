package tests;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import config.ConfigReader;
import pageObjects.*;
import testBase.BaseClass;

import java.time.Duration;

public class EndToEndFlow extends BaseClass {

	@Test
	public void EndToEndTest() throws IOException, InterruptedException {

		prop = ConfigReader.getProperty();
		
		long time = System.currentTimeMillis();
		String newEmail = "itachi" + time + "@gmail.com";

		// Step 1: Sign Up
		HomePage home = new HomePage(driver);
		home.ClickSignUp();

		SignUpPage signup = new SignUpPage(driver);
		Thread.sleep(1000);
		signup.setUsername(newEmail);
		signup.setPassword(prop.getProperty("password"));
		signup.ClickSignUp();

		Thread.sleep(2000);
		Alert signupAlert = driver.switchTo().alert();
		signupAlert.accept();
		System.out.println("Sign-up successful");

		//Step 2: Login
		home.ClickLogin();

		LoginPage login = new LoginPage(driver);
		Thread.sleep(1000);
		login.setLoginUsername(newEmail);
		login.setLoginPassword(prop.getProperty("password"));
		login.ClickLogin();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log out']")));
		System.out.println("Login successful");

		//Step 3: Add Product to Cart
		ProductPage product = new ProductPage(driver);
		product.ClickLaptop();
		Thread.sleep(1000);
		product.ClickMacBook();
		Thread.sleep(1000);
		product.ClickAddCart();

		Thread.sleep(2000);
		Alert cartAlert = driver.switchTo().alert();
		cartAlert.accept();
		System.out.println("Product added to cart");

		//Step 4: Place Order
		home.ClickCart();

		CartPage cart = new CartPage(driver);
		cart.ClickPlaceOrder();

		Thread.sleep(1000);
		PlaceOrderPage po = new PlaceOrderPage(driver);
		po.setName(prop.getProperty("name"));
		po.setCountry(prop.getProperty("country"));
		po.setCity(prop.getProperty("city"));
		po.setCard(prop.getProperty("card"));
		po.setMonth(prop.getProperty("month"));
		po.setYear(prop.getProperty("year"));
		po.ClickPurchase();

		WebElement thankYouHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sweet-alert h2")));
		String thankYouText = thankYouHeader.getText();
		WebElement purchaseDetails = driver.findElement(By.cssSelector("p.lead.text-muted"));

		System.out.println("Order Placed");
		System.out.println(thankYouText);
		System.out.println(purchaseDetails.getText());

		// verification
		assert thankYouText.equalsIgnoreCase("Thank you for your purchase!");
	}
}
