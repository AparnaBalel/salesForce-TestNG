package com.training.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.training.base.BasePage;

public class MySettingsPage extends BasePage {
	
	public MySettingsPage(WebDriver driver) {
		super(driver);}
	
	@FindBy (xpath="//span[@id='PersonalInfo_font']")
		WebElement personal;
	public void Personal () {
		waitForElement(personal, 20);
		personal.click();
	}
	@FindBy (id="LoginHistory_font")
		WebElement loginhistory;
	@FindBy (xpath="//a[contains(text(),'Download login history for last six months, includ')]")
        WebElement downloadhistory;
	
    public void LoginHistory() {
		waitForElement(loginhistory, 20);
        loginhistory.click();
	   waitForElement(loginhistory, 20);
        downloadhistory.click();
	}
	
	@FindBy (id="DisplayAndLayout_font")
	     WebElement displaylayout;
    @FindBy (id="CustomizeTabs_font")
	     WebElement customizetab;
    @FindBy (id="p4")
         WebElement  customapp;
    @FindBy (xpath="//select//option[contains(text(),'Salesforce Chatter')]")
	     WebElement salesforcechatter;
	public void DisplayAndLayout() {
		waitForElement( displaylayout, 10);
		 displaylayout.click();
	    customizetab.click();
	    customapp.click();
	    salesforcechatter.click();
	}
	

   
	
	
   @FindBy (xpath="//option[@value='report']")
	   WebElement report;
   @FindBy (xpath="//img[@class='rightArrowIcon']")
	WebElement add;
   public void Report() {
		report.click();
		add.click();
		save.click();
        }
	
      @FindBy (name="save")
		WebElement save;
	
	
	@FindBy (id="EmailSetup_font")
	    WebElement email;
    @FindBy (id="EmailSettings_font")
	    WebElement emailsetting;
    @FindBy (id="sender_name")
        WebElement sendername;
    @FindBy (id="sender_email")
    WebElement senderemail;
    @FindBy (id="auto_bcc1")
    WebElement automaticbcc;
    @FindBy (id="signature")
	WebElement signature;

	 public void Email() {
		email.click();
	    emailsetting.click();
	    sendername.clear();
        sendername.sendKeys("Aparna Balel");
	    senderemail.clear();
		senderemail.sendKeys("aparnabalel@gmail.com");
	    automaticbcc.click();
	    save.click();
	    SwitchToAlert();
	}
	
	@FindBy (id="CalendarAndReminders_font")
	    WebElement calendarreminder;
	 @FindBy (id="Reminders_font")
	    WebElement activityreminder;
	 @FindBy (id="testbtn")
	    WebElement testreminder;
	public void CalendarReminders() {
		calendarreminder.click();
		activityreminder.click();
		testreminder.click();}

		
	@FindBy(xpath="(//img[@title='Edit Profile'])[1]")
	    WebElement edittab;
	  
	@FindBy (xpath="//iframe[@id='contactInfoContentId']")
		    WebElement contact;
	@FindBy (id= "aboutTab")
    WebElement about;
	@FindBy (xpath = "(//input[@id='lastName'])[1]")
    WebElement lastname;
	@FindBy (xpath="//input[@value='Save All']")
	WebElement saveall;
	public void EditTab() throws InterruptedException {
        waitForElement(edittab,200);
		edittab.click();
        SwitchToFrame(contact);
		waitForElement(about,100);
		about.click();
		waitForElement(lastname,120);
		lastname.clear();
		lastname.sendKeys("Balel");
		saveall.click();
	}
	
	@FindBy (xpath="(//span[normalize-space()='Post'])[1]")
	     WebElement post;
	@FindBy (xpath="//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
         WebElement postiframe;

	@FindBy (xpath="/html[1]/body[1]")
	    WebElement text;
	@FindBy (xpath="(//input[@id='publishersharebutton'])[1]")
    WebElement share;
	
	public void Post() {
		waitForElement(post,200);
		post.click();
	    waitForElement(postiframe,200);
        SwitchToFrame(postiframe);
	   // SwitchToFrame(postiframe);
		waitForElement(text,200);
		text.click();
		text.sendKeys("Hello All");
		driver.switchTo().defaultContent();
		share.click();
      }
	
	
	
	@FindBy (xpath="//span[normalize-space()='File']")
	    WebElement file;
	
	@FindBy (xpath="//a[@id='chatterUploadFileAction']")
	    WebElement uploadfile;
	@FindBy (xpath="//input[@id='chatterFile']")
        WebElement choosefile;
	
	public void File() {
		waitForElement(file,200);
        file.click();
		waitForElement(uploadfile,100);
        uploadfile.click();
	    waitForElement(choosefile,100);
        choosefile.sendKeys("C:\\Users\\aparna\\SettingFile\\hawaii.jpg");
		share.click();}
	
	@FindBy (xpath= "(//span[@class='profileImage chatter-avatarFull chatter-avatar'])[1])")
	    WebElement uploadphoto;
	@FindBy (xpath="(//div[@class='photoUploadSection'])[1]")
        WebElement addphoto;
	
	@FindBy (xpath="//iframe[@id='uploadPhotoContentId']")
    WebElement photoiframe;
	
	@FindBy (xpath="(//input[@id='j_id0:uploadFileForm:uploadInputFile'])[1]")
    WebElement choosephotofile;
	@FindBy (xpath="(//input[@id='j_id0:uploadFileForm:save'])[1]")
    WebElement SaveFrame;
	@FindBy (xpath="//div[@class='imgCrop_selArea']//div[@class='imgCrop_clickArea']")
    WebElement cropphoto;
	public void UploadPhoto() throws InterruptedException {
         Thread.sleep(5000);
         Actions(addphoto);
		addphoto.click();
		waitForElement(photoiframe,100);
        SwitchToFrame(photoiframe);
        choosephotofile.sendKeys("C:\\Users\\aparna\\SettingFile\\hawaii.jpg");
        SaveFrame.click();
       
	}
    public void CropPhoto(WebElement element) throws AWTException {
    	Actions action = new Actions(driver);
	    action.moveToElement(element).build().perform();
	    Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(224, 224);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

	}
