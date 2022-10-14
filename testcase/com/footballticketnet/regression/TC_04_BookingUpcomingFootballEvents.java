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

public class TC_04_BookingUpcomingFootballEvents extends BaseTest {
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
	public void TC_01(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Click on 'Buy Now' on slide wallpaper");
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);
		homePage.clickToChooseCategoryDropdown();
		homePage.chooseCategoryByItem(GlobalConstants.CHOOSE_CATEGORY_BY_LABEL);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("295.00");
		checkoutPage.inputBillingAddress();
		checkoutPage.inputBillingDetail();
		checkoutPage.clickToNextButton();
		checkoutPage.chooseThePaymentMethod(GlobalConstants.CREDIT_CARD_IN_USD);
		checkoutPage.inputPaymentMethod();

//		homePage.chooseTheTicketWithTheHighestPrice();

	}

}
