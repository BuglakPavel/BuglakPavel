package com.midnight.driver;

import org.openqa.selenium.WebDriver;

import com.midnight.browsers.TypeBrowser;
import com.midnight.exception.BrowserException;

public class BrowserChoice {

	public WebDriver factoryMethod(String nameBrowser) {

		TypeBrowser request = TypeBrowser.getType(nameBrowser);
				
		switch (request) {

		case ChoiceFireFox:

			return new FireFoxClass().createBrowserDriver();

		case ChoiceChrome:

			return new ChromeClass().createBrowserDriver();

		default:
			throw new BrowserException("Such browser doesn't exist!");
		}

	}

}
