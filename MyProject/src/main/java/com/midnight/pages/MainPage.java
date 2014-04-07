package com.midnight.pages;

import org.openqa.selenium.WebDriver;

public abstract class MainPage {
	
	protected WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public abstract void checkPage();
	
}
