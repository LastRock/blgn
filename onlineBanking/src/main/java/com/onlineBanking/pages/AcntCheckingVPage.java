package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class AcntCheckingVPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="(//a[contains(.,'Checking')])[1]")	
	WebElement acntCheckingViewCheckingClick;		
			
	@FindBy(how=How.XPATH,using="//a[@href='/account/checking-view']")	
	WebElement acntCheckingViewLinkClick;
	
	
	@FindBy(how=How.XPATH,using="//strong[@class='card-title text-light']")
	WebElement verifyAcntCheckingView;

	public AcntCheckingVPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAcntCheckingViewCheckingLink() {
		acntCheckingViewCheckingClick.click();
	}
	
	
	public void clickAcntCheckingViewLink() {
		acntCheckingViewLinkClick.click();
	}
	
	public String getAcntCheckingViewMessage() {
		return verifyAcntCheckingView.getText();
	}
		

}
