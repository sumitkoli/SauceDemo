package com.sauce_demo_Page_Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo_Base_Class.Base_Class;

public class Login_Page extends Base_Class{

	public Login_Page() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Username Field
	@FindBy(id="user-name")
	WebElement username;
	
	//Password Field
	@FindBy(id="password")
	WebElement password;
	
	//Login Button
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	//Enter Username
	public void enterUsername(String userName) {
		
		username.sendKeys(userName);
	}
	
	//Enter Password
	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
	}
	
	//Click on Login Button
	public void clickonLoginBtn() {
		loginbtn.click();
	}
}
