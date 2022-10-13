package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.InternationalPageUI;

public class InternationalPageObject extends BasePage {
	WebDriver driver;

	public InternationalPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getInternaltionalsTitleHeading() {
		waitForElementVisible(driver, InternationalPageUI.INTERNATIONAL_TITLE_HEADING_XPATH);
		return getElementText(driver, InternationalPageUI.INTERNATIONAL_TITLE_HEADING_XPATH);
	}


	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
