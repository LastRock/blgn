package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.AcntSavingNPage;
import com.onlineBanking.pages.LoginPage;

public class AcntSavingNPageTest extends BaseTest{
	
	LoginPage loginPage;	
	AcntSavingNPage acntSavingNPage;
	public AcntSavingNPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		acntSavingNPage = new AcntSavingNPage();		
		logger = Logger.getLogger(AcntSavingNPageTest.class.getName());
	}
	
	
	@Test
	public void clickAcntSavingNewLinkTest() throws Exception{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(2000);
		acntSavingNPage.acntSavingViewSavingLink();
		Thread.sleep(1000);
		acntSavingNPage.acntSavingNewLink();
		Thread.sleep(2000);
		acntSavingNPage.acntSavingNewType();
		Thread.sleep(2000);
		acntSavingNPage.acntSavingNewOwnership();
		Thread.sleep(2000);
		acntSavingNPage.acntSavingNewAcntName(prop.getProperty("accountName"));
		Thread.sleep(2000);
		acntSavingNPage.acntSavingNewDeposit(prop.getProperty("deposit"));
		Thread.sleep(2000);
		acntSavingNPage.acntSavingNewSubmitBtn();
		Thread.sleep(2000);
		String showAcntSavingNewMessage = acntSavingNPage.getAcntSavingNewMessage();
		Assert.assertTrue(showAcntSavingNewMessage.contains("Transactions"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
