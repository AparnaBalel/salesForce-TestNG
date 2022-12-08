package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class ContactsPage extends BasePage{

	public ContactsPage (WebDriver driver) {
		super(driver);
	}

	@FindBy (name="new")
	WebElement newbutton;
	
	@FindBy (id="name_lastcon2")
	WebElement lastname;

	@FindBy (id="con4")
	WebElement acctname;
	
	@FindBy (name="save_new")
	WebElement newsave;
	
	@FindBy (name="save")
	WebElement save;
	
	@FindBy (name="cancel")
	WebElement cancel;
	
	 @FindBy (xpath ="//a[contains(text(),'Create New View')]")
	WebElement newview;
	 
	 @FindBy(id="fname")
		WebElement viewname;
	 
	 @FindBy(id="devname")
		WebElement uniquename;
	
	 @FindBy(xpath="//select[@id='hotlist_mode']")
		WebElement recentlycreated;
	 
	 @FindBy(xpath ="(//select[@id='fcf'])[1]")
	 WebElement view;
	 
	 @FindBy(xpath="//input[@title='Go!']")
		WebElement gobutton;
	 
	 @FindBy(xpath ="(//a[contains(text(),'Indian')])[1]")
	 WebElement contactname;
	 
	 
	public void New () {
		waitForElement(newbutton,10);
		newbutton.click();
	}
	public void LastName () {
		waitForElement(lastname,10);
		lastname.sendKeys("joshi");
	}
	
	public void LastName2() {
		waitForElement(lastname,10);
		lastname.sendKeys("Indian");
	}
	public void AcctName () {
		waitForElement(acctname,10);
		acctname.sendKeys("United Oil & Gas");
	}
	
	public void AcctName2() {
		waitForElement(acctname,10);
		acctname.sendKeys("Global Media");
	}
	public void Save () {
		save.click();
	}
	
	public void NewSave() {
		newsave.click();
	}
	public void Cancel() {
		cancel.click();
	}
	public void NewView () {
		waitForElement(newview,10);
        newview.click();
	}
	public void ViewName () {
		waitForElement(viewname,10);
        viewname.sendKeys("Shannon");
	}
	public void UniqueName () {
		waitForElement(uniquename,10);
        uniquename.sendKeys("nature");
	}
	public void RecentlyCreated() {
		waitForElement(recentlycreated,10);
		selectByIndex(recentlycreated,0);
		recentlycreated.click();
	}
	public void View() {
		waitForElement(view,20);
        selectByIndex(view,3);
		waitForElement(view,20);
        view.click();
	}
	
	public void GoButton () {
		waitForElement(gobutton,50);
		gobutton.click();
	}
	public void ContactName () {
		waitForElement(contactname,10);
		contactname.click();
	}
	public void UniqueName2 () {
		waitForElement(uniquename,10);
        uniquename.sendKeys("EFGH");
	}
	public void ViewName2 () {
		waitForElement(viewname,10);
        viewname.sendKeys("ABCD");
	}
	 @FindBy (xpath ="(//div[@class='errorMsg'])[1]")
		WebElement errormessage;
	 public void Errormessage () {
			waitForElement(viewname,10);
			 String Actualvalue= errormessage.getText();
			 String Expectedvalue ="Error: You must enter a value";
			 assertmethod(Actualvalue,Expectedvalue);		
	       
		}
}
