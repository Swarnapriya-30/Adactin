package com.testng.org;

import org.testng.annotations.*;

public class Ignore_Test {
	
	@Test
	private void browserLaunch() {
		
		System.out.println("Browser Launch");
	}
	
	@Test
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
