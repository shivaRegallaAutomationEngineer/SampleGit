package Package2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SetUp {

	
	@BeforeTest
	public void login() {
		System.out.println("Login into the application");
	}
	
	@AfterTest
	public void logout() {
		System.out.println("Logout into the application");
	}
}
