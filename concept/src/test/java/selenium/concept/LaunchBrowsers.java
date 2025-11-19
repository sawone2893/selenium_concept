package selenium.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		String URL="https://www.carwale.com/";
		WebDriver driver= new ChromeDriver();
		driver.get(URL);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		driver=new EdgeDriver();
		driver.get(URL);
		title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
