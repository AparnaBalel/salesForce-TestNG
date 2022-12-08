package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.base.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="username")
	       WebElement username;
	public void UserName (String strusername){
		waitForElement(username,10);
		   username.sendKeys(strusername);   }
	

	@FindBy(id="password")
	        WebElement password;
	public void PassWord(String strpassword) {
		    password.sendKeys(strpassword);  }
	
	
	@FindBy(id= "Login")
	        WebElement loginbutton;
	public void LoginButton() {
		    loginbutton.click();  }
		
	@FindBy(id="rememberUn")
	        WebElement rememberme;
	public void RememberMe() {
		    rememberme.click();
		    waitForElement(rememberme,10);  }
	
	@FindBy(id="forgot_password_link")
	        WebElement forgotpassword;
	public void ForgotPassword() {
		    forgotpassword.click();  }
	
	@FindBy (id="continue")
	         WebElement continuebutton;
	public void continueButton() {
		     continuebutton.click();  }
	
	@FindBy(id="un")
	       WebElement username2;
	public void UserName2(String strusername2) {
		   username2.sendKeys(strusername2);  }
	
	@FindBy(id="username")
	        WebElement wrongusername;
	public void Wrongusername() {
		    waitForElement(wrongusername,20);
		    wrongusername.sendKeys("123");   }
 
	@FindBy(id="password")
	       WebElement wrongpassword;
	public void WrongPassword() {
		   wrongpassword.sendKeys("22131");   }
	
	
	@FindBy (id="error")
	        WebElement passworderror;
	public void EnterPasswordmessage() {
		    waitForElement(passworderror,20);
		    String Actual = passworderror.getText();
		    System.out.println(Actual);
		    String Expected = "Please enter your password.";
		    System.out.println(Expected);
		    assertmethod(Actual, Expected);   } 
		
	
	@FindBy (id="content")
	        WebElement resetpassword;
	public String ResetPasswordText () {
		   waitForElement(resetpassword,20);
		   String resettext = resetpassword.getText();
		   System.out.println("Password Reset Message!");
		   System.out.println(resettext);
		   return resettext;}
		
	
	@FindBy (id="error")
	        WebElement invalidlogin;
	public void ValidateLogin() {
		    waitForElement(invalidlogin,50);
            String Actual =  invalidlogin.getText();
		    System.out.println(Actual);
		    String Expected = "Please check your username and password. If you still can't "
				            + "log in, contact your Salesforce administrator.";
            assertmethod(Actual, Expected);	     }	
		
	@FindBy(css="#idcard-identity")
            WebElement usernameverify;
public void UserNameVerify () {	
            waitForElement(usernameverify,20);
            usernameverify.click();
            waitForElement(usernameverify,20);
            String Actual =usernameverify.getText();
            System.out.println("After Logout value"+" "+Actual);
            String Expected= "aparna@b.com";
            System.out.println(Expected);
            assertmethod(Actual, Expected);   }

	
}
