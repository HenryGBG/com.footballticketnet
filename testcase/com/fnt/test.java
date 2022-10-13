package com.fnt;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.GlobalBaseUI;
import commons.PageGenerateManager;
import pageObjects.BlogPageObject;
import pageObjects.ContactUsPageObject;
import pageObjects.FAQsPageObject;
import pageObjects.GlobalPageObject;
import pageObjects.HomePageObject;
import pageObjects.InternationalPageObject;
import pageObjects.MostPopularPageObject;
import pageObjects.StadiumTourPageObject;
import pageObjects.TeamsPageObject;
import pageObjects.TermConditionPageObject;
import pageObjects.TournamentsPageObject;
import pageObjects.VoucherPageObject;
import reportConfig.ExtentTestManager;

public class test extends BaseTest {

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void TC_01_Check_Copyright(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Voucher Page");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.scrollToBottomPage(driver);

		Assert.assertEquals(homePage.checkCopyRightFNT(), "© 2022 All rights reserved to Football Ticket Net");
	}

	WebDriver driver;
	HomePageObject homePage;
}
