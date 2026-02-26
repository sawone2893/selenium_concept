package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverFactory.DriverManager;

public class BaseClass {

	public static void initBrowser(String browserType,boolean isHeadless) {
		DriverManager.getInstance(browserType, isHeadless);
		DriverManager.getDriver().manage().window().maximize();
	}

	public static void launchBrowser(String appUrl) {
		DriverManager.getDriver().get(appUrl);
		DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {
		switch (locatorType.toLowerCase()) {
		case "xpath":
			return DriverManager.getDriver().findElement(By.xpath(locatorValue));
		case "id":
			return DriverManager.getDriver().findElement(By.id(locatorValue));
		case "classname":
			return DriverManager.getDriver().findElement(By.className(locatorValue));
		case "css":
			return DriverManager.getDriver().findElement(By.cssSelector(locatorValue));
		case "linktext":
			return DriverManager.getDriver().findElement(By.linkText(locatorValue));
		case "partiallinktext":
			return DriverManager.getDriver().findElement(By.partialLinkText(locatorValue));
		case "tagname":
			return DriverManager.getDriver().findElement(By.tagName(locatorValue));
		default:
			System.err.println("Invalid Locator Type: " + locatorType);
		}

		return null;
	}

	public static List<WebElement> getWebElements(String locatorType, String locatorValue) {
		switch (locatorType.toLowerCase()) {
		case "xpath":
			return DriverManager.getDriver().findElements(By.xpath(locatorValue));
		case "id":
			return DriverManager.getDriver().findElements(By.id(locatorValue));
		case "classname":
			return DriverManager.getDriver().findElements(By.className(locatorValue));
		case "css":
			return DriverManager.getDriver().findElements(By.cssSelector(locatorValue));
		case "linktext":
			return DriverManager.getDriver().findElements(By.linkText(locatorValue));
		case "partiallinktext":
			return DriverManager.getDriver().findElements(By.partialLinkText(locatorValue));
		case "tagname":
			return DriverManager.getDriver().findElements(By.tagName(locatorValue));
		default:
			System.err.println("Invalid Locator Type: " + locatorType);
		}

		return null;
	}

	public static boolean isElementPresent(String locatorType, String locatorValue) {
		if (BaseClass.getWebElements(locatorType, locatorValue).size() > 0
				&& BaseClass.getWebElement(locatorType, locatorValue).isDisplayed()) {
			return true;
		}

		return false;
	}

	public static void click(String locatorType, String locatorValue) {
		if (isElementPresent(locatorType, locatorValue)) {
			getWebElement(locatorType, locatorValue).click();
		} else {
			System.err.println("Element Not Found: " + locatorValue);
		}
	}

	public static void type(String locatorType, String locatorValue, String text) {
		if (isElementPresent(locatorType, locatorValue)) {
			getWebElement(locatorType, locatorValue).sendKeys(text);
		} else {
			System.err.println("Element Not Found: " + locatorValue);
		}
	}

	public static String getTitle() {
		return DriverManager.getDriver().getTitle();
	}

	public static void closeCurrentWindow() {
		DriverManager.getDriver().close();
	}

	public static void closeBrowser() {
		DriverManager.unloadDriver();
	}
}
