package TestNGBasics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationPractice {
	@BeforeClass
	public void login() {
		System.out.println("logged in to the application");
		Reporter.log("Logged in to the application");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("logged out from the application");
		Reporter.log("Logged out from the application");
	}
	
	@Test(priority=3)
	public void homepage() {
		System.out.println("Checking the homepage");
		Reporter.log("Checking the homepage");
	}
	
	@Test(priority=2)
	public void notification() {
		System.out.println("Checking the notification");
		Reporter.log("Checking the notification");
	}
	
	@Test(priority=1)
	public void profilepage() {
		System.out.println("Checking the profilepage");
		Reporter.log("Checking the profilepage");
	}

}
