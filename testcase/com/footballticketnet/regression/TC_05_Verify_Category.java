package com.footballticketnet.regression;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerateManager;
import pageObjects.CheckoutPageObject;
import pageObjects.HomePageObject;
import pageObjects.VoucherPageObject;
import reportConfig.ExtentTestManager;

public class TC_05_Verify_Category extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	VoucherPageObject voucherPage;
	CheckoutPageObject checkoutPage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void TC_01(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);
		homePage.clickToChooseCategoryDropdown();

		homePage.chooseCategoryByItem("Best Available");
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("252.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Best Available");

	}

	@Test
	public void TC_02_Category_1(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);

		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Category 1");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("433.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Category 1");
	}

	@Test
	public void TC_03_Category_1_Gold(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);
		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Category 1 Gold");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("532.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Category 1 Gold");
	}

	@Test
	public void TC_04_Category_1_Platium(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);
		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Category 1 Platinum");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("605.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Category 1 Platinum");
	}

	@Test
	public void TC_05_Category_1_Silver(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);

		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Category 1 Silver");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("481.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Category 1 Silver");
	}

	@Test
	public void TC_06_Category_2(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);

		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Category 2");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("401.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Category 2");
	}

	@Test
	public void TC_07_Category_3(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);

		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Category 3");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("352.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Category 3");
	}

	@Test
	public void TC_08_Category_4(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);

		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Category 4");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("335.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Category 4");
	}

	@Test
	public void TC_08_Category_Standing(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");
		ExtentTestManager.getTest().log(Status.INFO, "Category");

		homePage = PageGenerateManager.getHomePage(driver);
		homePage.clickToBuyNowOnEvent(GlobalConstants.TEAM_INFO_LABEL);

		homePage.clickToChooseCategoryDropdown();
		sleepInSecond(1);
		homePage.chooseCategoryByItem("Standing");
		sleepInSecond(1);
		checkoutPage = homePage.clickToBuyNowOnCategoryPageWithPrice("304.00");
		Assert.assertEquals(checkoutPage.getCategoryNameInCheckoutPage(), "Standing");
	}

}
