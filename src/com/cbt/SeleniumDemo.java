package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/surkhaygurbanov/Documents/selenium dependency/drivers/chromedriver" );
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://cybertekschool.com");
	
//================================================================	
	
//	System.setProperty("webdriver.gecko.driver",
//			"/Users/surkhaygurbanov/Documents/selenium dependency/drivers/geckodriver" );
//
//
//WebDriver driver = new FirefoxDriver();
//
//driver.get("http://cybertekschool.com");
	
	}
	
	
}
