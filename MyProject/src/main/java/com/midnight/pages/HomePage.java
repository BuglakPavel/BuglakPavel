package com.midnight.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.midnight.exception.HomePageLoadingException;


public class HomePage extends MainPage {

	private static final Logger LOGGER = Logger.getLogger(HomePage.class);
	
	@FindBy(xpath =  "//a[@class='video_clips']")
    private WebElement goToUrlVideo;

	public HomePage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
		checkPage();
		
	}
	
	@Override
	public void checkPage() {
		
		try {

			WebDriverWait wait = new WebDriverWait(driver, 8);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content_holder")));
		} catch (TimeoutException e) {
			throw new HomePageLoadingException("Error with loading HomePage!");
		}
		
		LOGGER.info("Test:");
		LOGGER.info("Current url :");
		
	}
	
	
	public VideoClipsPage goToVideoClips()
	{
		
		goToUrlVideo.click();
		return new VideoClipsPage(driver);
	}

   
}
