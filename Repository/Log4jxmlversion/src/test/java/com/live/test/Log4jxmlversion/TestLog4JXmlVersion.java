package com.live.test.Log4jxmlversion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLog4JXmlVersion {
	
public static Logger logger = LogManager.getLogger("fileAppender");
protected static WebDriver driver;

	public static void main(String[] args) {
	DOMConfigurator.configure("C:\\Automation\\workspace\\eclipseworkspace\\Log4jxmlversion\\src\\main\\resources\\log4j.xml");

	try{
		
	driver = new FirefoxDriver(); 
	logger.info("Brower has been initiated and launched successfully");
	driver.get("http://live,guru99.live");
	logger.info("Web Address has been loaded successfully");
	driver.manage().window().maximize();
	logger.error("Error occurred");
	logger.warn("This is a warning message");
	logger.fatal("This is a fatal example");
	logger.debug("This is debug example");
	
	
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  System.out.println(FileUtils.getTempDirectoryPath());//you don't really need to do this, just a demo of things you can do with FileUtils 
	  try {
	   FileUtils.copyFile(screenshot, new File("//Users//emiliaugwu//Documents//Automation//workspace//eclipseWorkspace//Selenium//log4jxmlversion//LoggerReport//learningScreenshots.png"));
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	  driver.quit();
	 }
	}
	
	}


