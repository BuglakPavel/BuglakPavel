package com.midnight.thread;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ShutdownHookDemo {
	private static final Logger LOGGER = Logger.getLogger(ShutdownHookDemo.class);
	public void start(WebDriver driver) {
		
		LOGGER.info("Demo");
		ShutdownHook shutdownHook = new ShutdownHook(driver);
		Runtime.getRuntime().addShutdownHook(shutdownHook);
	}
}
