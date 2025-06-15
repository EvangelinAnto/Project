package com.app.pageexecution;

import com.app.baseclass.BaseClass;
import com.app.pageobject.LoginPageLocator;

public class LoginPageExe extends LoginPageLocator{

	public static void username() {
		BaseClass.passData(LoginPageLocator.getusername(), "Aiite");
	}
	
	public static void password() {
		BaseClass.passData(LoginPageLocator.getpassword(), "126gs");
	}
	
	public static void loginbutton() {
		BaseClass.clickElement(LoginPageLocator.getloginButton());
	}
	
	
}
