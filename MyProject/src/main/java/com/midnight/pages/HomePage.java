package com.midnight.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.midnight.constants.UrlConstants;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath =  "//a[@class='video_clips']")
    private WebElement goToUrlVideo;
	 
	public HomePage(WebDriver driver) {
		if (!driver.getCurrentUrl().contains(UrlConstants.URL)) {
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
