package com.BlackCircle;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBlackCirclesWeb {
	
public static WebDriver driver;
private LoginClass loginClass;
private String url = "http://www.blackcircles.com" ;

@Before
public void setUp (){
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to(url);
	loginClass = new LoginClass();
}






















}
