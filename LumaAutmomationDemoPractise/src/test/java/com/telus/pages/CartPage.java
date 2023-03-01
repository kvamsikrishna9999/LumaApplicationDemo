package com.telus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {
	public WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using = "//button[@id='product-addtocart-button']")
	@CacheLookup
	WebElement addToCartXpath;
//	@FindBy(how=How.XPATH,using ="//*[@id=\"qty\"]")
//	@CacheLookup
//	WebElement CartXpath;
	@FindBy(how=How.XPATH, using="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	@CacheLookup
	WebElement addCartMsg;
	@FindBy(how=How.XPATH,using = "/html/body/div[2]/header/div[2]/div[1]/a")
	@CacheLookup
	WebElement cartOptionXpath;
	@FindBy(how=How.XPATH,using = "//*[@id='top-cart-btn-checkout']")
	@CacheLookup
	WebElement proceedToCheckOutXpath;

	public void clickAddToCartBtn() {

		if(addToCartXpath.isSelected()) {

			System.out.print("AddToCart button is Selected successfully");
		}
		else {
			System.out.print("AddToCart button is not Selected successfully");
		}
		if(addToCartXpath.isEnabled()) {
			addToCartXpath.click();
			System.out.print("AddToCart button is clicked");
			System.out.print("AddToCart button is enabled successfully");
		}
		else {
			System.out.print("AddToCart button is not enabled successfully");
		}
	}

	public void cartSuccfulValidMsg(String msg) {
		String cartValid =addCartMsg.getText();
		System.out.println("Actual msg is :"+cartValid);
		if(cartValid.equals(msg)) {
			System.out.println("Actaul and Expected are equal");
			System.out.println("Actual msg is :"+cartValid);
			System.out.println("Expected msg is :"+msg);
		}
		else
		{
			System.out.println("Actaul and Expected are not equal");
			System.out.println("Actual msg is :"+cartValid);
			System.out.println("Expected msg is :"+msg);
		}
	}

	public void clickCartOptionBtn() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		cartOptionXpath.click();
//		System.out.println("Cart option is clicked successfully");

		if(cartOptionXpath.isSelected()) {

			System.out.print("CartOption button is Selected successfully");
		}
		else {
			System.out.print("CartOption button is not Selected successfully");
		}
		if(cartOptionXpath.isEnabled()) {
			cartOptionXpath.click();
			System.out.print("CartOption button is clicked");
			System.out.print("CartOption button is enabled successfully");
		}else {
			System.out.print("CartOption button is not enabled successfully");
		}
	}
	public void clickproceedToCheckOutBtn() {
		if(proceedToCheckOutXpath.isSelected()) {

			System.out.print("proceedToCheckOut button is Selected successfully");
		}
		else {
			System.out.print("proceedToCheckOut button is not Selected successfully");
		}
		if(proceedToCheckOutXpath.isEnabled()) {
			proceedToCheckOutXpath.click();
			System.out.print("proceedToCheckOut button is clicked");
			System.out.print("proceedToCheckOut button is enabled successfully");
		}
		else {
			System.out.print("proceedToCheckOut button is not enabled successfully");
		}
	}
}

