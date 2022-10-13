package com.fnt;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.GlobalBaseUI;
import commons.GlobalConstants;
import commons.PageGenerateManager;
import pageObjects.BlogPageObject;
import pageObjects.ContactUsPageObject;
import pageObjects.FAQsPageObject;
import pageObjects.HomePageObject;
import pageObjects.InternationalPageObject;
import pageObjects.MostPopularPageObject;
import pageObjects.StadiumTourPageObject;
import pageObjects.TeamsPageObject;
import pageObjects.TermConditionPageObject;
import pageObjects.TournamentsPageObject;
import pageObjects.VoucherPageObject;
import pageUIs.com.footballticketnet.BlogPageUI;
import pageUIs.com.footballticketnet.ContactUsPageUI;
import pageUIs.com.footballticketnet.FAQsPageUI;
import pageUIs.com.footballticketnet.InternationalPageUI;
import pageUIs.com.footballticketnet.MostPopularPageUI;
import pageUIs.com.footballticketnet.StadiumTourPageUI;
import pageUIs.com.footballticketnet.TeamsPageUI;
import pageUIs.com.footballticketnet.TermConditionPageUI;
import pageUIs.com.footballticketnet.TournamentsPageUI;
import pageUIs.com.footballticketnet.VoucherPageUI;
import reportConfig.ExtentTestManager;

public class Swap_Country extends BaseTest {

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void TC_01_Check_Copyright1(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Voucher Page");
		homePage = PageGenerateManager.getHomePage(driver);

//		homePage.clickToSelectCountry();
//		homePage.selectCountryFrench();
//		homePage.selectCountryGerman();
//		homePage.selectCountryItalian();
//		homePage.selectCountryDutch();
//		homePage.selectCountryFinnish();
//		homePage.selectCountrySwedish();
//		homePage.selectCountryDanish();
//		homePage.selectCountrySpanish();

	}

	WebDriver driver;
	HomePageObject homePage;
}
