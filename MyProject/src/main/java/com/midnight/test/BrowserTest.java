package com.midnight.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.midnight.constants.UrlConstants;
import com.midnight.driver.InitializationBrowser;
import com.midnight.pages.HomePage;
import com.midnight.pages.VideoClipsPage;
import com.midnight.runner.BrowserConfig;

import org.testng.Assert;


public class BrowserTest {

	private WebDriver driver;
	private VideoClipsPage pageVideo;
	private HomePage home;
	
	@BeforeClass
	public void startBrowser() {
		
		driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(UrlConstants.URL);
		
	}

	@Test
	public void checkDate() {

		home = new HomePage(driver);
		pageVideo = home.goToVideoClips();	
		Assert.assertEquals(pageVideo.getDate(), true);
		
	}
	
	@Test
	public void checkTittle() {
		
		Assert.assertEquals(pageVideo.getTittle(), true);
		
	}
	
	@Test
	public void checkUrlHome() {
		
		Assert.assertEquals(home.checkPage(), true);

	}
	
	@Test
	public void checkUrlPageVideo() {
				
		Assert.assertEquals(pageVideo.checkPage(), true);
		
	}
	
	@AfterTest
	public void closeBrowser() {

		InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).removeDriver();

	}

}
