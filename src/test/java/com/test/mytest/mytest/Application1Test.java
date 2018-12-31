package com.test.mytest.mytest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Application1Test {

	@Test
	public void testFun_app1() {
		Application1 app1=new Application1();
		app1.fun_app1();
		assertTrue(true);
		//fail("Not yet implemented");
	}
	
	@Test
	public void textmy_fun() {
		
		System.out.println("this is my own function.");
		assertTrue(true);
	}

}
