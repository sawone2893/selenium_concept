package selenium.training.assignment.ten;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignmen1 extends BaseTest {

	/*
	 * Create an excel having name “TestCredentials.xlsx” [or you can use the
	 * attachment] and store the below credentials. Save the file under C:\TestData
	 * folder.
	 * 
	 * User ID Password mngr655651 ezYjade mngr655652 ArEbyga HclTech Test@123
	 * 
	 * Create a file config.properties to store -
	 * 
	 * the browser type and the URL - https://demo.guru99.com/V4/ Excel file path -
	 * C:\TestData Excel file name - TestCredentials.xlsx Sheet name – TestData
	 * 
	 * 
	 * You need to read these [Yellow highlighted ones] from the config file during
	 * run time and use it in your code.
	 * 
	 * 
	 * 
	 * Develop a Data Driven Framework to validate the login functionality of the
	 * page pointing to URL - https://demo.guru99.com/V4/
	 */
	@DataProvider(name = "credentials")
	public Object[][] credentialsDetails() {
		String filePath = System.getProperty("user.dir") + PropertyManager.getPropertyValue("EXCEL_FILE_PATH")
				+ PropertyManager.getPropertyValue("EXCEL_FILE_NAME");
		Object[][] data = ExcelManager.getExcelData(filePath, PropertyManager.getPropertyValue("EXCEL_SHEET_NAME"));
		return data;
	}

	@Test(dataProvider = "credentials")
	public void testcase1(String userName, String pwd) {
		Alert alert = null;
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();

		if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
			// VALIDATION: Screen Traversal
			// Successful login leads to Manager Dashboard with a specific title
			wait.until(ExpectedConditions.titleContains("Guru99 Bank Manager HomePage"));
			String actualTitle = driver.getTitle();
			Assert.assertTrue(actualTitle.contains("Manager"), "Traversal failed for valid user: " + userName);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log out")));

			WebElement logoutLink = driver.findElement(By.linkText("Log out"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutLink);
		}

		// VALIDATION: Alert Handling
		alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertText = alert.getText();
		System.out.println("Actual Pop Text: "+alertText);
		if(alertText.equalsIgnoreCase("You Have Succesfully Logged Out!!")) {
			System.out.println("Login Successfull: User credentials are valid!");
		}else if(alertText.equalsIgnoreCase("User or Password is not valid")) {
			System.out.println("Login Failed: User credentials are invalid!");
		}else {
			throw new IllegalArgumentException("Unexpected alert text");
		}
		alert.accept();

	}

}
