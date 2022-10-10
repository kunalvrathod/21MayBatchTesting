package TestNGBasics;

import org.testng.annotations.Test;

public class Introduction {
	
	@Test(priority=1)
	public void openUrl() {
		System.out.println("Url is opened");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("Logged in to the website");
	}
	
	@Test(priority=3)
	public void logout() {
		System.out.println("Logged out from the website");
	}

}
