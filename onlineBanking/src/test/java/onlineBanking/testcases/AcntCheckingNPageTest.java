package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.AcntCheckingNPage;
import com.onlineBanking.pages.LoginPage;

public class AcntCheckingNPageTest extends BaseTest{
	
	LoginPage loginPage;	
	AcntCheckingNPage acntCheckingNPage;
	public AcntCheckingNPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		acntCheckingNPage = new AcntCheckingNPage();		
		logger = Logger.getLogger(AcntCheckingNPageTest.class.getName());
	}
	
	
	@Test
	public void clickAcntCheckingNewLinkTest() throws Exception{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(2000);
		acntCheckingNPage.acntCheckingViewCheckingLink();
		Thread.sleep(1000);
		acntCheckingNPage.acntCheckingNewLink();
		Thread.sleep(2000);
		acntCheckingNPage.acntCheckingNewType();
		Thread.sleep(2000);
		acntCheckingNPage.acntCheckingNewOwnership();
		Thread.sleep(2000);
		acntCheckingNPage.acntCheckingNewAcntName(prop.getProperty("accountName"));
		Thread.sleep(2000);
		acntCheckingNPage.acntCheckingNewDeposit(prop.getProperty("deposit"));
		Thread.sleep(2000);
		acntCheckingNPage.acntCheckingNewSubmitBtn();
		Thread.sleep(2000);
		String showAcntCheckingNewMessage = acntCheckingNPage.getAcntCheckingNewMessage();
		Assert.assertTrue(showAcntCheckingNewMessage.contains("Transactions"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
