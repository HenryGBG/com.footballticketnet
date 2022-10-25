package com.footballticketnet.voucher;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import pageObjects.HomePageObject;
import pageObjects.VoucherPageObject;
import reportConfig.ExtentTestManager;

public class fecthAllLinks extends BaseTest {
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

		List<WebElement> allLinks = driver.findElements(By.tagName("form"));
		for (WebElement link : allLinks) {
			System.out.println(link.getText() + " - " + link.getAttribute("action"));
		}
	}

}
