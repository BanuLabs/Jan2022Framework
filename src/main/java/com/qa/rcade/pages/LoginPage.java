package com.qa.rcade.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
//	/1. private by locators: -
	private By emailId = By.id("UserName");
	private By submit = By.id("btnSubmit");
	private By newUserRegister = By.xpath("//span[@id=\"lnkRegisterd\"]");
	
	
	// 2. public page class constructor: -
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3. public page actions: -
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}
	
	public boolean IsNewUserRegisterHereLinkExists() throws InterruptedException {
		Thread.sleep(3000);
			return driver.findElement(newUserRegister).isDisplayed();
	}
	
	public void doLogin(String email) {
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(submit).click();
	}
}
