package com.midnight.runner;

public class BrowserConfig {

 private static String browserType;
 
 public static String getBrowserType() {
  return browserType;
 }

 public static void setBrowserType(String type) {
  BrowserConfig.browserType = type;
 }

}