package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.util.ElementUtil;

public class TravelTheWorldPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By headertitle = By.xpath("//div[@class='container']//h1");
	private By thebeatch_lnk = By.xpath("//div[@class='container']//p/a");
	private By departure_dd = By.xpath("//select[@name='fromPort']");
	private By destination_dd = By.cssSelector("select[name='toPort']");
	private By findflights_btn = By.cssSelector("input.btn.btn-primary");
	
	
	
	public TravelTheWorldPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	
	public String titleOfTheWorldPage() {
		return eleutil.getElement(headertitle).getText();
	}
	
	public void clickOnTheBeatchLink() {
		 eleutil.getElement(thebeatch_lnk).click();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
		
	}
	
	public void navigateToBack() {
		driver.navigate().back();
	}
	
	
	public void chooseDepartureCity(String Option) {
		eleutil.selectDropDownValue(departure_dd, Option);
	}
	
	public void choosedestinationCity(String Option) {
		eleutil.selectDropDownValue(destination_dd, Option);
	}
	
	
	public FlightSelectionPage clickOnFindFlights() {
		eleutil.getElement(findflights_btn).click();
		return new FlightSelectionPage(driver);
	}
	
	
	

}
