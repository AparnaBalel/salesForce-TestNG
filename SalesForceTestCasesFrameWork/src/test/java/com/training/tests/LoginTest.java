package com.training.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.CommonUtilities;

public class LoginTest  extends BaseTest {
	CommonUtilities common = new CommonUtilities();
	WebDriver driver;
	LoginPage login;
	HomePage home;
  UserMenuPage usermenu;
	
	String url;
	String username;
	String password;
	String username2;
	
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
		
	}
	
	@Test
	public void LoginErrorTC1() {
		login.UserName(username);
		login.LoginButton();
		login.EnterPasswordmessage();
	}
	@Test
	public void LogintoSFDCTC2() {
		login.UserName(username);
		Reporter.log("username");
		login.PassWord(password);
		Reporter.log("password");
		login.LoginButton();
	}
	@Test
	public void CheckRemeberMeTC3() {
		login.UserName(username);
		login.PassWord(password);
		login.RememberMe();
		login.LoginButton();
		home.UserMenu();
		usermenu.Logout();
		login.UserNameVerify();
		}
	
	@Test
	public void ForgotPasswordTC4A() {
		login.ForgotPassword();
		login.UserName2(username);
		login.continueButton();
		login.ResetPasswordText();
	}
	@Test
	public void ForgotPasswordTC4B() {
		login.Wrongusername();
		login.WrongPassword();
		login.LoginButton();
		login.ValidateLogin();
	}
	@AfterTest 
	
	public void teardown() {
		takeScreenShot(driver);
        driver.close();
	}
	}

