package com.midnight.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.midnight.constants.UrlConstants;
import com.midnight.driver.InitializationBrowser;
import com.midnight.pages.HomePage;
import com.midnight.pages.VideoClipsPage;
import com.midnight.runner.cli.config.BrowserConfig;
import com.midnight.thread.ShutdownHookDemo;
import org.testng.Assert;

public class BrowserTest {

	private WebDriver driver;
	private VideoClipsPage pageVideo;
	private HomePage home;
	
	@BeforeClass
	public void startBrowser() {
		
		driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(UrlConstants.URLHOMEPAGE);
		
		ShutdownHookDemo demo = new ShutdownHookDemo();
		demo.start(driver);
	}

	@Test
	public void checkDate() {

		home = new HomePage(driver);
		pageVideo = home.goToVideoClips();	
		Assert.assertTrue(pageVideo.getDate());
	}	
	
	@Test
	public void checkTittle() {
		
		Assert.assertTrue(pageVideo.getTittle());

	}
	
	@AfterTest
	public void closeBrowser() {

		InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).removeDriver();

	}
}
