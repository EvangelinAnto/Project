package com.app.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.app.baseclass.BaseClass;

public class LoginPageLocator_PF extends BaseClass {
	// using Page Factory
	@FindBy (id = "username")
	private WebElement username;
	@FindBy (id = "password")
	private WebElement password;
	@FindBy (id = "login")
	private WebElement loginButton;
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
