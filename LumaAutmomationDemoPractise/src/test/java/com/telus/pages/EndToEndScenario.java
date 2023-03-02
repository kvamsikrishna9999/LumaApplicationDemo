package com.telus.pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 
public class EndToEndScenario {
	public static void main(String[] args) throws Exception {
		// Set the system properties for the chromedriver.
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Declaring xpath Locators values in string variables .
		String CreateAccountXpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']";
		String succAccountPageMsgXpath = "//span[@class='base']";
		String firstNameXpath = "//input[@id='firstname']";
		String lastNameXpath = "//input[@id='lastname']";
		String signUpCheckBoxXpath = "//input[@id='is_subscribed']";
		String emailXpath = "//input[@id='email_address']";
		String passwordXpath = "//input[@id='password']";
		String conformPasswordXpath = "//input[@id='password-confirmation']";
		String createAccountButtonXpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]";
	//	String successRegistrationMsgXpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div";
		String welcomeNameDropdownXpath = "//button[@class='action switch']";
		String signOutXpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']";
		//SignIn page Locators declaration;
		String signInLinkXpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]";
		String pageTitleSignInXpath = "//span[@class='base']";
		String emailIdSignINXpath = "//input[@id='email']";
		String passwordSignInXpath = "//fieldset[@class='fieldset login']//input[@id='pass']";
		String signInBtnXpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]";
		String signInWelcomeMsgXpath = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span";


		//Gear Dropdown Locators Declaration.
		String gearDropdownXpath = "//span[normalize-space()='Gear']";
		String watchesDropdownXpath = "//*[@id=\"narrow-by-list2\"]/dd/ol/li[3]/a";
		String watchPageTitleXpath = "//span[@class='base']";
		String categoryDropdownXpath = "//div[normalize-space()='Category']";
		String FashionDropdownXpath = "//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[3]//a[1]";
		String priceDropdownXpath ="//div[normalize-space()='Price']";
		String highCostDropdownXpath = "//div[@id='layered-filter-block']//div[1]//div[2]//ol[1]//li[2]//a[1]";
		String activityDropdownXpath = "//div[normalize-space()='Activity']";
		String reactionDropdownXpath ="//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a";
		String materialDropdownXpath = "//div[normalize-space()='Material']";
		String leatherDropdownXpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a";
		String genderDropdownXpath = "//div[normalize-space()='Gender']";
		String menDropdownXpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a";
		String newDropdownXpath = "//div[normalize-space()='New']";
		String cruiseWatchProductXpath = "//img[@alt='Cruise Dual Analog Watch']";
		String addToCartXpath = "//*[@id='product-addtocart-button']/span";
		String cartOptionXpath ="//span[@class='counter-number']";
		String proceedToCheckOutXpath = "//*[@id='top-cart-btn-checkout']";
		String companyXpath = "//input[@name='company']";
		String streetAddressXpath = "//input[@name='street[0]']";
		String cityXpath = "//input[@name='city']";
		String countryDropdownXpath = "//select[@name='country_id']"; 
		String stateDropdownXpath = "//select[@name='region_id']";
		String postalCodeXpath = "//input[@name='postcode']";
		String phoneNumberXpath = "//input[@name='telephone']";
		String shippingMethodXpath = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input";
		String nextButtonXpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button/span";
		String placeOrderXpath ="//*[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button/span";
		String cartAmmountXpath = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[1]/td/span";
		String cartChargesXpath = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[2]/td/span";
		String totalCartAmmountXpath = "//*[@id='opc-sidebar']/div[1]/table/tbody/tr[3]/td/strong/span";
		String successValidationMsgXpath = "//span[@class='base']";
		String successOrderNumber = "//*[@id='maincontent']/div[3]/div/div[2]/p[1]";
		String continueShipingBtnXpath = "//a[@class='action primary continue']";
		
		//Declaring the variable inputs
		String firstNameInput = "Vamsi";
		String lastNameInput = "Krishna";
		Random random = new Random(); 
		int em = random.nextInt(1000);
		String emailInput ="krish"+em+"@gamil.com";
		String passwordInput = "Antony@143";
		String confirmPasswordInput = "Antony@143";

		//Declaring shipping address input
		String companyInput = "Telus";
		String streetAddressInput = "1-4 main Street ,sanampudi";
		String cityInput = "Singarayakonda";
		String postalCodeInput = "523101";
		String phoneNumInput = "9999999999";
		String countryInput = "India";
		String stateInput = "Andhra Pradesh";


		// Declare the application Url into the string variable.
		String url = "https://magento.softwaretestingboard.com/";
		// launching Url application.
		driver.get(url);
		// maximing the webpage.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement creteAccount = driver.findElement(By.xpath(CreateAccountXpath));
		creteAccount.click();
		Thread.sleep(5000);
		WebElement verifyCreateAccPageMsg = driver.findElement(By.xpath(succAccountPageMsgXpath));
		String actualMsg = verifyCreateAccPageMsg.getText();
		System.out.println(actualMsg);
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.xpath(firstNameXpath));
		firstName.sendKeys(firstNameInput);
		WebElement lastName = driver.findElement(By.xpath(lastNameXpath));
		lastName.sendKeys(lastNameInput);
		WebElement signUpBtn = driver.findElement(By.xpath(signUpCheckBoxXpath));
		signUpBtn.click();
		WebElement emailId = driver.findElement(By.xpath(emailXpath));
		emailId.sendKeys(emailInput);
		WebElement password = driver.findElement(By.xpath(passwordXpath));
		password.sendKeys(passwordInput);
		WebElement conformPassword = driver.findElement(By.xpath(conformPasswordXpath));
		conformPassword.sendKeys(confirmPasswordInput);
		WebElement CreateAccountBtn = driver.findElement(By.xpath(createAccountButtonXpath));
		CreateAccountBtn.click();
		System.out.println("LUMA Account is created successdfully");
