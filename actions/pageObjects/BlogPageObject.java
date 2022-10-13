package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.com.footballticketnet.BlogPageUI;

public class BlogPageObject extends BasePage {
	WebDriver driver;

	public BlogPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getBlogPageTitleHeading() {
		waitForElementVisible(driver, BlogPageUI.BLOG_TITLE_XPATH);
		return getElementText(driver, BlogPageUI.BLOG_TITLE_XPATH);
	}


	public String checkCopyRightFNT() {
		waitForElementVisible(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		highlightElementByJS(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
		return getElementText(driver, GlobalConstants.COPY_RIGHT_LABEL_XPATH);
	}

}
