package com.app.execution;

import org.junit.Test;

import com.app.pageexecution.LoginPageExe;

public class Execution extends LoginPageExe{
	@Test
	public void test() {
	    browserLaunch();
	    username();
	    password();
	    loginbutton();
	}

}
