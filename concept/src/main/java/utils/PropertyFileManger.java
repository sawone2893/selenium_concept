package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileManger {
	
	static Properties prop=null;

	public static String getPropertyValue(String key) {
		
		try {
			prop=new Properties();
			String filePath=System.getProperty("user.dir")+"/src/main/java/config/config.properties";
			File file=new File(filePath);
			FileInputStream fis= new FileInputStream(file);
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
}
