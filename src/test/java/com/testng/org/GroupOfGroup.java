package com.testng.org;

import org.testng.annotations.Test;

public class GroupOfGroup {

	

	@Test(groups = "Family")
	private void name() {

		System.out.println("Swarnapriya");
	}
	
	@Test(groups = "Family")
	private void fatherName() {

		System.out.println("Sivakumar");
	}
	
	@Test(groups = "Contact")
	private void phoneNum() {

		System.err.println("9876543210");
	}
	
	@Test(groups = "Contact")
	private void email() {

		System.out.println("swarnapriyavittal@gmail.com");
	}
	
	@Test(groups = "Education")
	private void uGdegree() {

		System.out.println("B.Sc");
	}
	
	@Test(groups = "Education")
	private void pGdegree() {

		System.out.println("MCA");
	}

}
