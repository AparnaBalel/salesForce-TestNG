package com.training.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	private WebDriver driver;
	 public WebDriver getDriver() {
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			return driver;
		 
	 }
	 
	 
	 public static void takeScreenShot(WebDriver driver) {
		  
		  TakesScreenshot screenshot = ((TakesScreenshot) driver);
		  File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		  
		  Date CurrentDate = new Date();
		  String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(CurrentDate);
		  String filePath = System.getProperty("user.dir")+File.separator+"Screenshot"+timeStamp+".png";
		  File destFile = new File(filePath);
		  
		  try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 }
}
