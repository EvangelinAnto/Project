package com.app.testng;

public class ParallelExe {
	
	public static void main(String[] args) {
		 A a = new A();
		 B b = new B();
		 a.test1();
		 b.start();
	}
}

class A{
	public void test1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("Test1");
	}	
}
class B extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("Test2");
	}
}
