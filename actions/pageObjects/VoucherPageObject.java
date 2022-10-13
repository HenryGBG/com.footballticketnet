package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import commons.PageGenerateManager;
import pageUIs.com.footballticketnet.VoucherPageUI;

public class VoucherPageObject extends BasePage {
	WebDriver driver;

	public VoucherPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public CheckoutPageObject clickBuyNowButton() {
		waitForElementClickable(driver, VoucherPageUI.BUY_NOW_BUTTON);
		clickToElement(driver, VoucherPageUI.BUY_NOW_BUTTON);
		return PageGenerateManager.getCheckoutPage(driver);
	}

	public String getErrorMessageAtFromTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_FROM_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_FROM_ERROR_MESSAGE);
	}

	public String getErrorMessageAtToTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_TO_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_TO_ERROR_MESSAGE);
	}

	public String getErrorMessageAtAmountTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_AMOUNT_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_AMOUNT_ERROR_MESSAGE);
	}

	public String getErrorMessageAtCountryTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_COUNTRY_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_COUNTRY_ERROR_MESSAGE);
	}

	public String getErrorMessageAtNameTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_NAME_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtPhoneTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_PHONE_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_PHONE_ERROR_MESSAGE);
	}

	public String getErrorMessageAtLastNameTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_LAST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAtCheckmaskTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_CHECKMASK_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_CHECKMASK_ERROR_MESSAGE);
	}

	public String getErrorMessageAtRateTextbox() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_XPATH_RATE_ERROR_MESSAGE);
		return getElementText(driver, VoucherPageUI.VOUCHER_XPATH_RATE_ERROR_MESSAGE);
	}

	public void inputVoucherDetails() {
		inputToTextboxByID(driver, "voucher_from", VoucherPageUI.VOUCHER_FROM_NAME);
		inputToTextboxByID(driver, "voucher_to", VoucherPageUI.VOUCHER_TO_NAME);
		inputToTextboxByTextArea(driver, "voucher_dedication", VoucherPageUI.VOUCHER_DEDICATION);
		inputToTextboxByID(driver, "voucher_amount", VoucherPageUI.VOUCHER_AMOUNT);
		selectCurrencyInVoucherRateDropdown(VoucherPageUI.SELECTED_CURRENCY);
	}

	public void inputBuyerDetails() {
		inputToTextboxByID(driver, "billing_first_name", VoucherPageUI.BILING_FIRST_NAME);
		inputToTextboxByID(driver, "billing_last_name", VoucherPageUI.BILING_LAST_NAME);
		inputToTextboxByID(driver, "phone_number", VoucherPageUI.BILING_PHONE_NUMBER);
		inputToTextboxByID(driver, "billing_email", VoucherPageUI.BILLING_EMAIL_ADDRESS);
		selectCountryInCountryDropdown("Vietnam");
	}

	public void clickToCheckboxVoucherTypeMoney() {
		waitForElementClickable(driver, VoucherPageUI.VOUCHER_TYPE_CHECKBOX);
		clickToElement(driver, VoucherPageUI.VOUCHER_TYPE_CHECKBOX);

	}

	public void selectCurrencyInVoucherRateDropdown(String selectedCurrency) {
		clickToElementByJS(driver, VoucherPageUI.SELECTED_CURRENCY_DROPDOWN, selectedCurrency);
	}

	public void selectCountryInCountryDropdown(String selectedCountry) {
		clickToElementByJS(driver, VoucherPageUI.SELECTED_COUNTRY, selectedCountry);
	}

	public String getVoucherTitleHeading() {
		waitForElementVisible(driver, VoucherPageUI.VOUCHER_TITLE_XPATH);
		return getElementText(driver, VoucherPageUI.VOUCHER_TITLE_XPATH);
	}

	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}

}
