package com.midnight.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.midnight.exception.BrowserException;
import com.midnight.test.BrowserTest;
import com.midnight.exception.*;

public class TestRunner {
	
	 public TestRunner(String[] args) {

	  addCommandLineOptions();
	  CliParser.parseCmdLineArgs(args);

	 }

	 public void addCommandLineOptions() {

	  CliParser.getCmdLineOptions().add(new BrowserTypeOption());
	
	 }

		public static void main(String[] args) throws org.apache.commons.cli.ParseException {		
			
			TestRunner tr = new TestRunner(args);  
		    TestListenerAdapter tla = new TestListenerAdapter();
		    TestNG testng = new TestNG();
			testng.setTestClasses(new Class[] { BrowserTest.class });
			testng.addListener(tla);
			testng.run();
			System.out.println("log - C:/vsprog/LoggingSample");
		}
	 
}
