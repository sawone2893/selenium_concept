package selenium.concept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {

	public static void captureScreenshot(WebDriver driver, String filePath) {
		try {
			driver.get("https://www.example.com");
			// Take screenshot
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			// Define destination path
			File destinationFile = new File(filePath);
			// Save the screenshot
			FileUtils.copyFile(sourceFile, destinationFile);
			System.out.println("Screenshot saved successfully to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		TakingScreenshot.captureScreenshot(driver,"./screenshot/screenshot1.png");
		driver.findElement(By.className("name")).sendKeys("Shabbir");
		TakingScreenshot.captureScreenshot(driver,"./screenshot/screenshot2.png");
		driver.close();

	}

}
