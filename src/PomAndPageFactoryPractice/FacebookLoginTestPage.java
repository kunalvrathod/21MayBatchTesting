package PomAndPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookLoginTestPage {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium JF\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
//		driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		FacebookLoginPage fb=new FacebookLoginPage(driver);
		
		fb.VerifyFacebookLoginPageLogo();
		
		fb.VerifyFacebookLoginPageTagline();
		
		fb.VerifyFacebookLoginPageEmailAdderssOrMobnoField();
		
		fb.VerifyFacebookLoginPagePassawordField();
		
		fb.ClickFacebookLoginPageSigninBtn();
		
		fb.VerifyFacebookLoginPageForgotPassawordLink();
		
		fb.VerifyFacebookLoginPageCreateNewAccountBtn();
		
		fb.VerifyFacebookLoginPageFooterLinkSize();
	}

}
