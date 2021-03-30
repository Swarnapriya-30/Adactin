package com.testng.org;

import org.testng.annotations.Test;

public class Timeout_Test {

	@Test
	private void browserLaunch() {
		
		System.out.println("Browser Launch");
	}
	
	@Test(timeOut = 2000)
	private void login() {

		System.out.println("Login");
	}
	
	@Test
	private void searchMobiles() {

		System.out.println("Search Mobiles");
	}
	
	@Test
	private void searchLaptop() {

		System.out.println("Search Laptop");
	}
	
	@Test
	private void logout() {

		System.out.println("Logout");
	}
	
	@Test
	private void browserClose() {

		System.out.println("Browser Close");
	}

}
