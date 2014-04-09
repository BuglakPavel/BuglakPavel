package com.midnight.constants;

import java.io.File;


public class DriverConstants {
	
	public static final String FIREFOX ="FireFox";
	public static final String CHROME ="Chrome";
	public static final String CROMEEXE = DriverConstants.getPathChrome();
	public static final String CROMEDRIVER ="webdriver.chrome.driver";
	
	public static String getPathChrome()
	{
		File props = new File("test-output//lib//chromedriver.exe");
		
		return props.getAbsolutePath();
	}
	
}
