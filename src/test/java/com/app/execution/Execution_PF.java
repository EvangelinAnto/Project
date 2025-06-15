package com.app.execution;

import org.junit.Test;

import com.app.pageexecution.LoginPageExe_PF;

public class Execution_PF extends LoginPageExe_PF{
	@Test
	public void test() {
		browserLaunch();
		username();
		password();
		loginButton();
		browserClose();
	}

}
