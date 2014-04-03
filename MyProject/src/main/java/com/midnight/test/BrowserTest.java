package com.midnight.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.midnight.constants.DriverConstants;
import com.midnight.constants.UrlConstants;
import com.midnight.driver.InitializationBrowser;
import com.midnight.pages.HomePage;
import com.midnight.pages.VideoClipsPage;
import com.midnight.runner.BrowserConfig;

import org.testng.Assert;


public class BrowserTest {

	@BeforeTest
	public void startBrowser() {

		WebDriver driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(UrlConstants.URL);
	}

	@Test
	public void checkDate() {

		WebDriver driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(UrlConstants.URL);
		
		HomePage home = new HomePage(driver);
		driver = home.goToVideoClips();
		
		VideoClipsPage page = new VideoClipsPage(driver);
		
		Assert.assertEquals(page.getDate(), DriverConstants.DATE);
	}
	
	@Test
	public void checkTittle() {

		WebDriver driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(UrlConstants.URL);
		
		HomePage home = new HomePage(driver);
		driver = home.goToVideoClips();
		
		VideoClipsPage page = new VideoClipsPage(driver);
		
		Assert.assertEquals(page.getTittle(), DriverConstants.TITTLE);
	}
	
	@AfterTest
	public void closeBrowser() {

		InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).removeDriver();

	}

}
