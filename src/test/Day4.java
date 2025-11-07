package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void WebLoginHomeLoan() {

		System.out.println("WebLoginHomeLoan");
	}

	@Test(groups=("Smoke"))
	public void MobileLogInHomeLoan() {

		System.out.println("MobileLogInHomeLoan");
	}

	@Parameters({"URL"})
	@Test
	public void LoginAPIHomeLoan(String urlname) {

		System.out.println("LoginAPIHomeLoan");
		System.out.println(urlname);
	}

	@BeforeSuite
	public void Itsbeforesuite() {

		System.out.println("Itsbeforesuite");
	}

}
