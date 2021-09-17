package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.Store_Page;

public class Support_Signout_Test extends TestBase {
	@Test
	public void supportTest() {
		 Store_Page sp=new Store_Page(driver);
		 sp.getContactUs().click();
sp.getSubject().selectByVisibleText("Webmaster");
sp.getEmail1().sendKeys("ymamatha.535@gmail.com");
sp.getOrderpref().sendKeys("dresses");
sp.getMessage().sendKeys("wrong order");
sp.getSend().click();
sp.getSignOut().click();
	}

}
