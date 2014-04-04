package com.midnight.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.midnight.browsers.IBrowserDriver;

public class FireFoxClass implements IBrowserDriver {

	public  WebDriver createBrowserDriver()
	{
		return new FirefoxDriver();

	}
}