//		WebElement SuccRegPageMsg = driver.findElement(By.xpath(successRegistrationMsgXpath));
//		String actualMsg1 = SuccRegPageMsg.getText();
//		System.out.println(actualMsg1);
//		String expectedMsg1 = "Thank you for registering with Fake Online Clothing Store.";
//		if(actualMsg1.contains(expectedMsg1)) {
//			System.out.println("The page name is displayed as :"+actualMsg);
//	    }else {
//			System.out.println("Actual and expected results are not same");
//     	}
		Thread.sleep(3000);
		WebElement WelomeDropdown = driver.findElement(By.xpath(welcomeNameDropdownXpath));
		Actions action = new Actions(driver);
		action.moveToElement(WelomeDropdown).build().perform();
		WelomeDropdown.click();
		WebElement signOut = driver.findElement(By.xpath(signOutXpath));
		signOut.click();
		System.out.println("SignOut button is clicked successfully");
		WebElement signInLink = driver.findElement(By.xpath(signInLinkXpath));
		signInLink.click();
		WebElement signINSuccMsg = driver.findElement(By.xpath(pageTitleSignInXpath));
		String signMsg = signINSuccMsg.getText();
		System.out.println(signMsg);
		WebElement signInEmailId = driver.findElement(By.xpath(emailIdSignINXpath));
		signInEmailId.sendKeys(emailInput);
		WebElement signInPassword = driver.findElement(By.xpath(passwordSignInXpath));
		signInPassword.sendKeys(passwordInput);
		WebElement signInBtn = driver.findElement(By.xpath(signInBtnXpath));
		signInBtn.click();

		WebElement signInPageTitle = driver.findElement(By.xpath(signInWelcomeMsgXpath));
		String output = signInPageTitle.getText();
		System.out.println(output);
