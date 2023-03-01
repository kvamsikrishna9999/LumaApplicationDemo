package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

	public WebDriver driver;
	

	//	  String signInLinkXpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]";
	//		String pageTitleSignInXpath = "//span[@class='base']";
	//		String emailIdSignINXpath = "//input[@id='email']";
	//		String passwordSignInXpath = "//fieldset[@class='fieldset login']//input[@id='pass']";
	//		String signInBtnXpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]";
	//		String signInWelcomeMsgXpath = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span";
	@FindBy(how=How.XPATH,using = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	@CacheLookup
	WebElement signInLinkXpath;

	@FindBy(how=How.XPATH,using = "//span[@class='base']")
	@CacheLookup
	WebElement pageTitleSignInXpath;

	@FindBy(how=How.XPATH,using = "//input[@id='email']")
	@CacheLookup
	WebElement emailIdSignINXpath;

	@FindBy(how=How.XPATH,using = "//fieldset[@class='fieldset login']//input[@id='pass']")
	@CacheLookup
	WebElement passwordSignInXpath;

	@FindBy(how=How.ID,using = "send2")
	@CacheLookup
	WebElement signInBtnId;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
    
	public void getSignInPage()  {
		if(signInLinkXpath.isSelected()) {

			System.out.print("SignIn button is displayeded successfully");
		}
		else {
			System.out.print("SignIn button is not displayed successfully");
		}
		//verify SignUp btn is enabled are not
		if(signInLinkXpath.isEnabled()) {
			System.out.print("SignIn button is enabled successfully");
			signInLinkXpath.click();
			System.out.print("SignUp button is clicked");
		}
		else {
			System.out.print("SignIn button is not enabled successfully");
		}
	}
	
	public void getSignInPageTitle() {
		if(pageTitleSignInXpath.isDisplayed()) {
			String msg = pageTitleSignInXpath.getText();
			System.out.println(msg);
			System.out.println("Title is displayed as :"+ msg);
		}else {
			System.out.println("Title is not displayed successfully");

		}
	}
	public void signInEmail(String emailInput) {
		if(emailIdSignINXpath.isDisplayed()) {
			emailIdSignINXpath.sendKeys(emailInput);
			System.out.print("email is displayed successfully as "+emailInput);
		}
		else
		{
			System.out.print("email is not displayed successfully");
		}
	}
	public void signInPassword(String passwordInput) {
		if(passwordSignInXpath.isDisplayed()) {
			passwordSignInXpath.sendKeys(passwordInput);
			System.out.print("password is displayed successfully as "+ passwordInput);
		}
		else
		{
			System.out.print("password is not displayed successfully");
		}
	}
	
	public void clickSignInBtn() {
	
		if(signInBtnId.isSelected()) {

			System.out.print("SignIn button is Selected successfully");
		}
		else {
			System.out.print("SignIn button is not Selected successfully");
		}
		//verify SignUp btn is enabled are not
		if(signInBtnId.isEnabled()) {
			signInBtnId.click();
			System.out.print("SignUp button is clicked");
			System.out.print("SignIn button is enabled successfully");
		}
		else {
			System.out.print("SignIn button is not enabled successfully");
		}
}

}