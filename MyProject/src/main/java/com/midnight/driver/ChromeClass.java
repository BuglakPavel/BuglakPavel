package com.midnight.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.midnight.browsers.IBrowserDriver;

import com.midnight.constants.DriverConstants;

public class ChromeClass implements IBrowserDriver{
	
	public WebDriver createBrowserDriver()
	{
		System.setProperty(DriverConstants.CROMEDRIVER, DriverConstants.CROMEEXE);
		return new ChromeDriver();
	}
	
}
