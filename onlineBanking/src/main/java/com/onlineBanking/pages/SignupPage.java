package com.onlineBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onlineBanking.base.BaseTest;

public class SignupPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using="//select[@id='title']")
	WebElement signupTitle;
	
	@FindBy(how=How.XPATH,using="//input[@id='firstName']")
	WebElement firstNameField;
	
	@FindBy(how=How.XPATH,using="//input[@id='lastName']")
	WebElement lastNameField;
	
	@FindBy(how=How.XPATH,using="//input[@value='M']")
	WebElement genderRadio;
	
	@FindBy(how=How.XPATH,using="//input[@id='dob']")
	WebElement dobField;
	
	@FindBy(how=How.XPATH,using="//input[@id='ssn']")
	WebElement ssnField;
	
	@FindBy(how=How.XPATH,using="//input[@id='emailAddress']")
	WebElement emailField;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	WebElement passwordField;
	
	@FindBy(how=How.XPATH,using="//input[@id='confirmPassword']")
	WebElement confirmPasswordField;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit'][contains(.,'Next')]")	
	WebElement nextButtonClick;
	
	@FindBy(how=How.XPATH,using="//input[@id='address']")
	WebElement addressField;
	
	@FindBy(how=How.XPATH,using="//input[@id='locality']")
	WebElement cityField;
	
	@FindBy(how=How.XPATH,using="//input[@id='region']")
	WebElement regionField;
	
	@FindBy(how=How.XPATH,using="//input[@id='postalCode']")
	WebElement postalCodeField;
	
	@FindBy(how=How.XPATH,using="//input[@id='country']")
	WebElement countryField;
	
	@FindBy(how=How.XPATH,using="//input[@id='homePhone']")
	WebElement homePhoneField;
	
	@FindBy(how=How.XPATH,using="//input[@id='mobilePhone']")
	WebElement mobilePhoneField;
	
	@FindBy(how=How.XPATH,using="//input[@id='workPhone']")
	WebElement workPhoneField;
		
	@FindBy(how=How.XPATH,using="//input[@id='agree-terms']")	
	WebElement agreeFieldClick;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit'][contains(.,'Register')]")	
	WebElement registerButtonClick;
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectTitle() {
		signupTitle.click();
		Select sel = new Select(signupTitle);
		sel.selectByValue("Mr.");		
	}
			
	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	
	public void clickGender() {
		genderRadio.click();
	}	
	
	public void enterDob(String dob) {
		dobField.sendKeys(prop.getProperty("dob"));
	}
		
	public void enterSsn(String ssn) {
		ssnField.sendKeys(prop.getProperty("ssn"));
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(prop.getProperty("email"));
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(prop.getProperty("password"));
	}
	
	public void enterConfirmPassword(String password) {
		confirmPasswordField.sendKeys(prop.getProperty("password"));
	}
	
	public void clickOnLoginButton() {
		nextButtonClick.click();
	}
	
	public void enterAddress(String address) {
		addressField.sendKeys(prop.getProperty("address"));
	}
	
	public void enterCity(String city) {
		cityField.sendKeys(prop.getProperty("city"));
	}
	
	public void enterRegion(String region) {
		regionField.sendKeys(prop.getProperty("region"));
	}
	
	public void enterPostalCode(String postalCode) {
		postalCodeField.sendKeys(prop.getProperty("postalCode"));
	}
	
	public void enterCountry(String country) {
		countryField.sendKeys(prop.getProperty("country"));
	}
	
	public void enterHomePhone(String homePhone) {
		homePhoneField.sendKeys(prop.getProperty("homePhone"));
	}
	
	public void enterMobilePhone(String mobilePhone) {
		mobilePhoneField.sendKeys(prop.getProperty("mobilePhone"));
	}
	
	public void enterWorkPhone(String workPhone) {
		workPhoneField.sendKeys(prop.getProperty("workPhone"));
	}
	
	public void agreeClick() {
		agreeFieldClick.click();
	}
	
	public void registerBtnClick() {
		registerButtonClick.click();
	}
	
	
	
}
