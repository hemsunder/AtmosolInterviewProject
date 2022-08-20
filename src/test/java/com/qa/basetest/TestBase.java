package com.qa.basetest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.factory.DriverFactory;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.FlightSelectionPage;
import com.qa.pages.PurchaseFlightPage;
import com.qa.pages.TravelTheWorldPage;

public class TestBase {
	
	private WebDriver driver;
	private DriverFactory df;
	Properties prop;
	protected TravelTheWorldPage worldpage;
	protected FlightSelectionPage flightselpage;
	protected PurchaseFlightPage purchaseflightpage;
	protected ConfirmationPage confirmationpage;
	
	@BeforeTest
	public void setup() {
		
		df = new DriverFactory();
		prop = df.initprop();
		driver = df.initializebrowser(prop.getProperty("browserName"));
		worldpage = new TravelTheWorldPage(driver);
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	

}
