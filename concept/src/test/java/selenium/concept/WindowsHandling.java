package selenium.concept;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {


	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);

		// Handling new Tab
		driver.findElement(By.xpath(Locator.button("New Tab"))).click();

		// Get all window handles
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		// Switch to the new tab 
		driver.switchTo().window(tabs.get(1));
		
		// Perform actions in the new tab
		System.out.println("New Tab Title: " + driver.getTitle());

		// Closing new Tab 
		driver.close();

		// Switch back to the original tab
		driver.switchTo().window(tabs.get(0));

		// Handling multiple window
		driver.findElement(By.xpath(Locator.button("Popup Windows"))).click();
		// Get all window handles
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

		// Switch to the desired window 1
		driver.switchTo().window(windows.get(1));
		System.out.println("New Window1 Title: " + driver.getTitle());
		
		// Switch to the desired window 2
		driver.switchTo().window(windows.get(2));
		System.out.println("New Window 2 Title: " + driver.getTitle());
		

		// Switch to the desired window 1
		driver.switchTo().window(windows.get(0));
		System.out.println("Parent Window Title: " + driver.getTitle());
		
		driver.quit();

	}

}
