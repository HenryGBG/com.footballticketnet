package pageUIs.com.footballticketnet;

public class HomePageUIs {

	public static final String HEADER_VOUCHER_LINK = "xpath=//div[@class='left_Top']/descendant::a[contains(@href,'voucher')]";
	public static final String HEADER_BLOG_LINK = "xpath=//div[@class='left_Top']/descendant::a[contains(@href,'blog')]";
	public static final String HEADER_CONTACT_US_LINK = "xpath=//div[@class='left_Top']/descendant::a[contains(@href,'contact-us')]";
	public static final String HEADER_FAQ_LINK = "xpath=//div[@class='left_Top']/descendant::a[contains(@href,'faqs')]";
	public static final String HEADER_TERM_CONDITION_LINK = "xpath=//div[@class='left_Top']/descendant::a[contains(@href,'terms-and-conditions')]";
	public static final String MENU_TEAMS_XPATH = "xpath=//div[@class='menu']/descendant::a[@href='/teams']";
	public static final String MENU_TOURNAMENT_XPATH = "xpath=//div[@class='menu']/descendant::a[@href='/tournaments']";
	public static final String MENU_INTERNATIONAL_XPATH = "xpath=//div[@class='menu']/descendant::a[@href='/international-friendly-matches']";
	public static final String MENU_STADIUM_TOUR_XPATH = "xpath=//div[@class='menu']/descendant::a[@href='/stadium-tours']";
	public static final String MENU_MOST_POPULAR_TOUR_XPATH = "xpath=//div[@class='menu']/descendant::a[@href='/most-popular-events']";
	public static final String SELECTED_COUNTRY_DROPDOWN = "xpath=//dl[@id='country-select']";
	public static final String SELECTED_COUNTRY_FRENCH = "xpath=//dl[@id='country-select']//span[text()='French']";
	public static final String SELECTED_COUNTRY_GERMAN = "xpath=//dl[@id='country-select']//span[text()='German']";
	public static final String SELECTED_COUNTRY_ITALIAN = "xpath=//dl[@id='country-select']//span[text()='Italian']";
	public static final String SELECTED_COUNTRY_DUTCH = "xpath=//dl[@id='country-select']//span[text()='Dutch']";
	public static final String SELECTED_COUNTRY_FINNISH = "xpath=//dl[@id='country-select']//span[text()='Finnish']";
	public static final String SELECTED_COUNTRY_SWEDISH = "xpath=//dl[@id='country-select']//span[text()='Swedish']";
	public static final String SELECTED_COUNTRY_DANISH = "xpath=//dl[@id='country-select']//span[text()='Danish']";
	public static final String SELECTED_COUNTRY_SPANNISH = "xpath=//dl[@id='country-select']//span[text()='Spanish']";
	public static final String SEARCH_TEXTBOX_XPATH = "xpath=//input[@placeholder='Search']";
	public static final String SEARCH_RESULT_ITEM = "xpath=//div[@class='result_line result_event']//span[@class='marked_keyword' and text()='%s']";
	public static final String CHOOSE_CATEGORY_ITEM = "xpath=//div[@class='nice-select open']/ul/li[@class='option' and text()='%s']";
	public static final String CHOOSE_CATEGORY_DROPDOWN_XPATH = "xpath=//div[@id='exchange_category_filter']//div[@class='nice-select']";
	public static final String RESET_BUTTON = "xpath=//input[@class='reset_category green_btn desktop-only']";
	public static final String CATEGORY_LIST_ITEMS = "xpath=//div[@class='common_stand category category-border']/strong";
	public static final String TEAM_INFO = "xpath=//p[text()='%s ']/ancestor::div/div[@class='d_inline team_ticket']";
	public static final String BUY_NOW_BUTTON_XPATH = "xpath=//div[@class='stand_Sprice desktop  ']/div/div[@class='common_stand prive' and text()=' €%s ']/following-sibling::div/input[@value='Buy Now']";
	public static final String NOTIFICATION_ACCEPT_BUTTON_XPATH = "xpath=//div[@class='our_adv_pop']//button[@class='single_seats_popup']";

}
