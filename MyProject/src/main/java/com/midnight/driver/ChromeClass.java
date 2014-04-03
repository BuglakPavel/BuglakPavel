package com.midnight.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.midnight.browsers.IChrome;
import com.midnight.constants.DriverConstants;
import com.midnight.constants.UrlConstants;

public class ChromeClass implements IChrome{
	
	public WebDriver createCrome()
	{
		System.setProperty(DriverConstants.CROMEDRIVER, DriverConstants.CROMEEXE);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
}
