package com.footballticketnet.regression;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerateManager;
import pageObjects.CheckoutPageObject;
import pageObjects.HomePageObject;
import pageObjects.VoucherPageObject;
import pageUIs.com.footballticketnet.VoucherPageUI;
import reportConfig.ExtentTestManager;

public class TC_03_Voucher_BuyValidVoucherTestcase extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	VoucherPageObject voucherPage;
	CheckoutPageObject checkoutPage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void Voucher_TC001_Buy_Voucher_With_Valid_Information(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher with valid infomation");

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Navigate to 'FootballTicketNet'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 02: Navigate to 'Voucher' link");
		voucherPage = homePage.clickToVoucherLink();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 03: Input information to 'Voucher details'");
		voucherPage.inputVoucherDetails();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 04: Input information to 'Buyer details'");
		voucherPage.inputBuyerDetails();

		voucherPage.clickToCheckboxVoucherTypeMoney();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 05: Click to 'Buy Now' button");
		checkoutPage = voucherPage.clickBuyNowButton();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 06: Input Address billing information");
		checkoutPage.inputBillingAddress();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 07: Input Details billing information");
		checkoutPage.inputBillingInfomationDetailsOnCheckoutPage();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 08: Click to 'Next' button");
		checkoutPage.clickToNextButton();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 09: Choose the 'Payment' method");
		checkoutPage.chooseThePaymentMethod(GlobalConstants.CREDIT_CARD_IN_USD);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 10: Input valid data into 'Payment' form");
		checkoutPage.inputPaymentMethod();

	}

}
