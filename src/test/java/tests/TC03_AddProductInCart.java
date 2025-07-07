package tests;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC03_AddProductInCart extends BaseClass {
	
	@Test
	public void accProduct() throws InterruptedException, IOException
	{	
		/*
		TC02_Login login = new TC02_Login();
		login.Login();
		Thread.sleep(5000);
		*/
		
		ProductPage product = new ProductPage(driver);
		product.ClickLaptop();
		product.ClickMacBook();
		product.ClickAddCart();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("Product succesfully added in cart");
		
	}

}
