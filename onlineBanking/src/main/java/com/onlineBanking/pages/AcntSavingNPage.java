package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class AcntSavingNPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="(//a[contains(.,'Saving')])[1]")	
	WebElement acntSavingNewSavingClick;		
			
	@FindBy(how=How.XPATH,using="//a[@href='/account/savings-add']")	
	WebElement acntSavingNewLinkClick;
		
	@FindBy(how=How.XPATH,using="//input[@id='Savings']")
	WebElement clickAcntSavingNewType;
	
	@FindBy(how=How.XPATH,using="//input[@id='Individual']")
	WebElement clickAcntSavingNewOwnership;
	
	@FindBy(how=How.XPATH,using="//input[@id='name']")
	WebElement inputAcntSavingNewAcntName;
		
	@FindBy(how=How.XPATH,using="//input[@id='openingBalance']")
	WebElement inputAcntSavingNewDepositAmount;
	
	@FindBy(how=How.XPATH,using="//button[@id='newSavingsSubmit']")
	WebElement inputAcntSavingNewSubmitBtn;

	@FindBy(how=How.XPATH,using="//strong[@class='card-title text-light']")
	WebElement verifyAcntSavingNew;
	
	
	public AcntSavingNPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void acntSavingViewSavingLink() {
		acntSavingNewSavingClick.click();
	}
		
	public void acntSavingNewLink() {
		acntSavingNewLinkClick.click();
	}
	
	public void acntSavingNewType() {
		clickAcntSavingNewType.click();
	}
	
	public void acntSavingNewOwnership() {
		clickAcntSavingNewOwnership.click();
	}
	
	public void acntSavingNewAcntName(String accountName) {
		inputAcntSavingNewAcntName.sendKeys(prop.getProperty("accountName"));
	}
	
	public void acntSavingNewDeposit(String deposit) {
		inputAcntSavingNewDepositAmount.sendKeys(prop.getProperty("deposit"));
	}
	
	public void acntSavingNewSubmitBtn() {
		inputAcntSavingNewSubmitBtn.click();
	}
	
	public String getAcntSavingNewMessage() {
		return verifyAcntSavingNew.getText();
	}
	
}
