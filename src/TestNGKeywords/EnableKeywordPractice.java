package TestNGKeywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnableKeywordPractice {
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser is Launched");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("Logged in to the application");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test(priority=1)
	public void HomePageTest() {
		System.out.println("Checked the home page application");
	}
	
	@Test(priority=2,invocationCount=5,enabled=false)
	public void NotificationPageTest() {
		System.out.println("Checked the homepage of the application");
	}
	
	@Test
	public void SettingPageTest() {
		System.out.println("Checked the setting page of the application");
	}

}
