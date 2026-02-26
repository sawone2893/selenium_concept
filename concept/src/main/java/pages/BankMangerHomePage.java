package pages;

import base.BaseClass;

public class BankMangerHomePage {

	public static String getBankMangerHomePageTitle() {
		return BaseClass.getTitle();
	}

	public static boolean isManagerHyperLinkDisplayed() {
		return BaseClass.isElementPresent("linktext", "Manager");
	}

	public static boolean isNewCustomerHyperLinkDisplayed() {
		return BaseClass.isElementPresent("linktext", "New Customer");
	}

}
