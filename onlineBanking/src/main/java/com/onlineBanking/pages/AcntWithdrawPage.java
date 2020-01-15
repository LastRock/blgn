package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class AcntWithdrawPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="//a[@href='#'][contains(.,'Transactions')]")	
	WebElement acntWithdrawTransactionLinkClick;		
			
	@FindBy(how=How.XPATH,using="//a[@href='/account/withdraw']")	
	WebElement acntWithdrawLinkClick;
		
	@FindBy(how=How.XPATH,using="//*[@id='id']/option[5]")
	WebElement clickAcntWithdraw;
	
	@FindBy(how=How.XPATH,using="//input[@id='amount']")
	WebElement inputAcntWithdrawAmount;
	
			
	@FindBy(how=How.XPATH,using="//button[contains(.,'Submit')]")
	WebElement inputAcntWithdrawSubmitBtn;

	@FindBy(how=How.XPATH,using="//strong[@class='card-title text-light']")
	WebElement verifyAcntWithdraw;
	
	
	public AcntWithdrawPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void acntWithdrawTransactionLink() {
		acntWithdrawTransactionLinkClick.click();
	}
		
	public void acntWithdrawLink() {
		acntWithdrawLinkClick.click();
	}
	
	public void acntWithdraw() {
		clickAcntWithdraw.click();
	}
	
	public void acntWithdrawAmount(String deposit) {
		inputAcntWithdrawAmount.sendKeys(prop.getProperty("deposit"));
	}
	
	public void acntWithdrawSubmitBtn() {
		inputAcntWithdrawSubmitBtn.click();
	}
	
	public String getAcntWithdrawMessage() {
		return verifyAcntWithdraw.getText();
	}
	
}
