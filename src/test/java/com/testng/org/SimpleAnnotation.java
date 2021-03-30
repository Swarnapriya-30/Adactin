package com.testng.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	@BeforeSuite
	private void SetUp() {
		System.out.println("Google Chrome");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("BrowserLaunch");
	}
	
	@BeforeClass
	private void url() {
		System.out.println("url");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	
	@Test
	private void SearchLaptop() {
		System.out.println("SearchLaptop");
	}
	@Test
	private void searchMobile() {
		System.out.println("searchmobile");
	}
	
	@AfterMethod
	private void logOut() {
		System.out.println("Logout");
	}
	
	@AfterClass
	private void verification() {
		System.out.println("verification");
	}
	
	@AfterTest
	private void browserClose() {
		System.err.println("BrowserClose");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("DeleteCookies");
	}
	
	
	
	
	
	
}
