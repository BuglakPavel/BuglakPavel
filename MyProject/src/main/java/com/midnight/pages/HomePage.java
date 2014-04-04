package com.midnight.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.midnight.constants.UrlConstants;


public class HomePage extends MainPage {

	@FindBy(xpath =  "//a[@class='video_clips']")
    private WebElement goToUrlVideo;
	
	
	@Override
	public boolean checkPage() {
		
		if (driver.getCurrentUrl().equals(UrlConstants.URL))
			return true;
		else
			return false;

	}

	public HomePage(WebDriver driver) {
		if (!driver.getCurrentUrl().contains(UrlConstants.URL)) {
			throw new IllegalStateException(
					"This is not the page you are expected");
		}

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public VideoClipsPage goToVideoClips()
	{
		goToUrlVideo.click();
		return new VideoClipsPage(driver);
	}

   
}
