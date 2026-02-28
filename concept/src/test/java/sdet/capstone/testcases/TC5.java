package sdet.capstone.testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BankMangerHomePage;
import pages.HomePage;
import utils.ExcelManager;
import utils.PropertyFileManger;

public class TC5 extends BaseTest {

	@Test
	public void validateBankManagerHomePageUIElementsAfterLogin() {
		Map<String,String> testcaseData=ExcelManager.getTestCaseData("TC5");
		HomePage.enterCredentials(testcaseData.get("USER_ID"), testcaseData.get("PASSWORD"));
		Assert.assertEquals(BankMangerHomePage.getBankMangerHomePageTitle(),
				PropertyFileManger.getPropertyValue("BANK_MANAGER_HOME_PAGE_TITLE"), "Title Mismatch");
		Assert.assertTrue(BankMangerHomePage.isManagerHyperLinkDisplayed(), "Manager Hyperlink is not displayed");
		Assert.assertTrue(BankMangerHomePage.isNewCustomerHyperLinkDisplayed(),
				"New Customer Hyperlink is not displayed");
	}
}
