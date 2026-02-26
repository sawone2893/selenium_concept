package driverFactory;

import org.openqa.selenium.WebDriver;

public interface BrowserDriver {
	public WebDriver createDriver(boolean isHeadless);
}
