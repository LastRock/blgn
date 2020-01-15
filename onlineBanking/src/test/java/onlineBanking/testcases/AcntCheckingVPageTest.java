package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.AcntCheckingVPage;
import com.onlineBanking.pages.LoginPage;

public class AcntCheckingVPageTest extends BaseTest{
	
	LoginPage loginPage;	
	AcntCheckingVPage acntCheckingVPage;
	public AcntCheckingVPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		acntCheckingVPage = new AcntCheckingVPage();		
		logger = Logger.getLogger(AcntCheckingVPageTest.class.getName());
	}
	
	
	@Test
	public void clickAcntCheckingViewLinkTest() throws Exception{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(2000);		
		acntCheckingVPage.clickAcntCheckingViewCheckingLink();
		Thread.sleep(1000);
		acntCheckingVPage.clickAcntCheckingViewLink();
		Thread.sleep(2000);
		String showAcntCheckingViewMessage = acntCheckingVPage.getAcntCheckingViewMessage();
		Assert.assertTrue(showAcntCheckingViewMessage.contains("Transactions"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
