package com.testng.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {

	@Test(dataProvider = "testData")
	private void credential(String username,String password) {

		System.out.println("Username ="+username+" "+"Password ="+password);
	}
	
	@DataProvider
	private Object[][] testData() {

		return new Object[][] {{"siva","siva123"},
							   {"anu","anu546"},
							   {"dinesh","din789"},
							   {"Priya","priya10"}
		
		};
	}
}
