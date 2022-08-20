package com.qa.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	 WebDriver driver;
	 Properties prop;
	 FileInputStream fis;
	
	public WebDriver initializebrowser(String browserName) {
		
		String brName = prop.getProperty("browserName");
		
		if(brName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(brName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		return driver;
		
	}
	
	
	public Properties initprop() {
		
		prop = new Properties();
		try {
			fis = new FileInputStream("src/test/resources/com/qa/config/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
		
		
	}
	
	

}
