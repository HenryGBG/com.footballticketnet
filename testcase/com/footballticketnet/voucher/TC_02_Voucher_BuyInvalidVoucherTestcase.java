package com.footballticketnet.voucher;

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
import pageObjects.HomePageObject;
import pageObjects.VoucherPageObject;
import pageUIs.com.footballticketnet.VoucherPageUI;
import reportConfig.ExtentTestManager;

public class TC_02_Voucher_BuyInvalidVoucherTestcase extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	VoucherPageObject voucherPage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = PageGenerateManager.getHomePage(driver);
	}

	@Test
	public void Voucher_TC001_Buy_With_Empty_Data(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Navigate to 'Voucher' link");
		voucherPage = homePage.clickToVoucherLink();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 02: Click to 'Buy Now' button");
		voucherPage.clickBuyNowButton();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 03: Verify 'From' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtFromTextbox(), VoucherPageUI.VOUCHER_FROM_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 04: Verify 'To' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtToTextbox(), VoucherPageUI.VOUCHER_TO_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 05: Verify 'Amount' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtAmountTextbox(), VoucherPageUI.VOUCHER_AMOUNT_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 06: Verify 'Rate' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtRateTextbox(), VoucherPageUI.VOUCHER_RATE_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 07: Verify 'First Name' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtNameTextbox(), VoucherPageUI.VOUCHER_NAME_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 08: Verify 'Phone' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtPhoneTextbox(), VoucherPageUI.VOUCHER_PHONE_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 09: Verify 'Country' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtCountryTextbox(), VoucherPageUI.VOUCHER_COUNTRY_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 10: Verify 'Last Name' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtLastNameTextbox(),
				VoucherPageUI.VOUCHER_LAST_NAME_ERROR_MESSAGE);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 11: Verify 'Email' error message displayed");
		Assert.assertEquals(voucherPage.getErrorMessageAtEmailTextbox(), VoucherPageUI.VOUCHER_EMAIL_ERROR_MESSAGE);

	}

}
