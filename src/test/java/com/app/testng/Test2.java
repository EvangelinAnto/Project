package com.app.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test2 {
	@Test (enabled = false)
	public void test1() {
		System.out.println("test1");
	}
    @Ignore
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@Test (groups = {"smoke"})
	public void test5() {
		System.out.println("test5");
	}
	
	@Test  (groups = {"smoke"})
	public void test6() {
		System.out.println("test6");
	}
	
	@Test
	public void test9() {
		System.out.println("test9");
	}

}
