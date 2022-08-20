package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	
	
	public String getTitleOfThePage() {
		return driver.getTitle();
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void clickElement(By locator) {
		getElement(locator).click();
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public void selectDropDownValue(By locator, String option) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(option);
	}
	
	
	
	

}
