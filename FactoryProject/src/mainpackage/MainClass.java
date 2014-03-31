package mainpackage;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import by.buglak.tests.Test1;
import cli.BrowserTypeOption;
import cli.CliParser;
import cli.TestRunner;


public class MainClass {
	
	 private List<Class> listeners = new ArrayList<Class>();

	 public MainClass(String[] args) {

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
		testng.setTestClasses(new Class[] { Test1.class });
		testng.addListener(tla);
		testng.run();
		
	}
}
