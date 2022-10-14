package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.TeamsPageUI;

public class TeamsPageObject extends BasePage {
	WebDriver driver;

	public TeamsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getTeamsTitleHeading() {
		waitForElementVisible(driver, TeamsPageUI.TEAMS_TITLE_HEADING_XPATH);
		return getElementText(driver, TeamsPageUI.TEAMS_TITLE_HEADING_XPATH);
	}


	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
//		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}
}
