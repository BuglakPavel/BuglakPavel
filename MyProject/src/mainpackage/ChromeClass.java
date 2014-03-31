package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeClass implements IChrome{
	
	public WebDriver CreateCrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:/MyProjects/FactoryProject/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
}
