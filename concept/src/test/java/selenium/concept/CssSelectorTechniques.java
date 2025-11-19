package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTechniques {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		//tag and ID=>tag#id
		driver.findElement(By.cssSelector("input#male")).click();
		
		//tag and class=>tag.className
		driver.findElement(By.cssSelector("button.start")).click();
		//tags and attribute=>tag[attrbuteName='value']
		driver.findElement(By.cssSelector("input[placeholder='Enter Name']")).sendKeys("Shabbir");
		
		//tag class and attribute=>tag.className[attributeName='value']
		driver.findElement(By.cssSelector("input.form-check-input[value='male']"));
		
		driver.close();
	}

}
