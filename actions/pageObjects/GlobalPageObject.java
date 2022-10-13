package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class GlobalPageObject extends BasePage {
	WebDriver driver;

	public GlobalPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
