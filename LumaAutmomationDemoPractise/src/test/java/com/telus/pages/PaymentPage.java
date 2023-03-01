package com.telus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {
WebDriver driver;
public PaymentPage(WebDriver driver) {
	this.driver=driver;
}
//	String cartAmmountXpath = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[1]/td/span";
//	String cartChargesXpath = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[2]/td/span";
//	String totalCartAmmountXpath = "//*[@id='opc-sidebar']/div[1]/table/tbody/tr[3]/td/strong/span";
//String placeOrderXpath ="//*[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button/span";

	@FindBy(how=How.XPATH,using = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[1]/td/span")
	@CacheLookup
	WebElement cartAmmountXpath;
	@FindBy(how=How.XPATH,using = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[2]/td/span")
	@CacheLookup
	WebElement cartChargesXpath;
	@FindBy(how=How.XPATH,using = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[3]/td/strong/span")
	@CacheLookup
	WebElement totalCartAmmountXpath;
//	@FindBy(how=How.XPATH,using = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span")
//	@CacheLookup
//	WebElement placeOrderXpath1;
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Place Order']")
	@CacheLookup
	WebElement placeOrderXpath;
	
	public void getCartAmmount() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String cartProduct =cartAmmountXpath.getText();
		System.out.println("Actual cost of product is :"+cartProduct);
		
	}
	public void getCartCharges() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String cartCharge =cartChargesXpath.getText();
		System.out.println("Transport charge of product is :"+cartCharge);
		
	}
	public void getTotalCost() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String totalCartCharge =totalCartAmmountXpath.getText();
		System.out.println("totalCartCharge  of product is :"+totalCartCharge);	
	}
	public void clickPlaceOrderBtn() throws InterruptedException {	
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		placeOrderXpath1.click();
//		System.out.print("placeOrder button is clicked");

		if(placeOrderXpath.isSelected()) {

			System.out.print("placeOrder button is Selected successfully");
		}
		else {
			System.out.print("placeOrder button is not Selected successfully");
		}
		if(placeOrderXpath.isEnabled()) {
			Thread.sleep(8000);
			placeOrderXpath.click();
			System.out.print("placeOrder button is clicked");
			System.out.print("placeOrder button is enabled successfully");
		}
		else {
			System.out.print("placeOrder button is not enabled successfully");
		}
}

}

