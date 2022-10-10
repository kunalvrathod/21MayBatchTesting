package PomAndPageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrangeHRM_POM {
	
	//Declaration
	
	@FindBy(xpath="value") private WebElement company_brandname;
	@FindBy(xpath="value") private WebElement username;
	@FindBy(xpath="value") private WebElement password;
	@FindBy(xpath="value") private WebElement signinbtn;
	@FindBy(xpath="value") private WebElement forgotpassawardlink;
	@FindBy(xpath="value") private WebElement emp_name;
	@FindBy(xpath="value") private WebElement emp_id;
	@FindBy(xpath="value") private WebElement emp_status;
	@FindBy(xpath="value") private WebElement include_field;
	@FindBy(xpath="value") private WebElement sup_name;
	@FindBy(xpath="value") private WebElement job_title;
	@FindBy(xpath="value") private WebElement  sub_unit;
	@FindBy(xpath="value") private WebElement resetBtn;
	@FindBy(xpath="value") private WebElement submitBtn;
	
	//Initialization
	
	public OrangeHRM_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void VerifyWebsiteLogo() {
		Assert.assertTrue(company_brandname.isDisplayed(),"Company name is not present on the facebook");
	}
	
	public void username() {
		username.sendKeys("Admin");
	}
	
	public void password() {
		password.sendKeys("admin123");
	}
	
	public void login() {
		signinbtn.click();
	}
	
	public void forgotpassawaodlink() {
		Assert.assertTrue(forgotpassawardlink.isDisplayed(),"Forgot passaword link is not present on the webpage");
		Assert.assertEquals(forgotpassawardlink.getText(),"Forgot your password? ");
	}
	
	public void emp_name() {
		emp_name.sendKeys("kunal");
	}
	
	public void emp_id() {
		emp_id.sendKeys("12012");
	}
	
	public void emp_status() {
		
	}
	

}
