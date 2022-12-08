package com.training.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.HomeTabPage;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;

public class RandomScenariosTest extends BaseTest {
	
	CommonUtilities common = new CommonUtilities();
	WebDriver driver;
	LoginPage login;
	HomePage home;
	HomeTabPage hometab;
	UserMenuPage usermenu;
	
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
		hometab = new HomeTabPage(driver);
		}
	@Test
	public void VerifyNamesTC33() {
		login.UserName(username);
		login.PassWord(password);
		login.RememberMe();
		login.LoginButton();
	    home.Home();
	    hometab.UserProfile();
	   }
	@Test
	public void EditProfielTC34() throws InterruptedException  {
		login.UserName(username);
		login.PassWord(password);
		login.RememberMe();
		login.LoginButton();
	    home.Home();
	    hometab.UserProfile();
	    hometab.Editprofile();
	    hometab.AboutTab();
	    hometab.LastName();
	    hometab.SaveAll();
	    hometab.profilename();
	   }

	@Test
	public void VerifyTabTC35()  {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		hometab.TabBarBefore();
		home.AllTab();
		hometab.CustomizeTab();
		hometab.SelectedTab();
		hometab.Remove();
		hometab.Save();
		home.UserMenu();
		usermenu.Logout();
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		hometab.TabBarAfter();
		hometab.TabBarVerify();
	}

	@Test
	public void BlockingEventTC36()  {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Home();
		hometab.DateLink();
		System.out.println("I am done checking date");
		hometab.EightPm();
		hometab.EndTime();
		hometab.NinePM();
		hometab.Subject();
		System.out.println("I am done checking Subject");
		hometab.Other();
		hometab.SaveEvent();
		}
	@Test
	public void WeeklyRecurranceTC37()  {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Home();
		hometab.DateLink();
		System.out.println("I am done checking date");
		hometab.FourPM();
		hometab.EndTime();
		hometab.SevenPM();
		hometab.Recurrence();
		hometab.Weekly();
		hometab.RecurrenceEnd();
		hometab.RecurrenceEndDate();
		hometab.Subject();
		hometab.Other();
		hometab.SaveEvent();
	}
	@AfterMethod
	public void teardown() {
		takeScreenShot(driver);
        driver.close();
	}
}
