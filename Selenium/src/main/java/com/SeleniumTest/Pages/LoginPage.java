package com.SeleniumTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.SeleniumTest.Selenium.BaseClass;

public class LoginPage extends BaseClass {
	
	WebDriver driver;
    @FindBy(className = "enroll")
    WebElement enroll;
    
    public LoginPage(WebDriver driver) {  
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
	}
    
    
    public void goToEnroll() {
    	try {
    		enroll.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    
    	
    }

}
