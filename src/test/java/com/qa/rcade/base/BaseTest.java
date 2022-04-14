package com.qa.rcade.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.qa.rcade.factory.DriverFactory;
import com.qa.rcade.pages.LoginPage;

public class BaseTest {

	public DriverFactory df;
	public WebDriver driver;
	public LoginPage loginPage;
	public Properties prop;
	
	@BeforeTest
	
	public void setup() {
		df = new DriverFactory();
	prop = df.init_prop();
		driver = df.init_driver(prop);
		loginPage = new LoginPage(driver);
		
		
			
	}
	
	@AfterTest
	
	public void tearDown() {
		driver.quit();
	}
}
