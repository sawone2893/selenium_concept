package sdet.capstone.testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BankMangerHomePage;
import pages.HomePage;
import utils.ExcelManager;
import utils.PropertyFileManger;

public class TC3 extends BaseTest {

	@Test
	public void validateSuccessfulLogin() {
		Map<String,String> testcaseData=ExcelManager.getTestCaseData("TC3");
		HomePage.enterCredentials(testcaseData.get("USER_ID"), testcaseData.get("PASSWORD"));
		Assert.assertEquals(BankMangerHomePage.getBankMangerHomePageTitle(), PropertyFileManger.getPropertyValue("BANK_MANAGER_HOME_PAGE_TITLE"),"Title Mismatch");
	}

}
