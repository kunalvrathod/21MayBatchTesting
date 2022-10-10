package PomAndPageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
	
	//Declaration==>WebElement
	
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[text()='Sign Up']") private WebElement signuplink;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(name="reg_email_confirmation__") private WebElement re_email;
	@FindBy(name="reg_passwd__") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthdate;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement submitbtn;
	
	//Initialization
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Usage
	
	public void ClickFacebookSignupLink() {
		signuplink.click();
	}
	
	public void VerifyFacebookRegistrationPageFblogo() {
	
		Assert.assertTrue(reg_fblogo.isDisplayed(),"The facebook logo on registration page is not displayed");
		
	}
	
	public void VerifyFacebookRegistrationPageAlreadyAccount() {
		
		Assert.assertTrue(already_acc.isDisplayed(),"The already having an account option on registrstion page is not displayed");
		
		Assert.assertEquals(already_acc.getText(),"Already have an account?");
	}
	
	public void SetFacebookRegistrationPageFirstName() {
		firstname.sendKeys("kunal");
	}
	
	public void SetFacebookRegistrationPageLastName() {
		surname.sendKeys("rathod");
	}
	
	public void SetFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("test123@gmail.com");
	}
	
	public void SetFacebookRegistrationPageReEmail() {
		re_email.sendKeys("test123@gmail.com");
	}
	
	public void SetFacebookRegistrationPagePassword() {
		password.sendKeys("kunal@1996");
	}
	
	public void SetFacebookRegistrationPageBirthday() {
		Select bday=new Select(birthdate);
		Assert.assertTrue(birthdate.isDisplayed(),"Birthday drop down list not available on the website");
		Assert.assertFalse(birthdate.isSelected(),"The birthdate is selected initially");
		bday.selectByVisibleText("11");
	}
	
	public void SetFacebookRegistrationPageBirthMonth() {
		Select bmonth=new Select( birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(),"BirthMonth drop down list not available on the website");
		Assert.assertFalse(birthmonth.isSelected(),"The birthMonth is selected initially");
		bmonth.selectByVisibleText("Jan");
	}
	
	public void SetFacebookRegistrationPageBirthYear() {
		Select byear=new Select( birthyear);
		Assert.assertTrue(birthmonth.isDisplayed(),"BirthMonth drop down list not available on the website");
		Assert.assertFalse(birthmonth.isSelected(),"The birthMonth is selected initially");
		byear.selectByVisibleText("1996");
	}
	
	public void SetFacebookRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("Please select valid input");
		}
	}
	
	public void clickFacebookRegistrationPageSubmitBtn() {
		submitbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
