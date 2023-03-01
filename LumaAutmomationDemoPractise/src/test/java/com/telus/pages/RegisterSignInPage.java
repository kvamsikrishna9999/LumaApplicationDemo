package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class RegisterSignInPage {
//	String CreateAccountXpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']";
//	String succAccountPageMsgXpath = "//span[@class='base']";
//	String firstNameXpath = "//input[@id='firstname']";
//	String lastNameXpath = "//input[@id='lastname']";
//	String signUpCheckBoxXpath = "//input[@id='is_subscribed']";
//	String emailXpath = "//input[@id='email_address']";
//	String passwordXpath = "//input[@id='password']";
//	String conformPasswordXpath = "//input[@id='password-confirmation']";
//	String createAccountButtonXpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]";
//	String successRegistrationMsgXpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div";
	public WebDriver driver;
  public RegisterSignInPage(WebDriver driver) {
	  this.driver=driver;
  }
	@FindBy(how=How.XPATH,using = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
	@CacheLookup
	WebElement CreateAccountXpath;
	
	@FindBy(how=How.XPATH,using = "//span[@class='base']")
	@CacheLookup
	WebElement succAccountPageMsgXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='firstname']")
	@CacheLookup
	WebElement firstNameXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='lastname']")
	@CacheLookup
	WebElement lastNameXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='is_subscribed']")
	@CacheLookup
	WebElement signUpCheckBoxXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='email_address']")
	@CacheLookup
	WebElement emailXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='password']")
	@CacheLookup
	WebElement passwordXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='password-confirmation']")
	@CacheLookup
	WebElement conformPasswordXpath;
	
	@FindBy(how=How.XPATH,using = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	@CacheLookup
	WebElement createAccountButtonXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div")
	@CacheLookup
	WebElement successRegistrationMsgXpath;
	
	public void getCretePage() {
		if(CreateAccountXpath.isDisplayed()) {
			 CreateAccountXpath.click();
			System.out.print("Create account link is clicked successfully");
		}
		else
		{
			System.out.print("Create account link is not clicked successfully");
		}
	}
	
	public void setFirstName(String firstNameInput) {
			if(firstNameXpath.isDisplayed()) {
				firstNameXpath.sendKeys(firstNameInput);
				System.out.print("FirstName is displayed successfully as "+firstNameInput);
			}
			else
			{
				System.out.print("FirstName is not displayed successfully");
			}
		}
	public void setLastName(String lastNameInput) {
		if(lastNameXpath.isDisplayed()) {
			lastNameXpath.sendKeys(lastNameInput);
			System.out.print("LastName is displayed successfully as "+lastNameInput);
		}
		else
		{
			System.out.print("LastName is not displayed successfully");
		}
	}
	
	public void clickRegisterBtn() {
		if(signUpCheckBoxXpath.isDisplayed()) {

			System.out.print("SignUp button is displayeded successfully");
		}
		else {
			System.out.print("SignUp button is not displayed successfully");
		}
		//verify SignUp btn is enabled are not
		if(signUpCheckBoxXpath.isEnabled()) {
			System.out.print("SignUp button is enabled successfully");
			signUpCheckBoxXpath.click();
			System.out.print("SignUp button is clicked");
		}
		else {
			System.out.print("SignUp button is not enabled successfully");
		}
	}
	public void email(String emailInput) {
		if(emailXpath.isDisplayed()) {
			emailXpath.sendKeys(emailInput);
			System.out.print("email is displayed successfully as "+emailInput);
		}
		else
		{
			System.out.print("FirstName is not displayed successfully");
		}
	}
	public void password(String passwordInput) {
		if(passwordXpath.isDisplayed()) {
			passwordXpath.sendKeys(passwordInput);
			System.out.print("email is displayed successfully as "+ passwordInput);
		}
		else
		{
			System.out.print("FirstName is not displayed successfully");
		}
	}
	public void conformPassword(String conformPasswordInput) {
		if(conformPasswordXpath.isDisplayed()) {
			conformPasswordXpath.sendKeys(conformPasswordInput);
			System.out.print("email is displayed successfully as "+conformPasswordInput);
		}
		else
		{
			System.out.print("FirstName is not displayed successfully");
		}
	}
	
	public void creteAccountBtn() {
		if(createAccountButtonXpath.isSelected()) {

			Reporter.log("CreteAccount button is Selected successfully");
		}
		else {
			System.out.print("CreteAccount button is not Selected successfully");
		}
		//verify CreteAccount btn is enabled are not
		if(createAccountButtonXpath.isEnabled()) {
			System.out.print("CreteAccount button is enabled successfully");
			createAccountButtonXpath.click();
			System.out.print("CreteAccount button is clicked");
		}
		else {
			System.out.print("SignUp button is not enabled successfully");
		}
}
}