//		Actions action1 = new Actions(driver);
		WebElement gear = driver.findElement(By.xpath(gearDropdownXpath));
		action.moveToElement(gear).build().perform();
		gear.click();
		System.out.println("Gear option is clicked");
		WebElement watches = driver.findElement(By.xpath(watchesDropdownXpath));
		action.moveToElement(watches).build().perform();
		watches.click();
		System.out.println("Watches option is clicked");
		WebElement watchPage = driver.findElement(By.xpath(watchPageTitleXpath));
		String title =watchPage.getText();
		System.out.println(title);
		WebElement category = driver.findElement(By.xpath(categoryDropdownXpath));
		action.moveToElement(category).build().perform();
		category.click();
		System.out.println("Category option is displayed");
		WebElement fasion = driver.findElement(By.xpath(FashionDropdownXpath));
		action.moveToElement(fasion).build().perform();
		fasion.click();
		System.out.println("Fasion option is displayed");
		WebElement price = driver.findElement(By.xpath(priceDropdownXpath));
		action.moveToElement(price).build().perform();
		price.click();
		System.out.println("price option is displayed");
		WebElement cost = driver.findElement(By.xpath(highCostDropdownXpath));
		action.moveToElement(cost).build().perform();
		cost.click();
		System.out.println("cost option is displayed");
		WebElement activity = driver.findElement(By.xpath(activityDropdownXpath));
		action.moveToElement(activity).build().perform();
		activity.click();	
		System.out.println("activity option is displayed");
		WebElement reaction = driver.findElement(By.xpath(reactionDropdownXpath));
		action.moveToElement(reaction).build().perform();;
		reaction.click();
		System.out.println("reaction option is displayed");
		WebElement material = driver.findElement(By.xpath(materialDropdownXpath));
		action.moveToElement(material).build().perform();
		material.click();
		System.out.println("material option is displayed");
		WebElement leather = driver.findElement(By.xpath(leatherDropdownXpath));
		action.moveToElement(leather).build().perform();;
		leather.click();
		System.out.println("leather option is displayed");
		WebElement gender = driver.findElement(By.xpath(genderDropdownXpath));
		action.moveToElement(gender).build().perform();
		gender.click();
		System.out.println("gender option is displayed");
		WebElement men = driver.findElement(By.xpath(menDropdownXpath));
		action.moveToElement(men).build().perform();
		men.click();
		System.out.println("men option is displayed");
		WebElement newOne = driver.findElement(By.xpath(newDropdownXpath));
		action.moveToElement(newOne).build().perform();
		newOne.click();
		System.out.println("newOne option is displayed");
		WebElement product = driver.findElement(By.xpath(cruiseWatchProductXpath));
		action.moveToElement(product).build().perform();
		product.click();
		System.out.println("product option is displayed");
		Thread.sleep(5000);
		WebElement addToCart = driver.findElement(By.xpath(addToCartXpath));
		addToCart.click();
		Thread.sleep(15000);
		WebElement cartOption = driver.findElement(By.xpath(cartOptionXpath));
		cartOption.click();
		System.out.println("Product is added to cart successfully");
		Thread.sleep(5000);
		WebElement proceedCheckOut = driver.findElement(By.xpath(proceedToCheckOutXpath));
		proceedCheckOut.click();
		Thread.sleep(5000);
		WebElement company = driver.findElement(By.xpath(companyXpath));
		company.sendKeys(companyInput);
		WebElement streetAddress = driver.findElement(By.xpath(streetAddressXpath));
		streetAddress.sendKeys(streetAddressInput);
		WebElement city = driver.findElement(By.xpath(cityXpath));
		city.sendKeys(cityInput);
		Thread.sleep(5000);
		WebElement country = driver.findElement(By.xpath(countryDropdownXpath));
		Select s = new Select(country);	
		s.selectByVisibleText(countryInput);
		System.out.println("India is selected successfully");
		Thread.sleep(5000);
		WebElement state = driver.findElement(By.xpath(stateDropdownXpath));
		Select s1 = new Select(state);	
		s1.selectByVisibleText(stateInput);
		System.out.println("Andhra Pradesh is selected successfully");
		Thread.sleep(5000);
		WebElement postalCode = driver.findElement(By.xpath(postalCodeXpath));
		postalCode.sendKeys(postalCodeInput);
		WebElement phnNum = driver.findElement(By.xpath(phoneNumberXpath));
		phnNum.sendKeys(phoneNumInput);
		Thread.sleep(5000);
		WebElement shippingBtn = driver.findElement(By.xpath(shippingMethodXpath));
		shippingBtn.click();
		System.out.println("shipping method is clicked successfully");
		Thread.sleep(5000);
		WebElement nextBtn = driver.findElement(By.xpath(nextButtonXpath));
		nextBtn.click();
		System.out.println("Next button is clicked successfully");
		Thread.sleep(10000);
		
		WebElement ammountProduct = driver.findElement(By.xpath(cartAmmountXpath));
		String amnt =ammountProduct.getText();		
		System.out.println("Product Price is : "+amnt);
