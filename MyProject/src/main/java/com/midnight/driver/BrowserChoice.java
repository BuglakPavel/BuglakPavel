package com.midnight.driver;

import org.openqa.selenium.WebDriver;

import com.midnight.browsers.TypeBrowser;
import com.midnight.exception.BrowserException;

public class BrowserChoice {

	public WebDriver factoryMethod(String nameBrowser) {

		WebDriver driver = null;

		TypeBrowser request = TypeBrowser.getType(nameBrowser);
				
			switch (request) {

			case ChoiceFireFox:

				FireFoxClass FireFox = new FireFoxClass();
				driver = FireFox.createFireFox();
				return driver;

			case ChoiceChrome:

				ChromeClass Chrome = new ChromeClass();
				driver = Chrome.createCrome();
				return driver;

				default: throw new BrowserException("Such browser doesn't exist!");
			}
		

	}

}
