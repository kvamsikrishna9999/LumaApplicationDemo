package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class AddressPage {
public WebDriver driver;
public AddressPage(WebDriver driver) {
	this.driver=driver;
}
//String companyXpath = "//input[@name='company']";
//String streetAddressXpath = "//input[@name='street[0]']";
//String cityXpath = "//input[@name='city']";
//String countryDropdownXpath = "//select[@name='country_id']"; 
//String stateDropdownXpath = "//select[@name='region_id']";
//String postalCodeXpath = "//input[@name='postcode']";
//String phoneNumberXpath = "//input[@name='telephone']";
//String shippingMethodXpath = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input";
//String nextButtonXpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button/span";
//String companyInput = "Telus";
//String streetAddressInput = "1-4 main Street ,sanampudi";
//String cityInput = "Singarayakonda";
//String postalCodeInput = "523101";
//String phoneNumInput = "9999999999";
//String countryInput = "India";
//String stateInput = "Andhra Pradesh";
@FindBy(how=How.XPATH,using = "//input[@name='company']")
@CacheLookup
WebElement companyXpath;
@FindBy(how=How.XPATH,using = "//input[@name='street[0]']")
@CacheLookup
WebElement streetAddressXpath;
@FindBy(how=How.XPATH,using = "//input[@name='city']")
@CacheLookup
WebElement cityXpath;
@FindBy(how=How.XPATH,using = "//select[@name='country_id']")
@CacheLookup
WebElement countryDropdownXpath;
@FindBy(how=How.XPATH,using = "//select[@name='region_id']")
@CacheLookup
WebElement stateDropdownXpath;
@FindBy(how=How.XPATH,using = "//input[@name='postcode']")
@CacheLookup
WebElement postalCodeXpath;
@FindBy(how=How.XPATH,using = "//input[@name='telephone']")
@CacheLookup
WebElement phoneNumberXpath;
@FindBy(how=How.XPATH,using = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input")
@CacheLookup
WebElement shippingMethodXpath;
@FindBy(how=How.XPATH,using = "//*[@id=\"shipping-method-buttons-container\"]/div/button/span")
@CacheLookup
WebElement nextButtonXpath;
public void setCompanyName(String companyInput) {
	if(companyXpath.isDisplayed()) {
		companyXpath.sendKeys(companyInput);
		Reporter.log("company name is displayed successfully as "+companyInput);
	}
	else
	{
		Reporter.log("company name is not displayed successfully");
	}
}
public void setStreetAddress(String streetAddressInput) {
	if(streetAddressXpath.isDisplayed()) {
		streetAddressXpath.sendKeys(streetAddressInput);
		Reporter.log("streetAddress is displayed successfully as "+streetAddressInput);
	}
	else
	{
		Reporter.log("streetAddress is not displayed successfully");
	}
}
public void setCityName(String cityInput) {
	if(cityXpath.isDisplayed()) {
		cityXpath.sendKeys(cityInput);
		Reporter.log("City name is displayed successfully as "+cityInput);
	}
	else
	{
		Reporter.log("City name is not displayed successfully");
	}
}
	public void setCountry(String countryInput) {
		if (countryDropdownXpath.isDisplayed()) {
			Reporter.log("The Country name is displayed successfully");
		} else {
			Reporter.log("The Country name is not displayed successfully");
		}
		// Verify the country dropdown is enabled or not
		if (countryDropdownXpath.isEnabled()) {
			Reporter.log("The Countryname is enabled successfully");
		} else {
			Reporter.log("The country name is not enabled successfully");
		}
		Select dropdownValue = new Select(countryDropdownXpath);
		// Always mention the selection value inside the if statement
		if (countryDropdownXpath.isEnabled()) {
			// Select by using value
			dropdownValue.selectByVisibleText(countryInput);
			Reporter.log("The Selected Country is : " + countryInput);
		} else {
			Reporter.log("Country Name dropdown is not enabled successfully");
		}	
	}
	public void setStateDropdown(String stateInput) {
		if (stateDropdownXpath.isDisplayed()) {
			Reporter.log("The State name is displayed successfully");
		} else {
			Reporter.log("The State name is not displayed successfully");
		}
		// Verify the State dropdown is enabled or not
		if (stateDropdownXpath.isEnabled()) {
			Reporter.log("The State name is enabled successfully");
		} else {
			Reporter.log("The State name is not enabled successfully");
		}
		Select dropdownValue = new Select(stateDropdownXpath);
		// Always mention the selection value inside the if statement
		if (stateDropdownXpath.isEnabled()) {
			// Select by using value
			dropdownValue.selectByVisibleText(stateInput);
			Reporter.log("The Selected State is : " + stateInput);
		} else {
			Reporter.log("State Name dropdown is not enabled successfully");
		}	
	}
	public void setPostalCode(String PostalCodeInput) {
		if(postalCodeXpath.isDisplayed()) {
			postalCodeXpath.sendKeys(PostalCodeInput);
			Reporter.log("PostalCode is displayed successfully as "+PostalCodeInput);
		}
		else
		{
			Reporter.log("PostalCode is not displayed successfully");
		}
	}
	public void setPhoneNumber(String phoneNumberInput) {
		if(phoneNumberXpath.isDisplayed()) {
			phoneNumberXpath.sendKeys(phoneNumberInput);
			Reporter.log("phoneNumber is displayed successfully as "+phoneNumberInput);
		}
		else
		{
			Reporter.log("phoneNumber is not displayed successfully");
		}
	}
	public void clickShipingBtn() {	
		if(shippingMethodXpath.isSelected()) {

			Reporter.log("Shiping button is Selected successfully");
		}
		else {
			Reporter.log("Shiping button is not Selected successfully");
		}
		if(shippingMethodXpath.isEnabled()) {
			shippingMethodXpath.click();
			Reporter.log("Shiping button is clicked");
			Reporter.log("Shiping button is enabled successfully");
		}
		else {
			Reporter.log("Shiping button is not enabled successfully");
		}
}
	public void clickNextBtn() {	
		if(nextButtonXpath.isSelected()) {

			Reporter.log("Next button is Selected successfully");
		}
		else {
			Reporter.log("Next button is not Selected successfully");
		}
		if(nextButtonXpath.isEnabled()) {
			nextButtonXpath.click();
			Reporter.log("Next button is clicked");
			Reporter.log("Next button is enabled successfully");
		}
		else {
			Reporter.log("Next button is not enabled successfully");
		}
}
}



