package com.qa.rcade.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.rcade.base.BaseTest;
import com.qa.rcade.utils.Constants;

public class LoginPageTest extends BaseTest {

	@Test
	
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		System.out.println("Page title:" + actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE );
	}
	
	@Test
	
	public void loginPageUrlTest() {
		String url = loginPage.getCurrentPageURL();
		System.out.println("Login page URL:" + url);
		Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_FRACTION_URL));
	}
	
	@Test(enabled = false)
	public void newRegisterLinkTest() throws InterruptedException {
		
		
		Assert.assertTrue(loginPage.IsNewUserRegisterHereLinkExists());
	}
	
	@Test
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username"));
	}
}
