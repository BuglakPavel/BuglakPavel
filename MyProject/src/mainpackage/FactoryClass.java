package mainpackage;

import org.openqa.selenium.WebDriver;

public class FactoryClass {

	public WebDriver factoryMethod(String nameBrowser) {

		WebDriver driver = null;

		TypeBrowser request = TypeBrowser.getType(nameBrowser);

		switch (request) {
		
		case SCENARIO_ONE:

			FireFoxClass varFireFox = new FireFoxClass();
			driver = varFireFox.CreateFireFox();
			return driver;

		case SCENARIO_TWO:
			ChromeClass varChrome = new ChromeClass();
			driver = varChrome.CreateCrome();
			return driver;
		}

		return driver;
	}

}
