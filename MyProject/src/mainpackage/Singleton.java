package mainpackage;

import org.openqa.selenium.WebDriver;


public class Singleton {
	
	   private static Singleton instance;
	   private WebDriver driver;
	   
	    public static synchronized Singleton getInstance(String nameBrowser) {
	        if (instance == null) {
	            instance = new Singleton(nameBrowser);
	        }
	        return instance;
	    }
	    
	    public Singleton (String nameBrowser)
	    {
	    	 FactoryClass factory = new FactoryClass();
	    	 
             driver = factory.factoryMethod(nameBrowser);
             
	    }
	    
	    public WebDriver getDriver()
	    {
	    	return driver;
	    }
	    
	    private void removeDriver() {
	    	
	    	 if (instance != null)
	    	 {
	    		 driver.close();
	    	 }
	    	 
   	 } 

}
