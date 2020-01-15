package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.LoginPage;
import com.onlineBanking.pages.RegisterPage;
import com.onlineBanking.pages.SignupPage;

public class SignupPageTest extends BaseTest{
	
	LoginPage loginPage;
	SignupPage signupPage;
	RegisterPage registerPage;
	
	public SignupPageTest() {
		super();
	}	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		signupPage = new SignupPage();
		registerPage = new RegisterPage();
		logger = Logger.getLogger(SignupPageTest.class.getName());
	}
/*	
	@Test(priority = 1)
	public void gotoSelectTitle() throws Exception{
		logger.info("Title Value Slect started");		
		loginPage.goToSignUpPage();
		signupPage.selectTitle();
		Thread.sleep(2000);
		logger.info("Title Value Selected test completed");
	}
	
	@Test(priority = 2)
	public void gotoEnterFirstName() throws Exception{
		logger.info("First Name Value test started");
		loginPage.goToSignUpPage();
		signupPage.enterFirstName(prop.getProperty("firstName"));
		Thread.sleep(2000);
		logger.info("First Name Value test completed");
	}
	
	@Test(priority = 3)
	public void gotoEnterLastName() throws Exception{
		logger.info("Last Name Value test started");
		loginPage.goToSignUpPage();
		signupPage.enterLastName(prop.getProperty("lastName"));
		Thread.sleep(2000);
		logger.info("Last Name Value test completed");
	}
*/	
	@Test
	public void createRegisterForm() throws Exception{		
		loginPage.goToSignUpPage();
		Thread.sleep(2000);
		
		signupPage.selectTitle();
		Thread.sleep(1000);
		
		signupPage.enterFirstName(prop.getProperty("firstName"));
		Thread.sleep(1000);
		
		signupPage.enterLastName(prop.getProperty("lastName"));
		Thread.sleep(1000);
		
		signupPage.clickGender();
		Thread.sleep(1000);
		
		signupPage.enterDob(prop.getProperty("dob"));
		Thread.sleep(1000);
		
		signupPage.enterSsn(prop.getProperty("ssn"));
		Thread.sleep(1000);
		
		signupPage.enterEmail(prop.getProperty("ssn"));
		Thread.sleep(1000);
		
		signupPage.enterPassword(prop.getProperty("password"));
		Thread.sleep(1000);
		
		signupPage.enterConfirmPassword(prop.getProperty("password"));
		Thread.sleep(1000);
		
		signupPage.clickOnLoginButton();
		Thread.sleep(3000);		
		
		signupPage.enterAddress(prop.getProperty("address"));
		Thread.sleep(1000);
		
		signupPage.enterCity(prop.getProperty("city"));
		Thread.sleep(1000);
		
		signupPage.enterRegion(prop.getProperty("region"));
		Thread.sleep(1000);
		
		signupPage.enterPostalCode(prop.getProperty("postalCode"));
		Thread.sleep(1000);
		
		signupPage.enterCountry(prop.getProperty("country"));
		Thread.sleep(1000);
		
		signupPage.enterHomePhone(prop.getProperty("homePhone"));
		Thread.sleep(1000);
		
		signupPage.enterMobilePhone(prop.getProperty("mobilePhone"));
		Thread.sleep(1000);
		
		signupPage.enterWorkPhone(prop.getProperty("workPhone"));
		Thread.sleep(1000);
		
		signupPage.agreeClick();
		Thread.sleep(1000);
		
		signupPage.registerBtnClick();
		Thread.sleep(3000);
		
		registerPage.verifyRegisterSuccess();
		Thread.sleep(1000);
		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
