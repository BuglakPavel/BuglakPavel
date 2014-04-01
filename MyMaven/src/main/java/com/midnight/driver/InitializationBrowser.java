package com.midnight.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;



public class InitializationBrowser {
	
	   private static InitializationBrowser instance;
	   private WebDriver driver;
	   public static final Logger LOGGER = Logger.getLogger(InitializationBrowser.class);
	   
	    public static synchronized InitializationBrowser getInstance(String nameBrowser) {
	        if (instance == null) {
	            instance = new InitializationBrowser(nameBrowser);
	            LOGGER.info("instance create");
	        }
	        return instance;
	    }
	    
	    private InitializationBrowser (String nameBrowser)
	    {
	    	 BrowserChoice factory = new BrowserChoice();
	    	 
             driver = factory.factoryMethod(nameBrowser);
             LOGGER.info("driver create");
	    }
	    
	    public WebDriver getDriver()
	    {
	    	return driver;
	    }
	    
	    public void removeDriver() {
	    	
	    	 if (instance != null)
	    	 {
	    		 driver.close();
	    		 LOGGER.info("driver close");
	    	 }
	    	 
   	 } 

}
