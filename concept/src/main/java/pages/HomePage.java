package pages;

import base.BaseClass;

public class HomePage {
	
	private static String loginBtn="//input[@value='LOGIN']";
	private static String resetBtn="//input[@value='RESET']";
	private static String userIdTextBox="//td[text()='UserID']/following::input[1]";
	private static String passwordTextBox="//td[text()='Password']/following::input[1]";
	
	public static String getHomePageTitle(){
		return BaseClass.getTitle();
	}
	
	public static boolean isLoginBtnDisplayed(){
		return BaseClass.isElementPresent("xpath", loginBtn);
	}
	
	public static boolean isResetBtnDisplayed(){
		return BaseClass.isElementPresent("xpath", resetBtn);
	}
	public static boolean isUserIdTextBoxDisplayed(){
		return BaseClass.isElementPresent("xpath", userIdTextBox);
	}
	public static boolean isPasswordTextBoxDisplayed(){
		return  BaseClass.isElementPresent("xpath", passwordTextBox);
	}
	
	public static void enterCredentials(String userId,String password){
		BaseClass.type("xpath", userIdTextBox, userId);
		BaseClass.type("xpath", passwordTextBox, password);
		BaseClass.click("xpath", loginBtn);
	}

}
