package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class AcntSavingVPage extends BaseTest{
	
	
	
			
	@FindBy(how=How.XPATH,using="//a[@href='#'][contains(.,'Savings')]")	
	WebElement acntSavingViewSavingClick;		
			
	@FindBy(how=How.XPATH,using="//a[@href='/account/savings-view']")	
	WebElement acntSavingViewLinkClick;
	
	
	@FindBy(how=How.XPATH,using="//strong[@class='card-title text-light']")
	WebElement verifyAcntSavingView;

	public AcntSavingVPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAcntSavingViewSavingLink() {
		acntSavingViewSavingClick.click();
	}
	
	
	public void clickAcntSavingViewLink() {
		acntSavingViewLinkClick.click();
	}
	
	public String getAcntSavingViewMessage() {
		return verifyAcntSavingView.getText();
	}
		

}
