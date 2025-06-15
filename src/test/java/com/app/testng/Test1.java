package com.app.testng;

import org.testng.annotations.Test;

public class Test1 {
	@Test (groups = {"smoke"})
	public void user() {
		System.out.println("user ");
	}
	@Test (priority = 2)
	public void pass() {
		System.out.println("pass ");
	}
	@Test (priority = 3 , invocationCount = 10)
	public void login() {
		System.out.println("login ");
	}

}
