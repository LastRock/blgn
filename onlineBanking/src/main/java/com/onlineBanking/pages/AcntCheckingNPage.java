package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class AcntCheckingNPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="(//a[contains(.,'Checking')])[1]")	
	WebElement acntCheckingNewCheckingClick;		
			
	@FindBy(how=How.XPATH,using="//a[@href='/account/checking-add']")	
	WebElement acntCheckingNewLinkClick;
		
	@FindBy(how=How.XPATH,using="//input[@id='Standard Checking']")
	WebElement clickAcntCheckingNewType;
	
	@FindBy(how=How.XPATH,using="//input[@id='Individual']")
	WebElement clickAcntCheckingNewOwnership;
	
	@FindBy(how=How.XPATH,using="//input[@id='name']")
	WebElement inputAcntCheckingNewAcntName;
		
	@FindBy(how=How.XPATH,using="//input[@id='openingBalance']")
	WebElement inputAcntCheckingNewDepositAmount;
	
	@FindBy(how=How.XPATH,using="//button[contains(.,'Submit')]")
	WebElement inputAcntCheckingNewSubmitBtn;

	@FindBy(how=How.XPATH,using="//strong[@class='card-title text-light']")
	WebElement verifyAcntCheckingNew;
	
	
	public AcntCheckingNPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void acntCheckingViewCheckingLink() {
		acntCheckingNewCheckingClick.click();
	}
		
	public void acntCheckingNewLink() {
		acntCheckingNewLinkClick.click();
	}
	
	public void acntCheckingNewType() {
		clickAcntCheckingNewType.click();
	}
	
	public void acntCheckingNewOwnership() {
		clickAcntCheckingNewOwnership.click();
	}
	
	public void acntCheckingNewAcntName(String accountName) {
		inputAcntCheckingNewAcntName.sendKeys(prop.getProperty("accountName"));
	}
	
	public void acntCheckingNewDeposit(String deposit) {
		inputAcntCheckingNewDepositAmount.sendKeys(prop.getProperty("deposit"));
	}
	
	public void acntCheckingNewSubmitBtn() {
		inputAcntCheckingNewSubmitBtn.click();
	}
	
	public String getAcntCheckingNewMessage() {
		return verifyAcntCheckingNew.getText();
	}
	
}
