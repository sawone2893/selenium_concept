package selenium.training.assignment.ten;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

	private static Properties prop;
	private static FileInputStream fis;

	public static String getPropertyValue(String propKey) {
		String filePath = System.getProperty("user.dir")
				+ "/src/test/java/selenium/training/assignment/ten/config.properties";

		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop.getProperty(propKey);

	}

}
