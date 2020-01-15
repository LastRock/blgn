package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.AcntWithdrawPage;
import com.onlineBanking.pages.LoginPage;

public class AcntWithdrawPageTest extends BaseTest{
	
	LoginPage loginPage;	
	AcntWithdrawPage acntWithdrawPage;
	public AcntWithdrawPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		acntWithdrawPage = new AcntWithdrawPage();		
		logger = Logger.getLogger(AcntWithdrawPageTest.class.getName());
	}	
	
	@Test
	public void WithdrawLinkTest() throws Exception{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(2000);
		acntWithdrawPage.acntWithdrawTransactionLink();
		Thread.sleep(1000);
		acntWithdrawPage.acntWithdrawLink();
		Thread.sleep(2000);
		acntWithdrawPage.acntWithdraw();
		Thread.sleep(2000);	
		acntWithdrawPage.acntWithdrawAmount(prop.getProperty("deposit"));
		Thread.sleep(2000);		
		acntWithdrawPage.acntWithdrawSubmitBtn();
		Thread.sleep(2000);		
		String showAcntWithdrawMessage = acntWithdrawPage.getAcntWithdrawMessage();
		Assert.assertTrue(showAcntWithdrawMessage.contains("Transactions"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
