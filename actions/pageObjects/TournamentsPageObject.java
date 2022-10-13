package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.TournamentsPageUI;

public class TournamentsPageObject extends BasePage {
	WebDriver driver;

	public TournamentsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getTournamentsTitleHeading() {
		waitForElementVisible(driver, TournamentsPageUI.TOURNAMENTS_TITLE_HEADING_XPATH);
		return getElementText(driver, TournamentsPageUI.TOURNAMENTS_TITLE_HEADING_XPATH);
	}


	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
