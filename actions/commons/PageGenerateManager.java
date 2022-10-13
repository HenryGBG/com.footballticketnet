package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutPageObject;
import pageObjects.HomePageObject;

public class PageGenerateManager {

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static CheckoutPageObject getCheckoutPage(WebDriver driver) {
		return new CheckoutPageObject(driver);
	}
}
