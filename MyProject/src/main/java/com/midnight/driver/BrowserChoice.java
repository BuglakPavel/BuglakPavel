package com.midnight.driver;

import org.openqa.selenium.WebDriver;

import com.midnight.exception.BrowserException;
import com.midnight.workwithbrowsers.TypeBrowser;

public class BrowserChoice {

	public WebDriver factoryMethod(String nameBrowser) {

		WebDriver driver = null;

		TypeBrowser request = TypeBrowser.getType(nameBrowser);
		try {
			switch (request) {

			case ChoiceFireFox:

				FireFoxClass varFireFox = new FireFoxClass();
				driver = varFireFox.CreateFireFox();
				return driver;

			case ChoiceChrome:

				ChromeClass varChrome = new ChromeClass();
				driver = varChrome.CreateCrome();
				return driver;

			}
		} catch (NullPointerException e) {
			throw new BrowserException("Such browser doesn't exist!");
		}

		return driver;

	}

}
