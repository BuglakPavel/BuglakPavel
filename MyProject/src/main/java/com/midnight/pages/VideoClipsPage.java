package com.midnight.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VideoClipsPage {

	 public static final Logger LOGGER = Logger.getLogger(VideoClipsPage.class);
	   private static String URL_MATCH = "http://www.cc.com/video-clips/yczqh1/-midnight--hashtagwars----ruinacartoon";
	   
	private WebDriver driver;

	public VideoClipsPage(WebDriver driver) {
		if (!driver.getCurrentUrl().contains(URL_MATCH)) {
			throw new IllegalStateException(
					"This is not the page you are expected");
		}

		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	    
	    @FindBy(xpath =  ".//div[@class='air_date']/span")
	    private WebElement date;
	 

	    @FindBy(xpath =  "//div[@class='video_data']/p")

	    private WebElement description;
	    	    
	    
	    public String getTittle() {
	    	
	    	LOGGER.info(description.getText());
	    	return description.getText();
	    }

        public String getDate() {
	    	
	    	LOGGER.info(date.getText());	    	
	    	return date.getText();
	    }
	   
}
