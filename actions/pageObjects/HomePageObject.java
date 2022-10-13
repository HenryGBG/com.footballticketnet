package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.HomePageUIs;

public class HomePageObject extends BasePage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public VoucherPageObject clickToVoucherLink() {
		waitForElementClickable(driver, HomePageUIs.HEADER_VOUCHER_LINK);
		clickToElement(driver, HomePageUIs.HEADER_VOUCHER_LINK);
		return new VoucherPageObject(driver);
	}

	public BlogPageObject clickBlogLinkOnHeader() {
		waitForElementVisible(driver, HomePageUIs.HEADER_BLOG_LINK);
		clickToElement(driver, HomePageUIs.HEADER_BLOG_LINK);
		return new BlogPageObject(driver);
	}

	public ContactUsPageObject clickcToContactLinkOnHeader() {
		waitForElementVisible(driver, HomePageUIs.HEADER_CONTACT_US_LINK);
		clickToElement(driver, HomePageUIs.HEADER_CONTACT_US_LINK);
		return new ContactUsPageObject(driver);
	}

	public FAQsPageObject clickToFAQsOnHeaderLink() {
		waitForElementVisible(driver, HomePageUIs.HEADER_FAQ_LINK);
		clickToElement(driver, HomePageUIs.HEADER_FAQ_LINK);
		return new FAQsPageObject(driver);
	}

	public TermConditionPageObject clickToTermAndCondtions() {
		waitForElementVisible(driver, HomePageUIs.HEADER_TERM_CONDITION_LINK);
		clickToElement(driver, HomePageUIs.HEADER_TERM_CONDITION_LINK);
		return new TermConditionPageObject(driver);
	}

	public TeamsPageObject clickToTeamsMenu() {
		waitForElementVisible(driver, HomePageUIs.MENU_TEAMS_XPATH);
		clickToElement(driver, HomePageUIs.MENU_TEAMS_XPATH);
		return new TeamsPageObject(driver);
	}

	public TournamentsPageObject clickToTournamentsMenu() {
		waitForElementVisible(driver, HomePageUIs.MENU_TOURNAMENT_XPATH);
		clickToElement(driver, HomePageUIs.MENU_TOURNAMENT_XPATH);
		return new TournamentsPageObject(driver);
	}

	public InternationalPageObject clickToInternationalPageMenu() {
		waitForElementVisible(driver, HomePageUIs.MENU_INTERNATIONAL_XPATH);
		clickToElement(driver, HomePageUIs.MENU_INTERNATIONAL_XPATH);
		return new InternationalPageObject(driver);
	}

	public StadiumTourPageObject clickToStadiumTourMenu() {
		waitForElementVisible(driver, HomePageUIs.MENU_STADIUM_TOUR_XPATH);
		clickToElement(driver, HomePageUIs.MENU_STADIUM_TOUR_XPATH);
		return new StadiumTourPageObject(driver);
	}

	public MostPopularPageObject clickToMostPopularMenu() {
		waitForElementVisible(driver, HomePageUIs.MENU_MOST_POPULAR_TOUR_XPATH);
		clickToElement(driver, HomePageUIs.MENU_MOST_POPULAR_TOUR_XPATH);
		return new MostPopularPageObject(driver);
	}

	public void clickToSelectCountry() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_DROPDOWN);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_DROPDOWN);

	}

	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}

	public void selectCountryFrench() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_FRENCH);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_FRENCH);
	}

	public void selectCountryGerman() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_GERMAN);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_GERMAN);
	}

	public void selectCountryItalian() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_ITALIAN);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_ITALIAN);
	}

	public void selectCountryDutch() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_DUTCH);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_DUTCH);
	}

	public void selectCountryFinnish() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_FINNISH);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_FINNISH);
	}

	public void selectCountrySwedish() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_SWEDISH);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_SWEDISH);
	}

	public void selectCountryDanish() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_DANISH);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_DANISH);
	}

	public void selectCountrySpanish() {
		waitForAllElementVisible(driver, HomePageUIs.SELECTED_COUNTRY_SPANNISH);
		clickToElement(driver, HomePageUIs.SELECTED_COUNTRY_SPANNISH);
	}

}
