package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager implements BrowserDriver{

	@Override
	public WebDriver createDriver(boolean isHeadless) {
		EdgeOptions options= new EdgeOptions();
		options.addArguments("--disable-notifications");
		if(isHeadless) {
			options.addArguments("--headless");
		}
		return new EdgeDriver(options);
	}

}
