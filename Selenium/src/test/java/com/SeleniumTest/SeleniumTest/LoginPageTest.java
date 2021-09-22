package com.SeleniumTest.SeleniumTest;


import static org.junit.Assert.assertEquals;

import com.SeleniumTest.Pages.LoginPage;
import com.SeleniumTest.Selenium.BaseClass;

public class LoginPageTest extends BaseClass{
	
	public static void main(String[] args) {
		
		BaseClass b = new BaseClass();
			b.driverInit();
		
			b.lp = new LoginPage(driver);
			b.lp.goToEnroll();
			
			String expected = driver.getTitle();
	    	String actual = "The Bank of New Glarus | Enroll";
	    	
	    	assertEquals(expected, actual);
	    	b.closeDriver();
		}

}
