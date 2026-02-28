package sdet.capstone.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class TC2 extends BaseTest{
	
	@Test
	public void validateUIElementPresence() {
		Assert.assertTrue(HomePage.isLoginBtnDisplayed(),"Login button is not displayed");
		Assert.assertTrue(HomePage.isResetBtnDisplayed(),"Reset button is not displayed");
		Assert.assertTrue(HomePage.isUserIdTextBoxDisplayed(),"UserId TextBox is not displayed");
		Assert.assertTrue(HomePage.isPasswordTextBoxDisplayed(),"Password TextBox is not displayed");
	}

}
