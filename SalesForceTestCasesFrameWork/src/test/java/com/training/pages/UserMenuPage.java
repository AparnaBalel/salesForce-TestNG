package com.training.pages;
import com.training.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMenuPage  extends BasePage{
	
	public UserMenuPage(WebDriver driver) {
		super(driver);}
	
	@FindBy(xpath= "//a[contains(text(),'My Profile')]")
	WebElement myprofile;
	
	@FindBy (xpath= "//a[@title='My Settings']")
	WebElement mysetting;
	
	@FindBy (xpath= "//a[contains(text(),'Developer Console')]")
	WebElement devloperconsole;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	
	
	public void MyProfile() {
		waitForElement(myprofile,50);

		myprofile.click();
	}
	
	public void MySettings() {
		mysetting.click();
	}
	public void DeveloperConsole() {
        devloperconsole.click();
		SwitchWindow();
		}
	public void Logout () {
		logout.click();
		}

}
