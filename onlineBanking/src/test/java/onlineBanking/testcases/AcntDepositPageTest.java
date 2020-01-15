package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.AcntDepositPage;
import com.onlineBanking.pages.LoginPage;

public class AcntDepositPageTest extends BaseTest{
	
	LoginPage loginPage;	
	AcntDepositPage acntDepositPage;
	public AcntDepositPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		acntDepositPage = new AcntDepositPage();		
		logger = Logger.getLogger(AcntDepositPageTest.class.getName());
	}
	
	
	@Test
	public void clickAcntDepositLinkTest() throws Exception{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(2000);
		acntDepositPage.acntDepositTransactionLink();
		Thread.sleep(1000);
		acntDepositPage.acntDepositLink();
		Thread.sleep(2000);
		acntDepositPage.acntDeposit();
		Thread.sleep(2000);	
		acntDepositPage.acntDepositAmount(prop.getProperty("deposit"));
		Thread.sleep(2000);
		
		acntDepositPage.acntDepositSubmitBtn();
		Thread.sleep(2000);
		
		String showAcntDepositeMessage = acntDepositPage.getAcntDepositMessage();
		Assert.assertTrue(showAcntDepositeMessage.contains("Transactions"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
