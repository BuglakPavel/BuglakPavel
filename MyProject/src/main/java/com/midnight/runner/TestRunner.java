package com.midnight.runner;

import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;
import com.midnight.runner.cli.CliParser;
import com.midnight.runner.cli.options.BrowserTypeOption;
import com.midnight.thread.ShutDownHook;


public class TestRunner {
		
	 public TestRunner(String[] args) {

	  addCommandLineOptions();
	  CliParser.parseCmdLineArgs(args);

	 }

	 public void addCommandLineOptions() {

	  CliParser.getCmdLineOptions().add(new BrowserTypeOption());
	
	 }

		public static void main(String[] args) throws  ParserConfigurationException,
		SAXException, IOException {	
			
			  ShutDownHook shutdownhook = new ShutDownHook();
		      Runtime.getRuntime().addShutdownHook(shutdownhook);
		   	
			TestRunner tr = new TestRunner(args);
			   final TestNG testNG = new TestNG(true);			    
			    Parser parser = new Parser("testNG.xml");
			     List<XmlSuite> suites = null;
				try {
					suites = parser.parseToList();
				} catch (ParserConfigurationException e) {
		
					e.printStackTrace();
				} catch (SAXException e) {
		
					e.printStackTrace();
				} catch (IOException e) {
			
					e.printStackTrace();
				}
			    testNG.setXmlSuites(suites);
			    testNG.run();		
			    System.exit(0);
		}
}
