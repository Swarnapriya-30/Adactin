package com.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossBrowser {

	@Test
	private void chrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	private void ie() {

		System.setProperty("webdriver.ie.driver","C:\\Users\\DINESH\\eclipse-workspace\\SeleniumPractice\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in/");
	
	}
	@Test
	private void firefox() {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\DINESH\\eclipse-workspace\\SeleniumPractice\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");

	}
}
