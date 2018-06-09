package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/surkhaygurbanov/Documents/selenium dependency/drivers/chromedriver" );
	
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://etsy.com");
}
}
