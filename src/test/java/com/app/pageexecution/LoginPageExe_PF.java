package com.app.pageexecution;

import com.app.baseclass.BaseClass;
import com.app.pageobject.LoginPageLocator_PF;

public class LoginPageExe_PF extends LoginPageLocator_PF{
	
	public static void  username() {
		BaseClass.passData(new LoginPageLocator_PF().getUsername(), "Aiite");
	}
	
	public static void  password() {
		BaseClass.passData(new LoginPageLocator_PF().getPassword(), "Aiite");
	}
	
	public static void  loginButton() {
		BaseClass.clickElement(new LoginPageLocator_PF().getLoginButton());
	}

}