//		NumberFormat format = NumberFormat.getCurrencyInstance();
//		Number number = format.parse(amnt);
//		String productAmt =(number.toString());
//		float productAmount = Float.parseFloat(productAmt);
//		System.out.println("Product price :"+productAmount);
//		Thread.sleep(6000);
		
		WebElement ammountCharge = driver.findElement(By.xpath(cartChargesXpath ));
		String amnt1 =ammountCharge.getText();
		System.out.println("Product Price "+amnt1);
		Thread.sleep(6000);
//		NumberFormat format1 = NumberFormat.getCurrencyInstance();
//		Number number1 = format1.parse(amnt1);
//		String delevaryCharge =(number1.toString());
//		float delevaryChargeAmount = Float.parseFloat(delevaryCharge);
//		System.out.println("Product price :"+delevaryChargeAmount);
//		Thread.sleep(6000);
		
		WebElement totalAmmountCharge = driver.findElement(By.xpath(totalCartAmmountXpath ));
		String title3 =totalAmmountCharge.getText();
		System.out.println("total amount :"+title3);
//		NumberFormat format2 = NumberFormat.getCurrencyInstance();
//		Number number2 = format2.parse(title3);
//		String totalDelevaryCharge =(number2.toString());
//		float finalTotalAmount = Float.parseFloat(totalDelevaryCharge);
//		System.out.println("total amount is displayed as :"+finalTotalAmount);
//		float delevaryProductWithTransport =productAmount+delevaryChargeAmount;
//		System.out.println(delevaryProductWithTransport);
//		if(Float.compare(finalTotalAmount,delevaryProductWithTransport) == 0) {
//			System.out.println("Payment method is working fine");
//		}
//		else {
//			System.out.println("Payment method is not working fine");
//		}
		
		Thread.sleep(3000);
		WebElement placeOrder = driver.findElement(By.xpath(placeOrderXpath));
		placeOrder.click();
		System.out.println("placeOrder button is clicked successfully");
		Thread.sleep(2000);
		WebElement successProductMsg = driver.findElement(By.xpath(successValidationMsgXpath));
		String msgValid = successProductMsg.getText();
		System.out.println(msgValid);
		WebElement successOrderMsg = driver.findElement(By.xpath(successOrderNumber));
		String msgValid1 = successOrderMsg.getText();
		System.out.println(msgValid1);
		Thread.sleep(5000);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement continueShipingBtn = driver.findElement(By.xpath(continueShipingBtnXpath));
		continueShipingBtn.click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='action switch'].")).click();
	    WebElement w1 = driver.findElement(By.xpath(welcomeNameDropdownXpath));
	     w1.click();
	     System.out.println("Action for signout button is clicked successfully");
		WebElement signOut1 = driver.findElement(By.xpath(signOutXpath));
		signOut1.click();
		System.out.println("SignOut button is clicked successfully");
	}	
}
