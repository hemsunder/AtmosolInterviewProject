package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.basetest.TestBase;

public class TravelTheWorldPageTest extends TestBase {
	
	
	@Test(priority=1)
	public void worldPageTitleTest() {
		String worldpageTitle = worldpage.titleOfTheWorldPage();
		Assert.assertEquals(worldpageTitle, "Welcome to the Simple Travel Agency!");
	}
	
	@Test(priority=2)
	public void beatchLinkClickingTest() {
		worldpage.clickOnTheBeatchLink();
		String url = worldpage.getUrl();
		Assert.assertTrue(url.contains("vacation"));
		worldpage.navigateToBack();
	}
	
	@Test(priority=3)
	public void selectCityTest() {
		worldpage.chooseDepartureCity("Mexico City");
		worldpage.choosedestinationCity("London");
		flightselpage = worldpage.clickOnFindFlights();
		
	}
	
	@Test(priority=4)
	public void chooseFlightTest() {
		purchaseflightpage = flightselpage.clickOnChooseFlight();
	}
	
	@Test(priority=5)
	public void fillTheFlightFormTest() {
		confirmationpage = purchaseflightpage.fillTheFlightForm("Jones", "London",
				"London", "England", "500082", "123456789123456", "Jones jon");
	}
	
	
	@Test(priority=6)
	public void bookingIDTest() {
		confirmationpage.getID();
	
	}
	
	
	
	
	

	
	
	

}
