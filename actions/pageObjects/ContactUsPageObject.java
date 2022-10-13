package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.ContactUsPageUI;

public class ContactUsPageObject extends BasePage {
	WebDriver driver;

	public ContactUsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getContactUsTitleHeading() {
		waitForElementVisible(driver, ContactUsPageUI.CONTACT_US_TITLE_XPATH);
		return getElementText(driver, ContactUsPageUI.CONTACT_US_TITLE_XPATH);
	}

	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
