package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class ConfirmationPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By id = By.xpath("(//table[@class='table']//tbody/tr//td)[2]");
	
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	
	public void getID() {
		 System.out.println(eleutil.getText(id));
	}
	
	
	

}
