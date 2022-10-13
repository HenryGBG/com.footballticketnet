package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.TermConditionPageUI;

public class TermConditionPageObject extends BasePage {
	WebDriver driver;

	public TermConditionPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getContactUsTitleHeading() {
		waitForElementVisible(driver, TermConditionPageUI.TERMS_CONDITIONS_TITLE);
		return getElementText(driver, TermConditionPageUI.TERMS_CONDITIONS_TITLE);
	}

	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
