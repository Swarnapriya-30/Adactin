package com.testng.org;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test(priority = -5)
	private void browserLaunch() {
		
		System.out.println("Browser Launch");
	}
	
	@Test(priority = 0)
	private void login() {

		System.out.println("Login");
	}
	
	@Test
	private void searchMobiles() {

		System.out.println("Search Mobiles");
	}
	
	@Test(priority = 36)
	private void searchLaptop() {

		System.out.println("Search Laptop");
	}
	
	@Test(priority = 85)
	private void logout() {

		System.out.println("Logout");
	}
	
	@Test(priority = 22)
	private void browserClose() {

		System.out.println("Browser Close");
	}

}
