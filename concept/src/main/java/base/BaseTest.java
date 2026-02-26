package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utils.Config;

public class BaseTest {
	@Parameters({"browserType","isHeadless"})
	@BeforeClass
	public void setup(String browserType,String isHeadless) {
		//Loading configurations
		Config.init();
		BaseClass.initBrowser(browserType,Boolean.parseBoolean(isHeadless));
		BaseClass.launchBrowser(Config.get("APP_URL"));
	}

	@AfterClass
	public void tearDown() {
		BaseClass.closeBrowser();
	}

}
