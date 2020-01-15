package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.onlineBanking.base.BaseTest;

public class LoginPage extends BaseTest {
	
	
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	WebElement userLoginField;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	WebElement passwordLoginField;
	
	@FindBy(how=How.XPATH,using="//input[@id='remember-me']")	
	WebElement rememberMe;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[2]/form/div[4]/p/a")
	WebElement verifySignUpHere;
	
	@FindBy(how=How.XPATH,using="//a[@href='/signup']")
	WebElement signupLink;
	
	@FindBy(how=How.XPATH,using="//button[@id='submit']")	
	WebElement signinButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterLoginUser(String username) {
		userLoginField.sendKeys(prop.getProperty("username"));
	}
	
	public void enterLoginPassword(String password) {
		passwordLoginField.sendKeys(prop.getProperty("password"));
	}
	
	public void rememberMeClick() {
		rememberMe.click();
	}
	
	public void clickOnSigninButton() {
		signinButton.click();
	}
	
	public void login(String username, String password) {
		userLoginField.sendKeys(username);
		passwordLoginField.sendKeys(password);
		rememberMe.click();
		signinButton.click();
	}
	
	public SignupPage goToSignUpPage() throws Exception {
		Thread.sleep(2000);
		signupLink.click();
		return new SignupPage();
	}
}
