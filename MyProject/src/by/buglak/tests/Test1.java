package by.buglak.tests;

import mainpackage.Constant;
import mainpackage.Singleton;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test1 {

	@Test
	public void test1(){

		WebDriver driver = Singleton.getInstance(Constant.FireFox).getDriver();
		driver.get("http://www.cc.com/shows/-midnight");
		
	}
}
