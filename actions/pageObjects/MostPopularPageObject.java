package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.MostPopularPageUI;

public class MostPopularPageObject extends BasePage {
	WebDriver driver;

	public MostPopularPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getMostPopularTitleHeading() {
		waitForElementVisible(driver, MostPopularPageUI.MOST_POPULAR_HEADING_XPATH);
		return getElementText(driver, MostPopularPageUI.MOST_POPULAR_HEADING_XPATH);
	}

	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
