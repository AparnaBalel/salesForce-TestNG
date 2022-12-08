package com.training.tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.HomeTabPage;
import com.training.pages.LoginPage;
import com.training.pages.MySettingsPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;

public class HomeTest extends BaseTest {
	CommonUtilities common = new CommonUtilities();
	WebDriver driver;
	LoginPage login;
	HomePage home;
	HomeTabPage hometab;
	UserMenuPage usermenu;
	MySettingsPage mysetting;
	String url;
	String username;
	String password;
	
	@BeforeMethod
	public void Method () throws IOException {
		driver = getDriver();
		url = common.getproperty("url");
		username = common.getproperty("username");
		password = common.getproperty("password");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage (driver);
		usermenu = new UserMenuPage (driver);
		mysetting = new MySettingsPage (driver);
		hometab = new HomeTabPage (driver);
	}
	@Test
	public void UserMenuDropDownTC05 () {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.UserMenu();
		home.UserMenuOptiions();
		}
	
	@Test
   public void MyProfileTC06() throws AWTException, InterruptedException {
	   login.UserName(username);
	   login.PassWord(password);
	   login.LoginButton();
	   home.UserMenu();
       usermenu.MyProfile();
       mysetting.EditTab();
       System.out.println("edit tab click");
       mysetting.Post();
       mysetting.File();
       mysetting.UploadPhoto();
	   }
   
   @Test
	public void MySettingTC07() {
		   login.UserName(username);
			login.PassWord(password);
			login.LoginButton();
			home.UserMenu();
			usermenu.MySettings();
			mysetting.Personal();
			mysetting.LoginHistory();
			mysetting.DisplayAndLayout();
			mysetting.Report();
			mysetting.Email();
			mysetting.CalendarReminders();
			
	   }
	@Test
	public void DevlopersConsoleTC08() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.UserMenu();
		usermenu.DeveloperConsole();
		}
	@Test
	public void LogOutOptionTC09() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.UserMenu();
		usermenu.Logout();
	}
	
	
	
	
	//@AfterMethod
		public void teardown() {
		takeScreenShot(driver);
	}
	
	
	
	

}
