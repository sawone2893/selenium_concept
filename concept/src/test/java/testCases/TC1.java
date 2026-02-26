package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import utils.PropertyFileManger;

public class TC1 extends BaseTest{
	
	/*
	 * Validate the title of the webpage point to h􀆩ps://demo.guru99.com/V4/ is “Guru99 BankHome Page”
	 */
	@Test
	public void validateHomepageTitle() {
		Assert.assertEquals(HomePage.getHomePageTitle(), PropertyFileManger.getPropertyValue("HOME_PAGE_TITLE"),"Title Mismatch");
	}

}
