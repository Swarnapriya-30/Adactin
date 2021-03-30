package com.testng.org;

import java.util.NoSuchElementException;

import org.testng.annotations.*;

public class Exception_Test {

	@Test
	private void add() {

		int i = 10;
		int j = 5;
		int k=i+j;
		
		System.out.println(k);
	}
	
	@Test(expectedExceptions = Exception.class)
	private void divide() {

		int i = 10;
		int j = 0;
		
		System.out.println(i/j);
		
	}
	
	@Test
	private void multiplication() {

		int i = 10;
		int j = 5;
		
		System.out.println(i*j);
		
	}
}
