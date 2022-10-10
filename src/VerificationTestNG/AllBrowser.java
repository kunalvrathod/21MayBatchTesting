package VerificationTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AllBrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test(priority=1)
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium JF\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\selenium JF\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Wrong browser name selected");
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		}
	
	@Test(priority=2)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
		
	}
	
	@Test(priority=3)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
	}
	
	@Test(priority=4)
	public void VerifyUserNameField() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("kunal");
	}
	
	@Test(priority=5)
	public void VerifyPassawardField() {
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("kunal@123");
	}
	
	 
	public void ClickLoginBtn() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@Type='submit']"));
		LoginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
		

}
