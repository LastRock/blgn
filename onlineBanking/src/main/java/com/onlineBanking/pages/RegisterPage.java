package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class RegisterPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="//span[@class='badge badge-pill badge-success']")
	WebElement registerSuccessInfo;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyRegisterSuccess() {
		return registerSuccessInfo.getText();
	}
	
	

}
