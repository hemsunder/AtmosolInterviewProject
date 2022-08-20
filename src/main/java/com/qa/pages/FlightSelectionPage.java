package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class FlightSelectionPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	
	private By chooseFlight = By.xpath("//input[@value='Choose This Flight']");
	
	
	public FlightSelectionPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	
	//page actions
	public String getTitleOfPurchasePage() {
		return eleutil.getTitleOfThePage();
	}
	
	
	public PurchaseFlightPage clickOnChooseFlight() {
		eleutil.clickElement(chooseFlight);
		return new PurchaseFlightPage(driver);
	}
	
	
	
	
	
	

}
