package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager implements BrowserDriver{

	@Override
	public WebDriver createDriver(boolean isHeadless) {
		FirefoxOptions options= new FirefoxOptions();
		options.addArguments("--disable-notifications");
		if(isHeadless) {
			options.addArguments("--headless");
		}
		return new FirefoxDriver(options);
	}

}
