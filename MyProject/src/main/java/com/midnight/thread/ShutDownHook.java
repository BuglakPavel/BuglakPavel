package com.midnight.thread;

import org.apache.log4j.Logger;
import com.midnight.driver.InitializationBrowser;

public class ShutDownHook extends Thread {
	private static final Logger LOGGER = Logger.getLogger(ShutDownHook.class);

		 public void run() {
			 LOGGER.info("ShutDownHook");
			 InitializationBrowser.removeDriver();
		    }

}
