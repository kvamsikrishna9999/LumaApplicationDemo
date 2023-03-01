package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage {
	//	String gearDropdownXpath = "//span[normalize-space()='Gear']";
	//	String watchesDropdownXpath = "//*[@id=\"narrow-by-list2\"]/dd/ol/li[3]/a";
	//	String watchPageTitleXpath = "//span[@class='base']";
	//	String categoryDropdownXpath = "//div[normalize-space()='Category']";
	//	String FashionDropdownXpath = "//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[3]//a[1]";
	//	String priceDropdownXpath ="//div[normalize-space()='Price']";
	//	String highCostDropdownXpath = "//div[@id='layered-filter-block']//div[1]//div[2]//ol[1]//li[2]//a[1]";
	//	String activityDropdownXpath = "//div[normalize-space()='Activity']";
	//	String reactionDropdownXpath ="//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a";
	//	String materialDropdownXpath = "//div[normalize-space()='Material']";
	//	String leatherDropdownXpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a";
	//	String genderDropdownXpath = "//div[normalize-space()='Gender']";
	//	String menDropdownXpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a";
	//	String newDropdownXpath = "//div[normalize-space()='New']";
	//	String cruiseWatchProductXpath = "//img[@alt='Cruise Dual Analog Watch']";
	//	String addToCartXpath = "//*[@id='product-addtocart-button']/span";
	//	String cartOptionXpath ="//span[@class='counter-number']";
	//	String proceedToCheckOutXpath = "//*[@id='top-cart-btn-checkout']";

	@FindBy(how=How.XPATH,using = "//span[normalize-space()='Gear']")
	@CacheLookup
	WebElement gearDropdownXpath;

	@FindBy(how=How.XPATH,using = "//*[@id=\"narrow-by-list2\"]/dd/ol/li[3]/a")
	@CacheLookup
	WebElement watchesLinkXpath;

	@FindBy(how=How.XPATH,using = "//span[@class='base']")
	@CacheLookup
	WebElement watchPageTitleXpath;
	@FindBy(how=How.XPATH,using = "//div[normalize-space()='Category']")
	@CacheLookup
	WebElement categoryDropdownXpath;
	@FindBy(how=How.XPATH,using = "//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[3]//a[1]")
	@CacheLookup
	WebElement FashionDropdownXpath;
	@FindBy(how=How.XPATH,using = "//div[normalize-space()='Price']")
	@CacheLookup
	WebElement priceDropdownXpath;
	@FindBy(how=How.XPATH,using = "//div[@id='layered-filter-block']//div[1]//div[2]//ol[1]//li[2]//a[1]")
	@CacheLookup
	WebElement highCostDropdownXpath;
	@FindBy(how=How.XPATH,using = "//div[normalize-space()='Activity']")
	@CacheLookup
	WebElement activityDropdownXpath;
	@FindBy(how=How.XPATH,using = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a")
	@CacheLookup
	WebElement reactionDropdownXpath;
	@FindBy(how=How.XPATH,using = "//div[normalize-space()='Material']")
	@CacheLookup
	WebElement materialDropdownXpath;
	@FindBy(how=How.XPATH,using = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")
	@CacheLookup
	WebElement leatherDropdownXpath;
	@FindBy(how=How.XPATH,using = "//div[normalize-space()='Gender']")
	@CacheLookup
	WebElement genderDropdownXpath;
	@FindBy(how=How.XPATH,using = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a")
	@CacheLookup
	WebElement menDropdownXpath;
	@FindBy(how=How.XPATH,using = "//div[normalize-space()='New']")
	@CacheLookup
	WebElement newDropdownXpath;
	@FindBy(how=How.XPATH,using = "//img[@alt='Cruise Dual Analog Watch']")
	@CacheLookup
	WebElement cruiseWatchProductXpath;

	public WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}
	public void getGearDropDown() {
		if(gearDropdownXpath.isDisplayed()) {

			System.out.print("gearDropdown button is displayeded successfully");
		}
		else {
			System.out.print("gearDropdown button is not displayed successfully");
		}
		if(gearDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(gearDropdownXpath).build().perform();
			System.out.print("gearDropdown button is enabled successfully");
			gearDropdownXpath .click();
			System.out.print("gearDropdown button is clicked");
		}
		else {
			System.out.print("gearDropdown button is not enabled successfully");
		}
	}
	public void getWatchesLink() {
		if(watchesLinkXpath.isSelected()) {

			System.out.print("WatchesLink is Selected successfully");
		}
		else {
			System.out.print("WatchesLink is not Selected successfully");
		}
		//verify SignUp btn is enabled are not
		if(watchesLinkXpath.isEnabled()) {
			watchesLinkXpath.click();
			System.out.print("WatchesLink is clicked");
			System.out.print("WatchesLink is enabled successfully");
		}
		else {
			System.out.print("WatchesLink  is not enabled successfully");
		}
	}
	public void getWatchPageTitle() {
		if(watchPageTitleXpath.isDisplayed()) {
			String watchTitle =	watchPageTitleXpath.getText();
			System.out.println(watchTitle);
		}
	}

	public void getCategoryDropDown() {
		if(categoryDropdownXpath.isDisplayed()) {

			System.out.print("categoryDropdown button is displayeded successfully");
		}
		else {
			System.out.print("categoryDropdown button is not displayed successfully");
		}
		if(categoryDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(categoryDropdownXpath).build().perform();
			System.out.print("categoryDropdown button is enabled successfully");
			categoryDropdownXpath .click();
			System.out.print("categoryDropdown button is clicked");
		}
		else {
			System.out.print("categoryDropdown button is not enabled successfully");
		}
	}
	public void getFashionDropDown() {
		if(FashionDropdownXpath.isDisplayed()) {

			System.out.print("FashionDropdown button is displayeded successfully");
		}
		else {
			System.out.print("FashionDropdown button is not displayed successfully");
		}
		if(FashionDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(FashionDropdownXpath).build().perform();
			System.out.print("FashionDropdown button is enabled successfully");
			FashionDropdownXpath .click();
			System.out.print("FashionDropdown button is clicked");
		}
		else {
			System.out.print("FashionDropdown button is not enabled successfully");
		}
	}
	public void getPriceDropDown() {
		if(priceDropdownXpath.isSelected()) {

			System.out.print("	price Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	priceDropdown button is not displayed successfully");
		}
		if(priceDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(priceDropdownXpath).build().perform();
			System.out.print("	priceDropdown button is enabled successfully");
			priceDropdownXpath .click();
			System.out.print("	priceDropdown button is clicked");
		}
		else {
			System.out.print("	priceDropdown button is not enabled successfully");
		}
	}
	public void getcostDropDown() {
		if(highCostDropdownXpath.isDisplayed()) {

			System.out.print("	highCost Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	highCost Dropdown button is not displayed successfully");
		}
		if(highCostDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(highCostDropdownXpath).build().perform();
			System.out.print("	highCost Dropdown button is enabled successfully");
			highCostDropdownXpath .click();
			System.out.print("	highCost Dropdown button is clicked");
		}
		else {
			System.out.print("	highCost Dropdown button is not enabled successfully");
		}
	}
	public void getActivityDropDown() {
		if(activityDropdownXpath.isDisplayed()) {

			System.out.print("	activity Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	activity Dropdown button is not displayed successfully");
		}
		if(activityDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(activityDropdownXpath).build().perform();
			System.out.print("	activity Dropdown button is enabled successfully");
			activityDropdownXpath .click();
			System.out.print("	activity Dropdown button is clicked");
		}
		else {
			System.out.print("	activity Dropdown button is not enabled successfully");
		}
	}
	public void getReactionDropDown() {
		if(reactionDropdownXpath.isDisplayed()) {

			System.out.print("	reaction Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	reaction Dropdown button is not displayed successfully");
		}
		if(reactionDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(reactionDropdownXpath).build().perform();
			System.out.print("	reaction Dropdown button is enabled successfully");
			reactionDropdownXpath .click();
			System.out.print("	reaction Dropdown button is clicked");
		}
		else {
			System.out.print("	reaction Dropdown button is not enabled successfully");
		}
	}
	public void getMaterialDropDown() {
		if(materialDropdownXpath.isDisplayed()) {

			System.out.print("	material Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	material Dropdown button is not displayed successfully");
		}
		if(materialDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(materialDropdownXpath).build().perform();
			System.out.print("	material Dropdown button is enabled successfully");
			materialDropdownXpath .click();
			System.out.print("	material Dropdown button is clicked");
		}
		else {
			System.out.print("	material Dropdown button is not enabled successfully");
		}
	}
	public void getleatherDropDown() {
		if(leatherDropdownXpath.isDisplayed()) {

			System.out.print("	leather Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	leather Dropdown button is not displayed successfully");
		}
		if(leatherDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(leatherDropdownXpath).build().perform();
			System.out.print("	leather Dropdown button is enabled successfully");
			leatherDropdownXpath .click();
			System.out.print("	leather Dropdown button is clicked");
		}
		else {
			System.out.print("	leather Dropdown button is not enabled successfully");
		}
	}
	public void getGenderDropDown() {
		if(genderDropdownXpath.isDisplayed()) {

			System.out.print("	gender Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	gender Dropdown button is not displayed successfully");
		}
		if(genderDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(genderDropdownXpath).build().perform();
			System.out.print("	gender Dropdown button is enabled successfully");
			genderDropdownXpath .click();
			System.out.print("	gender Dropdown button is clicked");
		}
		else {
			System.out.print("gender Dropdown button is not enabled successfully");
		}
	}
	public void getMenDropDown() {
		if(menDropdownXpath.isDisplayed()) {

			System.out.print("	men Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	men Dropdown button is not displayed successfully");
		}
		if(menDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(menDropdownXpath).build().perform();
			System.out.print("	men Dropdown button is enabled successfully");
			menDropdownXpath .click();
			System.out.print("	men Dropdown button is clicked");
		}
		else {
			System.out.print("men Dropdown button is not enabled successfully");
		}
	}
	public void getNewDropDown() {
		if(newDropdownXpath.isDisplayed()) {

			System.out.print("	New Dropdown button is displayeded successfully");
		}
		else {
			System.out.print("	New Dropdown button is not displayed successfully");
		}
		if(newDropdownXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(newDropdownXpath).build().perform();
			System.out.print("	New Dropdown button is enabled successfully");
			newDropdownXpath .click();
			System.out.print("	New Dropdown button is clicked");
		}
		else {
			System.out.print("New Dropdown button is not enabled successfully");
		}
	}
	public void getCruiseWatchProduct() {
//		Actions action = new Actions(driver);
//		action.moveToElement(cruiseWatchProductXpath).build().perform();
//		cruiseWatchProductXpath.click();
//		System.out.println("cruiseWatchProduct option is displayed");
		if(cruiseWatchProductXpath.isDisplayed()) {

			System.out.print("	CruiseWatchProduct is displayeded successfully");
		}
		else {
			System.out.print("	CruiseWatchProduct is not displayed successfully");
		}
		if(cruiseWatchProductXpath.isEnabled()) {
			Actions action = new Actions(driver);
			action.moveToElement(cruiseWatchProductXpath).build().perform();
			System.out.print("	CruiseWatchProduct is enabled successfully");
			cruiseWatchProductXpath .click();
			System.out.print("	CruiseWatchProduct is clicked");
		}
		else {
			System.out.print("CruiseWatchProduct  is not enabled successfully");
		}
	}
}