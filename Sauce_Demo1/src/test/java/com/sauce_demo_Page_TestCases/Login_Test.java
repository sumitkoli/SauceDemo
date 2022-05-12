package com.sauce_demo_Page_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauce_demo_Base_Class.Base_Class;
import com.sauce_demo_Page_Object.Login_Page;



public class Login_Test extends Base_Class{

Login_Page login_page;
	
	@Test
	public void logintest() {
		
		login_page =new Login_Page();
		
		login_page.enterUsername("standard_user");
		
		login_page.enterPassword("secret_sauce");
		
		login_page.clickonLoginBtn();
		
		String expected=driver.getTitle();
		
		System.out.println(expected);
		
		String actual="Swag Labs";
		
		Assert.assertEquals(expected, actual);
	}
}
