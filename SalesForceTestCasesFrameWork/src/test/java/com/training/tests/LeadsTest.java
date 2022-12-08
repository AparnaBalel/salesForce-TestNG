package com.training.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;

public class LeadsTest extends BaseTest{
	CommonUtilities common = new CommonUtilities();
	WebDriver driver;
	LoginPage login;
	HomePage home;
	UserMenuPage usermenu;
	LeadsPage leads;
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
		leads = new LeadsPage(driver);
		usermenu = new UserMenuPage (driver);
		}
	@Test
	public void LeadsTabTC20() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Leads();
	}
	@Test
	public void LeadsSelectViewTC21() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Leads();
		leads.ViewVerify();
	}
	@Test
	public void DefaultViewTC22() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Leads();
		leads.View();
		leads.UnreadLeads();
		home.UserMenu();
		usermenu.Logout();
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Leads();
		leads.GoButton();
		
	}
	
	@Test
	public void TodaysLeadsTC23() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Leads();
		leads.TodaysLeads();
		leads.GoButton();
	}
	
	@Test
	public void NewButtonTC24() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Leads();
		leads.NewButton();
		leads.LastName();
		leads.CompanyName();
		leads.SaveButton();
	}
	@AfterMethod
        public void teardown() {
		takeScreenShot(driver);
       driver.close();
	}
}
	

