package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends  BasePage {

	public PlaceOrderPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='country']")
	WebElement country;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='card']")
	WebElement card;

	@FindBy(xpath = "//input[@id='month']")
	WebElement month;
	
	@FindBy(xpath = "//input[@id='year']")
	WebElement year;
	
	@FindBy(xpath = "//button[text()='Purchase']")
	WebElement Purchase;
	
	
	public void setName(String Uname)
	{
		name.sendKeys(Uname);
	}
	
	public void setCountry(String Ucountry)
	{
		country.sendKeys(Ucountry);
	}
	
	public void setCity(String Ucity)
	{
		city.sendKeys(Ucity);
	}
	
	public void setCard(String Ucard)
	{
		card.sendKeys(Ucard);
	}
	
	public void setMonth(String Umonth)
	{
		month.sendKeys(Umonth);
	}
	
	public void setYear(String Uyear)
	{
		year.sendKeys(Uyear);
	}
	
	public void ClickPurchase()
	{
		Purchase.click();
	}
}
