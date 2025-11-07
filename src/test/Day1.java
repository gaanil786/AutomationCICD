package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void Demo() {

		System.out.println("Day1_1");
	}

	@Test(groups=("Smoke"))
	public void Demo1() {

		System.out.println("Day1_2");
	}

	@Test
	public void Demo1_1() {

		System.out.println("I will be getting executed last");
		Assert.assertTrue(false);
		
		
	}
	
	@AfterSuite
	public void ItsAftersuite() {

		System.out.println("ItsAftersuite");
	}

}
