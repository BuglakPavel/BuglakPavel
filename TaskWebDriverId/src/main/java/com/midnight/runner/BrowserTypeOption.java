package com.midnight.runner;


import org.apache.commons.cli.Option;


public class BrowserTypeOption implements ICliOption {
	
	 private final String DEFAULT_VALUE =  "";

	
	 public String[] getDefaultValue() {
	  return new String[] { DEFAULT_VALUE };
	 }

	
	 public Option getOption() {
	  return new Option("browser", "browser", true, "Browser type");
	 }

	 
	 public void parse(String[] values) {
	  BrowserConfig.setBrowserType(values[0]);

	 }

}
