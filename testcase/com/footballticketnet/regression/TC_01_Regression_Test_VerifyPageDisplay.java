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

public class TC_01_Regression_Test_VerifyPageDisplay extends BaseTest {

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void TC_01_Regression_Verify_Voucher_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Voucher Page");

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

//		homePage.clickToSelectCountry();
//		homePage.selectCountryFrench();

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Navigate to 'Voucher' link");
		voucherPage = homePage.clickToVoucherLink();

		ExtentTestManager.getTest().log(Status.INFO,
				"Voucher - Step 02: Verify the title 'BUY A PRINTABLE E-GIFT CARD' displayed");
		Assert.assertEquals(voucherPage.getVoucherTitleHeading(), VoucherPageUI.COPYRIGHT_CHECKING.toUpperCase());
	}

	@Test
	public void TC_02_Regression_Verify_Blog_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Blog Page");
		ExtentTestManager.getTest().log(Status.INFO, "Blog - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Blog - Step 01: Click to 'Blog' link");
		blogPage = homePage.clickBlogLinkOnHeader();

		ExtentTestManager.getTest().log(Status.INFO, "Blog - Step 02: Verify the title 'LATEST BLOG POSTS' displayed");
		Assert.assertEquals(blogPage.getBlogPageTitleHeading(), BlogPageUI.BLOG_TITLE_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_03_Regression_Verify_ContactUs_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Contact US Page");
		ExtentTestManager.getTest().log(Status.INFO, "Contact Us - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Contact Us - Step 01: Click to 'Contact US' link");
		contactPage = homePage.clickcToContactLinkOnHeader();

		ExtentTestManager.getTest().log(Status.INFO,
				"Contact Us - Step 02: Verify the title 'HOW TO CONTACT FOOTBALL TICKET NET' displayed");
		Assert.assertEquals(contactPage.getContactUsTitleHeading(),
				ContactUsPageUI.CONTACT_US_TITLE_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_04_Regression_Verify_FAQs_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - FAQs Page");
		ExtentTestManager.getTest().log(Status.INFO, "FAQs - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "FAQs - Step 01: Click to 'FAQs' link");
		faqsPage = homePage.clickToFAQsOnHeaderLink();

		ExtentTestManager.getTest().log(Status.INFO,
				"FAQs - Step 02: Verify the title 'FREQUENTLY ASKED QUESTIONS' displayed");
		Assert.assertEquals(faqsPage.getFAQsTitle(), FAQsPageUI.FAQs_TITLE_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_05_Regression_Verify_TermAndConditions_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Term and Condtions Page");
		ExtentTestManager.getTest().log(Status.INFO, "Term & Condtions - Step 01: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Term & Condtions - Step 02: Click to 'Term & Conditions' link");
		termConditionPage = homePage.clickToTermAndCondtions();

		ExtentTestManager.getTest().log(Status.INFO,
				"Term & Condtions - Step 03: Verify the title heading 'TERMS & CONDITIONS' displayed");
		Assert.assertEquals(termConditionPage.getContactUsTitleHeading(),
				TermConditionPageUI.TERM_CONDITION_TITLE_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_06_Regression_Verify_Teams_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Teams Menu");
		ExtentTestManager.getTest().log(Status.INFO, "Teams - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Teams - Step 02: Click to 'Teams' menu");
		teamsPage = homePage.clickToTeamsMenu();

		ExtentTestManager.getTest().log(Status.INFO,
				"Teams- Step 03: Verify the title heading 'CHOOSE YOUR FOOTBALL TICKETS BY TEAM' displayed");
		Assert.assertEquals(teamsPage.getTeamsTitleHeading(), TeamsPageUI.TEAMS_TITLE_HEADING_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_07_Regression_Verify_Tournaments_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Tournaments Menu");
		ExtentTestManager.getTest().log(Status.INFO, "Tournaments - Step 01: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Tournaments - Step 02: Click to 'Tournaments' menu");
		tournamentsPage = homePage.clickToTournamentsMenu();

		ExtentTestManager.getTest().log(Status.INFO,
				"Tournaments- Step 03: Verify the title heading 'CHOOSE YOUR FOOTBALL TICKETS BY TOURNAMENT' displayed");
		Assert.assertEquals(tournamentsPage.getTournamentsTitleHeading(),
				TournamentsPageUI.TOURNAMENTS_TITLE_HEADING_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_08_Regression_Verify_International_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - International Menu");
		ExtentTestManager.getTest().log(Status.INFO, "International - Step 01: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "International - Step 02: Click to 'International' menu");
		internationalPage = homePage.clickToInternationalPageMenu();

		ExtentTestManager.getTest().log(Status.INFO,
				"International- Step 03: Verify the title heading 'BUY INTERNATIONAL FRIENDLY MATCHES TICKETS NOW!' displayed");
		Assert.assertEquals(internationalPage.getInternaltionalsTitleHeading(),
				InternationalPageUI.INTERNATIONAL_TITLE_HEADING_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_09_Regression_Verify_Stadium_Tour_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Stadium Tour Menu");
		ExtentTestManager.getTest().log(Status.INFO, "Stadium Tour - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Stadium Tour - Step 02: Click to 'Stadium Tour' menu");
		stadiumTourPage = homePage.clickToStadiumTourMenu();

		ExtentTestManager.getTest().log(Status.INFO,
				"Stadium Tour - Step 03: Verify the title heading 'CHOOSE YOUR STADIUM TOUR' displayed");
		Assert.assertEquals(stadiumTourPage.getStadiumTourTitleHeading(),
				StadiumTourPageUI.STADIUM_TOUR_TITLE_HEADING_IN_ENGLISH.toUpperCase());
	}

	@Test
	public void TC_10_Regression_Verify_Most_Popular_Page_Displayed(Method method) {
		ExtentTestManager.startTest(method.getName(), "Regression Test - Most Popular Menu");
		ExtentTestManager.getTest().log(Status.INFO, "Most Popular - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Most Popular - Step 02: Click to 'Stadium Tour' menu");
		mostPopularPage = homePage.clickToMostPopularMenu();

		ExtentTestManager.getTest().log(Status.INFO,
				"Most Popular - Step 03: Verify the title heading 'Most Popular Football Events' displayed");
		Assert.assertEquals(mostPopularPage.getMostPopularTitleHeading(),
				MostPopularPageUI.MOST_POPULAR_TITLE_HEADING_IN_ENGLISH);
	}

	WebDriver driver;
	HomePageObject homePage;
	VoucherPageObject voucherPage;
	BlogPageObject blogPage;
	ContactUsPageObject contactPage;
	FAQsPageObject faqsPage;
	TermConditionPageObject termConditionPage;
	TeamsPageObject teamsPage;
	TournamentsPageObject tournamentsPage;
	InternationalPageObject internationalPage;
	MostPopularPageObject mostPopularPage;
	StadiumTourPageObject stadiumTourPage;
}
