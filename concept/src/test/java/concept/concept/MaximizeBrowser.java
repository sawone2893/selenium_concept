package selenium.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		String URL="https://www.carwale.com/";
		WebDriver driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
