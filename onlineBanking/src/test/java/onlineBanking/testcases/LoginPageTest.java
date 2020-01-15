package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.LoginPage;
import com.onlineBanking.pages.SignupPage;

public class LoginPageTest extends BaseTest{

	LoginPage loginPage;
	SignupPage signupPage;	
	
	public LoginPageTest() {
		super();
	}	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		signupPage = new SignupPage();
		logger = Logger.getLogger(LoginPageTest.class.getName());
	}
	
	@Test
	public void verifyUserSuccessTest(String username, String password) throws InterruptedException {
		loginPage.login(username, password);
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
