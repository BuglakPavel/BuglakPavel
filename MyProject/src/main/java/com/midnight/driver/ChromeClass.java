package com.midnight.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.midnight.others.Constant;
import com.midnight.workwithbrowsers.IChrome;

public class ChromeClass implements IChrome{
	
	public WebDriver CreateCrome()
	{
		System.setProperty(Constant.CROMEDRIVER, Constant.CROMEEXE);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
}
