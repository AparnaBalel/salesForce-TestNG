package com.training.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.base.BaseTest;
import com.training.pages.ContactsPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

public class ContactsTest extends BaseTest {
	CommonUtilities common = new CommonUtilities();
	WebDriver driver;
	LoginPage login;
	HomePage home;
	ContactsPage contact;
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
		contact = new ContactsPage (driver);
		}

	@Test
	public void NewContactTC25() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.New();
		contact.LastName();
		contact.AcctName();
		contact.Save();
		
	}
	@Test
	public void NewViewTC26() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.NewView();
		contact.ViewName();
		contact.UniqueName();
		contact.Save();
		}
	@Test
	public void RecentlyCreatedTC27() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.RecentlyCreated();
	}
	@Test
	public void MyContactsTC28() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.View();
		contact.GoButton();
	}
	@Test
	public void ViewContactTC29() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.ContactName();
	}
	@Test
	public void ErrorMessageTC30() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.NewView();
		contact.UniqueName2();
		contact.Save();
		contact.Errormessage();
		}
	@Test
	public void CancelButtonTC31() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.NewView();
		contact.ViewName2();
		contact.UniqueName2();
		contact.Cancel();
		}
	@Test
	public void NewButtonTC32() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Contacts();
		contact.New();
		contact.LastName2();
		contact.AcctName2();
		contact.NewSave();
	
	}
	@AfterMethod
	public void teardown() {
		takeScreenShot(driver);
		driver.close();
	}
}
