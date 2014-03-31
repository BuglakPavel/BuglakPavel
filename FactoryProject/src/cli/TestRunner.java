package cli;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
	
	 private List<Class> listeners = new ArrayList<Class>();

	 public TestRunner(String[] args) {

	  addCommandLineOptions();
	  CliParser.parseCmdLineArgs(args);

	 }

	 public void addCommandLineOptions() {

	  CliParser.getCmdLineOptions().add(new BrowserTypeOption());
	
	 }

}
