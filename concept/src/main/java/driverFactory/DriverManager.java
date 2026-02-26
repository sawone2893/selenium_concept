package driverFactory;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static volatile DriverManager dManager;
	private static ThreadLocal<WebDriver> tLocal = new ThreadLocal<>();

	private DriverManager() {
		if (dManager != null) {
			throw new IllegalStateException("Driver instance already created!");
		}
	}

	public static DriverManager getInstance(String browserType, boolean isHeadless) {
		if (dManager == null) {
			synchronized (DriverManager.class) {
				if (dManager == null) {
					dManager = new DriverManager();
				}
			}
		}
		if (tLocal.get() == null) {
			tLocal.set(DriverFactory.getDriverInstance(browserType).createDriver(isHeadless));
		}
		return dManager;

	}

	public static WebDriver getDriver() {
		return tLocal.get();
	}

	public static void unloadDriver() {
		if (tLocal.get() != null) {
			tLocal.get().quit();
			tLocal.remove();
		}
	}
}
