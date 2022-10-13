package com.fnt;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import pageUIs.com.footballticketnet.HomePageUIs;
import reportConfig.ExtentTestManager;

public class testScript extends BaseTest {

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void TC_01_Check_Copyright(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Voucher Page");
		homePage = PageGenerateManager.getHomePage(driver);
//
//		homePage.clickToSelectCountry();
//		homePage.selectCountryFrench();

		sleepInSecond(5);

		homePage.searchUpcomingMatch("Paris");
		homePage.clickOnSearchResult("Paris");
		homePage.openChooseCategory();
		homePage.chooseCategoryByItem("Best Available");
		homePage.clickToResetButton();
		isProductNameSortByASCLambda(driver, HomePageUIs.CATEGORY_LIST_ITEMS);
	}

	WebDriver driver;
	HomePageObject homePage;

	public boolean isProductNameSortByASCLambda(WebDriver driver, String locatorType) {
		List<WebElement> elementLists = getListWebElement(driver, locatorType);
		List<String> names = elementLists.stream().map(n -> n.getText()).collect(Collectors.toList());
		for (String name : names) {
			System.out.println(name);
		}
		List<String> sortedNames = new ArrayList<String>(names);

//		Collections.sort(sortedNames);

//		for (String sortedName : sortedNames) {
//			System.out.println("Product name sau khi Sort: " + sortedName);
//		}
		return names.equals(sortedNames);
	}

	public List<WebElement> getListWebElement(WebDriver driver, String locatorType) {
		return driver.findElements(getBylocator(locatorType));

	}

	private By getBylocator(String locatorType) {
		By by = null;
		if (locatorType.startsWith("id=") || locatorType.startsWith("ID=") || locatorType.startsWith("Id=")) {
			by = By.id(locatorType.substring(3));
		} else if (locatorType.startsWith("class=") || locatorType.startsWith("CLASS=")
				|| locatorType.startsWith("Class=")) {
			by = By.className(locatorType.substring(6));
		} else if (locatorType.startsWith("name=") || locatorType.startsWith("NAME=")
				|| locatorType.startsWith("Name=")) {
			by = By.name(locatorType.substring(5));
		} else if (locatorType.startsWith("css=") || locatorType.startsWith("CSS=") || locatorType.startsWith("Css=")) {
			by = By.cssSelector(locatorType.substring(4));
		} else if (locatorType.startsWith("xpath=") || locatorType.startsWith("XPATH=")
				|| locatorType.startsWith("Xpath=")) {
			by = By.xpath(locatorType.substring(6));
		} else {
			throw new RuntimeException("Locartor type is not supported!");
		}
		return by;

	}
}
