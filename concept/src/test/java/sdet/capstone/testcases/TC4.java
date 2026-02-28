package sdet.capstone.testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BankMangerHomePage;
import pages.HomePage;
import utils.ExcelManager;
import utils.PropertyFileManger;

public class TC4 extends BaseTest {

	@Test
	public void validateBankManagerHomePageTitleAfterLogin() {
		Map<String, String> testcaseData = ExcelManager.getTestCaseData("TC4");
		HomePage.enterCredentials(testcaseData.get("USER_ID"), testcaseData.get("PASSWORD"));
		Assert.assertEquals(BankMangerHomePage.getBankMangerHomePageTitle(),
				PropertyFileManger.getPropertyValue("BANK_MANAGER_HOME_PAGE_TITLE"), "Title Mismatch");
	}
}
