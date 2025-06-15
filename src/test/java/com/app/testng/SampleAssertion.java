package com.app.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleAssertion {
	// SoftAsserts - assertEquals(),AssertTrue(),AssertFalse()
	// HardAsserts - assertEquals(),AssertTrue(),AssertFalse()

	@Test
	public void test1() {
		String a = "Evanglin Lavanya";
		Assert.assertEquals(a, "Evanglin Lavanya");
		System.out.println("testfailed");
	}
	@Test 
	public void test2() {
		String a = "Evanglin Lavanya";
		Assert.assertEquals(a, "Ratna");
		System.out.println("testfailed");
	}
	
	
}
