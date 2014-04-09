package com.midnight.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.midnight.exception.VideoClipsPageLoadingException;

public class VideoClipsPage extends MainPage {

	private static final Logger LOGGER = Logger.getLogger(VideoClipsPage.class);

	@FindBy(xpath =  "//div[@class='air_date']/span")
    private WebElement date;
 
    @FindBy(xpath =  "//p[@class='video_info']")
    private List<WebElement> dateVideos;
    
    @FindBy(xpath =  "//div[@class='video_data']/p")
    private WebElement description;
    	 
    @FindBy(xpath =  "//p[@class='video_descr']")
    private List<WebElement> descriptionVideos;
    
	public VideoClipsPage(WebDriver driver) {

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
			throw new VideoClipsPageLoadingException("Error with loading VideoClipsPage!");
		}
		
		LOGGER.info("CURRENT URL :");
		LOGGER.info(driver.getCurrentUrl());
	}
	
	public boolean getTittle() {

		for (WebElement element : descriptionVideos) {

			if (element.getText().equals(description.getText())) {
				
				LOGGER.info("Tittle is found!");
				return true;
			} else {
				LOGGER.info("Tittle is not found!");
			}
		}
		LOGGER.info(date.getText());
		return false;
	}

	public boolean getDate() {

		for (WebElement element : dateVideos) {

			String dataMovie = element.getText().substring(0,element.getText().indexOf('|') - 1);

			if (dataMovie.equals(date.getText())) {

				LOGGER.info("Date is found!");
				return true;
			}
		}

		LOGGER.info("Date is not found!");
		return false;
	}
}
