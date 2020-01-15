package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class AcntDepositPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="//a[@href='#'][contains(.,'Transactions')]")	
	WebElement acntDepositTransactionLinkClick;		
			
	@FindBy(how=How.XPATH,using="//a[@href='/account/deposit']")	
	WebElement acntDepositLinkClick;
		
	@FindBy(how=How.XPATH,using="//*[@id='id']/option[5]")
	WebElement clickAcntDeposit;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='amount']")
	WebElement inputAcntDepositAmount;
	
			
	@FindBy(how=How.XPATH,using="//button[contains(.,'Submit')]")
	WebElement inputAcntDepositSubmitBtn;

	@FindBy(how=How.XPATH,using="//strong[@class='card-title text-light']")
	WebElement verifyAcntDeposit;
	
	
	public AcntDepositPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void acntDepositTransactionLink() {
		acntDepositTransactionLinkClick.click();
	}
		
	public void acntDepositLink() {
		acntDepositLinkClick.click();
	}
	
	public void acntDeposit() {
		clickAcntDeposit.click();
	}
	
	public void acntDepositAmount(String deposit) {
		inputAcntDepositAmount.sendKeys(prop.getProperty("deposit"));
	}
	
	public void acntDepositSubmitBtn() {
		inputAcntDepositSubmitBtn.click();
	}
	
	public String getAcntDepositMessage() {
		return verifyAcntDeposit.getText();
	}
	
}
