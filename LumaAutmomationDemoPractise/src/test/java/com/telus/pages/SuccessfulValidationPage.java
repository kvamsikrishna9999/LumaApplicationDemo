package com.telus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuccessfulValidationPage {
WebDriver driver;
public SuccessfulValidationPage(WebDriver driver) {
	this.driver=driver;
}

//String successValidationMsgXpath = "//span[@class='base']";
//String successOrderNumber = "//*[@id='maincontent']/div[3]/div/div[2]/p[1]";
//String continueShipingBtnXpath = "//a[@class='action primary continue']";
@FindBy(how=How.XPATH,using = "//span[@class='base']")
@CacheLookup
WebElement successValidationMsgXpath;
@FindBy(how=How.XPATH,using = "//*[@id='maincontent']/div[3]/div/div[2]/p[1]")
@CacheLookup
WebElement successOrderNumber;
@FindBy(how=How.XPATH,using = "//a[@class='action primary continue']")
@CacheLookup
WebElement continueShipingBtnXpath;

public void getSuccessValid() {
	String succMsg = successValidationMsgXpath.getText();
	System.out.println("Verification of product purchesed msg is "+succMsg);
}
public void getSuccessOrderId() {
	String orderNum = successOrderNumber.getText();
	System.out.println("Verification of product purchesed msg is "+orderNum);
}
public void clickContinueOrderBtn() {	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(continueShipingBtnXpath.isSelected()) {

		System.out.print("continueShiping button is Selected successfully");
	}
	else {
		System.out.print("continueShiping button is not Selected successfully");
	}
	if(continueShipingBtnXpath.isEnabled()) {
		continueShipingBtnXpath.click();
		System.out.print("continueShiping button is clicked");
		System.out.print("continueShiping button is enabled successfully");
	}
	else {
		System.out.print("continueShiping button is not enabled successfully");
	}
}



}
