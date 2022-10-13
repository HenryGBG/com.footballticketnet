package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.com.footballticketnet.CheckoutPageUI;
import pageUIs.com.footballticketnet.VoucherPageUI;

public class CheckoutPageObject extends BasePage {
	WebDriver driver;

	public CheckoutPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputBillingInfomationBillingAddressOnCheckoutPage() {
		inputToTextboxByID(driver, "billing_city", CheckoutPageUI.SELECTED_CITY_TOWN_LABEL);
		inputToTextboxByID(driver, "billing_postal_code", CheckoutPageUI.SELECTED_POSTCODE);
		inputToTextboxByID(driver, "billing_address", CheckoutPageUI.SELECTED_SELECTED_ADDRESS_LABEL);
		clickToCheckboxRequired();
	}

	private void clickToCheckboxRequired() {
		waitForElementVisible(driver, CheckoutPageUI.CHECKBOX_REQUIRED);
		clickToElement(driver, CheckoutPageUI.CHECKBOX_REQUIRED);
	}

	public void inputBillingInfomationDetailsOnCheckoutPage() {
		selectCountryInBillingDetails(CheckoutPageUI.SELECTED_COUNTRY_LABEL);
		inputToBillingPhoneNumberLocation(CheckoutPageUI.PHONE_NUMBER_LOCATION_TEXT);
	}

	private void inputToBillingPhoneNumberLocation(String phoneNumberLocationText) {
		waitForElementVisible(driver, CheckoutPageUI.PHONE_NUMBER_LOCATION);
		sendkeyToElement(driver, CheckoutPageUI.PHONE_NUMBER_LOCATION, phoneNumberLocationText);
	}

	public void clickToNextButton() {
		waitForElementVisible(driver, CheckoutPageUI.NEXT_BUTTON);
		clickToElement(driver, CheckoutPageUI.NEXT_BUTTON);

	}

	public void inputSpecialRequest(String sepecial_request) {
		waitForElementVisible(driver, CheckoutPageUI.SPECIAL_REQUEST_TEXTAREA);
		sendkeyToElement(driver, CheckoutPageUI.SPECIAL_REQUEST_TEXTAREA, sepecial_request);
	}

	public void selectCountryInBillingDetails(String countrySelected) {
		clickToElementByJS(driver, CheckoutPageUI.SELECTED_COUNTRY_DROPDOWN, countrySelected);

	}

	public void chooseThePaymentMethod() {
		clickToThePaymentMethod("GBP");
	}

	public void clickToThePaymentMethod(String currencyInPayment) {
		clickToElementByJS(driver, CheckoutPageUI.CHOOSE_PAYMENT_METHOD_XPATH, currencyInPayment);
	}

	public void inputBillingDetailsPaymentMethod() {
		selectCardTypeInPayment(VoucherPageUI.CARD_TYPE_LABEL);
		inputCardNumber(VoucherPageUI.CARD_NUMBER_LABEL);
		inputCardHolderName(VoucherPageUI.CARD_HOLDER_NAME_LABEL);
		inputExpireMonthYear(VoucherPageUI.EXPIRE_MONTH_YEAR_LABEL);
		inputCardVerificationNumber(VoucherPageUI.CARD_VERIFICATION_NUMBER_LABEL);
	}

	private void inputCardVerificationNumber(String cardVerificationNumberLabel) {
		waitForElementVisible(driver, CheckoutPageUI.CARD_VERIFICATION_NUMBER_XPATH);
		sendkeyToElement(driver, CheckoutPageUI.CARD_VERIFICATION_NUMBER_XPATH, cardVerificationNumberLabel);
	}

	private void inputExpireMonthYear(String expireMonthYearLabel) {
		selectExpireMonth(CheckoutPageUI.EXPIRE_MONTH_LABEL);
		selectExpireYear(CheckoutPageUI.EXPIRE_YEAR_LABEL);

	}

	private void selectExpireYear(String expireYearLabel) {
		waitForElementVisible(driver, CheckoutPageUI.EXPIRE_YEAR_XPATH);
		selectItemInDefaultDropdown(driver, CheckoutPageUI.EXPIRE_YEAR_XPATH, expireYearLabel);

	}

	private void selectExpireMonth(String expireMonthLabel) {
		waitForElementVisible(driver, CheckoutPageUI.EXPIRE_MONTH_XPATH);
		selectItemInDefaultDropdown(driver, CheckoutPageUI.EXPIRE_MONTH_XPATH, expireMonthLabel);
	}

	private void inputCardHolderName(String cardHolderNameLabel) {
		waitForElementVisible(driver, CheckoutPageUI.CARD_HOLDER_NAME_TEXTBOX);
		sendkeyToElement(driver, CheckoutPageUI.CARD_HOLDER_NAME_TEXTBOX, cardHolderNameLabel);

	}

	private void inputCardNumber(String cardNumberLabel) {
		waitForElementVisible(driver, CheckoutPageUI.CARD_NUMBER_TEXTBOX);
		sendkeyToElement(driver, CheckoutPageUI.CARD_NUMBER_TEXTBOX, cardNumberLabel);

	}

	private void selectCardTypeInPayment(String cardTypeLabel) {
		waitForElementVisible(driver, CheckoutPageUI.CARD_TYPE_XPATH);
		selectItemInDefaultDropdown(driver, CheckoutPageUI.CARD_TYPE_XPATH, cardTypeLabel);
	}
}
