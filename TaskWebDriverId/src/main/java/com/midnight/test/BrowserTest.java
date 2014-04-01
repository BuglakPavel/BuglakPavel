package com.midnight.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.midnight.driver.InitializationBrowser;
import com.midnight.others.Constant;
import com.midnight.runner.BrowserConfig;

public class BrowserTest {

	@BeforeTest
	public void startBrowser() {

		WebDriver driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(Constant.URL);
	}

	@Test
	public void closeBrowser() {

		InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).removeDriver();

	}

}
