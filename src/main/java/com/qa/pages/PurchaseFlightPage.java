package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class PurchaseFlightPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	
	private By name_tb = By.id("inputName");
	private By address_tb = By.id("address");
	private By city_tb = By.id("city");
	private By state_tb = By.id("state");
	private By zipCode_tb = By.id("zipCode");
	private By creditCardNumber_tb = By.id("creditCardNumber");
	private By nameOnCard_tb = By.id("nameOnCard");
	private By purchaseFlight_btn = By.xpath("//input[@value='Purchase Flight']");
	
	
	public PurchaseFlightPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	
	
	public ConfirmationPage fillTheFlightForm(String name, String address, String city, String state, String zipcode
			, String ccnum, String nameoncard) {
		eleutil.doSendKeys(name_tb, name);
		eleutil.doSendKeys(address_tb, address);
		eleutil.doSendKeys(city_tb, city);
		eleutil.doSendKeys(state_tb, state);
		eleutil.doSendKeys(zipCode_tb, zipcode);
		eleutil.doSendKeys(creditCardNumber_tb, ccnum);
		eleutil.doSendKeys(nameOnCard_tb, nameoncard);
		eleutil.clickElement(purchaseFlight_btn);
		
		return new ConfirmationPage(driver);
		
	}
	
	

}
