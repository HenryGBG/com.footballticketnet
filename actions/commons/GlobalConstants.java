package commons;

public class GlobalConstants {
//	public static final String PORTAL_PAGE_URL = "https://www.footballticketnet.com/";
	public static final long LONG_TIME_OUT = 30;
	public static final long SHORT_TIME_OUT = 3;
	public static final String PASSWORD = "12345678";
	public static final String CONFIRM_PASSWORD = "12345678";
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String EXTENT_PATH = System.getProperty("user.dir");
	public static final String JAVA_VERSION = System.getProperty("java.version");
	public static final String HEADER_VOUCHER_LABEL = "voucher";

	// Voucher page
	public static final String ERROR_MESSAGE_TEXTBOX = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_DROPDOWN_BY_NAME = "xpath=//select[@name='%s']";
	public static final String DYNAMIC_RADIO_BUTTON_BY_VALUE = "xpath=//label[text()='%s']/preceding-sibling::input";
	public static final String DYNAMIC_CHECKBOX_BY_LABEL = "xpath=//label[contains(text(),'%s')]/following-sibling::input";
	public static final String COPY_RIGHT_LABEL_XPATH = "xpath=//div[@class='copy_footer']//div[@class='copy']";
	public static final String TEAM_INFO_LABEL = "Paris Saint-Germain vs Olympique Marseille";
	public static final String CHOOSE_CATEGORY_BY_LABEL = "Best Available";
}
