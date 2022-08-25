package com.qa.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.ElementUtil;

public class FlightSelectionPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	
	private By chooseFlight = By.xpath("//input[@value='Choose This Flight']");
	private By price = By.xpath("//td[contains(text(),'$')]");
	
	
	public FlightSelectionPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	
	//page actions
	public String getTitleOfPurchasePage() {
		return eleutil.getTitleOfThePage();
	}
	
	
	public void getMinFlightPrice() {
		List<WebElement> list = driver.findElements(price);
		int count = list.size();
		int[] num = new int[count];
		
		
		for(int i=0; i<count; i++) {
			String cost = list.get(i).getText();
			String costinNum = cost.replaceAll("[^0-9]", "");
			int j = Integer.parseInt(costinNum);
			num[i] = j;
		}
	
		Arrays.sort(num);
		int minvalue = num[0];
		double d = minvalue/100;
		int mValue = (int)d;
		String ch = "$";
		String miniValue = ch+mValue;
		System.out.println(miniValue);
		By minprice = By.xpath("//td[contains(text(),'"+miniValue+"')]//preceding-sibling::td/input");
		driver.findElement(minprice).click();
		
	}
	
	
	
	
	
	
	
	public PurchaseFlightPage clickOnChooseFlight() {
		eleutil.clickElement(chooseFlight);
		return new PurchaseFlightPage(driver);
	}
	
	
	
	
	
	

}
