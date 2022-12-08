package com.training.base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    protected  WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void waitForElement(WebElement element,int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
}
	
	public void SwitchWindow() {
		String parentwindow = driver.getWindowHandle();
    	System.out.println(driver.getWindowHandles());
    for(String handle:driver.getWindowHandles()) {
    	driver.switchTo().window(handle).close();
    	
       // driver.switchTo().window(parentwindow);
          }}
	
	public static void selectByIndex(WebElement obj, int index) {
		  if(obj.isDisplayed()) {
		   Select selObj=new Select(obj);
		  selObj.selectByIndex(index);}
	}
	public  void SwitchToAlert() {
		driver.switchTo().alert().accept();
	}
	public  void SwitchToFrame(WebElement element) {
        waitForElement(element,100);
        driver.switchTo().frame(element);
	}
	public  void SwitchToWindowPopUp(WebElement element) {
		Set<String> handles = driver.getWindowHandles();
		if (handles.size() == 2) {
	        Iterator<String> itr = handles.iterator(); 

	        String parent_window = itr.next().toString();
	        String child_window = itr.next().toString();
	        
	        System.out.println(parent_window);
	        System.out.println(child_window);
	        driver.switchTo().window(child_window);
	        waitForElement(element,100);
	        element.click();
	        driver.switchTo().window(parent_window);
		}
		}
		public  void Actions(WebElement element) throws InterruptedException {
		    Actions action = new Actions(driver);
		    action.moveToElement(element).build().perform();
		    Thread.sleep(5000);
		    element.click();
		    }
	
	public void assertmethod(String Actual,String Expected) {
		
		Assert.assertEquals(Actual, Expected);
		   System.out.println("Actual Length - "+ Actual.length());
		   System.out.println("Expected Length - "+ Expected.length());

		if (Expected.equals(Actual))  {
			System.out.println("Test is Pass");
		}
		else {
			System.out.println("Test is Fail");

		}
		
	}
	public void Selectmethod(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
}