package PomAndPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationPageTest {
	
	//Browser SetUp==>validation apply==>browser close;
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
		//driver.close();
	}
	
	@Test
	public void RegistrationPageTest_Positive() {
		RegistrationPage rp=new RegistrationPage(driver);
		
		rp.ClickFacebookSignupLink();
		
		
		rp.VerifyFacebookRegistrationPageFblogo();
		
		rp.VerifyFacebookRegistrationPageAlreadyAccount();
		
		rp.SetFacebookRegistrationPageFirstName();
		
		rp.SetFacebookRegistrationPageLastName();
		
		rp.SetFacebookRegistrationPageMobileEmail();
		
		rp.SetFacebookRegistrationPageReEmail();
		
		rp.SetFacebookRegistrationPagePassword();
		
		rp.SetFacebookRegistrationPageBirthday();
		
		rp.SetFacebookRegistrationPageBirthMonth();
		
		rp.SetFacebookRegistrationPageBirthYear();
		
		rp.SetFacebookRegistrationPageGender("Male");
		
		//rp.clickFacebookRegistrationPageSubmitBtn();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
