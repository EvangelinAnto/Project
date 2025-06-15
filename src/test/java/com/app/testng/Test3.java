package com.app.testng;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test (groups = {"smoke"})
	public void test4() {
		System.out.println("test4");
	}
	@Test (groups = {"smoke"})
	public void test7() {
		System.out.println("test6");
	}
	
	@Test
	public void test8() {
		System.out.println("test9");
	}

}
