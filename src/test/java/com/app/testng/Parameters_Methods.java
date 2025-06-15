package com.app.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Methods {
	@Parameters({"Username"})
	@Test
	public void browser(String user) {
		System.out.println(user);
	}
	
	@Parameters ({"Password"})
	@Test
	public void pass(String pass) {
		System.out.println(pass);
	}

}
