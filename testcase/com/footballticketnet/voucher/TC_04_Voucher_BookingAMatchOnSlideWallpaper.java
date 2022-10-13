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

public class TC_04_Voucher_BookingAMatchOnSlideWallpaper extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	VoucherPageObject voucherPage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void Voucher_TC001_Buy_With_Empty_Data(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Click on 'Buy Now' on slide wallpaper");
//		homePage.clickToBuyNowOnSlideWallpaper();
//		homePage.getListCategoryOfFootballMatch();
//		homePage.chooseTheTicketWithTheHighestPrice();

	}

}
