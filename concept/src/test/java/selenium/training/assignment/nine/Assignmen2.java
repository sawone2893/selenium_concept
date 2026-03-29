package selenium.training.assignment.nine;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignmen2 extends BaseTest {

	/*
	 * Assignment 2 ->
	 * 
	 * Develop a data driven framework for test the login functionality.
	 * 
	 * URL - https://demo.guru99.com/V4/
	 * 
	 * Test Data -> User ID Password mngr655651 ArEbyga mngr655652 ArEbyga HCL
	 * Test@123
	 * 
	 * For the first 2 user credentials, the test case should pass and third one
	 * should fail. While validating, keep the thing in mind that the screen
	 * traversal will take place to the next page if login is successful. So
	 * implement your validation accordingly.
	 */
	@DataProvider(name = "credentials")
	public Object[][] credentialsDetails() {
		return new Object[][] { { "mngr655651", "ArEbyga", "pass" }, { "mngr655652", "ArEbyga", "pass" },
				{ "HCL", "Test@123", "fail" } };
	}

	@Test(dataProvider = "credentials")
	public void testcase1(String userName, String pwd, String expectedOutcome) {
		Alert alert = null;
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();

		if (expectedOutcome.equals("pass")) {
			// VALIDATION: Screen Traversal
			// Successful login leads to Manager Dashboard with a specific title
			wait.until(ExpectedConditions.titleContains("Guru99 Bank Manager HomePage"));
			String actualTitle = driver.getTitle();
			Assert.assertTrue(actualTitle.contains("Manager"), "Traversal failed for valid user: " + userName);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log out")));
		    
		    WebElement logoutLink = driver.findElement(By.linkText("Log out"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutLink);
			alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		} else {
			// VALIDATION: Alert Handling
			// Invalid credentials trigger a JavaScript alert
			alert = wait.until(ExpectedConditions.alertIsPresent());
			String alertText = alert.getText();
			Assert.assertEquals(alertText, "User or Password is not valid ", "Unexpected alert text");
			alert.accept();
		}

	}

}
