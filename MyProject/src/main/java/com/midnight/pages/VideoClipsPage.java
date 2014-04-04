package com.midnight.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.midnight.constants.UrlConstants;

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
    
   // private WebDriver driver;
    
	public VideoClipsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	
	@Override
	public boolean checkPage() {
	
		if (driver.getCurrentUrl().equals(UrlConstants.VIDEO))
			return true;
		else
			return false;
	
	}
	
	public boolean getTittle() {

		for (WebElement element : descriptionVideos) {

			if (element.getText().equals(description.getText())) {
				
				LOGGER.info("Element is found!");
				return true;
			} else {
				LOGGER.info("Element is not found!");
			}
		}
		LOGGER.info(date.getText());
		return false;
	}

	public boolean getDate() {

		for (WebElement element : dateVideos) {

			String dataMovie = element.getText().substring(0,element.getText().indexOf('|') - 1);

			if (dataMovie.equals(date.getText())) {

				LOGGER.info("Element is found!");
				return true;
			}
		}

		LOGGER.info("Element is not found!");
		return false;
	}
}
