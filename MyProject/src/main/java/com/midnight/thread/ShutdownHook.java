package com.midnight.thread;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ShutdownHook extends Thread {
	private static final Logger LOGGER = Logger.getLogger(ShutdownHook.class);
	private WebDriver driver;
	
	public ShutdownHook(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public void run() {
		
		driver.quit();
		LOGGER.info("Shutting down");
		
	}
}
