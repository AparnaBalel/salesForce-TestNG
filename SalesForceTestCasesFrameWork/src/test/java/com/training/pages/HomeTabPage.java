package com.training.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class HomeTabPage extends BasePage{
	public HomeTabPage (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1[@class='currentStatusUserName']")
	        WebElement userprofile;
	public void UserProfile() {
		    waitForElement(userprofile,100);
            userprofile.click();
	}
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
	        WebElement editprofile;
	public void Editprofile() throws InterruptedException {
            waitForElement(editprofile,120);
            Actions(editprofile);
		    editprofile.click();
	}
	@FindBy (xpath= "//iframe[@id='contactInfoContentId']")
	         WebElement contact;
	@FindBy (id= "aboutTab")
	         WebElement about;
	public void AboutTab() {
		     waitForElement(contact,100);
             SwitchToFrame(contact);
		     waitForElement(about,20);
		     about.click();
	}

	@FindBy (xpath = "(//input[@id='lastName'])[1]")
	         WebElement lastname;
	public void LastName() {
		     waitForElement(lastname,20);
		     lastname.clear();
		     lastname.sendKeys("Abcd");
	}
	public void LastName2() {
		     waitForElement(lastname,20);
		     lastname.clear();
		     lastname.sendKeys("Balel");
	}
	@FindBy (xpath="//input[@value='Save All']")
	         WebElement saveall;
	public void SaveAll() {
		     waitForElement(saveall,20);
		     saveall.click();
	}
	@FindBy (xpath ="(//ul[@id='tabBar'])[1]")
             WebElement tabBarbefore ;
	
	public void TabBarBefore() {
		     waitForElement(tabBarbefore,20);
		     String Expected = tabBarbefore.getText();
		     System.out.println("Expected"+ Expected.length());
		     System.out.println(Expected);
	}
	@FindBy (xpath ="(//ul[@id='tabBar'])[1]")
             WebElement tabBarafter ;
	public void TabBarAfter() {
		     waitForElement(tabBarafter,20);
		     String Actual = tabBarafter.getText();
		     System.out.println("Actual"+ Actual.length());
		     System.out.println(Actual);	
	}
	public void TabBarVerify() {
		    System.out.print("#");
	        System.out.println("If Actual length and Expected length is diffrent.\n Test is Pass ");
		}
	@FindBy (name="customize")
	         WebElement customizetab;
	public void CustomizeTab() {
		     waitForElement(customizetab,20);
             customizetab.click();
	}	
	@FindBy (xpath="//select//option[contains(text(),'Libraries')]")
	         WebElement libraries;
	public void Libraries() {
		     waitForElement(libraries,20);
		     libraries.click();
	}
	@FindBy(xpath="//select[@id='duel_select_1']")
	        WebElement selectedtabs;
	public void SelectedTab() {
		    waitForElement(selectedtabs,20);
            selectByIndex(selectedtabs,1);
		    selectedtabs.click();
	}
	@FindBy (xpath="//img[@title='Remove']")
	         WebElement remove;
	public void Remove() {
		     waitForElement(remove,20);
		     remove.click();
	}
	@FindBy (name="save")
	         WebElement save;
	public void Save() {
		     waitForElement(save,20);
		     save.click();
	}
	@FindBy (css="#ptBody > div > div.content > span.pageDescription > a")
	         WebElement datelink;
	public void DateLink() {
		     waitForElement(datelink,100);
		     datelink.click();
    }
	@FindBy (xpath="(//div[@id='p:f:j_id25:j_id61:28:j_id64'])[1]")
	         WebElement eightpm;
	public void EightPm() {
		     waitForElement(eightpm,100);
		     eightpm.click();
    }
	@FindBy (xpath="(//img[@title='Subject Combo (New Window)'])[1]")
	         WebElement subject;
	public void Subject() {
		     waitForElement(subject,20);
		     subject.click();
	}
	@FindBy (xpath="//li[@class='listItem4']//a[1]")
	         WebElement other;
	public void Other() {
		     SwitchToWindowPopUp(other);
	}
	@FindBy (css="#EndDateTime_time")
	         WebElement endtime;
	public void EndTime() {
		     waitForElement(endtime,50);
		     endtime.click();
    }
	@FindBy (css="#timePickerItem_42")
	         WebElement ninepm;
	public void NinePM() {
		     waitForElement(ninepm,10);
		     ninepm.click();
    }
	@FindBy (xpath ="(//input[@title='Save'])[2]")
	          WebElement savenew;
	public void SaveEvent() {
		      waitForElement(savenew,50);
		      savenew.click();
    }
	@FindBy (xpath="(//div[@id='p:f:j_id25:j_id61:20:j_id64'])[1]")
	         WebElement fourpm;
	public void FourPM() {
		     waitForElement(fourpm,10);
		     fourpm.click();
	}
	@FindBy (xpath="(//div[@id='timePickerItem_38'])[1]")
	         WebElement sevenpm;
	public void SevenPM() {
		      waitForElement(sevenpm,10);
		      sevenpm.click();
	}
	@FindBy (id="IsRecurrence")
	         WebElement recurrence;
	
	public void Recurrence() {
		     waitForElement(recurrence,10);
		     recurrence.click();
	}
	@FindBy (id="rectypeftw")
	         WebElement weekly;
	
	public void Weekly() {
		     waitForElement(weekly,10);
		     weekly.click();
	}
	@FindBy (id="RecurrenceEndDateOnly")
	         WebElement recurrenceend;
	
	public void RecurrenceEnd() {
		     waitForElement(recurrenceend,10);
		     recurrenceend.click();
	}
	@FindBy (css="tr[id='calRow4'] td:nth-child(2)")
	         WebElement recurrenceenddate;
	
	public void RecurrenceEndDate() {
		     waitForElement(recurrenceenddate,10);
		     recurrenceenddate.click();
	}
    @FindBy (xpath = "//img[@title='All Tabs']")
             WebElement alltab;
    public void AllTab () {
	         alltab.click();
	}
    @FindBy (id = "tailBreadcrumbNode")
    WebElement profilename;
public void profilename () {
    String Actual = profilename.getText();
    String Expected = "aparna Abcd ";
    assertmethod(Actual,Expected);
}

}
