package onlineBanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineBanking.base.BaseTest;
import com.onlineBanking.pages.AcntSavingVPage;
import com.onlineBanking.pages.LoginPage;

public class AcntSavingVPageTest extends BaseTest{
	
	LoginPage loginPage;	
	AcntSavingVPage acntSavingVPage;
	public AcntSavingVPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
		acntSavingVPage = new AcntSavingVPage();		
		logger = Logger.getLogger(AcntSavingVPageTest.class.getName());
	}
		
	@Test
	public void clickAcntSavingViewLinkTest() throws Exception{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(2000);		
		acntSavingVPage.clickAcntSavingViewSavingLink();
		Thread.sleep(1000);
		acntSavingVPage.clickAcntSavingViewLink();
		Thread.sleep(2000);
		String showAcntSavingViewMessage = acntSavingVPage.getAcntSavingViewMessage();
		Assert.assertTrue(showAcntSavingViewMessage.contains("Transactions"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

