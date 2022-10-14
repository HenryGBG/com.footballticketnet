package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.CheckoutPageUI;
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

	public void searchUpcomingMatch(String searchValue) {
		waitForElementVisible(driver, HomePageUIs.SEARCH_TEXTBOX_XPATH);
		sendkeyToElement(driver, HomePageUIs.SEARCH_TEXTBOX_XPATH, searchValue);
	}

	public void clickOnSearchResult(String searchResult) {
		waitForElementVisible(driver, HomePageUIs.SEARCH_RESULT_ITEM, searchResult);
		clickToElement(driver, HomePageUIs.SEARCH_RESULT_ITEM, searchResult);
	}

	public void openChooseCategory() {
		waitForElementVisible(driver, HomePageUIs.CHOOSE_CATEGORY_DROPDOWN_XPATH);
		clickToElement(driver, HomePageUIs.CHOOSE_CATEGORY_DROPDOWN_XPATH);
	}

	public void chooseCategoryByItem(String itemCategory) {
		clickToElementByJS(driver, HomePageUIs.CHOOSE_CATEGORY_ITEM, itemCategory);
	}

	public void clickToResetButton() {
		waitForElementVisible(driver, HomePageUIs.RESET_BUTTON);
		clickToElement(driver, HomePageUIs.RESET_BUTTON);
	}

	public void clickToBuyNowOnEvent(String teamInfo) {
		waitForElementVisible(driver, HomePageUIs.TEAM_INFO, teamInfo);

		clickToElement(driver, HomePageUIs.TEAM_INFO, teamInfo);
	}

	public CheckoutPageObject clickToBuyNowOnCategoryPageWithPrice(String priceTicket) {
		waitForElementVisible(driver, HomePageUIs.BUY_NOW_BUTTON_XPATH, priceTicket);
		clickToElement(driver, HomePageUIs.BUY_NOW_BUTTON_XPATH, priceTicket);
		acceptNotificationIApprove();
		return new CheckoutPageObject(driver);
	}

	public void clickToChooseCategoryDropdown() {
		waitForElementVisible(driver, HomePageUIs.CHOOSE_CATEGORY_DROPDOWN_XPATH);
		clickToElement(driver, HomePageUIs.CHOOSE_CATEGORY_DROPDOWN_XPATH);
	}

	public void acceptNotificationIApprove() {
		if (isElementDisplayed(driver, HomePageUIs.NOTIFICATION_ACCEPT_BUTTON_XPATH)) {
			waitForElementVisible(driver, HomePageUIs.NOTIFICATION_ACCEPT_BUTTON_XPATH);
			clickToElement(driver, HomePageUIs.NOTIFICATION_ACCEPT_BUTTON_XPATH);
		}
	}

}
