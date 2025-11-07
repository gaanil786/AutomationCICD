package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	
	@Test(groups=("Smoke"))
	public void Demo3() {
		
		System.out.println("Day 2_1");
	}
	
	@Test(groups=("Smoke"))
	public void Demo4() {
		
		System.out.println("Day2_2");
	}
	
	@BeforeMethod
	public void ItsbeforeMethod() {
		System.out.println("ItsbeforeMethod");
	}
	
	@BeforeTest
	public void Demo5() {
		System.out.println("I will be getting executed first");
	}
	
	@BeforeClass
	public void Itsbeforeclass() {
		System.out.println("Its before Day2");
	}
	
	@AfterClass
	public void Itsafterclass() {
		System.out.println("Its After Day2");
	}

}
