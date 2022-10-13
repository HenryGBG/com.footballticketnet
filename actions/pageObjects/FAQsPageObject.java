package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.FAQsPageUI;

public class FAQsPageObject extends BasePage {
	WebDriver driver;

	public FAQsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getFAQsTitle() {
		waitForElementVisible(driver, FAQsPageUI.FAQs_TITLE_XPATH);
		return getElementText(driver, FAQsPageUI.FAQs_TITLE_XPATH);
	}


	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
