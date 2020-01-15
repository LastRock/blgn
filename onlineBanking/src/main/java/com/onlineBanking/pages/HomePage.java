package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class HomePage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="//li[@class='active'][contains(.,'Welcome Test')]")
	WebElement homeWelcomeMessage;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getWelcomeMessage() {
		return homeWelcomeMessage.getText();
	}
	
	

}