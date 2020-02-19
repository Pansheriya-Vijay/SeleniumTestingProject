package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testSelenium {
	
	@BeforeClass
	public void systemProperty() {
		System.out.println("property is set up");

	}

	@Test
	public void setUp() {
		System.out.println("My Test is pass");

	}

	@AfterClass
	public void openURL() {
		System.out.println("close the browser");
	}

}
