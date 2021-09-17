package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.Store_Page;

public class LoginTest extends TestBase {
	
	
	@Test
	public void login() {
		   Store_Page sp=new Store_Page(driver);

		   //1.Click on Sign in
			  sp.getSignIn().click();
			  
			  //2.Login
			  sp.getEmail().sendKeys("ymamatha.535@gmail.com");
			  sp.getPswd().sendKeys("16Ud1@0535");
			  sp.getSubmit().click();

	}

}
