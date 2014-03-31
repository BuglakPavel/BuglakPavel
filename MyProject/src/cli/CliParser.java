package cli;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CliParser {
	
	 private static List<ICliOption> cmdLineOptions = new ArrayList<ICliOption>();

	 private static CommandLineParser cmdLineParser = new GnuParser();

	 public static List<ICliOption> getCmdLineOptions() {
	  return cmdLineOptions;
	 }

	 public static void parseCmdLineArgs(String[] args) {
		 System.out.println("INTO CLIPARSER");
	  Options opts = CliParser.customOptsToCmdLineOpts();
	  try {
	   CommandLine cmd = CliParser.getCmdLineParser().parse(opts, args);
	   CliParser.parseCmdLine(cmd);

	  } catch (ParseException ex) {
	   //LOGGER.info(ex.getMessage());
	   HelpFormatter formatter = new HelpFormatter();
	   formatter.setWidth(128);
	   formatter.printHelp(" ", opts);
	  }
	 }

	 public static Options customOptsToCmdLineOpts() {
		 System.out.println("INTO CLIPARSER");
	  Options options = new Options();
	  for (ICliOption opt : getCmdLineOptions()) {
	   options.addOption(opt.getOption());
	  }
	  return options;
	 }

	 public static void parseCmdLine(CommandLine cmd) {
		 System.out.println("INTO CLIPARSER");
		
//	  Logger.info("------------------------------------------------------------------------");
//	  LOGGER.info(" Parsing command line: \"" + cmd.toString() + "\"");
//	  LOGGER.info("------------------------------------------------------------------------");
		 System.out.println("------------------------------------------------------------------------");
		 System.out.println(" Parsing command line: \"" + cmd.toString() + "\"");
		 System.out.println("------------------------------------------------------------------------");
	  for (ICliOption opt : getCmdLineOptions()) {
	   String longName = opt.getOption().getLongOpt();
	  // LOGGER.debug(String.format("   Parsing --%s option", longName));
	   System.out.println(String.format("   Parsing --%s option", longName));
	   if (cmd.hasOption(longName)) {
	    String[] values = cmd.getOptionValues(longName);
	    if (values != null && values.length != 0) {
	     for (String value : values) {
	    //  LOGGER.info(String.format("   %s=%s", longName, value));
	    	 System.out.println(String.format("   %s=%s", longName, value));
	     }
	    }
	    opt.parse(values);
	   } else if (opt.getDefaultValue() != null) {
	    String[] values = opt.getDefaultValue();
	    for (String value : values) {
	     //LOGGER.info(String.format("   %s=%s", longName, value));
	    	System.out.println(String.format("   %s=%s", longName, value));
	    }
	    opt.parse(opt.getDefaultValue());
	   }
	  }
	  //LOGGER.info("------------------------------------------------------------------------");
	  System.out.println("------------------------------------------------------------------------");
	 }

	 public static void setCmdLineParser(CommandLineParser cmdLineParser) {
		 System.out.println("INTO CLIPARSER");
	  CliParser.cmdLineParser = cmdLineParser;
	 }

	 public static CommandLineParser getCmdLineParser() {
		 System.out.println("INTO CLIPARSER");
	  return cmdLineParser;
	 }
	}


