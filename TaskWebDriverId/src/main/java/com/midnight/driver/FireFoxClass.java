package com.midnight.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.midnight.workwithbrowsers.IFireFox;

public class FireFoxClass implements IFireFox {

	public  WebDriver CreateFireFox()
	{
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
