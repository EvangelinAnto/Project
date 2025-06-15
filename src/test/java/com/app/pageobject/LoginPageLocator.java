package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.baseclass.BaseClass;

public class LoginPageLocator extends BaseClass{
	
	// without Using Page Factory
	public static WebElement getusername() {
		return driver.findElement(By.id("username"));	
	}
	
	public static WebElement getpassword() {
		return driver.findElement(By.id("password"));	
	}
	
	public static WebElement getloginButton() {
		return driver.findElement(By.id("login"));
		
	}

}
