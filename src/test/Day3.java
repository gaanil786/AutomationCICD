package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	
	
	@Test
	public void WebLoginCarLoan() {
		
		System.out.println("WebLoginCarLoan");
	}
	
	@Parameters({"URL", "APIKey"})
	@Test
	public void MobileLogInCarLoan(String urlname, String key) {
		
		System.out.println("MobileLogInCarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(dataProvider="getData")
	public void MobileSignInCarLoan(String username, String password) {
		
		System.out.println("MobileSignInCarLoan");
		System.out.println(username + password );
	}
	
	@Test
	public void MobileSignOutCarLoan() {
		
		System.out.println("MobileSignOutCarLoan");
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan", "MobileSignInCarLoan"})
	public void LoginAPICarLoan() {
		
		System.out.println("LoginAPICarLoan");
	}
	
	@BeforeTest
	public void Demo5() {
		System.out.println("I will be getting executed first_1");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username password - good credit history
		//2nd - username password - no credit history
		//3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		// Columns in the row are nothing but values for that particular combination (row)
		
		//2nd Set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd Set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
	}

}
