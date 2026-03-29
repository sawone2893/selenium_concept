package selenium.training.assignment.nine;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	/*
	 * Create a file config.properties to store the browser type and the URL -
	 * https://demo.guru99.com/V4/
	 * 
	 * During run time, fetch the URL and browser type and use it in the code.
	 * 
	 * For Browser, write code for both Chrome and Edge. If you change the browser
	 * type value to either of the value in your properties file, it will function
	 * accordingly.
	 */

	public WebDriver driver = null;
	WebDriverWait wait=null;

	private void init(String browserType) {
		switch (browserType.toUpperCase()) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Unsupported Browser Type: " + browserType);

		}

		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	private void launchApp(String appUrl) {
		driver.get(appUrl);
	}

	private void closeBrowser() {
		driver.close();
	}

	@BeforeTest
	public void setup() {
		this.init(PropertyManager.getProp("BROWSER_TYPE"));
		this.launchApp(PropertyManager.getProp("APP_URL"));
	}

	@AfterTest
	public void tearDown() {
		this.closeBrowser();
	}

}
