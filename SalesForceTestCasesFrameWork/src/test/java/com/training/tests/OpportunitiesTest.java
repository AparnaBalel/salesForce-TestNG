package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunitiesPage;
import com.training.utilities.CommonUtilities;

public class OpportunitiesTest extends BaseTest {
	CommonUtilities common = new CommonUtilities();
	WebDriver driver;
	LoginPage login;
	HomePage home;
	OpportunitiesPage opportunities;
	
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
	opportunities = new OpportunitiesPage(driver);
	}
	@Test
	public void OpportunitiesDropDownTC15() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Opportunities();
		opportunities.View();
	}
	
	@Test
	public void CreateNewOptyTC16() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Opportunities();
		opportunities.New();	
		opportunities.OppName();
		opportunities.AccName();
		opportunities.CloseDate();
		opportunities.Stage();
		opportunities.Probability();
		opportunities.LeadSource();
		opportunities.Campaign();
		opportunities.Save();
	}
	@Test
	public void OpportunityPipelineTC17() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Opportunities();
		opportunities.Pipeline();
		
		
	}
	@Test
	public void StuckOpportunityTC18() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Opportunities();
		opportunities.Stuck();
		
		
	}
	@Test
	public void  QuarterlySummaryReportTC19() {
		login.UserName(username);
		login.PassWord(password);
		login.LoginButton();
		home.Opportunities();
		opportunities.Interval();
		opportunities.NextQ();
		opportunities.Open();
		opportunities.RunReport();
		
	}
	@AfterMethod
	public void teardown() {
		takeScreenShot(driver);
		driver.close();
	}
}

