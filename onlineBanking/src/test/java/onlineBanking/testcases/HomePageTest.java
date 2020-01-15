package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.LoginPage;
import com.onlineBanking.pages.HomePage;

public class HomePageTest extends BaseTest{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		homePage = new HomePage();		
		logger = Logger.getLogger(HomePageTest.class.getName());
	}
	

	@Test
	public void loginToHomePage() throws Exception{				
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(2000);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
