package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxClass implements IFireFox {

	public  WebDriver CreateFireFox()
	{
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
