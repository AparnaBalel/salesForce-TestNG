package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.AccountPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

public class AccountTest extends BaseTest{
	
	CommonUtilities common = new CommonUtilities();
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
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
		account = new AccountPage(driver);
		}
	@Test
	public void NewAccountTC10() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Accounts();
		account.New();
		account.AcctName();
		account.Type();
		account.Priority();
		account.Save();
	}
	@Test
	public void NewViewTC11() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Accounts();
		account.NewView();
		account.ViewName();
		account.UniqueName();
		account.Save();
	}
	@Test
	public void EditViewTC12() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Accounts();
		account.Edit();
		account.ViewName2();
		account.Field();
		account.Operator();
		account.Value();
		account.Save();
	}
	@Test
	public void MergeAccountTC13() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Accounts();
		account.Merge();
		account.Search();
		account.Find();
		account.Next();
		account.Merge2();
		}
	@Test
	public void CreatAccountTC14() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Accounts();
		account.Activity();
		account.FromDate();
		account.FromTodaysDate();
		account.ToDate();
		account.ToTodaysDate();
		account.DateField();
		account.CreatedDate();
		account.SaveReport();
		account.ReportName();
		account.NameUnique();
		account.SaveRun();
	}
	@AfterMethod
	public void teardown() {
		takeScreenShot(driver);

		driver.close();
	}
}
