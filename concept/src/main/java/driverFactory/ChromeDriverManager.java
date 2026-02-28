package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager implements BrowserDriver{
	
	@Override
	public WebDriver createDriver(boolean isHeadless) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		if(isHeadless) {
			options.addArguments("--headless");
		}
		return new ChromeDriver(options);
	}

}
