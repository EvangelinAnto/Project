package com.junit;

import org.junit.Assert;
import org.junit.Test;

public class Test1 { // // Assertion
	// Assert
	// assertEquals()
	// assertTrue()
	// assertFalse()
	@Test
    public void test1() {
		String a = "DonaJose";
		Assert.assertEquals("DonaJose","donaJose");
    	System.out.println("Test1");
    }
	@Test
    public void test2() {
		String a = "DonaJose";
		Assert.assertTrue(a.contains("donaJose"));
    	System.out.println("Test2");
    }
	@Test
    public void test3() {
		String a = "DonaJose";
		Assert.assertFalse(a.contains("donaJose"));
    	System.out.println("Test3");
    }

}
