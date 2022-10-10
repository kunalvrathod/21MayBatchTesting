package TestNGKeywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethodKeywordPractice {
	
	@Test(priority=1)
	public void OpenUrl() {
		System.out.println("Url is opened");
		Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods="OpenUrl")
	public void Login() {
		System.out.println("Logged in to the application");
	}
	
	@Test(priority=3,dependsOnMethods="Login")
	public void Logout() {
		System.out.println("Logged pot from the application");
	}
	
	
	
	
	
	
	
	
	

}
