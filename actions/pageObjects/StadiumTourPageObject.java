package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.StadiumTourPageUI;

public class StadiumTourPageObject extends BasePage {
	WebDriver driver;

	public StadiumTourPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getStadiumTourTitleHeading() {
		waitForElementVisible(driver, StadiumTourPageUI.STADIUM_PAGE_HEADING_XPATH);
		return getElementText(driver, StadiumTourPageUI.STADIUM_PAGE_HEADING_XPATH);
	}

	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
