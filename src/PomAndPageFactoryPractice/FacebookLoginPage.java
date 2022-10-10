package PomAndPageFactoryPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FacebookLoginPage {
	
	//Declaration
	
	@FindBy(xpath="//img[@class='fb_logo _8ilh img']") private WebElement login_fblogo;
	@FindBy(xpath="//h2[starts-with(text(),'Facebook helps you')]") private WebElement login_fbtagline;
	@FindBy(xpath="//input[@id='email']") private WebElement EmailAdd_mobnofield;
	@FindBy(xpath="//input[@id='pass']") private WebElement password;
	@FindBy(xpath="//button[@name='login']") private WebElement loginBtn;
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgot_password;
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement createnew_accountBtn;
	@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']/ul/li")}) private List<WebElement> footerlinks;
	
	//Initialization
	
	public FacebookLoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	//usage
	
	public void VerifyFacebookLoginPageLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(),"Facebook log in page logo is not displayed");
		Reporter.log("VerifyFacebookLoginPageLogo",true);
	}
	
	public void VerifyFacebookLoginPageTagline() {
		Assert.assertTrue(login_fbtagline.isDisplayed(),"Facebook login page tagline is not displayed");
		Assert.assertEquals(login_fbtagline.getText(),"Facebook helps you connect and share with the people in your life.");
		Reporter.log("VerifyFacebookLoginPageTagline",true);
	}
	
	public void VerifyFacebookLoginPageEmailAdderssOrMobnoField() {
		Assert.assertTrue(EmailAdd_mobnofield.isDisplayed(),"EmailAddOrMobile number field is not displayed on webpage");
		EmailAdd_mobnofield.sendKeys("7276339040");
		Reporter.log("VerifyFacebookLoginPageEmailAdderssOrMobnoField",true);
	}
	
	public void VerifyFacebookLoginPagePassawordField() {
		Assert.assertTrue(password.isDisplayed(),"Password field is not present on the webpage");
		password.sendKeys("Kunal@1996");
		Reporter.log("VerifyFacebookLoginPagePassawordField",true);
	}
	
	public void ClickFacebookLoginPageSigninBtn() {
		Assert.assertTrue(loginBtn.isDisplayed(), "Facebook login page login btn not displayed on the webpage");
//		loginBtn.click();
		Reporter.log("ClickFacebookLoginPageSigninBtn",true);
	}
	
	public void VerifyFacebookLoginPageForgotPassawordLink() {
		Assert.assertTrue(forgot_password.isDisplayed(),"Facebook login page forgot passsword link is not present on the webpage");
		Assert.assertEquals(forgot_password.getText(),"Forgotten password?");
//		forgot_password.click();
		Reporter.log("VerifyFacebookLoginPageForgotPassawordLink",true);
	}
	
	public void VerifyFacebookLoginPageCreateNewAccountBtn() {
		Assert.assertTrue(createnew_accountBtn.isDisplayed(),"Create new account btn is not present on the facebook login page");
		Assert.assertEquals(createnew_accountBtn.getText(),"Create New Account");
//		createnew_accountBtn.click();
		Reporter.log("VerifyFacebookLoginPageCreateNewAccountBtn",true);
	}
	
	public void VerifyFacebookLoginPageFooterLinkSize() {
		Assert.assertEquals(footerlinks.size(),31);
		Reporter.log("VerifyFacebookLoginPageFooterLinkSize",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
