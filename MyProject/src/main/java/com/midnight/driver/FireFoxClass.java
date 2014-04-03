package com.midnight.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.midnight.browsers.IFireFox;

public class FireFoxClass implements IFireFox {

	public  WebDriver createFireFox()
	{
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
