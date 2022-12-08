package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class OpportunitiesPage extends BasePage   {
	
	public OpportunitiesPage(WebDriver driver) {
		super(driver);}
	
	@FindBy (xpath="//select[@id='fcf']")
     WebElement view;
	
	@FindBy (xpath="//a[contains(text(),'Opportunity Pipeline')]")
	WebElement pipeline;
	
	@FindBy (xpath="//a[contains(text(),'Stuck Opportunities')]")
	WebElement stuck;
	
	@FindBy (id="quarter_q")
	WebElement interval;

	@FindBy (xpath="//select//option[contains(text(),'Next FQ')]")
	WebElement nextq;
	
	@FindBy (id ="open")
	WebElement include;
	
	@FindBy (xpath="//select//option[contains(text(),'Open Opportunities')]")
	WebElement open;
	
	
	@FindBy (name ="go")
	WebElement RunReport ;
	
	@FindBy (name ="new")
	WebElement newclick;
	
	@FindBy (id ="opp3")
	WebElement oppname;
	
	@FindBy (id ="opp4")
	WebElement acctname;

	@FindBy (id ="opp9")
	WebElement closedate;
	
	@FindBy (xpath ="//td[@class='weekend'][normalize-space()='2']")
	WebElement date;
	
	@FindBy (id ="opp11")
	WebElement stage;
	
	@FindBy (id ="opp12")
	WebElement probability;
	
	@FindBy (id ="opp6")
	WebElement source;
	
	@FindBy (id ="opp17")
	WebElement campaign;
	
	@FindBy (name ="save")
	WebElement save;
	
	
	
	public void View() {
		waitForElement(view,10);
		 String Actualvalue= view.getText();
		 String Expectedvalue = "All Opportunities\n"
                 + "Closing Next Month\n"
                 + "Closing This Month\n"
                 + "My Opportunities\n"
                 + "New Last Week\n"
                 + "New This Week\n"
                 + "Opportunity Pipeline\n"
                 + "Private\n"
                 + "Recently Viewed Opportunities\n"
                 + "Won";
		 assertmethod(Actualvalue, Expectedvalue);
	}
	
	public void Pipeline() {
		waitForElement(pipeline,10);
		pipeline.click();
	}
	
	public void Stuck() {
		waitForElement(stuck,10);
		stuck.click();
	}
	public void Interval() {
		waitForElement(interval,10);
		interval.click();
	}
	public void NextQ() {
		nextq.click();
	}
	public void Include() {
		include.click();
	}
	public void Open() {
		open.click();
	}
	public void RunReport() {
		RunReport.click();
	}
	
	public void New() {
		waitForElement(newclick,10);
        newclick.click();
	}
	public void OppName() {
		waitForElement(oppname,10);

		oppname.sendKeys("Manual Testing");
	}
	public void AccName() {
		waitForElement(acctname,10);

		acctname.sendKeys("United Oil & Gas Corp");
	}
	public void CloseDate() {
		waitForElement(closedate,10);

		closedate.click();
	}
	public void Date() {
		waitForElement(date,10);
        date.click();
	}
	public void Stage() {
		selectByIndex(stage,2);
        stage.click();
	}
	public void Probability() {
		waitForElement(probability,10);
		probability.clear();
		probability.sendKeys("10");
	}
	public void LeadSource() {
		selectByIndex(source,1);
        source.click();
	}
	public void Campaign() {
		waitForElement(campaign,10);
        campaign.sendKeys("GC Product Webinar - Jan 7, 2002");
	}
	public void Save() {
		save.click();
	}

	
	
}
