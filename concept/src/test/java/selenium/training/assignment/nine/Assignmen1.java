package selenium.training.assignment.nine;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignmen1 extends BaseTest{
	
	/*
	 * URL -> https://demo.guru99.com/V4/
	 * 
	 * Write a TestNG test case to validate the title of the page.
	 */
	
	@Test
	public void testcase1() {
		String expectedTitle = "Guru99 Bank Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
