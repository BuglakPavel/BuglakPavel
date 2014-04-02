package com.midnight.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	private static String URL_MATCH = "http://www.cc.com/shows/-midnight";

	@FindBy(xpath =  "//a[@class='video_clips']")
    private WebElement goToUrlVideo;
	 
	public HomePage(WebDriver driver) {
		if (!driver.getCurrentUrl().contains(URL_MATCH)) {
			throw new IllegalStateException(
					"This is not the page you are expected");
		}

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	
	public WebDriver goToVideoClips()
	{
		goToUrlVideo.click();
		return driver;
	}

}
