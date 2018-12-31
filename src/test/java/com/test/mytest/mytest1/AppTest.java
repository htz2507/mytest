package com.test.mytest.mytest1;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	public void testShow() {
	App a=new App();
	a.show();
		TestCase.assertEquals("结论不一直", 4, 5);
	}

}
