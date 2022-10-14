package pageUIs.com.footballticketnet;

public class VoucherPageUI {

	// message
	public static final String VOUCHER_FROM_ERROR_MESSAGE = "Please Provide A Name";
	public static final String BUY_NOW_BUTTON = "xpath=//input[@class='voucher_input_form green_btn']";
	public static final String VOUCHER_TO_ERROR_MESSAGE = "Please Provide A Name";
	public static final String VOUCHER_AMOUNT_ERROR_MESSAGE = "This Field Must Only Contain Numbers";
	public static final String VOUCHER_RATE_ERROR_MESSAGE = "Please Select Currency";
	public static final String VOUCHER_NAME_ERROR_MESSAGE = "Please Provide A Name";
	public static final String VOUCHER_PHONE_ERROR_MESSAGE = "Please Insert Phone Number";
	public static final String VOUCHER_COUNTRY_ERROR_MESSAGE = "This Field Must Not Be Empty";
	public static final String VOUCHER_LAST_NAME_ERROR_MESSAGE = "Please Provide A Name";
	public static final String VOUCHER_EMAIL_ERROR_MESSAGE = "Please Enter A Valid Email Address";
	public static final String VOUCHER_CHECKMASK_ERROR_MESSAGE = "Please Check Box";

	// xpath
	public static final String VOUCHER_XPATH_FROM_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_from']/label";
	public static final String VOUCHER_XPATH_TO_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_to']/label";
	public static final String VOUCHER_XPATH_AMOUNT_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_amount']/label";
	public static final String VOUCHER_XPATH_RATE_ERROR_MESSAGE = "xpath=//select[@id='voucher_rate']/following-sibling::label";
	public static final String VOUCHER_XPATH_NAME_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_name']/label";
	public static final String VOUCHER_XPATH_PHONE_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_phone']/label";
	public static final String VOUCHER_XPATH_LAST_NAME_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_last_name']/label";
	public static final String VOUCHER_XPATH_EMAIL_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_email']/label";
	public static final String VOUCHER_XPATH_COUNTRY_ERROR_MESSAGE = "xpath=//div[@class='form_input voucher_country']/label";
	public static final String VOUCHER_XPATH_CHECKMASK_ERROR_MESSAGE = "xpath=//span[@class='voucher_type_money_lable']";
	public static final String VOUCHER_RATE_DROPDOWN = "xpath=//div[@class='form_input margin_bottom_10 voucher_rate']";
	public static final String SELECTED_CURRENCY = "GBP";
	public static final String CURRENCY_OF_VOUCHER_RATE = "xpath='//li[@data-value='%s']'";
	public static final String VOUCHER_TYPE_CHECKBOX = "xpath=//span[@class='voucher_type_money_lable']";

	// Data test
	public static final String VOUCHER_FROM_NAME = "TestingFrom";
	public static final String VOUCHER_TO_NAME = "TestingTo";
	public static final String VOUCHER_DEDICATION = "This is a test voucher. Please ignore it";
	public static final String VOUCHER_AMOUNT = "3";
	public static final String BILING_FIRST_NAME = "BillingFirstName";
	public static final String BILING_LAST_NAME = "BillingLastName";
	public static final String BILING_PHONE_NUMBER = "0932153486";
	public static final String BILLING_EMAIL_ADDRESS = "henry.footballticket@gmail.com";
	public static final String BILLING_COUNTRY = "Vietnam";
	public static final String VOUCHER_COUNTRY_DROPDOWN = "xpath=//div[@class='nice-select _input width_100']/span[text()='Select country']";
	public static final String VOUCHER_SELECTED_COUNTRY = "xpath=//li[@class='option' and text()='Afghanistan']";
	public static final String PARENT_COUNTRY_XPATH = "xpath=//div[@class='form_input voucher_country']/div[@class='nice-select _input width_100']";
	public static final String CHILD_COUNTRY_XPATH = "xpath=//ul[@class='list']";
	public static final String SELECTED_COUNTRY = "xpath=//li[@class='option' and text()='%s']";
	public static final String COUNTRY_LIST_IN_DROPDOWN = "xpath=//div[@class='nice-select _input width_100 open']/ul";
	public static final String SELECTED_CURRENCY_DROPDOWN = "xpath=//li[@class='option' and text()='%s']";
	public static final String CARD_TYPE_LABEL = "Visa";
	public static final String CARD_NUMBER_LABEL = "4365796307425151";
	public static final String CARD_HOLDER_NAME_LABEL = "Miralem Toma";
	public static final String EXPIRE_MONTH_YEAR_LABEL = null;
	public static final String CARD_VERIFICATION_NUMBER_LABEL = "111";
	public static final String VOUCHER_TITLE_XPATH = "xpath=//div[@class='voucher_title']/div[@class='ticket_head']/p";
	public static final String VOUCHER_TITLE_IN_ENGLISH = "BUY A PRINTABLE E-GIFT CARD";

}
