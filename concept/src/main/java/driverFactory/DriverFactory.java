package driverFactory;

public class DriverFactory {

	public static BrowserDriver getDriverInstance(String browserType) {
		switch (browserType.toUpperCase()) {
		case "CHROME":
			return new ChromeDriverManager();
		case "FIREFOX":
			return new FirefoxDriverManager();
		case "EDGE":
			return new EdgeDriverManager();
		default:
			throw new IllegalArgumentException("Invalid browser type: "+browserType);
		}
	}

}
