package com.selenium.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.LoginPage;

public class LoginPageTest {
	LoginPage lp;
	@BeforeMethod
	public void browserSetUp() {
		lp=new LoginPage();
		lp.initialization();
	}
	
	@Test
	public void validTitleTest() {
		
		String acttitle=lp.getTitle();
		String exptitle="OrangeHRM";
		Assert.assertEquals(acttitle, exptitle);
		
	} 
	@Test
	public void validLoginPageTest() {
		lp.login();
	}
	@Test
	public void forgotPasswordLinkDisplayed() {
		Assert.assertTrue(lp.forgotPasswordLink());
	}
	
	@AfterMethod
	public void closeBrowser() {
		lp.teardown();
	}
	

}
