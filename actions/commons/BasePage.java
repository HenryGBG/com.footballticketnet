package commons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static BasePage getBasePageObject() {
		return new BasePage();
	}

	public void openPageUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public Set<Cookie> getAllCookies(WebDriver driver, Set<Cookie> cookies) {
		return driver.manage().getCookies();
	}

	public void setCookies(WebDriver driver, Set<Cookie> cookies) {
		for (Cookie cookie : cookies) {
			driver.manage().addCookie(cookie);
		}
		sleepInSecond(3);
	}

	public void forwardCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void waitToAlertPresence(WebDriver driver) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert(WebDriver driver) {
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelAlert(WebDriver driver) {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void sendkeyAlert(WebDriver driver, String value) {
		alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}

	public String getTextAlert(WebDriver driver) {
		alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void switchToWindowByID(WebDriver driver, String parentID) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			if (!runWindow.equals(parentID)) {
				driver.switchTo().window(runWindow);
				break;
			}
		}
	}

	public void switchToWindowByTitle(WebDriver driver, String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			driver.switchTo().window(runWindow);
			String currentWin = driver.getTitle();
			if (currentWin.equals(title)) {
				break;
			}
		}
	}

	public void closeAllWindowsWithoutParent(WebDriver driver, String parentID) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			if (!runWindow.equals(parentID)) {
				driver.switchTo().window(runWindow);
				driver.close();
			}
		}
		driver.switchTo().window(parentID);
	}

	private By getBylocator(String locatorType) {
		By by = null;
		if (locatorType.startsWith("id=") || locatorType.startsWith("ID=") || locatorType.startsWith("Id=")) {
			by = By.id(locatorType.substring(3));
		} else if (locatorType.startsWith("class=") || locatorType.startsWith("CLASS=")
				|| locatorType.startsWith("Class=")) {
			by = By.className(locatorType.substring(6));
		} else if (locatorType.startsWith("name=") || locatorType.startsWith("NAME=")
				|| locatorType.startsWith("Name=")) {
			by = By.name(locatorType.substring(5));
		} else if (locatorType.startsWith("css=") || locatorType.startsWith("CSS=") || locatorType.startsWith("Css=")) {
			by = By.cssSelector(locatorType.substring(4));
		} else if (locatorType.startsWith("xpath=") || locatorType.startsWith("XPATH=")
				|| locatorType.startsWith("Xpath=")) {
			by = By.xpath(locatorType.substring(6));
		} else {
			throw new RuntimeException("Locartor type is not supported!");
		}
		return by;

	}

	private String getDynamicXpath(String locatorType, String... values) {
		locatorType = String.format(locatorType, (Object[]) values);
		if (locatorType.startsWith("xpath=") || locatorType.startsWith("XPATH=") || locatorType.startsWith("Xpath=")
				|| locatorType.startsWith("XPath=")) {
			locatorType = String.format(locatorType, (Object[]) values);
		}
		return locatorType;
	}

	public List<WebElement> getListWebElement(WebDriver driver, String locatorType) {
		return driver.findElements(getBylocator(locatorType));

	}

	public List<WebElement> getListWebElement(WebDriver driver, String locatorType, String... dynamicValues) {
		return driver.findElements(getBylocator(getDynamicXpath(locatorType, dynamicValues)));

	}

	private WebElement getWebElement(WebDriver driver, String locatorType) {
		return driver.findElement(getBylocator(locatorType));
	}

	public List<WebElement> finds(WebDriver driver, String locatorType) {
		return driver.findElements(getBylocator(locatorType));
	}

	public void clickToElement(WebDriver driver, String locatorType) {
		getWebElement(driver, locatorType).click();
	}

	// click dynmic values
	public void clickToElement(WebDriver driver, String locatorType, String... dynamicValues) {
		getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).click();
	}

	public void sendkeyToElement(WebDriver driver, String locatorType, String value) {
		getWebElement(driver, locatorType).clear();
		getWebElement(driver, locatorType).sendKeys(value);
	}

	// sendkey dynamic
	public void sendkeyToElement(WebDriver driver, String locatorType, String textValue, String... dynamicValues) {
		WebElement element = getWebElement(driver, getDynamicXpath(locatorType, dynamicValues));
		element.clear();
		element.sendKeys(textValue);
	}

	public void selectItemInDefaultDropdown(WebDriver driver, String locatorType, String itemValue) {
		select = new Select(getWebElement(driver, locatorType));
		select.selectByVisibleText(itemValue);
	}

	// select dynamic
	public void selectItemInDefaultDropdown(WebDriver driver, String locatorType, String textItem,
			String... dynamicValues) {
		select = new Select(getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)));
		select.selectByVisibleText(textItem);
	}

	public String getFirstSelectItemInDropdown(WebDriver driver, String locatorType) {
		select = new Select(getWebElement(driver, locatorType));
		return select.getFirstSelectedOption().getText();
	}

	public boolean isDropdownMultiple(WebDriver driver, String locatorType) {
		select = new Select(getWebElement(driver, locatorType));
		return select.isMultiple();
	}

	public void selectItemInCustomDropdown(WebDriver driver, String parentlocatorType, String childItemlocatorType,
			String expectedItem) {
//		getWebElement(driver, parentlocatorType).click();
		sleepInSecond(1);
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		List<WebElement> allItems = explicitWait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getBylocator(childItemlocatorType)));

		for (WebElement item : allItems) {
			if (item.getText().trim().equals(expectedItem)) {
				jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
				sleepInSecond(1);
				item.click();
				sleepInSecond(1);
				break;
			}
		}
	}

	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getElementAttribute(WebDriver driver, String locatorType, String attributeName) {
		return getWebElement(driver, locatorType).getAttribute(attributeName);
	}

	public String getElementAttribute(WebDriver driver, String locatorType, String attributeName,
			String... dynamicValues) {
		return getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).getAttribute(attributeName);
	}

	public String getElementText(WebDriver driver, String locatorType) {
		return getWebElement(driver, locatorType).getText();
	}

	public String getElementText(WebDriver driver, String locatorType, String... dynamicValues) {
		return getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).getText();
	}

	public int getElementSize(WebDriver driver, String locatorType) {
		return getListWebElement(driver, locatorType).size();
	}

	public int getElementSize(WebDriver driver, String locatorType, String... dynamicValues) {
		return getListWebElement(driver, getDynamicXpath(locatorType, dynamicValues), dynamicValues).size();
	}

	public String getElementCssValue(WebDriver driver, String locatorType, String propertyName) {
		return getWebElement(driver, locatorType).getCssValue(propertyName);

	}

	public String getHexaColorFromRGBA(WebDriver driver, String rgbValue) {
		return Color.fromString(rgbValue).asHex();

	}

	public int countElemntSize(WebDriver driver, String locatorType) {
		return finds(driver, locatorType).size();
	}

	public void checkToDefaultCheckboxOrRadio(WebDriver driver, String locatorType) {
		if (!getWebElement(driver, locatorType).isSelected()) {
			getWebElement(driver, locatorType).click();
		}
	}

	public void uncheckToDefaultCheckbox(WebDriver driver, String locatorType) {
		if (getWebElement(driver, locatorType).isSelected()) {
			getWebElement(driver, locatorType).click();
		}
	}

	public void uncheckToDefaultCheckbox(WebDriver driver, String locatorType, String... dynamicValues) {
		if (getWebElement(driver, locatorType).isSelected()) {
			getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).click();
		}
	}

	public boolean isElementDisplayed(WebDriver driver, String locatorType) {
		try {
			return getWebElement(driver, locatorType).isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}

	public void overrideImplicitTimeout(WebDriver driver, long timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	public boolean isElementUnDisplayed(WebDriver driver, String locatorType) {

		overrideImplicitTimeout(driver, shortTimeout);
		List<WebElement> elements = getListWebElement(driver, locatorType);

		overrideImplicitTimeout(driver, longTimeout);

		if (elements.size() == 0) {
			return true;
		} else if (elements.size() == 0 && !elements.get(0).isDisplayed()) {
			System.out.println("End time = " + new Date().toString());
			return true;
		} else {
			return false;
		}

	}

	public boolean isElementDisplayed(WebDriver driver, String locatorType, String... dynamicValues) {
		return getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).isDisplayed();
	}

	public boolean isElementEnabled(WebDriver driver, String locatorType) {
		return getWebElement(driver, locatorType).isEnabled();
	}

	public boolean isElementSelected(WebDriver driver, String locatorType) {
		return getWebElement(driver, locatorType).isSelected();
	}

	public void switchToFrame(WebDriver driver, String locatorType) {
		driver.switchTo().frame(getWebElement(driver, locatorType));
	}

	public void switchToDefaultPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void doubleClickToElement(WebDriver driver, String locatorType) {
		action = new Actions(driver);
		action.doubleClick(getWebElement(driver, locatorType)).perform();
	}

	public void rightClickToElement(WebDriver driver, String locatorType) {
		action = new Actions(driver);
		action.contextClick(getWebElement(driver, locatorType)).perform();
	}

	public void hoverToElement(WebDriver driver, String locatorType) {
		action = new Actions(driver);
		action.moveToElement(getWebElement(driver, locatorType)).perform();
	}

	public void sendKeyBoardToElement(WebDriver driver, String locatorType, Keys key) {
		action = new Actions(driver);
		action.sendKeys(getWebElement(driver, locatorType), key).perform();
	}

	public void highlightElementByJS(WebDriver driver, String locatorType) {
		jsExecutor = (JavascriptExecutor) driver;
		WebElement element = getWebElement(driver, locatorType);
		String originalStyle = element.getAttribute("style");
		jsExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style",
				"border: 2px solid red; border-style: dashed;");
		sleepInSecond(1);
		jsExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style",
				originalStyle);
	}

	public void waitToElementPresence(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(getBylocator(locatorType)));
	}

	public void waitForElementVisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getBylocator(locatorType)));
	}

	public void waitForElementVisible(WebDriver driver, String locatorType, String... dynamicValues) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions
				.visibilityOfElementLocated(getBylocator(getDynamicXpath(locatorType, dynamicValues))));

	}

	public void waitForAllElementVisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(getBylocator(locatorType)));
	}

	public void waitForAllElementVisible(WebDriver driver, String locatorType, String... dynamicValues) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(getBylocator(getDynamicXpath(locatorType, dynamicValues))));
	}

	public void waitForElementInVisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getBylocator(locatorType)));
	}

	/*
	 * Wait for element undisplayed in DOM or not in DOM and override implicit
	 * timeout
	 */
	public void waitForElementUndisplayed(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, shortTimeout);
		overrideImplicitTimeout(driver, shortTimeout);
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getBylocator(locatorType)));
		overrideImplicitTimeout(driver, longTimeout);
	}

	public void waitForElementClickable(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.elementToBeClickable(getBylocator(locatorType)));
	}

	public void waitForElementClickable(WebDriver driver, String locatorType, String... dynamicValues) {
		WebDriverWait expliciWait = new WebDriverWait(driver, longTimeout);
		expliciWait.until(
				ExpectedConditions.elementToBeClickable(getBylocator(getDynamicXpath(locatorType, dynamicValues))));
	}

	/**
	 * Enter to dynamic textbox by ID
	 * 
	 * @param driver
	 * @param textboxID
	 * @param value
	 */
	public void inputToTextboxByID(WebDriver driver, String textboxID, String value) {
		waitForAllElementVisible(driver, GlobalBaseUI.DYNAMIC_TEXTBOX_BY_ID, textboxID);
		sendkeyToElement(driver, GlobalBaseUI.DYNAMIC_TEXTBOX_BY_ID, value, textboxID);
	}

	public void inputToTextboxByTextArea(WebDriver driver, String textArea, String value) {
		waitForAllElementVisible(driver, GlobalBaseUI.DYNAMIC_TEXTBOX_BY_AREA, textArea);
		sendkeyToElement(driver, GlobalBaseUI.DYNAMIC_TEXTBOX_BY_AREA, value, textArea);
	}

	public void checkToDefaultCheckboxOrRadio(WebDriver driver, String locatorType, String... dynamicValues) {
		WebElement element = getWebElement(driver, getDynamicXpath(locatorType, dynamicValues));
		if (!element.isSelected()) {
			element.click();
		}
	}

	public void scrollToBottomPage(WebDriver driver) {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void clickToElementByJS(WebDriver driver, String locatorType) {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", getWebElement(driver, locatorType));
	}

	public void clickToElementByJS(WebDriver driver, String locatorType, String... dynamicValues) {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();",
				getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)));
	}

	public void scrollToElementByJS(WebDriver driver, String locatorType) {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", getWebElement(driver, locatorType));
	}

	public void sendkeyToElementByJS(WebDriver driver, String locatorType, String value) {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('value', '" + value + "')",
				getWebElement(driver, locatorType));
	}

	public void removeAttributeInDOM(WebDriver driver, String locatorType, String attributeRemove) {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');",
				getWebElement(driver, locatorType));
	}

	/**
	 * Select item in dropdown by Name attribute
	 * 
	 * @param driver
	 * @param dropdownAttributeName
	 * @param itemValue
	 */
	public void selectToDropdownByName(WebDriver driver, String dropdownAttributeName, String itemValue) {
		waitForElementClickable(driver, GlobalConstants.DYNAMIC_DROPDOWN_BY_NAME, dropdownAttributeName);
		selectItemInDefaultDropdown(driver, GlobalConstants.DYNAMIC_DROPDOWN_BY_NAME, itemValue, dropdownAttributeName);
	}

	/**
	 * Click to dynamic Radio button by Label name
	 * 
	 * @param driver
	 * @param radioButtonByLabelName
	 */
	public void clickToRadioButtonByLabel(WebDriver driver, String radioButtonByLabelName) {
		waitForElementClickable(driver, GlobalConstants.DYNAMIC_RADIO_BUTTON_BY_VALUE, radioButtonByLabelName);
		checkToDefaultCheckboxOrRadio(driver, GlobalConstants.DYNAMIC_RADIO_BUTTON_BY_VALUE, radioButtonByLabelName);
	}

	/**
	 * Click to dynamic checkbox by label name
	 * 
	 * @param driver
	 * @param checkboxLabelName
	 */
	public void clickToCheckboxByLabel(WebDriver driver, String checkboxLabelName) {
		waitForElementClickable(driver, GlobalConstants.DYNAMIC_CHECKBOX_BY_LABEL, checkboxLabelName);
		checkToDefaultCheckboxOrRadio(driver, GlobalConstants.DYNAMIC_CHECKBOX_BY_LABEL, checkboxLabelName);
	}

	/*
	 * [Framework] Dependency Testcase/ Sort Data (ASC/ DESC)
	 * https://docs.google.com/document/d/
	 * 1wcgGD_BJlcRZaF2xsZbwR1CCR5uPkT1WOqIE509ko0M/edit#
	 * 
	 */
	public boolean isProductNameSortByAscending(WebDriver driver, String locatorType) {
		// Khai b??o 1 Array List ????? ch???a c??c product name tr??n UI
		ArrayList<String> productUIList = new ArrayList<>();

		// L???y ra h???t t???t c??? c??c text product name
		List<WebElement> productNameText = getListWebElement(driver, locatorType);

		// D??ng v??ng l???p ????? getText v?? add v??o ArrayList tr??n
		for (WebElement productName : productNameText) {
			productUIList.add(productName.getText());
			System.out.println("Product name ??? tr??n UI:" + productName.getText());
		}

		// T???o ra 1 ArrayList m???i ????? sort d??? li???u trong ArrayList c?? xem ????ng hay ko
		ArrayList<String> productSortList = new ArrayList<>();
		for (String product : productUIList) {
			productSortList.add(product);
		}
		// Th???c hi???n SORT ASC c??i productSortList
		Collections.sort(productSortList);

		for (String productName : productSortList) {
			System.out.println("Product Name sau khi sort ASC: " + productName);
		}

		// So s??nh 2 List ???? b???ng nhau
		return productSortList.equals(productUIList);
	}

	/**
	 * Sort Descending (String)
	 */
	public boolean isProductNameSortByDescending(WebDriver driver, String locatorType) {
		// Khai b??o 1 Array List ????? ch???a c??c product name tr??n UI
		ArrayList<String> productUIList = new ArrayList<>();

		// L???y ra h???t t???t c??? c??c text product name
		List<WebElement> productNameText = getListWebElement(driver, locatorType);

		// D??ng v??ng l???p ????? getText v?? add v??o ArrayList tr??n
		for (WebElement productName : productNameText) {
			productUIList.add(productName.getText());
			System.out.println("Product name ??? tr??n UI:" + productName.getText());
		}

		// T???o ra 1 ArrayList m???i ????? sort d??? li???u trong ArrayList c?? xem ????ng hay ko
		ArrayList<String> productSortList = new ArrayList<>();
		for (String product : productUIList) {
			productSortList.add(product);
		}

		// Reverse productSortList
		Collections.reverse(productSortList);

		for (String productName : productSortList) {
			System.out.println("Product Name sau khi sort DESC: " + productName);
		}

		// So s??nh 2 List ???? b???ng nhau
		return productSortList.equals(productUIList);
	}

	/** Sort Float ASC */
	public boolean isProductPriceSortByAscending(WebDriver driver, String locatorType) {
		// Khai b??o 1 Array List
		ArrayList<Float> productUIList = new ArrayList<Float>();

		// L???y ra h???t t???t c??? Text Product Price
		List<WebElement> productPriceText = getListWebElement(driver, locatorType);

		// D??ng v??ng l???p ????? getText v?? add v??o ArrayList tr??n
		for (WebElement productPrice : productPriceText) {
			productUIList.add(Float.parseFloat(productPrice.getText().replace("$", "").replace(",", "").trim()));
			System.out.println("Product Price tr??n UI: " + productPrice.getText());
		}

		// T???o 1 ArrayList m???i ????? sort d??? li???u trong ArrayList c?? xem ????ng hay kh??ng
		ArrayList<Float> productSortList = new ArrayList<Float>();
		for (Float product : productUIList) {
			productSortList.add(product);
		}

		// Sort c??i productSortList ASC
		Collections.sort(productSortList);

		for (Float productName : productSortList) {
			System.out.println("Product Price sau khi Sort ASC: " + productName);
		}

		// So s??nh 2 List ???? b???ng nhau
		return productSortList.equals(productUIList);
	}

	/** Sort Float DESC */
	public boolean isProductPriceSortByDescending(WebDriver driver, String locatorType) {
		// Khai b??o 1 Array List
		ArrayList<Float> productUIList = new ArrayList<Float>();

		// L???y ra h???t t???t c??? Text Product Price
		List<WebElement> productPriceText = getListWebElement(driver, locatorType);

		// D??ng v??ng l???p ????? getText v?? add v??o ArrayList tr??n
		for (WebElement productPrice : productPriceText) {
			productUIList.add(Float.parseFloat(productPrice.getText().replace("$", "").replace(",", "").trim()));
			System.out.println("Product Price tr??n UI: " + productPrice.getText());
		}

		// T???o 1 ArrayList m???i ????? sort d??? li???u trong ArrayList c?? xem ????ng hay kh??ng
		ArrayList<Float> productSortList = new ArrayList<Float>();
		for (Float product : productUIList) {
			productSortList.add(product);
		}

		// Sort c??i productSortList
		Collections.sort(productSortList);

		// Reverse c??i productSortList DESC
		Collections.reverse(productSortList);

		for (Float productPrice : productSortList) {
			System.out.println("Product Price sau khi Sort DESC: " + productPrice);
		}

		// So s??nh 2 List ???? b???ng nhau
		return productSortList.equals(productUIList);
	}

	/** Sort Lamda Java 8 */
	public boolean isProductNameSortByASCLambda(WebDriver driver, String locatorType) {
		List<WebElement> elementLists = getListWebElement(driver, locatorType);
		List<String> names = elementLists.stream().map(n -> n.getText()).collect(Collectors.toList());
		for (String name : names) {
			System.out.println("Product name on UI: " + name);
		}
		List<String> sortedNames = new ArrayList<String>(names);
		Collections.sort(sortedNames);
		for (String sortedName : sortedNames) {
			System.out.println("Product name sau khi Sort: " + sortedName);
		}
		return names.equals(sortedNames);
	}

	public boolean isProductNameSortByDESCLambda(WebDriver driver, String locatorType) {
		List<WebElement> elementLists = getListWebElement(driver, locatorType);
		List<String> names = elementLists.stream().map(n -> n.getText()).collect(Collectors.toList());
		List<String> sortedNames = new ArrayList<String>(names);
		Collections.sort(sortedNames);
		Collections.reverse(sortedNames);
		return names.equals(sortedNames);
	}

	WebDriver driver;
	private Alert alert;
	private Select select;
	private JavascriptExecutor jsExecutor;
	private Actions action;
	private long longTimeout = GlobalConstants.LONG_TIME_OUT;
	private long shortTimeout = GlobalConstants.SHORT_TIME_OUT;

}
