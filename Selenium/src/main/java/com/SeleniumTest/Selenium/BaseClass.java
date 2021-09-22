package com.SeleniumTest.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SeleniumTest.Pages.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage lp;
	
	public WebDriver driverInit() {
		
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://thebankofnewglarus.bank/onlinebankingdemo.html");
				
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
	}
	
	
	

}
