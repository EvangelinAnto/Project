package com.junit;

import org.junit.Ignore;
import org.junit.Test;

public class Test2 {
	
	@Test
    public void user() {
    	System.out.println("user");
    }
	@Test
    public void pass() {
    	System.out.println("pass");
    }
	@Ignore
	@Test
    public void login() {
    	System.out.println("login");
    }

}
