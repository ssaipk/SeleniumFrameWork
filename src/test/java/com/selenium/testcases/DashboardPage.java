package com.selenium.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.LoginPage;

public class DashboardPage {

	LoginPage lp;
	com.excelr.pages.DashboardPage dp;
	
	@BeforeMethod
	public void browserSetUp() {
		lp=new LoginPage();
		lp.initialization();
	}
	
	@Test
	public void timeatWorkSection() {
		dp=lp.login();
		Assert.assertTrue(dp.gettimeWorkSection());
	}

	@AfterMethod
	public void closeBrowser() {
		lp.teardown();
	}
}
