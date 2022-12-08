package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="userNav")
	WebElement usermenu;
	
	@FindBy (xpath="//a[contains(text(),'Home')]")
    WebElement home;	
	
	@FindBy (xpath="//a[contains(text(),'Opportunities')]")
    WebElement opportunities;	
	
	@FindBy (xpath="//a[contains(text(),'Accounts')]")
    WebElement accounts;	
	
	@FindBy (xpath="//a[contains(text(),'Leads')]")
    WebElement leads;
	
	@FindBy (xpath="//a[contains(text(),'Contacts')]")
    WebElement contacts;
	
	

	@FindBy (id="userNavMenu")
	WebElement usermenuoptions;
	
	public void UserMenu () {
		waitForElement(usermenu,10);
		usermenu.click();
		}
	
	public void UserMenuOptiions () {
		String Actual = usermenuoptions.getText();
		System.out.println("actual"+Actual);
		String Expected="My Profile\n"
				      + "My Settings\n"
				      + "Developer Console\n"
				      + "Switch to Lightning Experience\n"
				      + "Logout";
		System.out.println("expected"+Expected);
	    assertmethod(Actual, Expected);
		
		}
	public void Opportunities () {
		waitForElement(opportunities,10);
		opportunities.click();
		}
	public void Accounts () {
		waitForElement(accounts,10);
        accounts.click();
		}
	public void Leads () {
		waitForElement(leads,10);
        leads.click();
        waitForElement(usermenu,10);
		}
	public void Contacts () {
		waitForElement(contacts,10);
        contacts.click();
		}
	public void Home () {
		waitForElement(home,10);
        home.click();
		}
	@FindBy (xpath = "//img[@title='All Tabs']")
	         WebElement alltab;
	public void AllTab () {
		     alltab.click();
		}
}
