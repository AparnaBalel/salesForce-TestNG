package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{

	
	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	
	
	

	

	public void ViewVerify() {
		waitForElement(view,10);
		String Actual = view.getText();
		String Expected = "All Open Leads\n"
                + "My Unread Leads\n"
                + "Recently Viewed Leads\n"
                + "Today's Leads\n"
                + "View - Custom 1\n"
                + "View - Custom 2";
		assertmethod(Actual, Expected);
	
	}
	@FindBy (xpath="//select[@id='fcf']")
            WebElement view;
	public void View() {
		    view.click();
	}
	
	
	public void UnreadLeads() {
		waitForElement(view,10);
		selectByIndex( view, 1 );
	}
	
	public void TodaysLeads() {
		waitForElement(view,10);
		selectByIndex( view, 3);
	}
	@FindBy (name ="go")
             WebElement go;
	public void GoButton() {
		     waitForElement(go,100);
             go.click();
    }
	
	@FindBy (name ="new")
             WebElement newbutton;
	public void NewButton() {
		     waitForElement(newbutton,20);
		     newbutton.click();
	}
	@FindBy (id="name_lastlea2")
             WebElement lastname;
	public void LastName() {
		     waitForElement(lastname,10);
		     lastname.clear();
		     lastname.sendKeys("ABCD");
	}
	@FindBy (id="lea3")
             WebElement companyname;
	public void CompanyName() {
		     companyname.clear();
		     companyname.sendKeys("ABCD");
	}
	@FindBy (name ="save")
             WebElement savebutton;
	public void SaveButton() {
		     savebutton.click();
	}
		
}