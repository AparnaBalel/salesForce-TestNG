 package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class AccountPage extends BasePage {
	public AccountPage (WebDriver driver) {
		super(driver);
	}
    	@FindBy (name="new")
    	         WebElement New;
        public void New() {
    	         waitForElement(New,10);
    	         New.click();
     }
    	@FindBy (name="save")
    	         WebElement save;
        public void Save() {
    	         save.click();
     }
     @FindBy (id="acc2")
 	          WebElement acctname;
     public void AcctName() {
    	      waitForElement(acctname,10);
    	      acctname.sendKeys("United");
     }
     @FindBy (id="acc6")
 	          WebElement type;
     public void Type() {
    	      waitForElement(type,10);
    	      selectByIndex(type,6);
    	      type.click();
     }
     @FindBy (id="00N8Z0000070GuJ")
 	          WebElement priority;
     public void Priority() {
    	      selectByIndex(priority,1);
    	      priority.click();
     }
 	@FindBy (xpath="//a[contains(text(),'Create New View')]")
 	         WebElement newview;
     public void NewView() {
    	     waitForElement(newview,10);
    	     newview.click();
     }
     @FindBy (id="fname")
 	          WebElement viewname;
     public void ViewName() {
    	      waitForElement(viewname,10);
    	      viewname.sendKeys("Hindustan");
     }
 	@FindBy (id="devname")
 	         WebElement uniquename;
     public void UniqueName() {
    	     waitForElement(uniquename,10);
    	     uniquename.sendKeys("india");
     }
     @FindBy (xpath="//a[normalize-space()='Edit']")
 	          WebElement edit;
     public void Edit() {
    	      waitForElement(edit,10);
    	      edit.click();
     }
     public void ViewName2() {
    	 waitForElement(viewname,10);
    	 viewname.sendKeys("USA");
     }
 	@FindBy (id="fcol1")
 	         WebElement field;
     public void Field() {
    	    waitForElement(field,10);
    	    selectByIndex(field,1);
    	    field.click();
     }
     @FindBy (id="fop1")
 	          WebElement operator;
     public void Operator() {
    	      waitForElement(operator,10);
    	      selectByIndex(operator,3);
    	      operator.click();
     }
     @FindBy (id="fval1")
 	          WebElement value;
     public void Value() {
    	      waitForElement(value,10);
    	      value.sendKeys("a");
     }
 	@FindBy (xpath="//a[contains(text(),'Merge Accounts')]")
 	         WebElement merge;
     public void Merge() {
    	     waitForElement(merge,10);
    	     merge.click();
     }
 	@FindBy (id="srch")
 	         WebElement search;
     public void Search() {
    	     waitForElement(search,10);
    	     search.sendKeys("Un");
     }
 	@FindBy (name="srchbutton")
 	         WebElement find;
     public void Find() {
    	     waitForElement(find,10);
    	     find.click();
     }
 	@FindBy (id="cid0")
 	         WebElement one;
     public void OneOption() {
    	     waitForElement(one,15);
    	     one.click();
     }
     @FindBy (id="cid2")
 	          WebElement two;
     public void TwoOption() {
    	      waitForElement(two,15);
    	      two.click();
     }
     @FindBy (xpath="(//input[@title='Next'])[2]")
 	          WebElement next;
     public void Next() {
    	      waitForElement(next,15);
    	      next.click();
     }
 	@FindBy (name="save")
 	         WebElement merge2;
     public void Merge2() {
    	     waitForElement(merge2,10);
    	     merge2.click();
    	     SwitchToAlert();
    	}
     @FindBy (xpath="(//a[normalize-space()='Accounts with last activity > 30 days'])[1]")
 	          WebElement lastactivity;
     public void Activity() {
    	      waitForElement(lastactivity,15);
    	      lastactivity.click();
     }
     @FindBy (xpath="//input[@id='ext-gen20']")
           	  WebElement datefield;
     public void DateField() {
    	      waitForElement(datefield,15);
              datefield.click();
     }
     @FindBy (xpath="//div[contains(text(),'Created Date')]")
   	          WebElement createddate;
     public void CreatedDate() {
    	      waitForElement(createddate,15);
              createddate.click();
     }
     @FindBy (id="ext-gen152")
   	          WebElement FromDate;
     public void FromDate() {
    	 waitForElement(FromDate,10);
    	 FromDate.click();
     }
     @FindBy (id="ext-gen279")
   	          WebElement fromtodaysdate;
     public void FromTodaysDate() {
    	      waitForElement(fromtodaysdate,100);
    	      fromtodaysdate.click();
     }
     @FindBy (id="ext-gen154")
          	  WebElement Todate;
     public void ToDate() {
	      waitForElement(Todate,15);
	      Todate.click();
}
     @FindBy (id="ext-gen302")
    	      WebElement toTodaysdate;
     public void ToTodaysDate() {
	          waitForElement(toTodaysdate,15);
	          toTodaysdate.click();
}
 	@FindBy (id="ext-gen49")
 	         WebElement savereport;
     public void SaveReport() {
    	     waitForElement(savereport,15);
             savereport.click();
     }
     @FindBy (name="reportName")
 	          WebElement reportname;
     public void ReportName() {
    	      waitForElement(reportname,10);
    	      reportname.sendKeys("recent");
     }
 	@FindBy (name="reportDevName")
 	         WebElement nameunique;
     public void NameUnique() {
    	     waitForElement(nameunique,10);
    	     nameunique.sendKeys("event");
     }
 	@FindBy (xpath="//td//table[@id='dlgSaveAndRun']")
 	         WebElement saverun;
     public void SaveRun() {
    	     waitForElement(saverun,25);
    	     saverun.click();
     }
}
