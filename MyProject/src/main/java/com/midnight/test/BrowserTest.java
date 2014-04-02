package com.midnight.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.midnight.driver.InitializationBrowser;
import com.midnight.others.Constant;
import com.midnight.pages.HomePage;
import com.midnight.pages.VideoClipsPage;
import com.midnight.runner.BrowserConfig;

import org.testng.Assert;


public class BrowserTest {

	@BeforeTest
	public void startBrowser() {

		WebDriver driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(Constant.URL);
	}

	@Test
	public void checkDate() {

		WebDriver driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(Constant.URL);
		
		HomePage home = new HomePage(driver);
		driver = home.goToVideoClips();
		
		VideoClipsPage page = new VideoClipsPage(driver);
		
		Assert.assertEquals(page.getDate(), "Posted: 03/31/2014");
	}
	
	@Test
	public void checkTittle() {

		WebDriver driver = InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).getDriver();
		driver.get(Constant.URL);
		
		HomePage home = new HomePage(driver);
		driver = home.goToVideoClips();
		
		VideoClipsPage page = new VideoClipsPage(driver);
		
		Assert.assertEquals(page.getTittle(), "In honor of \"Robot Chicken,\" Seth Green, Rachel Bloom and Kevin Shinick put an upsetting twist on popular cartoons. (2:00)");
	}
	
	@AfterTest
	public void closeBrowser() {

		InitializationBrowser.getInstance(BrowserConfig.getBrowserType()).removeDriver();

	}

}
