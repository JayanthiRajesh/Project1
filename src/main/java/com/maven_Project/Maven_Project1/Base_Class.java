package com.maven_Project.Maven_Project1;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\jayan\\eclipse-workspace\\Selenium_Exe\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		return driver;
		
	}
		public static void getUrl(String url) {
	
		driver.get(url);
	
		
		}

		public static void maxi()
		{
			driver.manage().window().maximize();
		}
		
		public static void click(WebElement element) {
			
			element.click();
		}
		
		public static void sendKeys(WebElement element,String input)
		{
			
			element.sendKeys(input);
		}
		
		
		
		public static void dropDown(String type, WebElement element,String value)
		{
			Select s= new Select(element);
			
		if(type.equalsIgnoreCase("byvalue")) {
			
			s.selectByValue(value);
			
		}
		else if(type.equalsIgnoreCase("byindex")){
			int index=Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if(type.equalsIgnoreCase("byvisibletext"))
		{
			
			s.selectByVisibleText(value);
		}
		}
		
		
			public static  void clear(WebElement clr) {
			clr.clear();

		}
		
		public static void takeScreenshot() throws IOException {

			TakesScreenshot ss= (TakesScreenshot)driver;
			File source = ss.getScreenshotAs(OutputType.FILE);
			File des= new File("C:\\Users\\jayan\\eclipse-workspace\\Selenium_Exe\\screenshot//ss.png");
			FileUtils.copyFile(source, des);
		}
	}


