package selenium.training.assignment.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
	/*
	 * Create a child class to implement the below 2 test cases –
	 * 
	 * Test Case 1 – Validate the title of the page is “Downloads | Selenium”.
	 * 
	 * Test Case 2 – Validate presence of hyperlink “other languages exist” in the
	 * same page.
	 */
	@Test
	public void testcase1() {
		String expectedTitle = "Downloads | Selenium";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test
	public void testcase2() {
		WebElement link = driver.findElement(By.linkText("other languages exist"));
		Assert.assertTrue(link.isDisplayed(), "Hyperlink: other languages exist is not present");

	}

}
