package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.LoginPage;
import com.onlineBanking.pages.RegisterPage;
import com.onlineBanking.pages.SignupPage;

public class RegisterPageTest extends BaseTest{
	LoginPage loginPage;
	SignupPage signupPage;
	RegisterPage registerPage;
	
	public RegisterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		signupPage = new SignupPage();
		registerPage = new RegisterPage();
		logger = Logger.getLogger(RegisterPageTest.class.getName());
	}
	
	
	public void verifyRegisterSuccessMessage() throws Exception {		
		String registerSuccessMsg = registerPage.verifyRegisterSuccess();
		Assert.assertTrue(registerSuccessMsg.contains("Success"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
